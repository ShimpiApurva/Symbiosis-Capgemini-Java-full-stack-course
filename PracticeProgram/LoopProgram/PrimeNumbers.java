import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int flag=0;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
                //flag=0;
            }
            if(flag==0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
    }
}