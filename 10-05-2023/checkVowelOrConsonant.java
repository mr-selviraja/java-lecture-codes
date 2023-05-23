import java.util.Scanner;

public class checkVowelOrConsonant {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter character to check whether it is vowel or consonant: ");  
        char ch = input.next().charAt(0);

        switch(ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println(ch + " is a Vowel.");
                break;

            default:
                System.out.println(ch + " is a Consonant.");
        }
    }
}