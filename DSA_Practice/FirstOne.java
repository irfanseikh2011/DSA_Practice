package prepbytes;

import java.util.Scanner;

public class FirstOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = sc.nextInt();
            }
            int low = 0, flag = 0 , high = n-1,ans = 0;
            while(low <= high )
            {
                int mid = low + (high - low)/2;
                if(a[mid]==1 && (mid==0 || a[mid-1]==0))
                {
                    flag = 1;
                    ans = mid;
                    break;
                }
                else if(a[mid]==0)
                    low = mid+1;
                else
                    high = mid-1;
            }
            if(flag==1)
                System.out.println(ans);
            else
                System.out.println(-1);
        }
    }
}
