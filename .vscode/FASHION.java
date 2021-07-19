import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://www.spoj.com/problems/FASHION/
public class FASHION {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        List<String[]> testCases = new ArrayList<String[]>();
        for (int i = 0; i < numOfTests; i++) {
            br.readLine();
            String[] testCaseDataMen = br.readLine().split(" ");
            Arrays.sort(testCaseDataMen);
            String[] testCaseDataWomen = br.readLine().split(" ");
            Arrays.sort(testCaseDataWomen);
            testCases.add(testCaseDataMen);
            testCases.add(testCaseDataWomen);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numOfTests; i++) {
            String[] testCaseDataMen = testCases.get(2 * i);
            String[] testCaseDataWomen = testCases.get(2 * i + 1);
            int result = 0;
            for (int j = 0; j < testCaseDataMen.length; j++) {
                result += Integer.valueOf(testCaseDataMen[j]) * Integer.valueOf(testCaseDataWomen[j]);
            }
            bw.write(String.valueOf(result));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
