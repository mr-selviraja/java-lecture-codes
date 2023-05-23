import java.util.Scanner;

public class rootsOfQuadraticEquation {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();
        
        double D = (b*b) - 4*a*c;

        if (D > 0) {
            // roots are real and different
            double root1 = (-b + Math.sqrt(D)) / 2*a;
            double root2 = (-b - Math.sqrt(D)) / 2*a;

            System.out.println("Roots are Real and Different.\nRoot1: " + root1 + "\nRoot2: " + root2);
        }
        else if (D == 0) {
            double root = -b/2*a;
            System.out.println("Roots are Real and same.\nRoot1: " + root);
        }
        else 
            System.out.println("Roots are Imaginary.");
    }
}