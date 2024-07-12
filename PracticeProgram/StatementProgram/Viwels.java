import java.util.Scanner;

public class Viwels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch=sc.next().charAt(0);
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='I' || ch=='i' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                System.out.println("You entered vowel");
            }else{
                System.out.println("YOu entered consonent");
            }
        }
    }
}
