public class Anglerfish extends Fish implements Swimming {
    public Anglerfish() {
        super("Demon", "Come to the light.");
    }
    public Anglerfish(String name, String desc) {
        super(name, desc);
    }
    public String swim() {
        return "swim swim";
    }
}
