public class ArithmeticCalculator {

    private final int firstNumber;
    private final int secondNumber;

    public ArithmeticCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int calculate(Operation operation) {

        return switch (operation) {
            case ADD -> firstNumber + secondNumber;
            case SUBTRACT -> firstNumber - secondNumber;
            case MULTYPLY -> firstNumber * secondNumber;
        };
    }

    public  enum Operation {
        ADD, SUBTRACT,MULTYPLY
    }
}
