import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int num;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no :");
            num=sc.nextInt();
        }
        int rev=0;
        int rem;
        int originalNumber=num;

        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
           // System.out.println("hello");

        }
        System.out.println(rev);
       if(rev == originalNumber){
        System.out.println("Number is Palindrome");
       }else{
        System.out.println("Number is not");
       }
    }
}
