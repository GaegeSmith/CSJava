import java.util.*;
import java.lang.*;
public class Useful {
    private static Scanner newScanner() {
        return new Scanner(System.in);
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