import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class MIRRORED {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        List<String> testCases = new ArrayList<String>();
        while (true) {
            String test = br.readLine();
            if ("  ".equals(test)) {
                break;
            }
            testCases.add(test);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Ready");
        bw.append("\n");
        for (int i = 0; i < testCases.size(); i++) {
            if (testCases.get(i).equals("pq") || testCases.get(i).equals("qp") || testCases.get(i).equals("bd")
                    || testCases.get(i).equals("db")) {
                bw.write("Mirrored pair");
            } else {
                bw.write("Ordinary pair");
            }
            bw.append("\n");
        }
        bw.flush();
        bw.close();
    }
}
