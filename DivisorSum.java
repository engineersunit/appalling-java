import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class DivisorSum {
  public static void main(String[] args) throws NumberFormatException, IOException {
    
    // Scan the inputs
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // number of test cases
    int numOfTestCases = Integer.parseInt(br.readLine());
    // test case data
    int[] testCaseData = new int[numOfTestCases];
    // test case results
    int[] testCaseResult = new int[numOfTestCases];
    // store test case data
    for (int i = 0; i < numOfTestCases; i++) {
      testCaseData[i] = Integer.parseInt(br.readLine());
    }
    // long startTime = System.currentTimeMillis();
    // System.out.println(Arrays.toString(testCaseData));
    int maxInput = 5_00_000;
    int primeLimit = ((Double) Math.sqrt(maxInput)).intValue();
    // generate primes
    // there are 168 primes under 1000
    // https://en.wikipedia.org/wiki/Prime_number_theorem#Table_of_%CF%80(x),_x_/_log_x,_and_li(x)
    boolean[] primes = new boolean[maxInput + 1];
    // fill the array with true
    Arrays.fill(primes, true);
    for (int i = 2; i <= primeLimit; i++) {
      if (primes[i]) {
        for (int j = i * i; j <= maxInput; j += i) {
          primes[j] = false;
        }
      }
    }
    
    // There are 41_538 primes under 5_00_000
    int[] primeNums = new int[41_539];
    for (int i = 2, j = 0; i < primes.length; i++) {
      if (primes[i]) {
        primeNums[j] = i;
        j++;
      }
    }
    
    // FileWriter fw = new FileWriter("D:\\Code\\appalling-java\\PrimeNumbers.txt");
    // BufferedWriter primeWriter =  new BufferedWriter(fw);
    // primeWriter.write(Arrays.toString(primeNums));
    // primeWriter.close();
    // System.out.println(Arrays.toString(primeNums));
    for (int j = 0; j < numOfTestCases; j++) {
      // if the input is 1 then result is 0
      if (testCaseData[j] == 1) {
        testCaseResult[j] = 0;
        continue;
      }
      // if the input is a prime then result is prime + 1
      if(Arrays.binarySearch(primeNums, testCaseData[j])>-1){
        testCaseResult[j] = 1;
        continue;
      }

      int sumOfPrimeFactors = 1;
      int sqrtTestCaseData =((Double)Math.sqrt(testCaseData[j])).intValue();
      for (int i = 2; i <= sqrtTestCaseData; i++) {
       
        if (testCaseData[j] % i == 0) {
          sumOfPrimeFactors += i;
          // testCaseData[j] /= i;
          if(testCaseData[j]/i != i){
            sumOfPrimeFactors += (testCaseData[j]/i);
          }
        }
      }
      testCaseResult[j] = sumOfPrimeFactors;
    }
    // long endTime = System.currentTimeMillis();
    // System.out.println("Total time taken is: "+ (endTime-startTime) + " milli seconds");
    // startTime = System.currentTimeMillis();
    BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int i : testCaseResult) {
      output.write(i + "\n");
    }
    output.flush();
    // endTime = System.currentTimeMillis();
    // System.out.println("Total time taken is: "+ (endTime-startTime) + " milli seconds");
    
    // System.out.println("Total time taken is: "+ (endTime-startTime) + " milli
    // seconds");

  }
}
