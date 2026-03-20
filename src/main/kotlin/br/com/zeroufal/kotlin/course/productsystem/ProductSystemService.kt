package org.example.br.com.zeroufal.kotlin.course.productsystem

class ProductSystemService {
    private fun filterPrice(products: List<Product>, price: Double = 200.0) = products.filter { it.price > price }

    private fun getProductsNames(products: List<Product>) = products.map { it.name }

    private fun getProductsSum(products: List<Product>): Double {
        return products.sumOf { it.price }
    }

    private fun getProductsNamesLength(products: List<Product>): List<Int> {
        return products.map { it.name.length }
    }

    fun templateMethod() {
        val products = listOf(
            Product("Computer", 400.0, "Tecnology"),
            Product("Table", 40.0, "Furniture"),
            Product("Guitar", 400.0, "Musical Instrument")
        )

        val price = 200.0
        val filteredProducts = filterPrice(products, price)
        val productsNames = getProductsNames(products)
        val sumOfPrices = getProductsSum(products)
        val productsNamesLegth = getProductsNamesLength(products)

        println("Products filtered by price $price are $filteredProducts")
        println("List of Products Names is $productsNames")
        println("The sum of the prices is $sumOfPrices")
        println("List of Products Names length is $productsNamesLegth")
    }
}