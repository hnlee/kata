import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactorsTest {

  @Test
  public void testOne() {
    List<Integer> list = new ArrayList<Integer>();
    assertEquals(list, PrimeFactors.generate(1));
  }

  @Test
  public void testTwo() {
    List<Integer> list = Arrays.asList(2);
    assertEquals(list, PrimeFactors.generate(2));
  }

  @Test
  public void testThree() {
    List<Integer> list = Arrays.asList(3);
    assertEquals(list, PrimeFactors.generate(3));
  }

  @Test
  public void testFour() {
    List<Integer> list = Arrays.asList(2, 2);
    assertEquals(list, PrimeFactors.generate(4));
  }

  @Test
  public void testSix() {
    List<Integer> list = Arrays.asList(2, 3);
    assertEquals(list, PrimeFactors.generate(6));
  }

  @Test
  public void testEight() {
    List<Integer> list = Arrays.asList(2, 2, 2);
    assertEquals(list, PrimeFactors.generate(8));
  }

  @Test
  public void testNine() {
    List<Integer> list = Arrays.asList(3, 3);
    assertEquals(list, PrimeFactors.generate(9));
  }


}
