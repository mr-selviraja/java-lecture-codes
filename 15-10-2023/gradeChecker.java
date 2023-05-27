import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's grade (0-100): ");
        int grade = scanner.nextInt();
        scanner.close();

        String result;

        if (grade < 0 || grade > 100) {
            System.out.println("Invalid input");
            return;
        } 
        switch (grade/10) {
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                result = "Pass";
                break;
            case 5:
                result = "Marginal pass";
                break;
            default:
                result = "Fail";
        }

        System.out.println(result);
    }
}
