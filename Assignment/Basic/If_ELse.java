import java.util.Scanner;

public class If_ELse {
    public static void main(String[] args) {
        String username = "apurva";
        int password=12345;
        String user;
        int pass;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter username");
            user=sc.next();
            pass=sc.nextInt();
        }

        if(username.equals(user)){
            if(password==pass){
                System.out.println("username and passwors is correct");
            }else {
                System.out.println("password is not correct");
            }
        }else if(password==pass){
            System.out.println("username not correct ");
        }
        else{
            System.out.println("Both are not valid");
        }

        

    }
}
