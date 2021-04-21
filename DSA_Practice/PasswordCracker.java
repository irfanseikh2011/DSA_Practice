package prepbytes;

import java.util.Scanner;

public class PasswordCracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String org = sc.nextLine();
            String fake = sc.nextLine();
            int flag = 0;
            int len = fake.length();
            String left = fake.substring(2,len) + fake.substring(0,2);
            String right = fake.substring(len-2,len) + fake.substring(0,len-2);
            if(left.compareTo(org)==0 || right.compareTo(org)==0)
            {
                    flag = 1;
            }

            if(flag==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

/*
tackblues
ckbluesta
bluestack
 */

