import java.util.Scanner;

public class sumRandom {
    

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int min=a;
            int max=a;
            while (true) { 
                a=sc.nextInt();
                if(a<0)
                    break;
               // a=sc.nextInt();
                if(a>max)
                    max=a;
                if(a<min)
                    min=a;   
            }
            System.out.println(max+" "+min);
        }
    }
}
