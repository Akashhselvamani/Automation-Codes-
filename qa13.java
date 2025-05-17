import java.lang.System;
import java.util.Scanner;

class qa13{
    public static void main(String args[]){


        int num[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("getting input using array");
        System.out.println("Enter the numbers");

        num[0] =scan.nextInt();
        num[1] =scan.nextInt();
        num[2] =scan.nextInt();
        num[3] =scan.nextInt();
        num[4] =scan.nextInt();
        //scan.close();

        System.out.println("getting input using Forloop");
        System.out.println("Enter the numbers");

       for (int i =0;i<5;i=i+1){
         num [i] =scan.nextInt();
       }
       
    }
}