import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year=sc.nextInt();

            if(year % 4==0){
                if(year%100==0){
                    if(year%400==00)
                        System.out.println("Lear year");
                    else
                        System.out.println("NOt leap year");
                }else{
                    System.out.println("leap year");
                }
            }else{
                System.out.println("not leap year");
            }
        }
    }
}
