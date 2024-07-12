import java.util.Scanner;

public class ValidTriangle{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int side1=sc.nextInt();
            int side2=sc.nextInt();
            int side3=sc.nextInt();

            // int result=side1+side2+side3;
            // if(result==180)
            //     System.out.println("This is valid triangle");
            // else
            //     System.out.println("Not valid");

            if((side1+side2 >side3) && (side2+side3 >side1) && (side1+side3 >side2))
                System.out.println("triangle is valid");
            else
                System.out.println("Not valid");
        }
    }
}