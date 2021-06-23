import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
//https://www.spoj.com/problems/INTEST/
class INTEST  {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numOfTests = Integer.parseInt(st.nextToken());
            int divisor = Integer.parseInt(st.nextToken());
            String[] testCases = new String[numOfTests];
            for (int i = 0; i < numOfTests; i++) {
                testCases[i] = br.readLine();
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int result = 0;
            for (int i = 0; i < testCases.length; i++) {
                if(Integer.parseInt(testCases[i])%divisor == 0){
                    result++;
                }                
            }
            bw.write(String.valueOf(result));
            bw.flush();
            bw.close();
    
        }
}