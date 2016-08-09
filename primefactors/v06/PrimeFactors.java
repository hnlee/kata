import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int candidate = 2; number > 1; candidate++) {
            for (; number % candidate == 0; number /= candidate) {
                primes.add(candidate);
            }
        }
        return primes;
    }

}
