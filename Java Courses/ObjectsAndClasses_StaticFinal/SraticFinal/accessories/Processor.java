package accessories;

public class Processor {

    private final double frequency, weight;
    private final int numberOfCores;
    private final String manufacture;

    public Processor(double frequency, double weight, int numberOfCores, String manufacture) {
        this.frequency = frequency;
        this.weight = weight;
        this.numberOfCores = numberOfCores;
        this.manufacture = manufacture;
    }

    public double getFrequency() {
        return frequency;
    }

    public Processor setFrequency(double frequency) {
        return new Processor(frequency, weight, numberOfCores, manufacture);
    }

    public double getWeight() {
        return weight;
    }

    public Processor setWeight(double weight) {
        return new Processor(frequency, weight, numberOfCores, manufacture);
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public Processor setNumberOfCores( int numberOfCores) {
        return new Processor(frequency, weight, numberOfCores, manufacture);
    }

    public String getManufacture() {
        return manufacture;
    }

    public Processor setManufacture(String manufacture) {
        return new Processor(frequency, weight, numberOfCores, manufacture);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", weight=" + weight +
                ", numberOfCores=" + numberOfCores +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}
