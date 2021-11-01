import java.util.Random;
public class Ball {
    int[] directions;
    Random rand;

    public Ball(int levels) {
        this.directions = new int[levels];
        this.rand = new Random();
    }
    public void nextDir(int level) {
        if (this.rand.nextInt(1) == 1) {
            this.directions[level] = 1;
        } else {
            this.directions[level] = -1;
        }
    }
}
