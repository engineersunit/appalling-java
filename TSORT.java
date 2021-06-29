import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//https://www.spoj.com/problems/TSORT
public class TSORT {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        List<Integer> testCaseData = new ArrayList<Integer>(numOfTests);
        for (int i = 0; i < numOfTests; i++) {
            testCaseData.add(Integer.valueOf(br.readLine()));
        }
        Collections.sort(testCaseData);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numOfTests; i++) {
            bw.write(String.valueOf(testCaseData.get(i)));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
