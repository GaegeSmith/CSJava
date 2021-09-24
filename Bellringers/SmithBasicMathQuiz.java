import java.util.*;
import java.lang.*;
public class BasicMathQuiz {

    public static void main(String[] args) {
        Random rand = new Random();
        int num0 = rand.nextInt(100) + 1;
        int num1 = rand.nextInt(100) + 1;
        int sumNum = num0 + num1;
        System.out.printf("%d + %d = %d", num0, num1, sumNum);
    }
}
