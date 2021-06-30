import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
// https://www.spoj.com/problems/AMR10F/
public class AMR10F {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCases.length; i++) {
            StringTokenizer st = new StringTokenizer(testCases[i]);
            int piles = Integer.valueOf(st.nextToken());
            int startNum = Integer.valueOf(st.nextToken());
            int diff = Integer.valueOf(st.nextToken());
            int result = startNum;
            for (int j = 1; j <= piles; j++) {
                result += j*diff;
            }
            bw.write(String.valueOf(result));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
