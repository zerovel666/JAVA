package LAB_9;

public class Student extends Person {
    private int course;

    public Student(String name, int age, int course) {
        super(name, age);
        this.course = course;
    }

    public void study() {
        System.out.println(name + " учится на " + course + " курсе");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Курс: " + course);
    }
}
