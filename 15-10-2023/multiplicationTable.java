import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 1 || number > 10) {
            System.out.println("Invalid input!");
        } else {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                int result = 1;
                switch (number) {
                    case 1:
                        result = i;
                        break;
                    case 2:
                        result = i * 2;
                        break;
                    case 3:
                        result = i * 3;
                        break;
                    case 4:
                        result = i * 4;
                        break;
                    case 5:
                        result = i * 5;
                        break;
                    case 6:
                        result = i * 6;
                        break;
                    case 7:
                        result = i * 7;
                        break;
                    case 8:
                        result = i * 8;
                        break;
                    case 9:
                        result = i * 9;
                        break;
                    case 10:
                        result = i * 10;
                        break;
                }
                System.out.println(number + " x " + i + " = " + result);
            }
        }
    }
}
