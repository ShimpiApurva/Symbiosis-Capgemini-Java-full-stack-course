import java.util.Scanner;
public class LuckyNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter 4 digit number :");
            int num=sc.nextInt();
            int a=num/1000;
            //int b=(num%1000)/100;
            int b=(num/100)%10;
            //int c=(num%100)/10;
            int c=(num/10)%10;
            int d=num%10;
            //b=
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            int first=a+b;
            int sec=c+d;
            if(first==sec){
                System.out.println("Lucky number");
            }else{
                System.out.println("not Lucky");
            }
        }
    }
}
