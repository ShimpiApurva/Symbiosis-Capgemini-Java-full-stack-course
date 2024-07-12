import java.util.Scanner;
public class FirstThreePower {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double num;
            System.out.println("Enter the num");
            num=sc.nextInt();
            double a=Math.pow(num, 1);
            double b=Math.pow(num, 2);
            double c=Math.pow(num, 3);

            System.out.println("N^1 :"+a);
            System.out.println("N^2 :"+b);
            System.out.println("N^3 :"+c);
        }
    }
}
