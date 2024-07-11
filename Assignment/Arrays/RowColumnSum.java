
import java.util.Scanner;

public class RowColumnSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum;
            int arr[][]=new int[10][10];
            for(int i=0;i<3;i++){
                
                for(int j=0;j<3;j++){
                   
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("------------------------");

            for(int i=0;i<3;i++){
                sum=0;
                for(int j=0;j<3;j++){
                    sum=sum+arr[i][j];
                    System.out.print(" "+arr[i][j]);
                    
                }
                System.out.print(" "+sum);
                System.out.println();
            }
            System.out.println("------------------------");

            for(int i=0;i<3;i++){
               sum=0;
                for(int j=0;j<3;j++){
                    sum=sum+arr[j][i];      
                }
                System.out.println(" "+sum);
                System.out.println();
            }
            System.out.println("---------------------------");

            // for(int i=0;i<3;i++){
            //     int sum=0;
            //      for(int j=0;j<3;j++){
            //          sum=sum+arr[j][i];      
            //      }
            //      System.out.print(" sum of column "+i+" :"+sum);
            //      System.out.println();
            //  }
        }
        
    }
}
