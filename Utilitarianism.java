//This code is mostly useless and probably won't run.

/*This would be where we collect the inputs
and ultimately pass them through the objects.
Just a hypothetical class, since I have no way
of getting the required inputs in a solid way. */
public class Utilitarianism {
    public static void main(String[] args) {
    }
}

//Bentham's calculus
//Classes are basically just variables with methods (functions) and stuff
class Bentham {

    /* These are the values we could not necessarily get from the user.
    However, they are still necessary for the calculation. We could just
    get them from a database or something before going through with our
    computation.*/
    int cert, propin, fecund, purity, extent;
    /*Intensity and duration could be probably collected
    from the user so we would just pass that when we call the
    class object.*/
    public static String solveMath(int inten, int dur) {
        String result = "";
        return result;
    }

};

//Mill's contribution to Bentham's work
//Extending Bentham means I can illustrate that while saving work
class Mill extends Bentham {
    /*This class would probably require a queue or
    BST to store hobbies and educational levels. You could
    pop off values off the queue until it matched a given string
    of the hobby/sport/art, and base your score off the incrementation.
    Otherwise, you could use a coded language to store each hobby/art/sport as a key in a BST
    and its value in the value portion of the node.*/
    /*You would also want a queue for stuff like educational level to determine who is the
    most educated in a given context.*/
};
