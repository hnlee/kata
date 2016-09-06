import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class PrimeFactorsTest {
    
    @Test
    public void testOne() {
        List<Integer> primes = Arrays.asList();
        assertEquals(primes, PrimeFactors.generate(1));
    }

    @Test
    public void testTwo() {
        List<Integer> primes = Arrays.asList(2);
        assertEquals(primes, PrimeFactors.generate(2));
    }
        
    @Test
    public void testThree() {
        List<Integer> primes = Arrays.asList(3);
        assertEquals(primes, PrimeFactors.generate(3));
    }
        
    @Test
    public void testFour() {
        List<Integer> primes = Arrays.asList(2, 2);
        assertEquals(primes, PrimeFactors.generate(4));
    }

    @Test
    public void testSix() {
        List<Integer> primes = Arrays.asList(2, 3);
        assertEquals(primes, PrimeFactors.generate(6));
    }

    @Test
    public void testEight() {
        List<Integer> primes = Arrays.asList(2, 2, 2);
        assertEquals(primes, PrimeFactors.generate(8));
    }

    @Test
    public void testNine() {
        List<Integer> primes = Arrays.asList(3, 3);
        assertEquals(primes, PrimeFactors.generate(9));
    }
}
