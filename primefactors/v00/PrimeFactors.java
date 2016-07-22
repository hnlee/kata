import java.util.*;

public class PrimeFactors {
    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int candidate = 2;
        while (number > 1) {
            while (number % candidate == 0) {
                primes.add(candidate);
                number /= candidate;
            }
            candidate++;
        }
        if (number > 1) {
            primes.add(number);
        }
        return primes;
    }
}
