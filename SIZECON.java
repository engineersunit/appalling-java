import java.util.*;
//https://www.spoj.com/problems/SIZECON/
class SIZECON {

    public static void main(String[] a){
        Scanner s = new Scanner(System.in);
        int i,u=0,e,n=s.nextInt();
        for (i = 0; i < n; i++)
        {e=s.nextInt();         
        if (e > 0) u += e;}
        System.out.print(u);
    }
}
