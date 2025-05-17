import java.lang.System;
import java.util.Scanner;

class qa6{
    public static void main(String args[]){
System.out.println("What is the colour of traffic light");
Scanner scan = new Scanner(System.in);
String colour = scan.nextLine();

if (colour.equals("Red"))
{
    System.out.println("Strop");
}
else if (colour.equals("Yellow"))
{

    System.out.println("Get ready");
}
else if (colour.equals("Green"))
{

System.out.println("Gooo");
}   
 }
}