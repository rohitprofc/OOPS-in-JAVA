import java.util.*;

public class SGPA {

    String[] subjects = { "Graphics", "PPS", "JAVA", "Chemistry", "English", "Technical Skills", "Data Structures", };
    double[] credits = { 2, 4, 3, 3, 2, 1.5, 4 };

    double calcSGPA(int[] points) {
        double s1 = 0;
        double s2 = 0;
        for (int i = 0; i < 7; i++) {
            s1 += points[i] * credits[i];
            s2 += credits[i];
        }
        double sgpa = s1 / s2;
        return sgpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] points = new int[7];
        SGPA s = new SGPA();
        System.out.println("Enter points for each subject: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(s.subjects[i] + ": ");
            points[i] = sc.nextInt();
        }
        double sgpa = s.calcSGPA(points);
        System.out.printf("SGPA - %.2f", sgpa);
    }
}
