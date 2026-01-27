import LAB_2.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////");
        System.out.println("LAB_2");
        System.out.println("TASK_1");
        System.out.println("/////////////////////////////////////////");

        User u = new User("Gin", 20, "Voll-street 12", "Gin@email.com", "123");

        System.out.println("Name: " + u.name);
        System.out.println("Age: " + u.age);
        System.out.println("Address: " + u.GetAddress());

        System.out.println("/////////////////////////////////////////");
    }
}
