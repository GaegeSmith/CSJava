public class StarWhale extends SpaceAnimal implements Flying {
    public StarWhale() {
        super("The Beast Below", "We trapped one underneath a small scale replica of Britian, enslaving it to survive.  Though we later found out that it willingly hlped us to survive earth's destruction.");
    }
    public StarWhale(String name, String desc) {
        super(name, desc);
    }
    public String fly() {
        return "Majesctically floating through space at speeds similar to star ships.";
    }
    @Override
    public String makeNoise() {
        return "Transmit maiting calls in radio waves";
    }
}