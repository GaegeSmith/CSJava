public abstract class Transporters {
    private String material, color, fuel, speed;
    public Transporters(String material, String color, String fuel, String speed){
        this.color = color;
        this.material = material;
        this.fuel = fuel;
        this.speed = speed;
    }
    public void accelerate(String newSpeed) {
        this.speed = newSpeed;
    }
    public void decelerate(String newSpeed) {
        this.speed = newSpeed;
    }
    public void stop() {
        this.speed = "stop";
    }
}
