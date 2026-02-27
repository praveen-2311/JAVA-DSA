import java.util.Scanner;
public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x+y+z;
        if(sum == 180)
        {
            System.out.println("Triangle is formed");
        }
        else{
            System.out.println("triangle not formed");
        }
    }
}
