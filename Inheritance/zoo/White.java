public class White extends Birb implements Flying, Walking, Swimming {
    public White() {
        super("Matilda", "Craps an egg");
    }
    public White(String name, String desc) {
        super(name, desc);
    }
    public String fly() {
        return "flap flap pop wiiiiiiii";
    }
    public String walk() {
        return "hopity hop hop hop";
    }
    public String swim() {
        return "prprprprprprprprprp";
    }
}
