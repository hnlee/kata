import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int prime = 2;
        while (number > 1) {
            while (number % prime == 0) {
                primes.add(prime);
                number /= prime;
            }
            prime++;
        }
        if (number > 1) {
            primes.add(number);
        }
        return primes;
    }

}
