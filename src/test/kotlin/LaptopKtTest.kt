import assertk.assertThat
import assertk.assertions.isEmpty
import org.junit.jupiter.api.Test

class LaptopKtTest {

    @Test
    fun `should create laptop with empty description when no options added`() {
        val laptop = Laptop()

        assertThat(laptop.description).isEmpty()
    }
}