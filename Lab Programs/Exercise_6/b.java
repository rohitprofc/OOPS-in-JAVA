package Exercise_6;

public class b {
    public static void main(String[] args) {
        String name = null;
        try {
            if (name.equals("Rohit"))
                System.out.println("Not Equal");

        } catch (NullPointerException npe) {
            System.out.println("Exception: Null Pointer Exception");
        }
    }
}
/*
 * Output:-
 * Exception: Null Pointer Exception
 */
