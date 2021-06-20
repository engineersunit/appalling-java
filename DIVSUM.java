import java.util.Arrays;
import java.util.Scanner;

public class DIVSUM {
  public static void main(String[] args) {
    // Scan the inputs
    Scanner sc = new Scanner(System.in);
    // number of test cases
    int numOfTestCases = sc.nextInt();
    // test case data
    int[] testCaseData = new int[numOfTestCases];
    // test case results
    int[] testCaseResult = new int[numOfTestCases];
    // store test case data
    for (int i = 0; i < numOfTestCases; i++) {
      testCaseData[i] = sc.nextInt();
    }
    // System.out.println(Arrays.toString(testCaseData));
    int maxInput = 5_00_000;
    int primeLimit = ((Double) Math.sqrt(maxInput)).intValue();
    // generate primes
    // there are 168 primes under 1000
    // https://en.wikipedia.org/wiki/Prime_number_theorem#Table_of_%CF%80(x),_x_/_log_x,_and_li(x)
    boolean[] primes = new boolean[maxInput+1];
    // fill the array with true
    Arrays.fill(primes, true);
    for (int i = 2; i <= primeLimit; i++) {
      if (primes[i]) {
        for (int j = i * i; j <= maxInput; j += i) {
          primes[j] = false;          
        }
      }
    }
    // int numOfPrimes = 0;
    // for (int i = 2; i < primes.length; i++) {
    //   if (primes[i]) {
    //     numOfPrimes++;
    //   }
    // }
    // System.out.println(numOfPrimes);

    // There are 41_538 primes under 5_00_000
    int[] primeNums = new int[41_538];
    for (int i = 2, j = 0; i < primes.length; i++) {
      if (primes[i]) {
        primeNums[j] = i;
        j++;
      }
    }
    // System.out.println(Arrays.toString(primeNums));
    for (int j = 0; j < numOfTestCases; j++) {
      if (testCaseData[j] == 1) {
        testCaseResult[j] = 0;
        continue;
      }
      int sumOfPrimeFactors = 1;
      for (int i = 0; i < primeNums.length; i++) {
        if(testCaseData[j]%primeNums[i]==0){
          sumOfPrimeFactors += primeNums[i];
          testCaseData[j]/=primeNums[i];
        }
      }
      testCaseResult[j] = sumOfPrimeFactors;      
    }
    for (int i : testCaseResult) {
      System.out.println(i);
    }

  }
}
