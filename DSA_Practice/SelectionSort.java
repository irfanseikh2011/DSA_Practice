package prepbytes;

public class SelectionSort {
    public static int[] sort(int a[])
    {
        int n = a.length,min = 0,temp =0;
        for(int i = 0 ; i < n - 1; i++)
        {
            min = i;
            for(int j = i+1 ; j < n ; j++)
            {
                if(a[j]<a[min])
                    min = j;
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {5,8,1,3,4};
        a = sort(a);
        for(int i = 0 ; i < a.length ;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
