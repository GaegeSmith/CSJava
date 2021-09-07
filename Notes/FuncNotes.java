import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class FuncNotes {
    public static void main(String[] args) {
        // convertMiletoKM();
        // calculateEnergy();
        // futureInvestments();
        drivingCost();
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
        // https://stackoverflow.com/questions/8137218/trim-double-to-2-decimal-places
        DecimalFormat df = new DecimalFormat("#.##");
        // the example for this did the math wrong somehow,
        // initialInvestment = 1000
        // monthlyInterestRate = 3.25% or 0.0325
        // numberOfYears = 1
        // result is $1467.85
        Scanner ui = newScanner();
        System.out.print("Enter investment amount: ");
        double invAmt = ui.nextDouble();
        System.out.print("Enter the annual interest rate percentage: ");
        double monIntRt = ui.nextDouble() / 100.0;
        System.out.print("Enter number of years: ");
        double numYears = ui.nextDouble();
        System.out.println("Future value is: $" + 
            df.format(invAmt * (Math.pow(
                (1 + monIntRt), 
                (numYears * 12)
                ))
            ));
        ui.close();
            
    }

    private static void drivingCost() {
        // https://stackoverflow.com/questions/8137218/trim-double-to-2-decimal-places
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner ui = newScanner();

        System.out.print("Enter driving distance in miles: ");
        double drvDist = ui.nextDouble();

        System.out.print("Enter fuel millage in mile per gallon: ");
        double mpg = ui.nextDouble();

        System.out.print("Enter price per gallon in dollars: ");
        double ppg = ui.nextDouble();

        System.out.println("The cost of driving " + drvDist + " miles at " + mpg + " miles per gallon is $" + df.format(drvDist/mpg*ppg));
        
    }
}
