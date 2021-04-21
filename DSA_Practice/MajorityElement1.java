package prepbytes;

public class MajorityElement1 {
    public static int find(int a[])
    {
        int maxC = 0, maxElem = a[0],count = 1;
        for(int i = 0 ; i < a.length - 1; i++)
        {
            for(int j = i+1 ; j < a.length ; j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }
            if(count > (a.length /2))
            {
              return a[i];
            }
            count = 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {7,2,7,3,7,2,7,7};
        System.out.println(find(a));
    }
}
