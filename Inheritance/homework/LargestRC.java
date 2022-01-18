import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class LargestRC {
    public static Scanner in = newScanner();
    public static ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    public static void main(String[] args) {
        int size = intput("How large is the matrix?");
        
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

    public static int intput(String msg) {
        int result = 0;
        System.out.print(msg + " ");
        if (in.hasNextInt()) {
            result = in.nextInt();
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