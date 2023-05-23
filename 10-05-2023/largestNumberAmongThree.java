import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input.nextInt();

        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("Largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
    }
}