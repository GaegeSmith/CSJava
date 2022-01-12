public class Groot extends SpaceAnimal implements Walking {
    public Groot() {
        super("I am Groot", "He is Groot");
    }
    public Groot(String name, String desc) {
        super(name, desc);
    }
    public String walk() {
        return "I am Groot";
    }
}
