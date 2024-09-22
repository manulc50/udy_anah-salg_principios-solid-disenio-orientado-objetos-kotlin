package constructores

import java.time.LocalDateTime

class Post(
    // Constructor principal
    // Propiedades de la clase que se crean con el constructor
    val name: String,
    val author: String,
    val date: LocalDateTime
) {
    // Propiedades de la clase
    private var body: String = ""
    private var category = ""

    // Constructor Secundario
    // Nota: Para decarlar constructores secundarios, debe existir el constructor primario y estos constructores
    // secundarios deben invocar al constructor primario
    constructor(
        // Propiedades de la clase que se crean con el constructor
        name: String,
        author: String,
        date: LocalDateTime,
        content: String,
        category: String
    ): this(name, author, date) {
        this.body = content
        this.category = category
    }

    fun publish(): String {
        return """
            Post Name: $name,
            Author: $author,
            Date: $date
            ${getCategorySection()}
            ${getContent()}
        """.trimIndent()
    }

    // Solo accesible a nivel de clase
    private fun getContent() = if(body.isNotBlank()) "Content: $body" else ""

    private fun getCategorySection(): String = if(category.isNotBlank()) "Content: $category" else ""
}