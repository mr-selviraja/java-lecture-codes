import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        input.close();

        int numDays;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                numDays = 31;
                break;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                numDays = 30;
                break;

            case 2: // February
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear)
                    numDays = 29;
                else
                    numDays = 28;
                break;

            default:
                numDays = 0;
                System.out.println("Invalid month entered!");
                break;
        }

        if (numDays != 0) {
            System.out.println("Number of days in the specified month: " + numDays);
        }
    }
}
