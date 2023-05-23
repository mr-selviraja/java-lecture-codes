import java.util.Scanner;

public class checkEvenOrOdd {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to check whether it is even or odd: ");  
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Negative numbers are neither Even nor Odd!");
            return;
        }

        if (num%2 == 0) {
            System.out.println(num + " is an even number.");
            return;
        }
        else
            System.out.println(num + " is a odd number.");
    }
}