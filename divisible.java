import java.lang.System;
import java.util.Scanner;

class divisible{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    if(num1 % 3 == 0)
    {
        System.out.println("number is divisible by 3 ");
    }
    else 
    {
        System.out.println("number is not divisible by 3 ");
    }

    if(num2% 5 ==0)
    {
        System.out.println("number is divisible by 5 ");
    }
    else 
    {
        System.out.println("number is not divisible by 5 ");
    }
    }
}