import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        boolean dayValid = false;
        int hours = 0;
        int minutes = 0;
        int lowMonth = 1;
        int highMonth = 0;

        year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        switch (month) {
            case 2:
                highMonth = 29;
                break;
            case 1, 3, 5, 7, 9, 10, 12:
                highMonth = 31;
                break;
            case 4, 6, 8, 11:
                highMonth = 30;
                break;
                }
                day = SafeInput.getRangedInt(in, "Enter your date of birth", lowMonth, highMonth);



                hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);

                minutes = SafeInput.getRangedInt(in, "Enter your birth minutes", 1, 59);

        System.out.println("You said you were born on " + month + "/" + day + "/" + year + " at " + hours + ":" + minutes);
        }
    }
