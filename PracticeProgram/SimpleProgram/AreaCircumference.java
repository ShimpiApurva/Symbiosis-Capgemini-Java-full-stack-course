import java.util.Scanner;

public class AreaCircumference {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float PI=3.142f;
            float r=sc.nextInt();

            if((r>=1)&&(r<1000)){
                float area=PI*r*r;
                float circum=2*PI*r;
                System.out.printf("Area : %.4f ",area);
                System.out.printf("Circum :%.4f ",circum);
            }else{
                System.out.println("-1");
            }
        }
        
        
    }
}
