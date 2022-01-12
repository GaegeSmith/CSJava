public class BrownBear extends Bear {
    public BrownBear() {
        super("Brownie", "Bear that's brown and delicious");
    }
    public BrownBear(String name, String desc) {
        super(name, desc);
    }
    @Override
    public String walk() {
        return "Hunt some picanic basket";
    }
    @Override
    public String makeNoise() {
        return "Hello boo boo!";
    }
}
