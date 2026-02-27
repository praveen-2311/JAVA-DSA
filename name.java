import java.util.Scanner;
public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(s1+s2);
        }
    }
}
