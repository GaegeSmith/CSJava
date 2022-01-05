public abstract class Animal {
    private String name, desc;
    public Animal(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return this.name;
    }
    public String getDesc() {
        return this.desc;
    }
    // public abstract String makeNoise();
    // works like onCreate in Android Studio
    
}
