import java.lang.System;
import java.util.Scanner;

class qa4{
    public static void main(String args[]){

        

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the score in the game");
        int A = scan.nextInt();

        if (A<50){
            System.out.println("you need to improve");

        }

        else if(A>=50 && A<=70){

            System.out.println("Very good");
        }

        else if (A>70){
            System.out.println("Excellent");
        }
    }
}