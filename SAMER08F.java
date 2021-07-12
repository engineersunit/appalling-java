import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
//https://www.spoj.com/problems/SAMER08F/
public class SAMER08F {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        List<Integer> testCases = new ArrayList<Integer>();
        while (true) {
            int input = Integer.valueOf(br.readLine());
            if (input == 0) {
                break;
            }
            testCases.add(input);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCases.size(); i++) {
            int result = 0;
            int testData = testCases.get(i);
            for (int j = 1; j <= testData; j++) {
                result += j * j;
            }
            bw.write(String.valueOf(result));

            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
