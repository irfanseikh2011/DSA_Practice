package prepbytes;

import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a,b,c,d = 0;

        while(t-- > 0)
        {
            int n = sc.nextInt();
            for(int i = n+1 ; i <= 9000 ; i++)
            {
                a = (i%10);
                b = (i%100)/10;
                c = (i%1000)/100;
                d = (i%10000)/1000;
                if(a!=b && a!=c && a!=d && b!=a && b!=c && b!=d && c!=a && c!=b && c!=d && d!=a && d!=b && d!=c)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
