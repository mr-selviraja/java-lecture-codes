import java.util.Scanner;

public class nameOfTheDay
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter a number from 0 to 6, to get it's respective day: ");
        int dayNum = input.nextInt();

        switch(dayNum) {
            case 0:
                System.out.println("Sunday");
                break;
            
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;
            
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid input");
        }
	}
}
