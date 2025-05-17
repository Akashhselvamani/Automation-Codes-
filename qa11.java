import java.lang.System;
import java.util.Scanner;

class qa11{
    public static void main(String args[])
    {

       int evencount = 0;
       for(int i=1;i<=10;i=i+1)
       {
        if(i%2==0)
        
       {
        evencount = 1 + evencount;
        System.out.println("Even numbers "+i);
       }
        
       }
       System.out.println("Number of count "+evencount);

    }
    
}