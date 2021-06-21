import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

// https://www.spoj.com/problems/STRHH/
public class STRHH {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCases.length; i++) {
            char[] chArr = testCases[i].toCharArray();
            for (int j = 0; j < testCases[i].length() / 2; j += 2) {
                bw.append(chArr[j]);
            }
            bw.append("\n");
        }
        bw.flush();
        bw.close();

    }
}
