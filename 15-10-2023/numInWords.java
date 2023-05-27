import java.util.Scanner;

public class numInWords
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0-999: ");
		int num = input.nextInt();
	    
		String numInWords = "";

		if(num > 999 || num < 0){
			System.out.println("Number must be in the provided range");
			return;
		}

		if (num == 0) {
			System.out.println("Zero");
			return;
		}

		int hundreds = num / 100 ;
		int tens = (num / 10) % 10;
		int ones = num % 10;

		switch(hundreds) {
				case 1:
					numInWords += "One hundred ";
					break;
				case 2:
					numInWords += "Two hundred ";
					break;
				case 3:
					numInWords += "Three hundred ";
					break;
				case 4:
					numInWords += "Four hundred ";
					break;
				case 5:
					numInWords += "Five hundred ";
					break;
				case 6:
					numInWords += "Six hundred ";
					break;
				case 7:
					numInWords += "Seven hundred ";
					break;
				case 8:
					numInWords += "Eight hundred ";
					break;
				case 9:
					numInWords += "Nine hundred ";
					break;
		}

		switch(tens) {
				case 1:
					switch(ones) {
						case 1:
							numInWords += "Eleven";
							System.out.println(numInWords);
							return;
						case 2:
							numInWords += "Twelve";
							System.out.println(numInWords);
							return;
						case 3:
							numInWords += "Thirteen";
							System.out.println(numInWords);
							return;
						case 4:
							numInWords += "Fourteen";
							System.out.println(numInWords);
							return;
						case 5:
							numInWords += "Fifteen";
							System.out.println(numInWords);
							return;
						case 6:
							numInWords += "Sixteen";
							System.out.println(numInWords);
							return;
						case 7:
							numInWords += "Seventeen";
							System.out.println(numInWords);
							return;
						case 8:
							numInWords += "Eighteen";
							System.out.println(numInWords);
							return;
						case 9:
							numInWords += "Nineteen ";
							System.out.println(numInWords);
							return;
					}	
				case 2:
					numInWords += "Twenty ";
					break;
				case 3:
					numInWords += "Thirty ";
					break;
				case 4:
					numInWords += "Forty ";
					break;
				case 5:
					numInWords += "Fifty ";
					break;
				case 6:
					numInWords += "Sixty ";
					break;
				case 7:
					numInWords += "Seventy ";
					break;
				case 8:
					numInWords += "Eighty ";
					break;
				case 9:
					numInWords += "Ninety ";
					break;
		}

		switch(ones) {
				case 1:
					numInWords += "One";
					break;
				case 2:
					numInWords += "Two";
					break;
				case 3:
					numInWords += "Three";
					break;
				case 4:
					numInWords += "Four";
					break;
				case 5:
					numInWords += "Five";
					break;
				case 6:
					numInWords += "Six";
					break;
				case 7:
					numInWords += "Seven";
					break;
				case 8:
					numInWords += "Eight";
					break;
				case 9:
					numInWords += "Nine";
					break;
		}


		System.out.println(hundreds);
		System.out.println(tens);
		System.out.println(ones);
		System.out.println(numInWords);
	}
}
