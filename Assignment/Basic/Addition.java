import java.util.Scanner;
public class Addition{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number1=sc.nextInt();
            int number2=sc.nextInt();
            int addition;
            addition=number1+number2;
            System.out.println("Addition :"+addition);
        }

    }
}
