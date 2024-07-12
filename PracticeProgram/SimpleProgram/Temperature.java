import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int celsius=sc.nextInt();

            int result = celsius * 9/5 +32;
        
        System.out.println("Result :"+result);
        }
    }
}
