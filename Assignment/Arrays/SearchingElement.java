import java.util.Scanner;

public class SearchingElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr=new int[10];
            int count=0;
            for(int i=0;i<5;i++){
                arr[i]=sc.nextInt();
            }

            System.out.println("ENter your search element");
            int search=sc.nextInt();
  
            for(int i=0;i<5;i++){
                
                if(search==arr[i]){
                    count++;   
                }
            }
                
                System.out.println("Count :"+count);
        }
        }

    }

