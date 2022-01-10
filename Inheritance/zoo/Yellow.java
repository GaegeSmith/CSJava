public class Yellow extends Birb implements Flying, Walking, Swimming {
    public Yellow() {
        super("Chuck", "I am SPEEEEED!!!");
    }
    public Yellow(String name, String desc) {
        super(name, desc);
    }
    public String fly() {
        return "go fast";
    }
    public String walk() {
        return "go faster";
    }
    public String swim() {
        return "too fast to swim, he crushes himself, or he skips on the water like a rock";
    }
}
