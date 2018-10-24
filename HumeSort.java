import java.util.Scanner;

/*David Hume was an epistemological philosopher who destroyed tons of
philosophy prior to him. He was instrumental in the philosophy Kant developed.
Kant referred to Hume's actions as a scandal in philosophy.
This sort is meant to model that scandal. Which means, it will take in
information from previous arrays and base its assumption of how to sort
the latest one off similarity of previous arrays.
Ideally, a confidence interval or some fancy stats would be used instead
of straight arithmetic, however, this is for fun and a proof of concept.
I am also not that strong in stats or math.

Ideally this program should eventually run in constant time for an average case.
However, adding new information or changing the parameters of the array would
drastically lower the performance. I don't recommend its use for sorting. There are
better algorithms.

This is a joke. haha.*/
public Class HumeSort {
    /*We need an array to compare to, one to save the values, another to save counts,
    and the array we're going to sort based on those three. I'm going to use a resizing array
    so that we only need four arrays.
    We're going to count the size of the first array, and treat any entry beyond the initial count
    as a new array. This count would be updated ideally after every new input meant to resemble a new
    array. Totally for convenience. We'll use an int to maintain a running count of instances of a given
    value. The initial size will be updated by the user. Therefore we will have a counter to make sure
    after the first time they've been queried they will no longer get an input on its size.
    Rather, there will just be a while loop that will end once they're done inputting values.*/
    String array1 = "";
    String array2 = "";
    String array3 = "";
    String array4 = "";
    int size, usrChoices, runningCount, nums;
    String quit = "";
    String numInput = "";
    Scanner usrInput = new Scanner(System.in);
    Scanner terminate = new Scanner(System.in);

    /*Since I am working with multiple arrays, I am taking various arguments
    instead of a single one like the original algorithm called for. We will take
    the initial size as N, and later on just throw things into the arrays without
    thought, but keep incrementing the counter and letting these functions do their work.
    I am omitting the function to delete anything from these arrays because it is unnecessary.*/
    public void push(String item, String s, int N) {
        if(N == s.length()) {
            resize(2 * s.length());
            s[N++] = item;
        }
    }

    /*This function will resize our array. */
    private void resize (int capacity) {
        String[] copy = new String[capacity];
        for(int i = 0; i < N; ++i) {
            copy[i] = s[i];
        }
        s = copy;
    }

    /*We are getting the initial size of the first array from the user.
    This value would normally be stored and prevent this option from
    coming up again. */
    if(usrChoices == 0) {
        System.out.println("How large will your initial array be?");
        size = usrInput.nextInt();
        usrInput.close();
        for(int i = 0; i < size; ++i) {
            System.out.println("Please enter a value: ");
            quit = terminate.nextLine();
            nums = Integer.parseInt(quit);
        }
        ++usrChoies;
    } else {
        while(!(quit.equals("q") || quit.equals("Q"))) {
            System.out.print("Please enter a new value or Q to terminate: ");
            quit = terminate.nextLine();
            if(quit.equals("q") || quit.equals("Q")) {
                break;
            } else {
                nums = Integer.parseInt(quit);
            }
        }
    }

    //Because this is Java.
    public static void main(String[] args) {}
}
