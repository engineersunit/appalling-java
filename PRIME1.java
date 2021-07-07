import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;
// https://www.spoj.com/problems/PRIME1/
public class PRIME1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }

        int max = 0;
        for (int i = 0; i < testCases.length; i++) {
            StringTokenizer st = new StringTokenizer(testCases[i]);
            st.nextToken();
            int end = Integer.valueOf(st.nextToken());
            if (end > max) {
                max = end;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Vector<Integer> primes = new Vector<>();
        segmentedSieve(max, primes);
        
        for (int i = 0; i < testCases.length; i++) {
            StringTokenizer st = new StringTokenizer(testCases[i]);
            int start = Integer.valueOf(st.nextToken());
            int end = Integer.valueOf(st.nextToken());
            for (int j = start; j <= end; j++) {
                if (sieve[j]) {
                    bw.write(String.valueOf(j));
                    bw.append("\n");
                }
            }
            if (i != testCases.length - 1)
                bw.append("\n");
        }

        bw.flush();
        bw.close();
    }

    static void simpleSieve(int limit, Vector<Integer> primes) {
        boolean[] sieve = new boolean[limit + 1];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        int sqrt = ((Double) Math.sqrt(limit)).intValue();
        for (int i = 2; i <= sqrt; i++) {
            if (sieve[i]) {
                for (int j = i * i; j < sieve.length; j += i) {
                    sieve[j] = false;
                }
            }
        }
       for (int i = 2; i < sieve.length; i++) {
        if (sieve[i]) {
            primes.add(i);
        }
        } 
    }


    static void segmentedSieve(int limit, Vector<Integer> primes) {
        //https://www.geeksforgeeks.org/segmented-sieve/
        int simpleSieveLimit  =  ((Double)Math.sqrt(limit)).intValue() + 1;
        simpleSieve(simpleSieveLimit, primes);


    }
}
