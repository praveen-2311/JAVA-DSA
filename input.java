import java.util.Scanner;
class input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(n);
        System.out.println(s);
        System.out.println(c);
    }
}