package dataaccess

// Nota: Este tipo de clases ya tienen implementados los métodos "equals" y "hashCode" en función de sus propiedades.
// Nota: Este tipo de clases no deben tener funcionalidades adicionales, es decir, no se debe implementar métodos con
// funcionalidades en este tipo de clases porque su principal y única función es almacenar datos.
// Nota: También, este tipo de clases se caracterizan por su inmutabilidad, por lo tanto, sus propiedades deben
// declararse con "val".

data class DataClassSong(
    val title: String,
    val artist: String
)