import java.util.Scanner; // Gotta take in user input

public class Tessie {

    public static void main(String args[]) {
        /*For now all I'm doing is setting myself up to take in user information. */
        Scanner dimensionInput = new Scanner(System.in);
        Scanner tessieStringInput = new Scanner(System.in);
        int dimensions;
        String tessieString;

        /*Just basic user input and output stuff. */
        System.out.print("What is the size of the square? ");
        dimensions = dimensionInput.nextInt();
        dimensionInput.close();

        System.out.print("What are the characters we're working with? ");
        tessieString = tessieStringInput.nextLine();
        tessieStringInput.close();

        /*Initializing a character array to break down the string.*/
        char[][] tessieArray = new char[dimensions][dimensions];
    }

    /*Skateboarding taught me a thing or two about trig, and from what
    I can recall a 270 degree rotation is just 90 degrees more than
    180. My solution to the 270 is inelegant because it'll require
    two partial rotations. However, like Jack Burton my solution
    will be able to handle anything.*/

    public static void rotpos90() {}

    public static void rotpos180() {}

    public static void rotneg90() {}

    public static void rotneg180() {}

    /*First we will take in the dimensions. The instructions state to assume
    the structure we are working with is a square. Therefore, we'll just ask
    for one number and assume both dimensions are that number.*/

    /*Second we will take in the god awful string of characters and praise Cthulhu.
    Since we can iterate through strings we will based on the number given to us.*/

    /*Third we will use a switch case for rotation because there are four possible
    rotations according to the instructions. No need to include Satan worship. However,
    ultimately all this will do is alter how we iterate through the array. Usually,
    you just go left to right, but we'll gown down-up, left-right, and stuff too.*/

    /* Should be easy. However, this is a WIP. I work two jobs now (one FT, one PT).
    Give me a few days. Code is easier than it looks, far easier. */
}
