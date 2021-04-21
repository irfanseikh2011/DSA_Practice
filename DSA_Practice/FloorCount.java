package prepbytes;

import java.util.Scanner;

public class FloorCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i < n ;i++)
            {
                a[i] = sc.nextInt();
            }
            int low = 0, high = n-1;
            int ans = 0;
            while(low <= high)
            {
                int mid = low + (high - low)/2;
                if(a[mid]==x)
                {
                    System.out.println(mid);
                    System.exit(0);
                }
                else if(a[mid] > x)
                    high = mid -1;
                else if(a[mid] < x)
                    low = mid +1;
            }
            if(low != 0)
                ans = low -1;
            else
                ans = -1;
            System.out.println(ans);
        }
    }
}
