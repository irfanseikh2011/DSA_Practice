package prepbytes;

public class ArrayRotation2 {
    public static int[] rotate(int a[]) {
        int temp = a[0];
        int n = a.length;
        for (int i = 1; i < n; i++) {
            a[i - 1] = a[i];
        }
        a[n - 1] = temp;
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < 2; i++) {
            a = rotate(a);

            for (int elem : a
            ) {
                System.out.print(elem + " ");
            }
        }
    }
}
