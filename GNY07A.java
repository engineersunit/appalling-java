import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//https://www.spoj.com/problems/GNY07A/
public class GNY07A {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int missCharPos;
        String word;
        for (int i = 0; i < testCases.length; i++) {
            StringTokenizer st = new StringTokenizer(testCases[i]);
            missCharPos = Integer.valueOf(st.nextToken());
            bw.write(String.valueOf(i + 1));
            bw.write(" ");
            word = st.nextToken();
            bw.write(word.substring(0, missCharPos - 1).concat(word.substring(missCharPos, word.length())));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
