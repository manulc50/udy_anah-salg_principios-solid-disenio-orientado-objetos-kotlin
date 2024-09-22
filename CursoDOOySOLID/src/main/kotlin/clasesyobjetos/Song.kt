package clasesyobjetos

// "class Song(...){...}" es la forma reducida y recomendada de poner "class Song constructor(...){...}"
class Song (
    // Propiedades de la clase que se crean con el constructor
    val title: String,
    val artist: String
){
    // Propiedades de la clase
    private val artistUpper = artist.uppercase()

    init {
        println("Song $title created")
    }

    fun play() {
        println("Playing $title - $artistUpper")
    }

    fun stop() = println("Stopping $title")
}