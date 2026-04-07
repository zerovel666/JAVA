package LAB_11;

import java.util.Scanner;

public class SimpleCalc {
    public void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter two number: ");
        double b = scanner.nextDouble();

        System.out.print("Select operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Devision zero");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Error: undefiend operation");
                return;
        }

        System.out.println("Result: " + result);
    }
}
