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
        int numOfTests = Integer.valueOf(st.nextToken());
        String[] testCases = new String[numOfTests];
        for (int i = 0; i < numOfTests; i++) {
            testCases[i] = br.readLine();
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] sizes = new int[numOfTests];
        int[] values = new int[numOfTests];
        for (int i = 0; i < testCases.length; i++) {
            String[] splits = testCases[i].split(" ");
            sizes[i] = Integer.valueOf(splits[0]);
            values[i] = Integer.valueOf(splits[1]);            
        }
        System.out.println(Arrays.toString(sizes));
        System.out.println(Arrays.toString(values));
        bw.flush();
        bw.close();
    }
}
