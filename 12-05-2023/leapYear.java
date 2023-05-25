/*

The reason for dividing year with 100 and 400 is:

=> The reason for this process is to ensure that the calendar remains in alignment with the Earth's revolution
around the Sun. By adding an extra day (February 29th) to the calendar every four years, the average length of the calendar year becomes closer to the actual length of a solar year.

=> However, simply adding an extra day every four years would be slightly too much. To correct for this, the 
second rule is introduced: if a year is divisible by 100 but not divisible by 400, it is not a leap year. This rule eliminates certain leap years that would otherwise be counted according to the first rule. By doing this, the average calendar year length remains more accurate over the long term.

=> Example: 
    The year 2000 was a leap year because it was divisible by both 4 and 400.
    The year 1900 was not a leap year despite being divisible by 4 because it was also divisible by 100 but not by 400.

*/

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
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
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
