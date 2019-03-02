import java.util.Scanner; // Gotta take in user input

public class Tessie {

    public static void main(String args[]) {
        /*For now all I'm doing is setting myself up to take in user information. */
        Scanner dimensionInput = new Scanner(System.in);
        Scanner tessieStringInput = new Scanner(System.in);
        Scanner rotationInput = new Scanner(System.in);
        int dimensions, rotationDegree;
        String tessieString;

        /*Just basic user input and output stuff. */
        System.out.print("What is the size of the square? ");
        dimensions = dimensionInput.nextInt();
        dimensionInput.close();

        System.out.println();

        System.out.print("What is the degree of rotation? ");
        rotationDegree = rotationInput.nextInt();
        rotationInput.close();

        //We'll treat 360 degree rotations and 0 degree rotations the same.
        if(rotationDegree == 360)
            rotationDegree -= 360;


        /* If the user puts in a rotation greater than 360 degrees,
        we'll just subtract 360 degrees from it until it's no longer
        greater than 360 degrees.*/
        if(rotationDegree > 360 && rotationDegree%90 == 0) {
            while(rotationDegree > 360 && rotationDegree%90 == 0) {
                rotationDegree -= 360;
            }
        }

        /*This will catch potential user error before it messes things up. */
        if(rotationDegree%90 != 0) {
            System.out.print("Please input the degree again, as a multiple of 90: ");
            rotationDegree = rotationInput.nextInt();
            rotationInput.close();
        }

        System.out.print("What are the characters we're working with? ");
        tessieString = tessieStringInput.nextLine();
        tessieStringInput.close();

        /*Initializing a character array to break down the string.*/
        char[][] tessieArray = new char[dimensions][dimensions];
        char[][] secondTessieArray = new char[dimensions][dimensions];

        /*Now for the fun part, take a 1 dimension object and turn it into
        a 2 dimension array. Due to the looping required this will not be pretty.
        Seriously, don't do this at home. It's ugly.*/
        for(int i = 0; i < tessieString.length(); ++i) {
            for(int j = 0; j < dimensions; ++j) {
                for(int k = 0; k < dimensions; ++k) {
                    tessieArray[j][k] = tessieString.charAt(i);
                }
            }
        }

        /*This is faster than an if-statement and since there are
        few specific options it'll work perfectly. I'll probably
        end up handling the 270 degree rotation differently,
        with its own function to ensure accuracy. No matter what
        I do though the 270 rotation won't be pretty.*/
        switch(rotationDegree) {
        case 0:
            //output array as is
            break;
        case -270:
            rotneg180();
            rotneg90();
            break;
        case -180:
            rotneg180();
            break;
        case -90:
            rotneg90();
            break;
        case 90:
            rotpos90();
            break;
        case 180:
            rotpos180();
            break;
        case 270:
            rotpos180();
            rotpos90();
            break;
        }


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
