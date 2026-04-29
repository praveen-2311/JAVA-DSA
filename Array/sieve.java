
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        int sum = 0;
        for(int i=2;i<a.length;i++)
        {
            if(a[i]==0)
            {
                for(int j=i*2;j<a.length;j=j+i)
                {
                    a[j] = 1;
                }
            }
        }
        for(int i=2;i<a.length;i++)
        {
            if(a[i]==0)
            {
            System.out.println(i);
            sum = sum+i;
            }
        }
        System.out.println("The sum is : "+sum);
    }
}
