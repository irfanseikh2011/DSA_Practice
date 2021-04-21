package prepbytes;

import java.io.IOException;
import java.util.Scanner;

public class Perfect {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int Sum = 0;

        while(t-- > 0)
        {
            int Number = sc.nextInt();

            for(int i = 1 ; i < Number ; i++) {
                if(Number % i == 0)  {
                    Sum = Sum + i;
                    System.out.println(Sum);
                }
            }

            if (Sum == Number) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
            Sum = 0;
        }
    }
}
