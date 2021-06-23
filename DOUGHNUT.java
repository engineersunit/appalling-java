
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class DOUGHNUT {
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
            int numOfCats = Integer.valueOf(st.nextToken());
            int capacity = Integer.valueOf(st.nextToken());
            int weight = Integer.valueOf(st.nextToken());
            if ((numOfCats * weight) <= capacity) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
