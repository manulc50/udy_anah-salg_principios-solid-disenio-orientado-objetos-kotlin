package gettersetter

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

fun main() {
    val user = User("JOHNDOE@CORREO.COM", "abc123")
    val registeredUser: User? = RegisterUser().invoke(user)
    if(registeredUser != null)
        println("Registered User: ${registeredUser.email} - ${registeredUser.password}")
    else
        println("User Not Registered!")
    println("---------------")
    val user2 = User(
        password = "123abc",
        email = "joebucks@correo.com",
        gender = 'M',
        birthday = LocalDate.of(1990, Month.DECEMBER, DayOfWeek.THURSDAY.value))
    val registeredUser2: User? = RegisterUser().invoke(user2)
    if(registeredUser2 != null) {
        println("Email: ${registeredUser2.email}")
        println("Password: ${registeredUser2.password}")
        println("Gender: ${registeredUser2.gender}")
        println("Birthday: ${registeredUser2.birthday}")
    }
    else
        println("User Not Registered!")

}