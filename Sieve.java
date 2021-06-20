import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc = null;
        int num;
        try {
            sc = new Scanner(System.in);
            num = sc.nextInt();
        } finally {
            sc.close();
        }
        long startTime = System.nanoTime();
        System.out.println("Start time: " + startTime);
        boolean[] sieve = new boolean[num + 1];
        Arrays.fill(sieve, true);
        for (int i = 2; i * i <= num; i++) {    
            if (sieve[i] == true) {
                for (int j = i * i; j <= num; j += i) {
                    sieve[j] = false;
                }
            }
        }
        System.out.println("Primes: ");
        int numOfPrimes = 0;
        for (int i = 2; i < sieve.length; i++) {
            if (sieve[i]) {
                numOfPrimes++;
                // System.out.println(i);
            }
        }
        System.out.println("Total Primes: " + numOfPrimes);
        
        long endTime = System.nanoTime();
        System.out.println("End time: " + endTime);
        System.out.println("Total time: " + (endTime - startTime));

    }
}
