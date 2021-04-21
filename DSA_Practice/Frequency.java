package prepbytes;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String s = sc.nextLine();
            s = s.toLowerCase();
            int freq[] = new int[26];
            for(int i = 0 ; i < s.length() ; i++) {
                char ch = s.charAt(i);
                int charAsci = (int) ch - 97;
                freq[charAsci] += 1;
            }
            int flag = 0;
            for(int i = 0 ; i < 26 ; i++)
            {
                char ch = (char)(i+97);
                if(freq[i]>1)
                {
                    System.out.print(ch+"="+freq[i]);
                    flag = 1;
                }
            }
            if(flag==0)
            {
                System.out.println(-1);
            }
        }
    }
}

