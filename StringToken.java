import java.util.StringTokenizer;

class StringToken{
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(":::,1",",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}