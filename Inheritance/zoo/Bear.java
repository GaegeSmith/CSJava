public abstract class Bear extends Animal {
    public Bear() {
        super("Theodore", "bear");
    }

    public Bear(String name, String desc) {
        super(name, desc);
    }
    @Override
    public String makeNoise() {
        return "r-ow-wer";
    }
    public abstract String walk();
}
