import java.lang.*;
import java.util.*;
public class SciFiName {
    public static void main(String[] args) {
        Scanner ui = newScanner();
        

        String first = "Informal";
        String last = "Cleric";
        String city = "Chandler";
        String school = "Chandler";
        String brother = "Patrick";
        String sister = "Patrice";



        // System.out.print("Please enter your first name: ");
        // String first = ui.nextLine();

        // System.out.print("Please enter your last name: ");
        // String last = ui.nextLine();

        // System.out.print("Please enter your city's name: ");
        // String city = ui.nextLine();
        
        // System.out.print("Please enter your school's name: ");
        // String school = ui.nextLine();

        // System.out.print("Please enter your brother's name: ");
        // String brother = ui.nextLine();

        // System.out.print("Please enter your sister's name: ");
        // String sister = ui.nextLine();

        
        // generate random numbers
        int rF = (int) (Math.random() * first.length());
        int rL = (int) (Math.random() * last.length());
        int rC = (int) (Math.random() * city.length());
        int rS = (int) (Math.random() * school.length());
        int rB = (int) (Math.random() * brother.length());
        int rSi = (int) (Math.random() * sister.length());

        String sciFiFirst = first.substring(rF) + last.substring(rL);

        String sciFiLast = city.substring(rC) + school.substring(rS);

        String sciFiHome = brother.substring(rB) + sister.substring(rSi);

        int count = 0;

        while (sciFiFirst != (first + last) || sciFiLast != (city + school) || sciFiHome != (brother + sister)){
            // generate random numbers
            rF = (int) (Math.random() * first.length());
            rL = (int) (Math.random() * last.length());
            rC = (int) (Math.random() * city.length());
            rS = (int) (Math.random() * school.length());
            rB = (int) (Math.random() * brother.length());
            rSi = (int) (Math.random() * sister.length());

            sciFiFirst = first.substring(rF) + last.substring(rL);

            sciFiLast = city.substring(rC) + school.substring(rS);

            sciFiHome = brother.substring(rB) + sister.substring(rSi);
            count++;

        }

        System.out.println("Hello there " + sciFiFirst + " " + sciFiLast + " from " + sciFiHome + " count: " + count);
    }

    
    
    private static Scanner newScanner() {
        return new Scanner(System.in);
    }
}
