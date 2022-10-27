public class Arithmetic {

    private final int firstvalue, secondValue;

    public Arithmetic(int firstvalue, int secondValue) {
        this.firstvalue = firstvalue;
        this.secondValue = secondValue;
        sum(firstvalue, secondValue);
        multiply(firstvalue, secondValue);
        min(firstvalue, secondValue);
        max(firstvalue, secondValue);
    }

    private void sum(int firstvalue, int secondValue) {
        System.out.println("a + b: " + firstvalue + secondValue);
    }
    private void multiply(int firstvalue, int secondValue) {
        System.out.println("a * b: " + (firstvalue * secondValue));
    }
    private void max(int firstvalue, int secondValue) {
        System.out.println(Math.max(firstvalue, secondValue));
    }
    private void min(int firstvalue, int secondValue) {
        System.out.println(Math.min(firstvalue, secondValue));
    }
}
