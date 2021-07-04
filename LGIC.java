import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
// https://www.spoj.com/problems/LGIC/
public class LGIC {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        double num = Double.valueOf(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double result = Math.pow(2d, num) - num;
        result += factorial(num);
        bw.write(String.valueOf(((Double) (result)).intValue()));
        bw.flush();
        bw.close();
    }

    private static double factorial(double num) {
        if (num == 1) {
            return 1;
        } else {
            return factorial(num - 1) * num;
        }
    }
}
