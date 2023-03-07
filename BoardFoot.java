import java.util.Random;
import java.util.Scanner;
/**
* This program asks the user for height and width
* then calls the length function to find volume.
*
* @author Jedidiah Alfred
* @version 1.0
* @since 2023-03-5
*/

public final class BoardFoot {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
     */
    private BoardFoot() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    */

    public static void main(String[] args) {
        // Creating the random generator
        final Random rand = new Random();

        // Creating the scanner.
        final Scanner scanner = new Scanner(System.in);

        // Getting user input for height and width
        System.out.print("Enter the height: ");
        final String heightString = scanner.nextLine();
        System.out.print("Enter the width: ");
        final String widthString = scanner.nextLine();

        // try catching any input errors
        try {
            // Parsing to doubles
            final double widthDouble = Double.parseDouble(widthString);
            final double heightDouble = Double.parseDouble(heightString);
            // Negative input is not allowed
            if (widthDouble > 0 && heightDouble > 0) {
                // Calling the function to calculate the length
                final double lengthDouble =
                    calcboardFoot(heightDouble, widthDouble);
                System.out.format("The length is %.2fin\n", lengthDouble);
            } else {
                System.out.println("The input cannot be negative!");
            }
        } catch (NumberFormatException error) {
            System.out.println("That input is invalid");
        }
        scanner.close();
    }
    /**
    * This function calculates the length given the width and height.
    *
    * @author  Jedidiah Alfred
    * @version 1.0
    * @param width This is used for the length calculations
    * @param height This is used for Calculating length
    * @return The length for the code above
    * @since   2023-03-5
    */

    public static double calcboardFoot(double height, double width) {
        // Board foot volume constant
        final double boardFoot = 144.0;

        // Calculating the length
        final double length = boardFoot / (height * width);
        // Returning the length back to where it was called from
        return length;
    }
}
