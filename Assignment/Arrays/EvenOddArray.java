import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        //int arr2[]=new int[10];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]);
            }
        }

        for(int i=0;i<5;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
        }
    }
}
