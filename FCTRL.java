import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.spoj.com/problems/FCTRL/
public class FCTRL {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        int[] testCases = new int[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = Integer.valueOf(br.readLine());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < testCases.length; i++) {
            int result = 0;
            for (int j = 5; testCases[i] / j >= 1; j *= 5) {
                result += testCases[i] / j;
            }
            bw.write(String.valueOf(result));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
