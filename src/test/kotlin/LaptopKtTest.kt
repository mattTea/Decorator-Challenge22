import assertk.assertThat
import assertk.assertions.isEmpty
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class LaptopKtTest {

    @Test
    fun `should create laptop with empty description and base total price when no options added`() {
        val laptop = BaseLaptop()

        assertThat(laptop.description).isEqualTo("Base laptop @ 1000.0")
        assertThat(laptop.price).isEqualTo(1000.0)
    }

    @Test
    fun `should create laptop with description and price that includes a processor upgrade`() {
        val laptop = ProcessorUpgrade(BaseLaptop())

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99"
        )
        assertThat(laptop.price).isEqualTo(1149.99)
    }

    @Test
    fun `should create laptop with description and price that includes a processor and memory upgrade`() {
        val laptop = MemoryUpgrade(ProcessorUpgrade(BaseLaptop()))

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99, 1TB RAM @ 49.99"
        )
        assertThat(laptop.price).isEqualTo(1199.98)
    }

    @Test
    fun `should create laptop with description and price that includes processor, memory and hard drive upgrades`() {
        val laptop = DriveUpgrade(MemoryUpgrade(ProcessorUpgrade(BaseLaptop())))

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99, 1TB RAM @ 49.99, SSD @ 109.99"
        )
        assertThat(laptop.price).isEqualTo(1309.97)
    }

    @Test
    fun `should create laptop with description and price that includes processor, memory, hard drive and graphics card upgrades`() {
        val laptop = GraphicsUpgrade(DriveUpgrade(MemoryUpgrade(ProcessorUpgrade(BaseLaptop()))))

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99, 1TB RAM @ 49.99, SSD @ 109.99, Lightning Graphics Card @ 29.99"
        )
        assertThat(laptop.price).isEqualTo(1339.96)
    }

    @Test
    fun `should create laptop with description and price that includes processor, memory, hard drive, graphics card and battery upgrades`() {
        val laptop = BatteryUpgrade(GraphicsUpgrade(DriveUpgrade(MemoryUpgrade(ProcessorUpgrade(BaseLaptop())))))

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99, 1TB RAM @ 49.99, SSD @ 109.99, Lightning Graphics Card @ 29.99, Massive Battery @ 39.99"
        )
        assertThat(laptop.price).isEqualTo(1379.95)
    }

    @Test
    fun `should create laptop with description and price that includes processor, memory, hard drive, graphics card, battery and case upgrades`() {
        val laptop = CaseUpgrade(BatteryUpgrade(GraphicsUpgrade(DriveUpgrade(MemoryUpgrade(ProcessorUpgrade(BaseLaptop()))))))

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99, 1TB RAM @ 49.99, SSD @ 109.99, Lightning Graphics Card @ 29.99, Massive Battery @ 39.99, Bling Case @ 59.99"
        )
        assertThat(laptop.price).isEqualTo(1439.94)
    }
}