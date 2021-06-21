import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// https://www.spoj.com/problems/SMPWOW/
public class SMPWOW {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        char[] wow = new char[numOfTests+2];
        wow[0] = 'W';
        Arrays.fill(wow, 1, numOfTests + 1, 'o');
        wow[numOfTests + 1] = 'w';
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(wow));
        bw.flush();
        bw.close();

    }
}
