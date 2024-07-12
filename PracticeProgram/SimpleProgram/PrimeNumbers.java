import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int flag=0;
        try (Scanner sc = new Scanner(System.in)) {
            int m=sc.nextInt();
            if(m==0 && m==1){
                System.out.println(m+"is not prime number");
            }else{
                for(int i=2;i<=m/2;i++){
                    if(m%i==0){
                        System.out.println(m+" not orime number");
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println(m+" is prime number");
                }
            }
        }

    }
}
