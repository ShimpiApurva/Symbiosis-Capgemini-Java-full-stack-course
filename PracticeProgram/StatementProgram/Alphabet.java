
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char s=sc.next().charAt(0);
            // if((s >='A' &&  s<='Z')|| (s>='a' && s<='z')){
            //     System.out.println("alphabet");
            // }else{
            //     System.out.println("not");
            // }
            if(Character.isLowerCase(s)){
                System.out.println(s+" is a lowercase aplhabet");
            }else if(Character.isUpperCase(s)){
                System.out.println(s+" is an uppercase alphabet");
            }
            else if(Character.isDigit(s)){
                System.out.println(s+" is a digit");
            }else if(Character.isWhitespace(s)){
                System.out.println(s+" is whitespace");
            }else{
                System.out.println(s+" is special character");
            }
        }
    }
}
