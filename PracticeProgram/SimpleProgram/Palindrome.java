public class Palindrome {
    public static void main(String[] args) {
        int num=323;
        int rev=0;
        int rem;
        int ON=num;
        while (num!=0) {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
        if(ON==rev){
            System.out.println("No is palindrome");
        }else{
            System.out.println("NOt palindrome");
        }
    }
}
