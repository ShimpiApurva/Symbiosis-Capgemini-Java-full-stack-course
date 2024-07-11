import java.util.Scanner;

public class NumberOneToEight {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();

            while(true){
                if(num >=1 && num <=8){
                    System.out.println("Correct");
                    break;
                }
                System.out.println("enter correct number");
                num=sc.nextInt();         
                
            }
        }
    }
}
