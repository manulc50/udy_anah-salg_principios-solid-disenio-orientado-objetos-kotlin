package sealedclass

fun main() {
    val post = Post("Post de prueba")
    val success: RequestResult = Success(post)

    when(success) {
        is Success -> { /* do something */ }
        is Failure -> { /* do something */ }
    }
}