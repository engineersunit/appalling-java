import java.util.Arrays;
import java.util.Scanner;
public class DIVSUM {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numOfTestCases = sc.nextInt();
       int[] testCaseData = new int[numOfTestCases];
       int[] testCaseResult = new int[numOfTestCases];
       for (int i = 0; i < numOfTestCases; i++) {
           testCaseData[i] = sc.nextInt();           
       }
       System.out.println(Arrays.toString(testCaseData));
       
       for (int i : testCaseData) {
          if (i == 1) {
            testCaseResult[i] = 0;
            continue;
          } 
          

       } 
    }
}
