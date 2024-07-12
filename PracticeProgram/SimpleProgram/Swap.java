import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter num 1 :");
            int num1=sc.nextInt();
            System.out.println("Enter num 2 :");
            int num2=sc.nextInt();
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;
            System.out.println("Num 1 :"+num1);
            System.out.println("Num 2 :"+num2);
        }

    }
}
