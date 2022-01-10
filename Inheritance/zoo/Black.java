public class Black extends Birb implements Flying, Walking, Swimming {
    public Black() {
        super("Bomb", "boomb");
    }
    public Black(String name, String desc) {
        super(name, desc);
    }
    public String fly() {
        return "wiiiiiiiiiiiiiiiiiiiiiiii...boom";
    }
    public String walk() {
        return "hop hop hop * 10......boom";
    }
    public String swim() {
        return "splish splash your boat is trash.....boom";
    }
}
