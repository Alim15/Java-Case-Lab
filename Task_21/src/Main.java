import java.util.*;
import java.lang.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double operand1 = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /):");
        String operator = scanner.next();

        System.out.println("Введите второе число:");
        double operand2 = scanner.nextDouble();

        Operation operation = null;
        switch (operator) {
            case "+":
                operation = new Addition(operand1, operand2);
                break;
            case "-":
                operation = new Deduction(operand1, operand2);
                break;
            case "*":
                operation = new Multiplication(operand1, operand2);
                break;
            case "/":
                operation = new Division(operand1, operand2);
                break;
            default:
                System.out.println("Неверный оператор!");
                return;
        }
        Calculator calculator = new Calculator();
        double result = calculator.performOperation(operation);
        System.out.println("Результат: " + result);
    }
}
