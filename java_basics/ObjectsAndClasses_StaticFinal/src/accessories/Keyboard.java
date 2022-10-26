package accessories;

public class Keyboard {

    private final boolean hasLights;
    private final double weight;

    public Keyboard(String type, boolean hasLights, double weight) {
        this.type = type;
        this.hasLights = hasLights;
        this.weight = weight;
    }

    private final String type;

    public String getType() {
        return type;
    }

    public boolean isHasLights() {
        return hasLights;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "hasLights=" + hasLights +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
