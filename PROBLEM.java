import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//https://www.spoj.com/problems/PROBLEM/
public class PROBLEM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCases.length; i++) {
            int result = 0;
            char[] chars = testCases[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '0' || chars[j] == '6' || chars[j] == '9') {
                    result++;
                } else if (chars[j] == '8') {
                    result += 2;
                }
            }
            bw.write(String.valueOf(result));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
