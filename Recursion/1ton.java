// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
   void func(int n , int z ){
       if(n>z)
       {
           return;
       }
       else
       {
           System.out.println(n);
           func(n+1,z);
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter z value :");
        int z = sc.nextInt();
       Main m = new Main();
       m.func(1,z);
    }
}
