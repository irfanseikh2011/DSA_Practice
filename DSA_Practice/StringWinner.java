package prepbytes;

import java.util.Scanner;

public class StringWinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            char ch[] = sc.next().toCharArray();
            String s = new String(ch);
            int countA = 0, countD = 0;
            for(int i = 0 ; i < n ;i++)
            {
                if(s.charAt(i)=='A')
                {
                    countA++;
                }
                else if(s.charAt(i)=='D')
                {
                    countD++;
                }
            }
            if(countA>countD)
            {
                System.out.println("Aditya");
            }
            else if(countA<countD)
            {
                System.out.println("Danish");
            }
            else
            {
                System.out.println("AdiDan");
            }
        }
    }
}
