import java.util.*;
import java.lang.*;
public class QuadraticFormula {
    public static void main(String[] args) {
        quadratic();
    }
    private static Scanner newScanner() {
        return new Scanner(System.in);
    }
    private static void quadratic() {
        Scanner ui = newScanner();

        System.out.print("Enter a: ");
        double a = ui.nextDouble();
        
        System.out.print("Enter b: ");
        double b = ui.nextDouble();

        System.out.print("Enter c: ");
        double c = ui.nextDouble();

        double disc = Math.pow(b, 2) - (4 * a * c);
        double r1 = (-b + Math.sqrt(disc)) / 2 * a;
        double r2 = (-b - Math.sqrt(disc)) / 2 * a;

        if (disc > 0) {
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (disc < 0) {
            System.out.println("The equation has no real roots");
        } else {
            System.out.println("The equation has one root " + r1);
        }
    }
}