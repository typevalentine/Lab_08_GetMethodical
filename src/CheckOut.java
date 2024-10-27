import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        int numItems = 0;
        boolean done = false;
        String trash = "";

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            numItems++;
            totalPrice += itemPrice;
            done = SafeInput.getYNConfirm(in, "Are you done[YyNn]?");
        } while(!done);

        System.out.println("You have " + numItems + " for the price of: " + totalPrice);

    }
}
