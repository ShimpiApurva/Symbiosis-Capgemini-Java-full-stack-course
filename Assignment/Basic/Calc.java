import java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1=5;
            int num2=4;
            char c;
            System.out.println("enter operator :");
            c=sc.next().charAt(0);
            switch (c) {
                case '+' -> System.out.println(num1+num2);
                case '-' -> System.out.println(num1-num2);
                case '*' -> System.out.println(num1*num2);
                default -> System.out.println(num1/num2);
            }
            // System.out.println("enter your choice :");
            // char ch=sc.next().charAt(0);
            // switch (ch) {
            //     case '+':System.out.println(num1+num2);
            //         break;
            //     case '-':System.out.println(num1-num2);
            //         break;
            //     case '*':System.out.println(num1*num2);
            //         break;
            //     default:
            //         System.out.println("invalid choice");;
            // }
        }

    }
}
