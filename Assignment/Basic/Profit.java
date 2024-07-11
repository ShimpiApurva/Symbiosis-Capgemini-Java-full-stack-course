public class Profit {
    public static void main(String[] args) {
        double buying_price=20.54;//if you want float data type just assign with the literal 20.5f
        double selling_price=30.50;//as default datatype of java is double not float
        double profit=selling_price-buying_price;
        System.out.println("Buying Price :"+buying_price);
        System.out.println("Selling Price :"+selling_price);
        System.out.println("Profit Calculated :"+profit);
        double profit_percentage=(profit/buying_price)* 100;
        System.out.println("Profit Percentage :"+profit_percentage);
    }
}
