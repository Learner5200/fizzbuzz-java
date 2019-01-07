package test;
import org.junit.*;
import static org.junit.Assert.*;
import main.FizzBuzz;

public class FizzBuzzTest {
    @Test
    public void testFizzesFor3() {
        String message = FizzBuzz.message(3);
        assertEquals("fizz", message);
    }
}
