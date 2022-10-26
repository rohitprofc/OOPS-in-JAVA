import java.util.*;

public class Binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int n = s.nextInt();

        if (n < 1 || n > 255)
            System.exit(0);

        String rawBinary = Integer.toBinaryString(n);
        String formatBinary = String.format("%08d", Integer.parseInt(rawBinary));
        System.out.println("Binary value: " + formatBinary);
        s.close();
    }
}
/*
 * Output:-
 * Enter decimal number: 51
 * Binary value: 00110011
 */
