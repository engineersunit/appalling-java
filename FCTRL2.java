import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

//https://www.spoj.com/problems/FCTRL2/
public class FCTRL2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        int[] testCases = new int[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = Integer.valueOf(br.readLine());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < testCases.length; i++) {
            bw.write(((getfactorial(new BigDecimal(testCases[i])))).toString());
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }

    static BigDecimal getfactorial(BigDecimal n) {
        if (n == BigDecimal.ONE) {
            return n;
        } else {
            return n.multiply(getfactorial(n.subtract(BigDecimal.ONE)));
        }
    }
}
