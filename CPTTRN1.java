import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// https://www.spoj.com/problems/CPTTRN1/
public class CPTTRN1 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            int numOfTests = Integer.valueOf(br.readLine());
            String[] testCases = new String[numOfTests];
            for (int i = 0; i < numOfTests; i++) {
                testCases[i] = br.readLine();
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < testCases.length; i++) {
                bw.append("\n");
            }
            bw.flush();
            bw.close();
    
        }
}
