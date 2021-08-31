import java.util.Scanner;
import java.lang.Math;

public class FuncNotes {
    public static void main(String[] args) {
        // convertMiletoKM();
        // calculateEnergy();
        futureInvestments();
        // drivingCost();
    }

    private static Scanner newScanner() {
        return new Scanner(System.in);
    }

    private static void convertMiletoKM() {
        Scanner ui = newScanner(); 
        System.out.print("Convert Miles to KM: ");
        float miles = ui.nextFloat();
        System.out.println(miles + " miles is " + (miles * 1.6) + " kilometers");
        ui.close();

    }

    private static void calculateEnergy() {
        Scanner ui = newScanner();
        System.out.print("Enter amount of water in kilograms: ");
        float kgs = ui.nextFloat();
        
        System.out.print("Enter initial temperature: ");
        float initTemp = ui.nextFloat();
        
        System.out.print("Enter final temperature: ");
        float endTemp = ui.nextFloat();

        System.out.println("The energy needed is " + (
            kgs * (endTemp - initTemp) * 4184
        ));
        
        ui.close();
    }

    private static void futureInvestments() {
        Scanner ui = newScanner();
        System.out.print("Enter investment amount: ");
        float 

         
    }

    private static void drivingCost() {

        
    }
}
