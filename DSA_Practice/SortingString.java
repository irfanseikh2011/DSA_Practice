package prepbytes;

import java.util.Scanner;

public class SortingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String str = sc.nextLine();
            int j = 0;
            char temp = 0;
            char[] chars = str.toCharArray();
            for(int i=0; i < chars.length; i++) {
                for(j=0; j < chars.length; j++) {
                    if(chars[j] < chars[i]) {
                        temp = chars[i];
                        chars[i] = chars[j];
                        chars[j] = temp;
                    }
                }
            }
            for(int k=0; k < chars.length; k++) {
                System.out.print(chars[k]);
            }
        }
    }
}
