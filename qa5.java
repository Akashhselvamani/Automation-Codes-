import java.lang.System;
import java.util.Scanner;

class qa5{
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);

       System.out.println("Enter tamil mark");
        int S1 =scan.nextInt();
     System.out.println("Enter English mark");
        int S2 =scan.nextInt();
        System.out.println("Enter Math mark");
        int S3 =scan.nextInt();
        System.out.println("Enter Social mark");
        int S4 =scan.nextInt();
       System.out.println("Enter Science mark");
        int S5 =scan.nextInt();

        int Total = S1+S2+S3+S4+S5;

        int Avg = Total/5 ;

        System.out.println("Your Average mark is  "+ Avg);

        if (Avg < 35){
            System.out.println("Additional class is required");
        }

        else {
            System.out.println("You are good to go");
        }




    }
}