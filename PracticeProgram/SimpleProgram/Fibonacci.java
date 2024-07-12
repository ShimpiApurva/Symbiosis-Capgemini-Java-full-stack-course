public class Fibonacci {
    public static void main(String[] args) {
        int num=10;
        int n1=0;
        int n2=1;
        int fibo=0;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<=num;i++){
            fibo=n1+n2;
            System.out.println(fibo);
            n1=n2;
            n2=fibo;
        }
        
    }
}
