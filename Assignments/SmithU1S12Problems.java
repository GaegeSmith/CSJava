import java.util.*;
import java.lang.*;

public class SmithU1S12Problems {
    public class Useful {
        // public static void main(String[] args) {
        //     System.out.println("Useful");
        // }
        private static String reverse(String reversee) {
            // init a result to add each letter to
            String result = "";
            // loop backwards through the string and concat the letter to result
            for (int i = reversee.length() - 1; i >= 0; i--) {
                result += reversee.substring(i, i+1);
            }
            // return result
            return result;
        }
        private static Scanner newScanner() {
            return new Scanner(System.in);
        }
    
        private static int howMany(String s, char chr) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == chr) {
                    count++;
                }
            }
            return count;
        }
    
        private static class Point {
            double x;
            double y;
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }
        
        private static class Line {
            Point pt0;
            Point pt1;
            Line(Point pt0, Point pt1) {
                this.pt0 = pt0;
                this.pt1 = pt1;
            }
            public double len() {
                return Math.sqrt(Math.pow((this.pt1.x - this.pt0.x), 2) + Math.pow((this.pt1.y - this.pt0.y), 2));
            }
            public Point midPnt() {
                return new Point(
                    (this.pt0.x + this.pt1.x) / 2, (this.pt0.y + this.pt1.y) / 2
                );
            }
    
        }
    }

    public static void main(String[] args) {
        // triangleArea();
        midPointTabel();
        // minuteYearConverter();
        // triangleVolume();
    }
    private static void minuteYearConverter() {
        Scanner ui = Useful.newScanner();
        System.out.print("Enter the number of minutes: ");
        double minutes = ui.nextDouble();
        int years = 0;
        int leftOverMins = 0;
        double minsInYear = 365 * 24 * 60;

        years = (int)(minutes / minsInYear);
        leftOverMins = (int)((minutes % minsInYear) / 24) / 60;
        System.out.println(leftOverMins);
        System.out.println("\n" + minutes + " minutes is approximately " + years + " years and " + leftOverMins + " days.");

    }
    
    private static void midPointTabel() {
        
    }

    private static void triangleVolume() {
        Scanner ui = Useful.newScanner();
        
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
        double len = ui.nextDouble();
        double area = (Math.sqrt(3) / 4.0) * len * len;
        double volume = area * len;
        System.out.println("The area is " + area + "\nThe volume of the Triangular prism is " + volume);
    }

    private static void triangleArea() {
        Scanner ui = Useful.newScanner();
        System.out.println("Type the x and y for each point and hit enter after each number.\nPoint A");
        Useful.Point ptA = new Useful.Point(ui.nextDouble(), ui.nextDouble());
        System.out.println("Point B");
        Useful.Point ptB = new Useful.Point(ui.nextDouble(), ui.nextDouble());
        System.out.println("Point C");
        Useful.Point ptC = new Useful.Point(ui.nextDouble(), ui.nextDouble());
        ui.close();
    
        Useful.Line side0 = new Useful.Line(ptA, ptB);
        Useful.Line side1 = new Useful.Line(ptA, ptC);
        Useful.Line side2 = new Useful.Line(ptC, ptB);
    
        double s = (side0.len() + side1.len() + side2.len()) / 2;
        double area = Math.sqrt(
            s * (s - side0.len()) * (s - side1.len()) * (s - side2.len())
        );
        System.out.println(area);
    
    
    }

    
}
