import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int numOfTests = sc.nextInt();
		sc.nextLine();
		String[] testCasesData = new String[numOfTests];
		for (int i = 0; i < numOfTests; i++) {
			testCasesData[i] = sc.nextLine();
		}

		System.out.println("Number of tests: " + numOfTests);
		System.out.println("All test data: " + Arrays.toString(testCasesData));

		for (String s : testCasesData) {
			String[] testCaseDataString = s.split(" ");
			System.out.println(Arrays.toString(testCaseDataString));
			// convert to int
			int min = Integer.valueOf(testCaseDataString[0]);
			int max = Integer.valueOf(testCaseDataString[1]);

			System.out.println("Test data: min: " + min + ", max: " + max);
			// find primes
			boolean[] sieve = new boolean[max - min + 2];
			System.out.println("Initial sieve: " + Arrays.toString(sieve));

			// set all values to true
			Arrays.fill(sieve, true);
			System.out.println("Defaulted sieve: " + Arrays.toString(sieve));

			for (int i = 2; i * i <= max; i++) {
				if(sieve[i] == true){
					for (int j = Math.max(i*i, min); j <= max; j+=i) {
						sieve[j] = false;
					}
				}
			}
			System.out.println("Primes: " + Arrays.toString(sieve));
		}

	}
}