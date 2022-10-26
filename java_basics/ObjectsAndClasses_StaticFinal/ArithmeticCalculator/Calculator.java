public class Calculator {
    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(5, 7);
        int firstNum = arithmeticCalculator.getFirstNumber();
        int secondNum = arithmeticCalculator.getSecondNumber();
        System.out.println(firstNum + " + " + secondNum + " = " + arithmeticCalculator.calculate(ArithmeticCalculator.Operation.ADD));
        System.out.println(firstNum + " - " + secondNum + " = " + arithmeticCalculator.calculate(ArithmeticCalculator.Operation.SUBTRACT));
        System.out.println(firstNum + " * " + secondNum + " = " + arithmeticCalculator.calculate(ArithmeticCalculator.Operation.MULTYPLY));

    }
}
