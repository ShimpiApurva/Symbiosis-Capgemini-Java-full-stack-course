public class ReverseString {
    public static void main(String[] args) {
        //char[] str=args[0].toCharArray();
        String str="apurva";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
