package companionobject

// "companion object" nos permite crear métodos y propiedades estáticas de una clase

class Post {
    companion object {
        val number:Int = 2

        fun sayHello(): Unit {
            println("Hello")
        }
    }
}