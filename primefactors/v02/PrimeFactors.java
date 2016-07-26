import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int factor = 2;
        while (number > 1) {
            primes.add(factor);
            number /= factor;
        }
        return primes;
    }   

}
