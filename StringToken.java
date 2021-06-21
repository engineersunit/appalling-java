import java.util.StringTokenizer;

class StringToken{
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("WIS:::WIS_WD_RSQ_DEL_FIRST_OP,1",",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}