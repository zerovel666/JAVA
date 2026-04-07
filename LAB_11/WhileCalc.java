package LAB_11;

import java.util.Scanner;

public class WhileCalc {
    public void calculatorWithLoop() {
        Scanner scanner = new Scanner(System.in);
        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            System.out.print("Введите операцию (+, -, *, /): ");
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
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Error: Undefiend operation");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Next? (yes/no): ");
            choice = scanner.next();
        }
        System.out.println("Exit calc.");
    }
}
