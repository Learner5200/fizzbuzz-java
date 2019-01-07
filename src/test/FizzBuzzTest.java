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

    @Test
    public void testFizzesFor9() {
        String message = FizzBuzz.message(9);
        assertEquals("fizz", message);
    }

    @Test
    public void testBuzzesFor5() {
        String message = FizzBuzz.message(5);
        assertEquals("buzz", message);
    }

    @Test
    public void testBuzzesFor35() {
        String message = FizzBuzz.message(35);
        assertEquals("buzz", message);
    }

    @Test
    public void testFizzBuzzesFor15() {
        String message = FizzBuzz.message(15);
        assertEquals("fizzbuzz", message);
    }

    @Test
    public void testFizzBuzzesFor30() {
        String message = FizzBuzz.message(30);
        assertEquals("fizzbuzz", message);
    }
}
