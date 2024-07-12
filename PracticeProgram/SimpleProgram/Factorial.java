import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num;
        int fact=1;
        try (Scanner sc = new Scanner(System.in)) {
            num=sc.nextInt();
        }
        while (num!=1) {
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial :"+fact);
    }
}
