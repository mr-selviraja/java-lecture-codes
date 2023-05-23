import java.util.Scanner;

public class removeSpacesFromString {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();

        String strWithoutSpace = str.replaceAll("\\s", "");

        System.out.println("String without whitespace: " + strWithoutSpace);
    }
}