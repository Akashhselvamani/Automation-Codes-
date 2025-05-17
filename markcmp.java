import java.lang.System;
import java.util.Scanner;

class markcmp{
    public static void main(String args[]){

 Scanner scan = new Scanner(System.in);
 int income = scan.nextInt();

 //int mark = 20;


if(income > 6999)
{
    System.out.print("scholarship available");

}
else
{
    System.out.print("scholarship is not available");
}

    }
}