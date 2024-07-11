public class Discount {
    public static void main(String[] args) {
        float price1=20.50f;
        float price2=45.40f;
        float total=price1+price2;
        float saved_amt=total*10/100;
        float discount_amt=total-saved_amt;
        System.out.println("Total amount :"+total);
        System.out.println("saved amount :"+saved_amt);
        System.out.println("discount amt :"+discount_amt);
    }
}
