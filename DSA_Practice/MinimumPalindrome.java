package prepbytes;

import java.util.Scanner;

public class MinimumPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0)
        {
            String str = sc.nextLine();
            int n = str.length();
            int a[] = new int[n];
            for(int i = 0 ; i < n ;i++)
            {
                char ch = str.charAt(i);
                a[i] = (int)ch - 97;
            }
            int left = 0, right = n-1, count = 0;
            while (left < right)
            {
                if(a[left]!=a[right])
                {
                    if(a[left]< a[right])
                    {
                        a[right] -= 1;
                        count++;
                    }
                    else
                    {
                        a[left] -= 1;
                        count++;
                    }
                }
                else
                {
                    left++;
                    right--;
                }
            }
            System.out.println(count);
        }
    }
}
