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
        List<Integer[]> testCases = new ArrayList<Integer[]>();
        for (int i = 0; i < numOfTests; i++) {
            int numOfPartcipants = Integer.valueOf(br.readLine());
            Integer[] testCaseDataMen = new Integer[numOfPartcipants];
            int num = 0;
            for (String s : br.readLine().split(" ")) {
                testCaseDataMen[num] = Integer.valueOf(s);
                num++;
            }
            
            Integer[] testCaseDataWomen = new Integer[numOfPartcipants];
            num = 0;
            for (String s : br.readLine().split(" ")) {
                testCaseDataWomen[num] = Integer.valueOf(s);
                num++;
            }
            
            testCases.add(testCaseDataMen);
            testCases.add(testCaseDataWomen);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < numOfTests; i++) {
            Integer[] testCaseDataMen = testCases.get(2 * i);
            Integer[] testCaseDataWomen = testCases.get(2 * i + 1);
            Arrays.sort(testCaseDataMen);
            Arrays.sort(testCaseDataWomen);
            int result = 0;
            for (int j = 0; j < testCaseDataMen.length; j++) {
                if(testCaseDataMen[j]==0 || testCaseDataWomen[j]==0){
                    continue;
                }
                result += testCaseDataMen[j] * testCaseDataWomen[j];
            }
            bw.write(String.valueOf(result));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
