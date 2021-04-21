package prepbytes;

import java.util.Scanner;

public class MajorityElementMooreAlgo {
    public static boolean checkCount(int major, int a[])
    {
        int count = 0;
        for(int i= 0 ; i < a.length ; i++)
        {
            if(a[i] == major)
            {
                count++;
            }
        }
        
        if(count > (a.length/2))
        {
            return true;
        }
        return false;
    }
    public static void majorityElement(int a[])
    {
        int count = 1 , majority = 0;
        for(int i = 1 ; i < a.length ; i++)
        {
            if(a[majority] == a[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count == 0)
            {
                majority = i;
                count = 1;
            }
        }
        if (checkCount(a[majority],a))
        {
            System.out.println(a[majority]);
        }
        else
        {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
//        int a[] = {7,3,3,3,3,3,7,7};
//        majorityElement(a);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int index = 0, flag = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i]==1)
            {
                index = i;
                flag = 1;
            }
        }
        if(flag == 1)
        {
            System.out.println(index);
        }
        else
        {
            System.out.println(-1);
        }

        }
    }

