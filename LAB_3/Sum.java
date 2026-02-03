package LAB_3;

public class Sum {
    private int num1;
    private int num2;
    private int num3;

    public Sum(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void displayResult() {
        System.out.println("Result sum: " + (num1 + num2 + num3));
    }

}
