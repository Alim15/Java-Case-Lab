public class Division extends Operation {
    public Division(double operand1, double operand2) {
        super(operand1, operand2);
    }

    @Override
    double calculate() {
        if (operand2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return operand1 / operand2;
    }
}
