import java.util.Scanner;

public class Abbreviated {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first name :");
            char firstName=sc.next().charAt(0);
            System.out.println("Enter sec name");
            char secName=sc.next().charAt(0);
            System.out.println("ENter last name :");
            String lastName=sc.next();

            System.out.println(firstName+ "." + secName + "." + lastName);
        }
    } 
}
