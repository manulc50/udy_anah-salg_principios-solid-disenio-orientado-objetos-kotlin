package enumeraciones

fun main() {
    val connectionType = ConnectionType.WIFI
    println("$connectionType")

    val color = Color.WHITE
    println("$color")

    val intents = ErrorType.NOT_LOGGED_IN_ERROR.getRetryIntents()
    println("$intents")
}