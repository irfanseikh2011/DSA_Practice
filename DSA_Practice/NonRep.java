package prepbytes;

public class NonRep {
    public static void main(String[] args) {
        String s = "pppppd";
        for(int i = 0 ; i < s.length(); i++)
        {
            int flag = 0;
            for(int j = i+1 ; j< s.length(); j++)
            {
                char ch = s.charAt(j);
                if(ch == s.charAt(i))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
            {
                System.out.println(s.charAt(i));
                break;
            }
        }
        char ch = s.charAt(2);
        int index = (int)ch ;
        System.out.println(index-97);
    }
}
