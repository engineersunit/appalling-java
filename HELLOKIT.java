import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
// https://www.spoj.com/problems/HELLOKIT/
public class HELLOKIT {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        List<String> testCases = new ArrayList<String>();
        String s;
        while (true) {
            s = br.readLine();
            if (".".equals(s)) {
                break;
            }
            testCases.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word;
        int repeat;
        for (int i = 0; i < testCases.size(); i++) {
            StringTokenizer st = new StringTokenizer(testCases.get(i));
            word = st.nextToken().repeat(repeat = Integer.valueOf(st.nextToken()));
            int length = word.length();
            char[] wordArray = word.toCharArray();
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < length/repeat; j++) {
                bw.write(
                        sb.append(
                                String.valueOf(
                                        Arrays.copyOfRange(wordArray, j, length))
                                ).append(
                                        String.valueOf(
                                            Arrays.copyOf(wordArray, j)))
                        .toString());
                bw.append("\n");
                sb.delete(0, sb.length());
            }
        }
        bw.flush();
        bw.close();
    }
}
