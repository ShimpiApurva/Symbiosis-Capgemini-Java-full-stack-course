import java.util.Scanner;

public class DigonalSum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum=0;
            int arr[][]=new int[10][10];
            for(int i=0;i<3;i++){
                
                for(int j=0;j<3;j++){
                   
                    arr[i][j]=sc.nextInt();
                }
            }
            System.out.println("------------------------");
            for(int i=0;i<3;i++){
                
                for(int j=0;j<3;j++){
                   
                   System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
            for(int i=0;i<3;i++){
                
                for(int j=0;j<3;j++){
                   
                  if(arr[i]==arr[j]){
                    sum=sum+arr[i][j];
                  }
                }
            }
            System.out.println("Diagonal sum :"+sum);

        }
    }
}
