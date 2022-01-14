import java.util.Scanner;

public class TestProgam {
    static Scanner in = newScanner();
    public static void main(String[] args) {
        boolean filled = input("Is the triangle filled? (y/n)").equals("y");
        Triangle t = new Triangle(
            doubleInput("Length of side 1"),
            doubleInput("Length of side 2"),
            doubleInput("Length of side 3"),
            input("Color"),
            filled
        );

        System.out.println(t.toString());
    }

    public static Scanner newScanner() {
        return new Scanner(System.in);
    }

    public static double doubleInput(String msg) {
        double result = 0;
        System.out.print(msg + " ");
        if (in.hasNextDouble()) {
            result = in.nextDouble();
        }
        return result;
    }

    public static String input(String msg) {
        String result = "";
        System.out.print(msg + " ");
        if (in.hasNextLine()) {
            result = in.nextLine();
        }
        return result;
    }
}
