import java.lang.System;
import java.util.Scanner;

class qa3{
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        if (num1 % 2 == 0 )
        {
            System.out.println("Number is even");
        }
        else 
        {
            System.out.println("Number is odd");
        }
    }
}