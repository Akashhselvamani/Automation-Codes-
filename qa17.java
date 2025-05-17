import java.util.Scanner;

public class qa17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {

            System.out.print("Enter a string of exactly 8 characters: ");
            userInput = scanner.nextLine();

            if (userInput.length() == 8) {
                break; 
            } else {
                System.out.println("Invalid input. Please make sure it is exactly 8 characters.");
            }
        }

        System.out.println("You entered: " + userInput);

        scanner.close();
    }
}
