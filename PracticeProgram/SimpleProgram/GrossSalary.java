import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        double basicSalary;
        try (Scanner sc = new Scanner(System.in)) {
            basicSalary=sc.nextDouble();
        }
        double hra=basicSalary * 0.2;
        double da =basicSalary *0.8;
        double grossSalary=basicSalary * da * hra;

        System.out.println("Gross Salary :"+grossSalary);
    }
}
