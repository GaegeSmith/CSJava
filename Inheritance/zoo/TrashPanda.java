public class TrashPanda extends Bear implements Swimming {
    public TrashPanda() {
        super("Little steely", "fluffy boi who snatches and sneeks");
    }
    public TrashPanda(String name, String desc) {
        super(name, desc);
    }
    public String swim() {
        return "Swim with floaties";
    }
    @Override
    public String walk() {
        return "off to steal some stuff";
    }
}
