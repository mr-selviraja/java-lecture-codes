// Get integers input from the user  
import java.util.Scanner;

public class readingUserInput
{
	public static void main(String[] args) {
	    //create an object of scanner
	    Scanner input= new Scanner(System.in);
	    
	    System.out.println("Enter the name: ");
	    String name=input.nextLine();
	    System.out.println("you entered  "+ name);
	    
	    //getting float as input
	    System.out.println("Enter Float value ");
	    float n1=input.nextFloat();
	    System.out.println("Float entered  "+ n1);
	    
	    //getting double as input
	    System.out.println("Enter Double value ");
	    double n2=input.nextDouble();
	    System.out.println("Double entered  "+ n2);
	    
	    
	    
	}
}