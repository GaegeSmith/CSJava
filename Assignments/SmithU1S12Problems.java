import java.util.*;
import java.lang.*;

public class SmithU1S12Problems {
    public class Useful {
        public static String reverse(String reversee) {
            // init a result to add each letter to
            String result = "";
            // loop backwards through the string and concat the letter to result
            for (int i = reversee.length() - 1; i >= 0; i--) {
                result += reversee.substring(i, i+1);
            }
            // return result
            return result;
        }
        public static Scanner newScanner() {
            return new Scanner(System.in);
        }
        
        public static int howMany(String s, char chr) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == chr) {
                    count++;
                }
            }
            return count;
        }
    
        public static class Point {
            double x;
            double y;
            Point(double x, double y) {
                this.x = x;
                this.y = y;
            }
        }
        
        public static class Line {
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
        // midPointTable();
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
    
    private static void midPointTable(){
        System.out.println("  a\t  b\tMiddle Point");
        System.out.printf("(0,0)\t(2,1)\t%s\r\n",midPoint(0,0,2,1));
        System.out.printf("(1,4)\t(4,2)\t%s\r\n",midPoint(1,4,4,2));
        System.out.printf("(2,7)\t(6,3)\t%s\r\n",midPoint(2,7,6,3));
        System.out.printf("(3,9)\t(10,5)\t%s\r\n",midPoint(3,9,10,5));
        System.out.printf("(4,11)\t(12,7)\t%s\n",midPoint(4,11,12,7));
    }
    private static String midPoint(double x1,double y1,double x2,double y2){
        double deltaX =(x2-x1)/2+x1;
        double deltaY =(y2-y1)/2+y1;
        String output="("+deltaX+","+deltaY+")";
        return output;
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
