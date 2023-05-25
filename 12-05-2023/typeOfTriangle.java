import java.util.Scanner;

public class typeOfTriangle {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        if ((side1 == side2) && (side1 == side3))
            System.out.println("Equilateral triangle");
        else if ((side1 == side2) || (side1 == side3))
            System.out.println("Issosceles triangle");
        else 
            System.out.println("Scalene triangle");
    }
}