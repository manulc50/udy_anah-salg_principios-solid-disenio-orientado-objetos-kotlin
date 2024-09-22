package gettersetter

import java.time.LocalDate


class User(
    // Nota: Si no indicamos "var" o "val" en los argumentos de entrada del constructor primario, Kotlin no crea
    // propiedades para esos argumentos, es decir, actuan como variables dentro de la clase pero sin ser propiedades
    email: String,
    password: String
) {
    constructor(
        email: String,
        password: String,
        birthday: LocalDate,
        gender: Char
    ): this(email, password) {
        // En Kotlin, cuando se asignan valores a propiedades de una clase, se invocan automáticamente
        // a sus métodos setter
        this.birthday = birthday
        this.gender = gender
    }

    // Nota: De forma implícita, Kotlin crea los métodos getter y setter para las propiedades de una clase.
    // Si la priopiedad se declarada con "val", como es inmutable, Kotlin sólo creará su método getter de forma ímplicita.
    // Sin embargo, si la propiedad se declara con "var", Kotlin creará su método getter y su método setter de forma implícita.

    // Crea la propiedad "email" y le asigna el valor del argumento de entrada "email" del constructor principal
    var email: String = email
        // Indicamos nuestrá implementación personalizada del método setter para la propiedad "email"
        set(value) {
            // "field" representa el valor actual de la propiedad
            field = value.lowercase()
        }

    // Crea la propiedad "isValid" y le asigna el valor del true
    var isValid: Boolean = true

    // Crea la propiedad "password" y le asigna el valor del argumento de entrada "password" del constructor principal
    var password: String = password
        set(value) {
            if(value.length == 6)
                field = value
            else
                isValid = false
        }

    init {
        // En Kotlin, cuando se asignan valores a propiedades de una clase, se invocan automáticamente
        // a sus métodos setter
        this.email = email
        this.password = password
    }

    private val dateNow = LocalDate.now();
    var birthday: LocalDate = dateNow
        set(value) {
            val age = dateNow.year - value.year
            field = if(age >= 18)
                field
            else {
                isValid = false
                dateNow
            }
        }

    private val validGenders = listOf('M', 'F')
    var gender: Char = 'N'
        set(value) {
            field = if(validGenders.contains(value))
                value
            else {
                isValid = false
                'N'
            }
        }

}