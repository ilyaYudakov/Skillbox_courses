package accessories;

import enums.MonitorType;

public class Monitor {

    private final double diagonal, weight;
    private final MonitorType type;

    public Monitor(double diagonal, double weight, MonitorType type) {
        this.diagonal = diagonal;
        this.weight = weight;
        this.type = type;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public Monitor setDiagonal(double diagonal) {
        return new Monitor(diagonal, weight, type);
    }

    public double getWeight() {
        return weight;
    }

    public Monitor setWeight(double weight) {
        return new Monitor(diagonal, weight, type);
    }

    public MonitorType getType() {
        return type;
    }

    public Monitor setType(MonitorType type) {
        return new Monitor(diagonal, weight, type);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonal=" + diagonal +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
