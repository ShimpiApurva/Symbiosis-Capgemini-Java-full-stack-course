public class SimpleInterest {
    public static void main(String[] args) {
        // int p=1000;
        // int r=20;
        // int t=2;
        // int SI=(p*r*t)/100;
        // System.out.println("Simple Interest :"+SI);
        double principal = 10000, rate = 10.25, time = 10; 
  
        /* Calculate compound interest */
        double CI = principal * 
                    (Math.pow((1 + rate / 100), time)); 
          
        System.out.println("Compound Interest is "+ CI); 
    }
}
//calculate compound Interest
