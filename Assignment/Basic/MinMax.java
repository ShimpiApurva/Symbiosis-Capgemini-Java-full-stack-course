import java.util.Scanner;
public class MinMax{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num=sc.nextInt();
            int max=num;
            int min=num;
            
            while (true) { 
                num=sc.nextInt();
                if(num<0){
                    break;
                }
                if(num>max)
                    max=num;
                if(num<min)
                    min=num;
            }
            System.out.println("Max :"+max+"  Min :"+min);
        }
    }

}