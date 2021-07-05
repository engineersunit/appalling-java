import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/
https://www.spoj.com/problems/KNAPSACK/
*/
public class KNAPSACK {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sizeOfBag = Integer.valueOf(st.nextToken());
        int numOfObjects = Integer.valueOf(st.nextToken());
        String[] testCases = new String[numOfObjects];
        for (int i = 0; i < numOfObjects; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sizes = new int[numOfObjects];
        int[] values = new int[numOfObjects];
        for (int i = 0; i < testCases.length; i++) {
            String[] splits = testCases[i].split(" ");
            sizes[i] = Integer.valueOf(splits[0]);
            values[i] = Integer.valueOf(splits[1]);
        }
        // +1 array size for offset the object numbering to start from 1
        int[][] calc = new int[numOfObjects+1][sizeOfBag+1];
        for (int i = 0; i < numOfObjects; i++) {
            for (int j = 0; j < sizeOfBag; j++) {
                if (i == 0 || j == 0) {
                    calc[i][j] = 0;
                }else if (sizes[i]<=sizeOfBag) {
                    calc[i][j] = Math.max(a, b);
                }
            }
        }
        // System.out.println(Arrays.toString(sizes));
        // System.out.println(Arrays.toString(values));
        bw.flush();
        bw.close();
    }
}
