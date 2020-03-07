fun main() {
    //TODO
}

interface Laptop {
    val price: Double
    val description: String
}

class BaseLaptop : Laptop {
    override val price = 1000.0
    override val description = "Base laptop @ $price"
}

class ProcessorUpgrade(private val laptop: Laptop) : Laptop by laptop {
    private val optionPrice = 149.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, 18 core processor @ $optionPrice"
}

class MemoryUpgrade(private val laptop: Laptop) : Laptop by laptop {
    private val optionPrice = 49.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, 1TB RAM @ $optionPrice"
}
