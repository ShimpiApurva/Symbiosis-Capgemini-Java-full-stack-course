
import java.util.Scanner;

public class SecureUrl {
    public static void main(String[] args) {
        //String secureUrl;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the string :");
            String secureUrl=sc.next();
            System.out.println("ENter the start string ");
            String protocol=sc.next();
            
            if(secureUrl.startsWith(protocol)){
                System.out.println(secureUrl+" starts with "+protocol);
            }else{
                System.out.println("String does not start with "+protocol);
            }
        }
    }
}
