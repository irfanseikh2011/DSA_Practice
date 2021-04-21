package prepbytes;

import java.util.Scanner;

public class MajorityVotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i < n ;i++)
            {
                a[i] = sc.nextInt();
            }
            int count = 1, maj = 0;
            for(int i = 1 ; i < n ;i++)
            {
                if(a[maj]==a[i])
                    count++;
                else
                    count--;
                if(count==0)
                {
                    maj = i ;
                    count = 1;
                }
            }
            maj = a[maj];
            count = 0;
            for(int i = 0 ; i < n ;i++)
            {
                if(a[i] == maj)
                    count++;
            }
            if(count > (n/2))
                System.out.println(maj);
            else
                System.out.println(-1);
        }
    }
}
