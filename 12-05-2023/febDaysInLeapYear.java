import java.util.Scanner;

public class febDaysInLeapYear {
    public static void main(String args[]) {
        // Read the year from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear = false;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
            } 
            else {
                isLeapYear = true;
            }
        }

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year and the number of days in February are 29.");
        } else {
            System.out.println(year + " is not a leap year and the number of days in February are 28.");
        }
    }
}