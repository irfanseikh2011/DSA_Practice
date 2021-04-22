package prepbytes;

import java.io.IOException;
import java.util.Scanner;

public class FindingMissingAP {
    public static int findMissing(int a[],int low,int high,int diff)
    {
        if(low>high)
            return -1;
        int mid = low + (high-low)/2;
        if(low<mid && (a[mid] - a[mid-1]) > diff)
            return a[mid-1]+diff;
        if(high> mid && (a[mid+1]-a[mid]) > diff)
            return a[mid]+diff;
        if(a[mid]==(a[0]+(mid*diff)))
            return findMissing(a,mid+1,high,diff);
        return findMissing(a,0,mid-1,diff);
    }
    public static void missing(int a[],int low,int high)
    {
        int n = a.length;
        int diff = (a[n - 1] - a[0]) / n;
        int res = findMissing(a,low,high,diff);
        if(res!=-1)
            System.out.println(res);
        else
            System.out.println(a[high]+diff);
    }
    public static void main(String[] args) throws IOException {
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
            int high = n-1, low = 0;
            missing(a,low,high);
        }
    }
}
