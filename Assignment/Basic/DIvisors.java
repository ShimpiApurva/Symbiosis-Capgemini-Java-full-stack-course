public class DIvisors {
    public static void main(String[] args){
        int num=15;
        int i=1;
        int sum=0;
        while(i<=num/2){
            if(num%i==0){
                sum=sum+i;
                //System.out.println(i);
            }
            i++;
        }
        System.out.println(sum);
    }
}
