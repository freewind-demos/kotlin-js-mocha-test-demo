import example.hello
import kotlin.test.*

class SimpleTest {

    @Test
    fun testHello() {
        assertEquals("Hello, Kotlin!", hello("Kotlin"))
    }

    @Ignore
    @Test
    fun testFooWrong() {
        assertEquals("aaa", hello("Kotlin"))
    }
}

@Ignore
class TestTest {
    @Test
    fun emptyTest() {
        // Will not run
    }
}