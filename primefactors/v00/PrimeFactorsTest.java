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
}
