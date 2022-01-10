public class Whale extends Fish implements Swimming {
    public Whale() {
        super("Orca", "I'm a whale.");
    }
    public Whale(String name, String desc) {
        super(name, desc);
    }
    public String swim() {
        return "Swimming and blowing its nose";
    }
}
