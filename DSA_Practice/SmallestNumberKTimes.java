package prepbytes;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumberKTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            int k = sc.nextInt();
            for(int i = 0 ; i < n ;i++)
            {
                a[i] = sc.nextInt();
            }
            int freq[] = new int[100000];
            Arrays.sort(a);
//        for(int i = 0 ; i < n ;i++)
//        {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println();
            int curr = a[0];
            freq[curr]++;
            for(int i = 1 ; i < n ;i++)
            {
                if(a[i]==curr)
                    freq[curr]++;
                else
                {
                    curr = a[i];
                    freq[curr]++;
                }
            }
            int ans = 0;
            for(int i = 0 ; i < 100000 ; i++)
            {
                if(freq[i]==k)
                {
                    ans = i;
                    break;
                }
            }
//            for(int i = 0 ; i < 10 ; i++)
//            {
//                System.out.print(freq[i]+" ");
//            }
//        System.out.println();
//            for(int i = 0 ; i < n ;i++)
//            {
//                System.out.print(a[i]+" ");
//            }
        System.out.println(ans);
        }
    }

