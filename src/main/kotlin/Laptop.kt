fun main() {
//    val laptop = Laptop()
//
//    println(laptop.processor.price)
}

const val BASE_PRICE = 1000.0

interface Laptop {
    val description: String
    val price: Double
}

class BaseLaptop : Laptop {
    override val description: String
        get() = "Base laptop"

    override val price: Double
        get() = BASE_PRICE
}

class ProcessorUpgrade(private val baseLaptop: BaseLaptop) : Laptop by baseLaptop {
    private val optionPrice = 149.99

    override val price = baseLaptop.price + optionPrice
    override val description = "${baseLaptop.description} @ $BASE_PRICE, with 18 core processor @ $optionPrice. Total: $price"
}
