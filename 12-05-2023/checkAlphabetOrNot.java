import java.util.Scanner;

public class checkAlphabetOrNot {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character to check whether it is an Alphabet or not..!");
        char ch = input.next().charAt(0);

        // relational operators type casts chars into their respective ASCII values
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an Alphabet");
        else
            System.out.println(ch + " is not an Alphabet");
    }
}