import java.util.Scanner;
import java.lang.Math;
public class SmithU3S6 {
    public class Useful {
        public static void main(String[] args) {
            System.out.println("Useful");
        }
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
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2, 3, 6, 8, 9, 9, 0};
        evenOddChecker(nums);
    }

    public static void evenOddChecker(int[] listy) {
        for (int i = 0; i < listy.length; i++) {
            
        }
    }
}