import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> primes = new ArrayList<Integer>(); 
        for (int candidate = 2; number > 1; candidate++) {
            for (; number % candidate == 0; number /= candidate) {
                primes.add(candidate);
            }
        }
        return primes; 
    }
}
