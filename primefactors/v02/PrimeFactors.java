import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int factor = 2; number > 1; factor++) {
            for (; number % factor == 0; number /= factor) {
                primes.add(factor);
            }
        }
        return primes;
    }   

}
