import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class FizzBuzzTests {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void returnsNumber_whenNoFizzOrBuzzRuleApplies() {
        assertEquals("1", fizzBuzz.getOutputFromValue(1));
        assertEquals("2", fizzBuzz.getOutputFromValue(2));
        assertEquals("4", fizzBuzz.getOutputFromValue(4));
    }

    @Test
    void returnsFizz_whenDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.getOutputFromValue(6));
    }

    @Test
    void returnsFizz_whenContainsThree() {
        assertEquals("Fizz", fizzBuzz.getOutputFromValue(13));
    }

    @Test
    void returnsBuzz_whenDivisibleByFive() {
        assertEquals("Buzz", fizzBuzz.getOutputFromValue(10));
    }

    @Test
    void returnsBuzz_whenContainsFive() {
        assertEquals("Buzz", fizzBuzz.getOutputFromValue(52));
    }

    @Test
    void returnsFizzFizz_whenDivisibleByThreeAndContainsThree() {
        assertEquals("FizzFizz", fizzBuzz.getOutputFromValue(3));
    }

    @Test
    void returnsBuzzBuzz_whenDivisibleByFiveAndContainsFive() {
        assertEquals("BuzzBuzz", fizzBuzz.getOutputFromValue(5));
    }

    @Test
    void returnsFizzBuzz_whenContainsThreeAndContainsFive() {
        assertEquals("FizzBuzz", fizzBuzz.getOutputFromValue(53));
    }

    @Test
    void returnsFizzBuzzBuzz_whenContainsThreeAndIsDivisibleByFiveAndContainsFive() {
        assertEquals("FizzBuzzBuzz", fizzBuzz.getOutputFromValue(35));
    }

    @Test
    void returnsFizzBuzzBuzz_whenDivisibleByThreeAndFiveAndContainsFive() {
        assertEquals("FizzBuzzBuzz", fizzBuzz.getOutputFromValue(15));
    }

    @Test
    void fizzAlwaysPrecedesBuzz_whenBothArePresent() {
        assertTrue(fizzBuzz.getOutputFromValue(35).startsWith("Fizz"));
    }
}
