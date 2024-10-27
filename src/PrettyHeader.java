public class PrettyHeader {
    public static void main(String[] args)
    {



    }
    private static void prettyHeader(String msg)
    {
        final int TOTAL_Width = 60;
        int msgLength = msg.length();
        int spaceBefore = 0;
        int spaceAfter = 0;

        if(msg.length() > 54)
        {
            System.out.println("Failed to create header, msg is too long!");
        }
    }


}
