import java.util.*;
public class MaxMin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            int[] arr=new int[10];
            int max=arr[0];
            int min=Integer.MAX_VALUE;

            for(i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }
            for(i=0;i<5;i++){
                System.out.print("| "+arr[i]);
                
            }
            System.out.print("|");
            System.out.println();
            for(i=0;i<5;i++){
            
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
            }

            System.out.println("Max :"+max);
            System.out.println("MIN :"+min);
        }
    }
}
