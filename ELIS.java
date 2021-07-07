import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

// https://www.spoj.com/problems/ELIS/
public class ELIS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        int[] testCases = new int[numOfTests];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = Integer.valueOf(st.nextToken());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] lis = new int[numOfTests];
        Arrays.fill(lis, 1);
        for (int i = 1; i < testCases.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((testCases[i] > testCases[j]) && ((lis[j] + 1) > lis[i])) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        bw.write(String.valueOf(Arrays.stream(lis).max().getAsInt()));
        bw.flush();
        bw.close();
    }
}
