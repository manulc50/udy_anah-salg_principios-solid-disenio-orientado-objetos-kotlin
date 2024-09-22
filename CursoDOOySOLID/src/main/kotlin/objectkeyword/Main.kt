package objectkeyword

fun main() {
    // "CartManager" es un Singleton
    CartManager.addProduct(Product("Apple"))
    val productNames = CartManager.getProductName()
    productNames.forEach { name -> println(name) }
}