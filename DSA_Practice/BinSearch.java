package prepbytes;

import java.util.Scanner;

public class BinSearch {
    public static void BinarySearch(int a[],int high,int low) {
        while (low < high) {
            int mid = (high + low) / 2;
            if (a[mid] == 1 && (mid == 0 || a[mid - 1] == 0)) {
                System.out.println(mid);
                System.exit(0);
            } else if (a[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        BinarySearch(a,a.length-1,0);

    }
}
