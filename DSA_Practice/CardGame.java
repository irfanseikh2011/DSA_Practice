package prepbytes;

import java.io.IOException;
import java.util.Scanner;

public class CardGame {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            sc.nextLine();
            String s = sc.nextLine();
            String arr[] = new String[5];
            char type = s.charAt(1);
            char card = s.charAt(0);
            for(int i = 0 ; i < 5 ; i++)
            {
                arr[i] = sc.next();
            }
            int flag = 0;
            for(int i = 0 ; i < 5 ; i++)
            {
                char type1 = arr[i].charAt(1);
                char card1 = arr[i].charAt(0);
                if(card==card1 || type==type1)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
