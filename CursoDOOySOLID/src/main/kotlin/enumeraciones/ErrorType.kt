package enumeraciones

enum class ErrorType(
    val message: String
) {
    NOT_LOGGED_IN_ERROR("Not logged in error") {
        override val userMessage: String = "User is not logged in"
        override fun getCoderError(): String = "LE002"
        override fun getRetryIntents(): Int = 2
    },
    UNKNOWN_ERROR("Unknown error") {
        override val userMessage: String = "Unexpected error occurred"
        override fun getCoderError(): String = "UE000"
    },
    CONNECTIVITY_ERROR("Connectivity error") {
        override val userMessage: String = "Failure Request"
        override fun getCoderError(): String = "CE003"
        override fun getRetryIntents(): Int = 3
    };

    // Como esta propiedad y este método están marcados con "abstract", cada enumeración debe implementar dicha
    // propiedad y dicho método de forma obligatoria
    abstract val userMessage: String;
    abstract fun getCoderError(): String
    // Como este método está marcado con "open", cada enumeración puede sobrescribir su comportamiente por defecto de
    // forma opcional
    open fun getRetryIntents(): Int = 1
    // Este método no pude ser sobrescrito por las enumeraciones y, por lo tanto, este comportamiento de este método va
    // a ser común para todas las enumeraciones
    fun otraFunc(): Int = 0
}