public class SwapW{
    public static void main(String[] args) {
        int num1=5;
        int num2=6;
       // int temp;
        System.out.println("X :"+num1);
        System.out.println("y :"+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("X :"+num1);
        System.out.println("y :"+num2);
    }
} 