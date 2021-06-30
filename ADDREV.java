import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ADDREV {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b = 0;
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = new StringBuffer();

        for (int i = 0; i < testCases.length; i++) {
            StringTokenizer st = new StringTokenizer(testCases[i]);
            a = Integer.valueOf(sb1.append(st.nextToken()).reverse().toString());
            b = Integer.valueOf(sb2.append(st.nextToken()).reverse().toString());
            bw.write(Integer.valueOf(sb3.append(a + b).reverse().toString()).toString());
            bw.append("\n");
            sb1.delete(0, sb1.length());
            sb2.delete(0, sb2.length());
            sb3.delete(0, sb3.length());
        }
        bw.flush();
        bw.close();
    }
}
