public class MichaelPhelps extends SpaceAnimal implements Swimming {
    public MichaelPhelps() {
        super("Michael Phelps", "Why am I here, swimming through space?");
    }
    public MichaelPhelps(String name, String desc) {
        super(name, desc);
    }
    public String swim() {
        return "I am swimming, but in space *echo that fades*";
    }
}