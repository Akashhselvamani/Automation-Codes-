import java.lang.System;
import java.util.Scanner;

class elseif{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();

        if(A >35 && A<60){
            System.out.println("Video game");
        }
        else if (A > 60 && A< 80){
        System.out.println("iPhone");

        }

        else if(A>80 && A< 90){

            System.out.println("Mackbook");
        }





    }
}