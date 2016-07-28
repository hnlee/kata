import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class PrimeFactorsTest {

    private ArrayList<Integer> list(int... ints) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : ints) {
            list.add(i);
        }
        return list; 
    }

    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    } 

    @Test
    public void testTwo() {
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    @Test
    public void testFour() {
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(list(2, 3), PrimeFactors.generate(6));
    }

}
