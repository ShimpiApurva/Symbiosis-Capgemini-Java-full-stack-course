public class SumArray {
    public static void main(String[] args) {
        int[] arr={4,6,4,7,3,8};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int avg=sum/arr.length;
        System.out.println("Sum :"+sum);
        System.out.println("Avg :"+avg);
    }
}
