import java.lang.System;
import java.util.Scanner;

class qa12{
    public static void main(String args[]){

       int dcount = 0;
        for(int i=1; i<=100;i=i+1)

        {
            
            if (i%3==0 && i%5==0)
            {
                dcount = dcount+1;
                System.out.println("Numbers divisible by both 3 and 5 is " +i);
            }
        }
        System.out.println(dcount);
        
    }
}