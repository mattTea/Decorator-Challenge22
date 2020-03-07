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
    fun `create laptop with description and price that includes a processor and memory upgrade`() {
        val laptop = MemoryUpgrade(ProcessorUpgrade(BaseLaptop()))

        assertThat(laptop.description).isEqualTo(
            "Base laptop @ 1000.0, 18 core processor @ 149.99, 1TB RAM @ 49.99"
        )
        assertThat(laptop.price).isEqualTo(1199.98)
    }
}