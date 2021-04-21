package prepbytes;

import java.util.Scanner;

public class ConsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            sc.nextLine();
            int cons = 0 ,vowels = 0;
            String s = sc.nextLine().toUpperCase();
            for(int i = 0 ; i < s.length() ; i++)
            {
                char ch = s.charAt(i);
                if(ch=='A'|| ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    vowels++;
                }
                else
                {
                    cons++;
                }
            }
            System.out.println(cons+" "+vowels);
        }
    }
    }

