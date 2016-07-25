import java.util.ArrayList;

class PrimeFactors {
    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        if (number > 1) {
            primes.add(number);
        }
        return primes;
    }
}
