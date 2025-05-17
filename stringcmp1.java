import java.lang.System;
import java.util.Scanner;

class stringcmp1{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        String meghana = scan.nextLine();

        if(meghana.equals("dead"))
        {
            System.out.print("Surya meets Ramya");
        }
    else
    {
        System.out.print("meghana weds surya");
    }

    }
}