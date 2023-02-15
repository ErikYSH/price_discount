public class Sale
{
    public static void main (String[] arg)
    {
        double discountRate = 1;
        double originalPrice = 200;
        
        if (originalPrice < 128 ){
            discountRate = 0.92;
        } else {
            discountRate = 0.84;
        }

        double discountedPrice = discountRate * originalPrice;

        System.out.printf("Your original price $%.2f and your get a %.2f. You pay $%.2f%n",originalPrice, discountRate, discountedPrice);
    }
}