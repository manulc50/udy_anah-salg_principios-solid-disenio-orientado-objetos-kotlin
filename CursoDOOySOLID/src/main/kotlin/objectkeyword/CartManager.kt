package objectkeyword

// "object" permite definir una clase y crea una única instancia de esa clase, es decir, crea
// un Singleton

object CartManager {
    val products = mutableListOf<Product>()

    fun getProductName(): List<String> {
        return products.map { it.name }
    }

    fun addProduct(product: Product): Unit {
        products.add(product)
    }
}

class Product(
    val name: String
)