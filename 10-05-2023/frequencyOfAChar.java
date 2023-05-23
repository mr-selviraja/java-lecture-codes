import java.util.Scanner;

public class frequencyOfAChar {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        System.out.print("Enter a Character to check it's presence in the String: ");
        char ch = input.next().charAt(0);

        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if (ch == str.charAt(i))
                count++;
        }

        System.out.println(ch + " is found " + count + " times!");
    }
}