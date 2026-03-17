package LAB_9;

public class Professor extends Person {
    private String subject;

    public Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " преподает " + subject);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Предмет: " + subject);
    }
}
