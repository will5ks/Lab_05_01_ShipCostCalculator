public class Main {
    public static void main(String[] args) {
        //Declarations
        double price;
        double shipping;
        double totalPrice;

        //User Prompt
        System.out.println("Enter the item's price.");

        //User Input Simulation
        System.out.println("150");
        price = 150;

        //Calculations
        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = 0.02 * price;
        }

        //Output to User
        totalPrice = price + shipping;
        System.out.println("Your shipping cost is $" + shipping + " and your total price is $" + totalPrice + ".");

    }
}