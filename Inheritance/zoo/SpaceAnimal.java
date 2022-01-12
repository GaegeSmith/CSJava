public class SpaceAnimal extends Animal {
    public SpaceAnimal() {
        super("Filler text", "animals, in SPACE, wAAt");
    }
    public SpaceAnimal(String name, String desc) {
        super(name, desc);
    }
    @Override
    public String makeNoise() {
        return "...";
    }
}
