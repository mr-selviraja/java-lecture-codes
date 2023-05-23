public class swapNumbersUsingTemp
{
	public static void main(String[] args) {
	    int num1=5,num2=10;
	    System.out.println(" Before Swapping num1="+ num1 +" and num2="+num2);
	    
	    int temp=num1;
	    num1=num2;
	    num2=temp;
	    
	    System.out.println(" After Swapping num1="+ num1 +" and num2="+num2);
	   
	}
}