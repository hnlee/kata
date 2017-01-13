import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PrimeFactorsTest {
  
  @Test
  public void testOne() {
    List list = new ArrayList<Integer>();
    assertEquals(list, PrimeFactors.generate(1));
  }

  @Test
  public void testTwo() {
    List list = Arrays.asList(2);
    assertEquals(list, PrimeFactors.generate(2));
  }

  @Test
  public void testThree() {
    List list = Arrays.asList(3);
    assertEquals(list, PrimeFactors.generate(3));
  }

  @Test
  public void testFour() {
    List list = Arrays.asList(2, 2);
    assertEquals(list, PrimeFactors.generate(4));
  }

  @Test
  public void testSix() {
    List list = Arrays.asList(2, 3);
    assertEquals(list, PrimeFactors.generate(6));
  }

  @Test
  public void testEight() {
    List list = Arrays.asList(2, 2, 2);
    assertEquals(list, PrimeFactors.generate(8));
  }

  @Test
  public void testNine() {
    List list = Arrays.asList(3, 3);
    assertEquals(list, PrimeFactors.generate(9));
  }

}
