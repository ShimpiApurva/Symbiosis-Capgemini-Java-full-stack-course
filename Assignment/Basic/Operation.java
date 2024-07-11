import java.util.*;
//import javax.xml.namespace.QName;
public class Operation {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int  num1,num2;
            num1=sc.nextInt();
            num2=sc.nextInt();
            int ch;
            do{
                System.out.println("1.ADD\n2.Sub\n3.MUL\n4.division");
                System.out.println("ENter your choice");
                ch=sc.nextInt();
                switch(ch){
                    case 1 -> System.out.println(num1+num2);
                    case 2 -> System.out.println(num1-num2);
                    case 3 -> System.out.println(num1*num2);
                    case 4 -> System.out.println(num1/num2);
                }
            }while(ch!=5);
        }
    }
}
