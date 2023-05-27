import java.util.Scanner;

public class areaOfDifferentShapesUsingSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the shape (circle, rectangle, or triangle): ");
        String shape = input.nextLine();

        switch (shape.toLowerCase()) {
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                if (radius < 0)
                    System.out.println("Invalid input! Radius cannot be negative.");
                else {
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Area of the circle: " + circleArea);
                }
                break;

            case "rectangle":
                System.out.print("Enter the length of the rectangle: ");
                double length = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = input.nextDouble();
                if (length < 0 || width < 0)
                    System.out.println("Invalid input! Dimensions cannot be negative.");
                else {
                    double rectangleArea = length * width;
                    System.out.println("Area of the rectangle: " + rectangleArea);
                }
                break;

            case "triangle":
                System.out.print("Enter the base length of the triangle: ");
                double base = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = input.nextDouble();
                if (base < 0 || height < 0)
                    System.out.println("Invalid input! Dimensions cannot be negative.");
                else {
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of the triangle: " + triangleArea);
                }
                break;

            default:
                System.out.println("Invalid shape entered!");
                break;
        }

        input.close();
    }
}
