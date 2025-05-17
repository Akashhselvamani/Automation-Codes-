import java.lang.System;
import java.util.Scanner;

class qa8{
    public static void main (String args[]){
        System.out.println("Please enter the numbers");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
       String result = num1>num2?" num 1 is Greater than num 2":"num 2 is Greater than num 1";
        System.out.println(result);
    }
}