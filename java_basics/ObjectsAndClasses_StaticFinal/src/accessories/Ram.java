package accessories;

import enums.TypeRam;

public class Ram {

    private final TypeRam type;
    private final int volune;
    private final double weight;


    public Ram(TypeRam type, int volune, double weight) {
        this.type = type;
        this.volune = volune;
        this.weight = weight;
    }

    public TypeRam getType() {
        return type;
    }

    public int getVolune() {
        return volune;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "type=" + type +
                ", volune=" + volune +
                ", weight=" + weight +
                '}';
    }
}
