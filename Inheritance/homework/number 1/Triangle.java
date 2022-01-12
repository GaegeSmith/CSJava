import java.lang.Math;

public class Triangle extends GeometricObject{
    private double s0, s1, s2;
    public Triangle() {
        super();
        this.s0 = 1.0;
        this.s1 = 1.0;
        this.s2 = 1.0;
    }
    public Triangle(double side0, double side1, double side2, String color, boolean filled) {
        super(color, filled);
        this.s0 = side0;
        this.s1 = side1;
        this.s2 = side2;
    }
    public double getSide0() {
        return this.s0;
    }
    public double getSide1() {
        return this.s1;
    }
    public double getSide2() {
        return this.s2;
    }
    public String toString() {
        return "Triangle:\n\tside1 = " + this.s0 + "\n\tside2 = " + this.s1 + "\n\tside3 = " + this.s2;
    }

    @Override
    public double getArea() {
        // https://www.cuemath.com/measurement/area-of-triangle-with-3-sides/
        // Heron's formula, allows you to find the area of a triangle with three sides and no height
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - this.s0) * (s - this.s1) * (s - this.s2));
    }
    @Override
    public double getPerimeter() {
        return this.s0 + this.s1 + this.s2;
    }
}
