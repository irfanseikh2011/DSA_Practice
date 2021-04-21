package prepbytes;

public class ArrayRotation3 {
    public static int[] rotate(int a[])
    {
        int temp = a[0];
        int n = a.length;
        for(int i = 1 ; i < n ; i++)
        {
            a[i-1] = a[i];
        }
        a[n-1] = temp;
        return a;
    }

    public static int[] reverse(int a[],int start,int end)
    {
        int k = 0;
        int temp[] = new int[end - start +1];
        for(int i = end  ; i >= start ; i--)
        {
            temp[k++] = a[i];
        }
        k = 0;
        for(int i = start ; i <= end ; i++)
        {
            a[i] = temp[k++];
        }

        return a;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        a = reverse(a,4,5);
        a = reverse(a,0,3);
        a = reverse(a,0,5);
        for (int elem:a
        ) {
            System.out.print(elem+" ");
        }
    }
}
