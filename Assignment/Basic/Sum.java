import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int sum=0;
            while (true) { 
                num=sc.nextInt();
                if(sum==100){
                    sum=sum+num;
                }
                break;
                
            }
        }
        System.out.println("done");
    }
}
