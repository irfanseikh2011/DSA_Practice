package prepbytes;

import java.util.Scanner;

public class NumberOfOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            sc.nextLine();
            String str[] = sc.nextLine().split(" ");
            int count = 0;

            for(int i = 0 ; i < n ;i++)
            {
                if(str[i].compareTo("x")==0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
