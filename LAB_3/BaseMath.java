package LAB_3;

public class BaseMath {
    private int num1;
    private int num2;
    private String operation;

    public BaseMath(int num1, int num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    private void sum() {
        System.out.println("Result sum: " + (this.num1 + this.num2));
    }

    private void difference() {
        System.out.println("Result difference: " + (this.num1 - this.num2));
    }

    private void division() {
        if (this.num2 == 0) {
            System.out.println("Division by zero error");
            return;
        }
        System.out.println("Result division: " + (this.num1 / this.num2));
    }

    private void multiplication() {
        System.out.println("Result multiplication: " + (this.num1 * this.num2));
    }

    public void displayResult() {
        if (this.operation.equals("*")) {
            this.multiplication();
        } else if (this.operation.equals("/")) {
            this.division();
        } else if (this.operation.equals("+")) {
            this.sum();
        } else if (this.operation.equals("-")) {
            this.difference();
        } else {
            System.out.println("Undefined operation: " + this.operation);
        }
    }

}
