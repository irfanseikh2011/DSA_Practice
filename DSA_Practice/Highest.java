package prepbytes;
import java.util.*;
import java.io.*;

public class Highest {
    public static void main(String args[]) throws IOException {
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
            int max = 0;
            for(int i = 0 ; i < n ; i++)
            {
                int sum = 0;
                for(int j = 0 ; j < n ;j++)
                {
                    sum = Math.abs(a[i]-a[j])+Math.abs(i-j);
                    if(sum > max)
                    {
                        max = sum;

                    }
                }
            }
            System.out.println(max);
        }
    }
}