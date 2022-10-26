package accessories;

import enums.HDType;

public class HardDrive {

    private final HDType type;
    private final int memoryCapacity;
    private final double weight;

    public HardDrive(HDType type, int memoryCapacity, double weight) {
        this.type = type;
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public HDType getType() {
        return type;
    }

    public HardDrive setType(HardDrive hardDrive) {
        return new HardDrive(type, memoryCapacity,weight);
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public HardDrive setMemoryCapacity(int capacity) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    public double getWeight() {
        return weight;
    }

    public HardDrive setWeight(double weight) {
        return new HardDrive(type, memoryCapacity, weight);
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "type=" + type +
                ", memoryCapacity=" + memoryCapacity +
                ", weight=" + weight +
                '}';
    }
}
