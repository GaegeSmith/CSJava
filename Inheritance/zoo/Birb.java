public class Birb extends Animal {
    public Birb() {
        super("Birb", "I am a government drone.  Gosh darn it, I wasn't supposed to sa--*Birb has been vaporized*");
    }
    public Birb(String name, String desc) {
        super(name, desc);
    }
    @Override
    public String makeNoise() {
        return "k-awe";
    }
}
