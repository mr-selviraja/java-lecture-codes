public class checkStringEmptyOrNull {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        if (userInput == null || userInput.isEmpty()) {
            System.out.println("The string is either null or empty.");
        } else {
            System.out.println("The string is not empty or null.");
        }

        input.close();
    }
}