import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PrimeFactors {

  public static List<Integer> generate(int number) {
    List<Integer> primes = new ArrayList<Integer>();
    for(int prime = 2; number > 1; prime++) {
      for(; number % prime == 0; number /= prime) { 
        primes.add(prime);
      }
    }
    return primes;
  }

}
