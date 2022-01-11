public class Wookie extends SpaceAnimal implements Walking {
    public Wookie() {
        super("Chewbacca", "Nicknames:\n\tChewy\n\tWalking Carpet\n\tLikes to carry a crossbow style blaster.");
    }
    public Wookie(String name, String desc) {
        super(name, desc);
    }
    public String walk() {
        return "5 foot stride";
    }
}
