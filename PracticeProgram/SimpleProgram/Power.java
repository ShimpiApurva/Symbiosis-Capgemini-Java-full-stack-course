//import java.awt.geom.Arc2D;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter number :");
            double num=sc.nextInt();
            System.out.println("Enter exponent :");
            double expo=sc.nextInt();
            Double result=Math.pow(num, expo);
            System.out.println(result);
        }
    }
}
