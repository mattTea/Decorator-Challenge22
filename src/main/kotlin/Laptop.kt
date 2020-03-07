fun main() {
    val laptopWithItAll = CaseUpgrade(BatteryUpgrade(GraphicsUpgrade(DriveUpgrade(MemoryUpgrade(ProcessorUpgrade())))))

    println(laptopWithItAll.description)
    println("Total price: ${laptopWithItAll.price}")
    println("-------")

    val modestLaptop = MemoryUpgrade(CaseUpgrade())
    println(modestLaptop.description)
    println("Total price: ${modestLaptop.price}")
}

interface Laptop {
    val price: Double
    val description: String
}

class BaseLaptop : Laptop {
    override val price = 1000.0
    override val description = "Base laptop @ $price"
}

class ProcessorUpgrade(private val laptop: Laptop = BaseLaptop()) : Laptop by laptop {
    private val optionPrice = 149.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, 18 core processor @ $optionPrice"
}

class MemoryUpgrade(private val laptop: Laptop = BaseLaptop()) : Laptop by laptop {
    private val optionPrice = 49.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, 1TB RAM @ $optionPrice"
}

class DriveUpgrade(private val laptop: Laptop = BaseLaptop()) : Laptop by laptop {
    private val optionPrice = 109.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, SSD @ $optionPrice"
}

class GraphicsUpgrade(private val laptop: Laptop = BaseLaptop()) : Laptop by laptop {
    private val optionPrice = 29.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, Lightning Graphics Card @ $optionPrice"
}

class BatteryUpgrade(private val laptop: Laptop = BaseLaptop()) : Laptop by laptop {
    private val optionPrice = 39.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, Massive Battery @ $optionPrice"
}

class CaseUpgrade(private val laptop: Laptop = BaseLaptop()) : Laptop by laptop {
    private val optionPrice = 59.99

    override val price = laptop.price + optionPrice
    override val description = "${laptop.description}, Bling Case @ $optionPrice"
}
