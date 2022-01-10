public class Red extends Birb implements Flying, Walking, Swimming {
    public Red() {
        super("Red", "angy");
    }
    public Red(String name, String desc) {
        super(name, desc);
    }
    public String fly() {
        return "angrily flies";
    }
    public String walk() {
        return "angrily hops";
    }
    public String swim() {
        return "angrily swims";
    }
}
