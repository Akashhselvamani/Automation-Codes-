import java.lang.System;
import java.util.Scanner;

class qa10{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2");
        int num2 = scan.nextInt();
        scan.close();

        for (int i= num1; i<= num2; i=i+1  ){
            System.out.println( i);
        }
    }
}