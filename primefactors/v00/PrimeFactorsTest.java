import junit.framework.*;
import java.util.*;

public class PrimeFactorsTest extends TestCase {
    private ArrayList<Integer> list(int... ints) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n : ints) {
            list.add(n);
        }
        return list;
    }
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1)); 
    }
    public void testTwo() {
        assertEquals(list(2), PrimeFactors.generate(2));
    }
    public void testThree() {
        assertEquals(list(3), PrimeFactors.generate(3));
    }
    public void testFour() {
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }
    public void testSix() {
        assertEquals(list(2, 3), PrimeFactors.generate(6));
    }
    public void testEight() {
        assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
    }
    public void testNine() {
        assertEquals(list(3, 3), PrimeFactors.generate(9));
    }
    public void testLargePrime() {
        assertEquals(list(15485863), PrimeFactors.generate(15485863));
    }
    public void testProductofLargePrimes() {
        assertEquals(list(9929, 10039), 
                     PrimeFactors.generate(9929 * 10039));
    }
}
