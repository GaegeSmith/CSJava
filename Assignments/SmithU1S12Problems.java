import java.util.*;
import java.lang.*;

public class SmithU1S12Problems {
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
    public static void main(String[] args) {
        // triangleArea();
        // midPointTabel();
        minuteYearConverter();
        // triangleVolume();
    }
    private static Scanner newScanner() {
        return new Scanner(System.in);
    }
    private static void minuteYearConverter() {
        Scanner ui = newScanner();
        System.out.print("Enter the number of minutes: ");
        double minutes = ui.nextDouble();
        System.out.println("\n" + minutes + " minutes is approximately " + years + " years and " + );

    }
    private static void midPointTabel() {
        
    }
    private static void triangleArea() {
        Scanner ui = newScanner();
        System.out.println("Type the x and y for each point and hit enter after each number.\nPoint A");
        Point ptA = new Point(ui.nextDouble(), ui.nextDouble());
        System.out.println("Point B");
        Point ptB = new Point(ui.nextDouble(), ui.nextDouble());
        System.out.println("Point C");
        Point ptC = new Point(ui.nextDouble(), ui.nextDouble());
        ui.close();

        Line side0 = new Line(ptA, ptB);
        Line side1 = new Line(ptA, ptC);
        Line side2 = new Line(ptC, ptB);

        double s = (side0.len() + side1.len() + side2.len()) / 2;
        double area = Math.sqrt(
            s * (s - side0.len()) * (s - side1.len()) * (s - side2.len())
        );
        System.out.println(area);


    }

    
}
