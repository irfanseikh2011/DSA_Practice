package prepbytes;

import java.util.Scanner;

public class MaximiseTheProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0,time = 0, flag = 0;
        for (int i = 1; i <= n; i++) {
            time += (i * 5);
            if (time > (240 - k)) {
                ans = i -1;
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            ans = n;
        System.out.println(ans);

    }
}
