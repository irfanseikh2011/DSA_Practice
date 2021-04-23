package prepbytes;

import java.util.Scanner;

public class BooksLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ;i++)
        {
            a[i] = sc.nextInt();
        }
        int head = 0 , tail = n-1,count = 0;
        while(head < tail)
        {
            if(a[head]<=k)
            {
                count++;
                head++;
            }
            else if(a[tail]<=k)
            {
                count++;
                tail--;
            }
            if(a[head]>k && a[tail]>k)
                break;
        }
        System.out.println(n-count);
    }
}
