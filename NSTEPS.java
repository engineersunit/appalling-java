import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// https://www.spoj.com/problems/NSTEPS/
public class NSTEPS {

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
            String result = "No Number";
            int x = Integer.valueOf(st.nextToken());
            int y = Integer.valueOf(st.nextToken());
            if (x == y) {
                if (x % 2 == 0) {
                    result = String.valueOf(2 * x);
                } else {
                    result = String.valueOf(2 * x - 1);
                }
            } else if (y == (x - 2) && x > 1) {
                if (x % 2 == 0) {
                    result = String.valueOf(x + y);
                } else {
                    result = String.valueOf(x + y - 1);
                }
            }
            bw.write(result);
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
