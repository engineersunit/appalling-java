import java.util.Arrays;

class StringToken{
    public static void main(String[] args) {
        // StringTokenizer st = new StringTokenizer("WIS:::WIS_WD_RSQ_DEL_FIRST_OP:FND_MSG:1:FND_TKN_VER_NO:Work Def Name:: 01-1:FND_TKN_WD_NAME:");
        String st = new String("WIS:::WIS_WD_RSQ_DEL_FIRST_OPORA_FND_MSG_TKN1ORA_FND_MSG_TKNWork Def Name:: 01-1");
       String[] splits = st.split("ORA_FND_MSG_TKN");
       System.out.println( Arrays.toString(splits));
    }
}