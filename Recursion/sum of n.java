class Main {
    int func(int n)
    {
        if(n == 0)
        {
            return 0 ;
        }
        
        return n+func(n-1);
    }
    
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.func(5));
    }
}
