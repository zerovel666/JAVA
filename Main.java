import java.util.Scanner;

import LAB_1.StudentInfo;
import LAB_2.User;
import LAB_3.BaseMath;
import LAB_3.Quadrant;
import LAB_3.Sum;

public class Main {

    public static void main(String[] args) {
        // callLabOne();
        // callLabTwo();
        callLabThree();
    }

    public static void printHeader(String title) {
        System.out.println("/////////////////////////////////////////");
        System.out.println(title);
        System.out.println("/////////////////////////////////////////");
        System.out.println();
    }

    public static void callLabOne() {
        printHeader("LAB_1");

        StudentInfo s1 = new StudentInfo("Azizbek", "FIIT", "Web-developer");
        StudentInfo s2 = new StudentInfo("Tom", "FIIT", "Web-developer");
        StudentInfo s3 = new StudentInfo("Ford", "FIIT", "Web-developer");

        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();
        s3.displayInfo();
        System.out.println();
    }

    public static void callLabTwo() {
        printHeader("LAB_2");

        User u = new User("Gin", 20, "Voll-street 12", "Gin@email.com", "123");

        System.out.println("Name: " + u.name);
        System.out.println("Age: " + u.age);
        System.out.println("Address: " + u.GetAddress());
        System.out.println();
    }

    public static void callLabThree() {
        printHeader("LAB_3");
        callLabThreeTaskOne();
        callLabThreeTaskTwo();
        callLabThreeTaskThree();
        callLabThreeTaskFour();
        callLabThreeTaskFive();
    }

    public static void callLabThreeTaskOne() {
        Scanner scanner = new Scanner(System.in);

        printHeader("TASK_1");

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        Sum sum = new Sum(num1, num2, num3);
        sum.displayResult();

        System.out.println();
        scanner.close();
    }

    public static void callLabThreeTaskTwo() {
        printHeader("TASK_2");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Выберите операцию (*, /, +, -): ");
        String operation = scanner.nextLine();

        BaseMath baseMath = new BaseMath(number1, number2, operation);
        baseMath.displayResult();

        scanner.close();
    }

    public static void callLabThreeTaskThree() {
        printHeader("TASK_3");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int x = scanner.nextInt();

        System.out.println("Начальное значение x = " + x);

        x = x + 5;
        System.out.println("После x = x + 5, x = " + x);

        x = x * 2;
        System.out.println("После x = x * 2, x = " + x);

        scanner.close();
    }

    public static void callLabThreeTaskFour() {
        printHeader("TASK_4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        new Quadrant(num);
        scanner.close();
    }

    public static void callLabThreeTaskFive() {
        printHeader("TASK_4");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: пример (2,3) : ");
        float length = scanner.nextFloat();

        System.out.print("Введите ширину прямоугольника: пример (5) : ");
        float width = scanner.nextFloat();

        System.out.print("Площадь прямоугольника: " + (length * width));

        scanner.close();
    }
}
