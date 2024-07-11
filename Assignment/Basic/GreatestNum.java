import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1,num2,num3;
            num1=sc.nextInt();
            num2=sc.nextInt();
            num3=sc.nextInt();

            // if(num1 > num2 && num1>num3){
            //     System.out.println("Num1 is greater");
            // }
            // else if(num2>num1 && num2>num3){
            //     System.out.println("Number 2 is gretaer");
            // }
            // else{
            //     System.out.println("num3 is greater");
            // }
            int max=(num1>num2)?(num1>num3?num1 :num3):(num2>num3?num2:num3);
            System.out.println("max"+max);
        }



    }
}
