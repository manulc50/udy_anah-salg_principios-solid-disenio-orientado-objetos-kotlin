package gettersetter

class RegisterUser {
    fun invoke(user: User): User? = if (user.isValid) user else null
}