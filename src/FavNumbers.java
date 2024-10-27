import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("You said your favorite integer is " + favInt);
        favDouble = SafeInput.getDouble(in,"Enter your favorite double");
        System.out.println("You said your favorite double is " + favDouble);
    }
}
