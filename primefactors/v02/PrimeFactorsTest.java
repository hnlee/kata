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
}
