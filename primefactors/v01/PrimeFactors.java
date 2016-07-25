import java.util.ArrayList;

class PrimeFactors {
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
        return primes;
    }
}
