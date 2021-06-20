import java.util.Arrays;

public class SumOfPrimeFactors {
    public static void main(String[] args) {
        // input
        int input = 5_00_000;
        // limit for prime generation for max 5_00_000
        final int limit = ((Double)(Math.sqrt(input))).intValue() + 1;
        System.out.println(limit);
        boolean[] sieve = new boolean[limit+1];
        Arrays.fill(sieve, true);
        for (int j = 2; j <= limit; j++) {
            if(sieve[j]==true){
                for (int j2 = j*j; j2 <= limit; j2+=j) {
                    sieve[j2] = false;
                }
            }
        }
        int primes[] =  new int[168];
        int i=0;
        for (int j = 2 ; j < sieve.length; j++) {
            if(sieve[j]){
            primes[i] = j;
            i++;
            }
        }
        primes = Arrays.copyOf(primes, i);
        System.out.println(Arrays.toString(primes));;
        int sum = 1;
        int inputSqRt= ((Double)Math.sqrt(input)).intValue();
        for (int j = 0; j < primes.length && primes[j] < inputSqRt; j++) {
            while(input % primes[j] == 0){
                sum+=primes[j];
                input = input / primes[j];
            }
        }
        System.out.println(sum);
        
        
        
    }
}
