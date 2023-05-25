import java.util.Scanner;

public class calcGradesUsingMarks {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks(0-100) to get grade: ");
        int marks = input.nextInt();

        if (marks<0 || marks>100) {
            System.out.println("Invalid marks");
            return;
        }

        if (marks >= 60)
            System.out.println("Passed with " + marks + " marks.");
        else if(marks >= 50 && marks < 60)
            System.out.println("Marginally passed with " + marks + " marks.");
        else
            System.out.println("Failed with " + marks + " marks.");
    }
}