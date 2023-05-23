import java.util.Scanner;

public class checkStringEmptyOrNull {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        if (userInput == null) {
            System.out.println("The string is null");
        } else if(userInput.length() == 0) {
            System.out.println("The string is empty");
        } else {
            System.out.println("The string is not empty or null.");
        }

        input.close();
    }
}