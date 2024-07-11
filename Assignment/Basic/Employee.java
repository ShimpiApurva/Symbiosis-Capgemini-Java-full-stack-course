import java.util.Scanner;
public class Employee {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            double basic_salary;
            double withdraw_amt;
            System.out.println("ENter name of employee :");
            sc.next();
            System.out.println("ENter Basic salary");
            basic_salary=sc.nextInt();
            System.out.println("tell me your withdraw amount :");
            withdraw_amt=sc.nextInt();
            if(basic_salary>25000){
                double tax=0.1*basic_salary;
                System.out.println("Tax :"+tax);
                double remaining_salary=basic_salary-withdraw_amt-tax;
                System.out.println("Remaing salary"+remaining_salary);
            }
            else{
                double remaining_salary=basic_salary-withdraw_amt;
                System.err.println("REmaining amount :"+remaining_salary);
            }
        }
       
    }
}
