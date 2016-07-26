import java.util.ArrayList;

public class PrimeFactors {

    public static ArrayList<Integer> generate(int number) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int factor = 2;
        while (number > 1) {
            for (; number % factor == 0; number /= factor){
                primes.add(factor);
            }
            factor++; 
        }
        return primes;
    }   

}
