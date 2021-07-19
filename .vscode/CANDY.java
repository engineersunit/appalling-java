import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class CANDY {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int input = Integer.valueOf(br.readLine());
        List<Integer[]> testCases = new ArrayList<>();
        while (input != -1) {

            Integer[] testCase = new Integer[input];
            for (int i = 0; i < input; i++) {

                testCase[i] = Integer.valueOf(br.readLine());
            }
            testCases.add(testCase);
            input = Integer.valueOf(br.readLine());
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCases.size(); i++) {
            Integer[] testCaseData = testCases.get(i);
            int sum = 0;
            for (int j = 0; j < testCaseData.length; j++) {
                sum += testCaseData[j];

            }
            if (sum % testCaseData.length != 0) {
                bw.write(String.valueOf(-1));
                bw.append("\n");
                continue;
            }
            int result = 0;
            int average = sum / testCaseData.length;
            for (int j = 0; j < testCaseData.length; j++) {
                if (testCaseData[j] < average)
                    result += average - testCaseData[j];
            }
            bw.write(String.valueOf(result));
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
