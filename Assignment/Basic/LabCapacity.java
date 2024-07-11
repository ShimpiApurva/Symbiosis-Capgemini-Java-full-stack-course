import java.util.Scanner;

public class LabCapacity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter lab1 capacity");
            int lab1=sc.nextInt();
            System.out.println("ENter lab2 capacity");
            int lab2=sc.nextInt();
            System.out.println("ENter lab3 capacity");
            int lab3=sc.nextInt();

            if((lab1<lab2) && (lab1 < lab3)){
                System.out.println("Lab 1 has minimal seating capacity");
            }
            else if((lab2 < lab1) && (lab2 <lab3)){
                System.out.println("Lab 2 has minimal seating capacity");
            }else{
                System.out.println("Lab 3 has minimal seating capacity");
            }
        };
    }
}
