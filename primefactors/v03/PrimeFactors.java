import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if (number % 2 == 0) {
            primes.add(2);
            number /= 2;
        }
        if (number > 1) {
            primes.add(number);
        }
        return primes;
    }

}
