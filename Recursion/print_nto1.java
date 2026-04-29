
class Main {
   void func(int n){
       if(n==0)
       {
           return;
       }
       else
       {
           System.out.println(n);
           func(n-1);
       }
   }
    public static void main(String[] args) {
       Main m = new Main();
       m.func(5);
    }
}
