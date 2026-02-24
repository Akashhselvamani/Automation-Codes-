import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
    Scanner hello = new Scanner(System.in);

    int A = hello.nextInt();
    int B = hello.nextInt();

    hello.nextLine();

 String value = hello.nextLine();

    int C = A+B;

    System.out.println("On adding both numbers answer is "+ C);

    System.out.println("Printed the " + value);

    hello.close();




    }
    
}
