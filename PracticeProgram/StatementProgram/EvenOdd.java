
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1=sc.nextInt();
            if(num1 % 2==0){
                System.out.println("Number is even");
            }else{
                System.out.println("Number is odd");
            }
        }
    }
}
