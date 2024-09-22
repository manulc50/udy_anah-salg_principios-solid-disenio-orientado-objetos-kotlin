package sealedclass

// Las clases "Sealed" son como las enumeraciones pero nos permite definir un constrcutor distinto en cada
// opción. En las enumeraciones, sólo podemos definir un tipo de constructor para todas las opciones

sealed class RequestResult
class Success(post: Post): RequestResult()
class Failure(e: Throwable): RequestResult()

class Post(
    val title: String
)