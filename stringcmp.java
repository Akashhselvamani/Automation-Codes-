import java.lang.System;
import java.util.Scanner;

class stringcmp
{
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);
        String Enter = scan.nextLine();

        if(Enter.equals("win"))
        {
            System.out.print("Correct");
        
        }

        else
        {
            System.out.print("Incorrect");
        }

    }
}