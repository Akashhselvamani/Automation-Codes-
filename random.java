import java.lang.System;
import java.util.Scanner;
import java.util.Random;

class random{

    public static void main(String args[]){


         Random ran = new Random();
         int num=0;

         while (num !=5){


                      
            num = ran.nextInt(100);

                
            System.out.println(num);
         }
    }
}