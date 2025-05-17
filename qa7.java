import java.lang.System;
import java.util.Scanner;

class qa7{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your salary");
        int salary = scan.nextInt();
        System.out.println("Please enter your age");
        int age = scan.nextInt();

        if (salary >= 20000 || age <25){

            System.out.println("you are eligible please enter loan amount");
            int amount = scan.nextInt();
            if (amount <= 50000){
                System.out.println("you are eligible for loan");

            }
            if (amount > 50000) {
                System.out.println("maximum loan amount is 50000");
            }
            
        }
        else {
            System.out.println("you are not eligible");

        }

        
    }
}