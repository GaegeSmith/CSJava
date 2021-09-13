import java.util.*;
import java.lang.*;
public class Condish {
    public static void main(String[] args) {
        // gradeChecker();
        // evenOddChecker();
        // System.out.println(isEven(999));
        triangleChecker();


    }
    public static void gradeChecker() {
        Scanner ui = new Scanner(System.in);
        System.out.print("What is your grade? ");
        int grade = ui.nextInt();

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        ui.close();
    }
    private static void evenOddChecker() {
        Scanner ui = new Scanner(System.in);
        System.out.print("Whole number: ");
        int num = ui.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d is even\n", num);
        } else {
            System.out.printf("%d is odd\n", num);
        }
    }




    private static void triangleChecker() {
        Point p1 = new Point(100.5, 25.5);
        


    }

    private static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
    
}
