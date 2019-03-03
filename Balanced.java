/*I'm gonna work on a bonus version here in a few. Easy challenge.*/

import java.util.Scanner;

public class Balanced {

    public static void main(String[] args) {
        /*Gotta take in user input, and count the x's and y's.*/
        Scanner strInput = new Scanner(System.in);
        String usrString = "";
        int xCounter = 0, yCounter = 0;

        /*Need user input.*/
        System.out.print("Please input your string of characters: ");
        usrString = strInput.nextLine();
        strInput.close();

        /*Fun part: loop through the string and count the x's or y's.
        Since this is the basic challenge where a letter is x or y,
        we can just assume any non-x character is y.*/
        for(int i = 0; i < usrString.length(); ++i) {
            if(usrString.charAt(i) == 'x') {
                ++xCounter;
            } else {
                ++yCounter;
            }
        }
        /*Gotta make sure it's balanced by checking to make sure
        both counter values are equal.*/
        if(xCounter == yCounter) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
