import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=sc.nextInt();

            if((num1> num2) && (num1>num3)){
                System.out.println("Number 3 greater");
            }else if((num2>num1) && (num2>num3)){
                System.out.println("number 2 is greater");
            }else{
                System.out.println("Number 3 is greater");
            }
        }
    }
}
