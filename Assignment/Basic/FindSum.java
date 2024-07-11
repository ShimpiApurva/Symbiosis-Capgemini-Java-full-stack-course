import java.util.Scanner;
public class FindSum {
    public static void main(String[] args) {
        int first;
        int sec;
        try (Scanner sc = new Scanner(System.in)) {
            first=sc.nextInt();
            sec=sc.nextInt();
        }
        if((-100<=first) && (first<=100) && (-100<=sec) && (sec<=100)){
            
            int sum=first+sec;
            System.out.println(sum);
        }else{
                System.out.println(-1);
        }
        


        
    }
}
