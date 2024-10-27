import java.util.Scanner;

public class DevTest
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String yesOrNo = "";
        int age = 0;
        int favNum = 0;
        double salary = 0;
        double constrained = 0; // must be between 100 and 10000
        String SSN = "";
/*
//first test:
        firstName = getNonZeroLenString(in, "Enter your first name");

        System.out.println("First name is " + firstName);

//second test:
        age = getInt(in, "Enter your age");
        System.out.println("You said your age is " + age);

//third test:
        salary = getDouble(in,"Enter your salary");
        System.out.println("Your salary is " + salary);

//fourth test:
        favNum = getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.println("Your favorite number is " + favNum);

//fifth test:
        constrained = getRangedDouble(in, "Enter the constrained double", 100, 10000);
        System.out.println("Constrained is " + constrained);

//sixth test:
        boolean wantToQuit = getYNConfirm(in, "Do you want to quit");
        System.out.println(wantToQuit);

//seventh test:
  SSN = getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");

*/
        SSN = getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");

    }

    /**
     * gets a string from the user using the console, and
     * it must be at least one character in length
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a string of at least one character in length
     */


    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("You must enter at least one character!");

        }while(retVal.isEmpty());

        return retVal;
    }


    /**
     * gets an int value from the user at the console with no constraint
     *
     * @param pipe a scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return an int of any value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }


        }while(!done);

        return retVal;
    }


    /**
     * gets a double value from the user at the console with no constraint
     *
     * @param pipe a scanner used to get the input
     * @param prompt the prompt that tells the user what to enter
     * @return a double of any value
     */

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }


        }while(!done);

        return retVal;
    }

    /**
     * gets an integer from the user via console within a specified range
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low the low inclusive low bound
     * @param high the inclusive high bound
     * @return an int within the specified bounds
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }


        }while(!done);

        return retVal;
    }


    /**
     * gets a double from the user via console within a specified range
     *
     * @param pipe the scanner to use for input
     * @param prompt the prompt to tell the user what is required
     * @param low the low inclusive low bound
     * @param high the inclusive high bound
     * @return a double within the specified bounds
     */

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value within the range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }


        }while(!done);

        return retVal;
    }


    /**
     * Gets a Y or N from the user (yes or no) and returns the equivalent
     *
     * @param pipe scanner to use for input
     * @param prompt tells what the user to enter
     * @return true or false based on Y or N
     */


    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String YNResponse = "";
        boolean retVal = false;
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            YNResponse = pipe.nextLine();

            if (!YNResponse.matches("[YyNn]"))
            {
                System.out.println("You must enter [Y/N]: ");
            }
            else
            {
                 done = true;
                 switch (YNResponse)
                 {
                     case "Y":
                     case "y":
                         retVal = true;
                         break ;
                     case "N":
                     case "n":
                         retVal = false;
                         break;
                 }
            }

        }while(!done);

        return retVal;

    }


    /**
     *
     * @param pipe
     * @param prompt
     * @param regEx
     * @return
     */


    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;


        do
        {
            System.out.print(prompt + " " + regEx );
            retVal = pipe.nextLine();
            if(retVal.matches(regEx)) {
                done = true;
            }
            else
            {
                System.out.println("You must enter a matching expression " + regEx + " not " + retVal);
            }
        }while (!done);

        return retVal;
    }

}