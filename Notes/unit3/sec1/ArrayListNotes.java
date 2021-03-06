import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class ArrayListNotes {
    public class Useful {
        public static void main(String[] args) {
            System.out.println("\n\tNobody:\n\tJava:");
            int bigest = 2147483647;
            System.out.println("\t" + bigest + " + 1 = " + (bigest + 1) + "\n");
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
    public static void main(String[] args) {
        ArrayList newList1 = new ArrayList();
        ArrayList<String> newList2 = new ArrayList<String>();
        ArrayList<Integer> newList3 = new ArrayList<Integer>();

        newList1.add(1);
        newList1.add("1");
        newList1.add("Kevin");
        newList1.add(3.14);


        System.out.println(newList1);

        for (int i = 0; i < newList1.size(); i++) {
            System.out.println(newList1.get(i).getClass());
        }
    }
    
}
