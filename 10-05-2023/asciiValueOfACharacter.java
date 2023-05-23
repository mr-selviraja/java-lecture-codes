import java.util.Scanner;

public class asciiValueOfACharacter {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character to find it's ASCII value: ");
        char ch = input.next().charAt(0);

        System.out.println("The ASCII value of " + ch + " is: " + (int)ch);
    }
}