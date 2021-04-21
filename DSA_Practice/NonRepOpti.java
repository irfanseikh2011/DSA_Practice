package prepbytes;

public class NonRepOpti {
    public static void main(String[] args) {
        String s = "prepbytes";
        int a[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) ch - 97;
            a[index] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (a[s.charAt(i) - 97] == 1) {
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}

