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
    @Override
    public String makeNoise() {
        return "This little light of mine I'm going to let it shine Oh, this little light of mine I'm going to let it shine  This little light of mine I'm going to let it shine Let it shine, all the time, let it shine  All around the neighborhood I'm going to let it shine All around the neighborhood I'm going to let it shine All around the neighborhood";
    }
}
