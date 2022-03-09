import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class FizzTest {
    @Test
    public void FizzBuzzNormalNumbers() {

        Fizz fb = new Fizz();
        Assertions.assertEquals("1", fb.convert(1));
        Assertions.assertEquals("2", fb.convert(2));
    }

    @Test
    public void FizzBuzzThreeNumbers() {

        Fizz fb = new Fizz();
        Assertions.assertEquals("Fizz", fb.convert(3));
    }

    @Test
    public void FizzBuzzFiveNumbers() {

        Fizz fb = new Fizz();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

    @Test
    public void FizzBuzzThreeAndFiveNumbers() {

        Fizz fb = new Fizz();
        Assertions.assertEquals("Buzz", fb.convert(5));
    }

}
