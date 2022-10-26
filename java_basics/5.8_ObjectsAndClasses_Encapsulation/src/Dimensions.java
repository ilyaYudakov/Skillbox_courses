package src;

public class Dimensions {

    private double width;
    private final double height;
    private final double length;

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double volume() {
        return (width = height * length / 1_000_000_000);
    }
}
