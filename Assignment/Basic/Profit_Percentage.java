import java.util.Scanner;
public class Profit_Percentage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("ENter no of dozen");
            System.out.println("ENter cost price per dozen");
            float y=sc.nextFloat();
            System.out.println("ENter selling price per item");
            float z=sc.nextFloat();
            float costPricePerItem=y/12.0f;
            float profit=z-costPricePerItem;
            float profit_percentage=(profit/costPricePerItem)*100;
            System.out.println("Profit Percentage :"+profit_percentage);
        }

    }
}
