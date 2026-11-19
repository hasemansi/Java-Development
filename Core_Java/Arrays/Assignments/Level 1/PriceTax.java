//9. Create a double[] of prices and print the total after adding 18% tax to each.
public class PriceTax {
    public static void main(String[] args)
    {
        double[] prices = {100.0, 250.5, 75.25, 500.0};

        double Total = 0;

        for(double price : prices ){
            Total += price * 1.18; // add price with 18% tax
        }
        System.out.printf("Total = %.2f", Total);
    }
}
