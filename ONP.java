import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;
//https://www.spoj.com/problems/ONP/
public class ONP {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCases.length; i++) {
            char[] testCaseDataChars = testCases[i].toCharArray();
            char[] testResultChars = new char[testCases[i].length()];
            Stack<Character> s;
            for (int j = 0; j < testCaseDataChars.length; j++) {
                s = new Stack<Character>();
                Character c = testCaseDataChars[j];
                if (c.equals(')')) {
                    while(s.peek().equals('(')){
                        Character c = s.pop();

                    }        
                }else{
                    s.push(c);
                }
            }

            // bw.write(testCases[i]);
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
