public class Blues extends Birb implements Flying, Walking, Swimming {
    public Blues() {
        super("The Blues", "Mitosis, chromosomal ride.  Inter-, pro-, meta- ana-, telophase, divide!  Eukaryotes go from one cell to two.  Mitosis; how cells renew");
    }
    public Blues(String name, String desc) {
        super(name, desc);
    }
    public String fly() {
        return "making it rain mini meees";
    }
    public String walk() {
        return "hold on, we're coming";
    }
    public String swim() {
        return "we need a bunch of mini lifejackets";
    }
}
