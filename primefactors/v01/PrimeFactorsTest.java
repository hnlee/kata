import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

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
        assertEquals(list(2, 2), PrimeFactors.generate(4));
    }
}
