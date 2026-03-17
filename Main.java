import java.util.Scanner;

import LAB_1.StudentInfo;
import LAB_2.User;
import LAB_3.BaseMath;
import LAB_3.Quadrant;
import LAB_3.Sum;
import LAB_8.Graphic;
import LAB_9.Animal;
import LAB_9.Bird;
import LAB_9.Car;
import LAB_9.Cat;
import LAB_9.Dog;
import LAB_9.Professor;
import LAB_9.SUV;
import LAB_9.Sedan;
import LAB_9.Student;
import LAB_9.Truck;

public class Main {

    public static void main(String[] args) {
        // callLabOne();
        // callLabTwo();
        // callLabThree();
        // callLabEight();
        // callLabFour();
        callLabNine();
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

    public static void callLabEight() {
        new Graphic();
    }

    public static void callLabFour() {
        printHeader("LAB_4");
        callLabFourTaskOne();
        callLabFourTaskTwo();
        callLabFourTaskThree();
        callLabFourTaskFour();
        callLabFourTaskFive();
        callLabFourTaskSix();
        callLabFourTaskSeven();
        callLabFourTaskEight();
        callLabFourTaskNine();
        callLabFourTaskTen();
    }

    public static void callLabNine() {
        printHeader("LAB_9");
        // callLabNineTaskOne();
        callLabNineTaskTwo();
        callLabNineTaskThree();
    }

    public static void callLabFourTaskOne() {
        printHeader("TASK_1");
        Scanner scanner = new Scanner(System.in);

        boolean isExit = false;

        while (!isExit) {
            System.out.print("Введите число для проверки на 0 или нажмите enter для выхода: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                System.out.println("Система завершила работу");
                break;
            }

            float number;
            try {
                number = Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Введите число!");
                continue;
            }

            if (number > 0) {
                System.out.println("Введенное число положительно");
            } else if (number < 0) {
                System.out.println("Введенное число отрицательно");
            } else {
                System.out.println("Введенное число равняется нулю");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskTwo() {
        printHeader("TASK_2");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите балл (0-100) или enter для выхода: ");
            String input = scanner.nextLine();

            if (input.isEmpty())
                break;

            try {
                int score = Integer.parseInt(input);
                if (score < 0 || score > 100) {
                    System.out.println("Балл должен быть в диапазоне от 0 до 100");
                } else if (score >= 90) {
                    System.out.println("Оценка: 5 (Отлично)");
                } else if (score >= 75) {
                    System.out.println("Оценка: 4 (Хорошо)");
                } else if (score >= 60) {
                    System.out.println("Оценка: 3 (Удовлетворительно)");
                } else {
                    System.out.println("Оценка: 2 (Неудовлетворительно)");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskThree() {
        printHeader("TASK_3");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число (или enter для выхода): ");
            String input1 = scanner.nextLine();
            if (input1.isEmpty())
                break;

            System.out.print("Введите второе число: ");
            String input2 = scanner.nextLine();

            try {
                double a = Double.parseDouble(input1);
                double b = Double.parseDouble(input2);

                if (a > b) {
                    System.out.println(a + " больше чем " + b);
                } else if (a < b) {
                    System.out.println(b + " больше чем " + a);
                } else {
                    System.out.println("Числа равны");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода чисел!");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskFour() {
        printHeader("TASK_4");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер дня недели (1-7) или enter для выхода: ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;

            try {
                int day = Integer.parseInt(input);
                switch (day) {
                    case 1:
                        System.out.println("Понедельник");
                        break;
                    case 2:
                        System.out.println("Вторник");
                        break;
                    case 3:
                        System.out.println("Среда");
                        break;
                    case 4:
                        System.out.println("Четверг");
                        break;
                    case 5:
                        System.out.println("Пятница");
                        break;
                    case 6:
                        System.out.println("Суббота");
                        break;
                    case 7:
                        System.out.println("Воскресенье");
                        break;
                    default:
                        System.out.println("Нет такого дня недели");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число!");
            }

            scanner.close();
        }
    }

    public static void callLabFourTaskFive() {
        printHeader("TASK_5");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите целое число для проверки на четность или enter для выхода: ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;

            try {
                int num = Integer.parseInt(input);
                if (num % 2 == 0) {
                    System.out.println("Число чётное");
                } else {
                    System.out.println("Число нечётное");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskSix() {
        printHeader("TASK_6");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите ваш возраст или enter для выхода: ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;

            try {
                int age = Integer.parseInt(input);
                if (age >= 18) {
                    System.out.println("Доступ разрешен");
                } else if (age < 0) {
                    System.out.println("Возраст не может быть отрицательным");
                } else {
                    System.out.println("Доступ запрещен (вам меньше 18)");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }
        scanner.close();

    }

    public static void callLabFourTaskSeven() {
        printHeader("TASK_7");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите номер месяца (1-12) или enter для выхода: ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;

            try {
                int month = Integer.parseInt(input);
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("31 день");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30 дней");
                        break;
                    case 2:
                        System.out.println("28 или 29 дней (зависит от года)");
                        break;
                    default:
                        System.out.println("Некорректный номер месяца");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskEight() {
        printHeader("TASK_8");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите температуру или enter для выхода: ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;

            try {
                double temp = Double.parseDouble(input);
                if (temp < 10) {
                    System.out.println("Холодно");
                } else if (temp >= 10 && temp <= 25) {
                    System.out.println("Тепло");
                } else {
                    System.out.println("Жарко");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskNine() {
        printHeader("TASK_9");
        Scanner scanner = new Scanner(System.in);
        int min = 10;
        int max = 50;

        while (true) {
            System.out.print("Введите число для проверки диапазона [" + min + "," + max + "] или enter для выхода: ");
            String input = scanner.nextLine();
            if (input.isEmpty())
                break;

            try {
                double val = Double.parseDouble(input);
                if (val >= min && val <= max) {
                    System.out.println("Число входит в диапазон");
                } else {
                    System.out.println("Число ВНЕ диапазона");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода!");
            }
        }

        scanner.close();
    }

    public static void callLabFourTaskTen() {
        printHeader("TASK_10");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первое число (или enter для выхода): ");
            String in1 = scanner.nextLine();
            if (in1.isEmpty())
                break;

            System.out.print("Введите второе число: ");
            String in2 = scanner.nextLine();

            System.out.print("Введите операцию (+, -, *, /): ");
            String op = scanner.nextLine();

            try {
                double a = Double.parseDouble(in1);
                double b = Double.parseDouble(in2);

                switch (op) {
                    case "+":
                        System.out.println("Результат: " + (a + b));
                        break;
                    case "-":
                        System.out.println("Результат: " + (a - b));
                        break;
                    case "*":
                        System.out.println("Результат: " + (a * b));
                        break;
                    case "/":
                        if (b != 0) {
                            System.out.println("Результат: " + (a / b));
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                        }
                        break;
                    default:
                        System.out.println("Неизвестная операция");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка в числах!");
            }
        }

        scanner.close();
    }

    public static void callLabNineTaskOne() {
        printHeader("TASK_1");
        Car sedan = new Sedan(120);
        Car truck = new Truck(80);
        Car suv = new SUV(100);

        sedan.showSpeed();
        System.out.println("Расход: " + sedan.fuelConsumption());

        truck.showSpeed();
        System.out.println("Расход: " + truck.fuelConsumption());

        suv.showSpeed();
        System.out.println("Расход: " + suv.fuelConsumption());
    }

    public static void callLabNineTaskTwo() {
        printHeader("TASK_2");
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }

    public static void callLabNineTaskThree() {
        printHeader("TASK_3");

        Student student = new Student("Азизбек", 20, 2);
        Professor professor = new Professor("Артем", 45, "Математика");

        student.showInfo();
        student.study();

        System.out.println();

        professor.showInfo();
        professor.teach();
    }
}
