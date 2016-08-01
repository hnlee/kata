import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int prime = 2; number > 1; prime++) {
            for (; number % prime == 0; number /= prime) {
                primes.add(prime);
            }
        }
        return primes;
    }
}
