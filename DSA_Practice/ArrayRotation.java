package prepbytes;

public class ArrayRotation {
    public static int[] rotate(int a[],int d)
    {
        int temp[] = new int[d];
        int n = a.length;
        for(int i = 0 ; i < d ; i++)
        {
            temp[i] = a[i];
        }
        for(int i = 0 ; i < n-d ; i++)
        {
            a[i] = a[i+d];
        }
        int k = 0;
        for(int i = n-d ; i< n ; i++)
        {
            a[i] = temp[k++];
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        a = rotate(a,2);
        for (int elem:a) {
            System.out.print(elem+" ");
        }
    }
}
