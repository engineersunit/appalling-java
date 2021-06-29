import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

//https://www.spoj.com/problems/EZDIJKST/
public class EZDIJKST {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int numOfTests = Integer.valueOf(br.readLine());
        Map[] testData = new Map[numOfTests];
        HashMap<String, Object> testDataMap = null;
        for (int i = 0; i < numOfTests; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            testDataMap = new HashMap<String, Object>();
            int VERTICES_NUM = Integer.valueOf(st.nextToken());
            int EDGES_NUM = Integer.valueOf(st.nextToken());
            testDataMap.put("VERTICES_NUM", VERTICES_NUM);
            testDataMap.put("EDGES_NUM", EDGES_NUM);
            int[][] GRAPH_DATA = new int[VERTICES_NUM][VERTICES_NUM];
            for (int j = 0; j < EDGES_NUM; j++) {
                st = new StringTokenizer(br.readLine());
                GRAPH_DATA[Integer.valueOf(st.nextToken()) - 1][Integer.valueOf(st.nextToken()) - 1] = Integer
                        .valueOf(st.nextToken());
            }
            testDataMap.put("GRAPH_DATA", GRAPH_DATA);
            st = new StringTokenizer(br.readLine());
            int FROM_VERTEX = Integer.valueOf(st.nextToken());
            int TO_VERTEX = Integer.valueOf(st.nextToken());
            testDataMap.put("FROM_VERTEX", FROM_VERTEX);
            testDataMap.put("TO_VERTEX", TO_VERTEX);

            testData[i] = testDataMap;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testData.length; i++) {

            bw.write(testData[i].get("VERTICES_NUM").toString());
            bw.append("\n");
            bw.write(testData[i].get("EDGES_NUM").toString());
            bw.append("\n");

            for (int j = 0; j < ((int[][]) testData[i].get("GRAPH_DATA")).length; j++) {
                bw.write(Arrays.toString(((int[][]) testData[i].get("GRAPH_DATA"))[j]));
            }
            bw.append("\n");
            bw.write(testDataMap.get("FROM_VERTEX").toString());
            bw.append("\n");
            bw.write(testDataMap.get("TO_VERTEX").toString());
            bw.append("\n");
            

        }
        bw.flush();
        bw.close();
    }
}
