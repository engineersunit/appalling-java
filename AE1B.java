import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.spoj.com/problems/AE1B/
public class AE1B {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numOfBoxes = Integer.valueOf(st.nextToken());
        int numOfScrewsPerTable = Integer.valueOf(st.nextToken());
        int numOfTables = Integer.valueOf(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] boxCapacities = new int[numOfBoxes];
        for (int i = 0; i < boxCapacities.length; i++) {
            boxCapacities[i] = Integer.valueOf(st1.nextToken());
        }
        Arrays.sort(boxCapacities);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int resultBoxes = 0, collectedScrews = 0, neededScrews = 0;
        neededScrews = numOfTables * numOfScrewsPerTable;
        for (int i = boxCapacities.length - 1; i >= 0; i--) {
            if (collectedScrews < neededScrews) {
                collectedScrews += boxCapacities[i];
                resultBoxes++;
            } else {
                break;
            }
        }
        bw.write(String.valueOf(resultBoxes));
        bw.flush();
        bw.close();
    }
}
