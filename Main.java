import LAB_1.StudentInfo;
import LAB_2.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("/////////////////////////////////////////");
        System.out.println("LAB_1");
        System.out.println("/////////////////////////////////////////");

        StudentInfo s1 = new StudentInfo("Azizbek", "FIIT", "Web-developer");
        StudentInfo s2 = new StudentInfo("Tom", "FIIT", "Web-developer");
        StudentInfo s3 = new StudentInfo("Ford", "FIIT", "Web-developer");

        s1.displayInfo();
        System.out.println("/////////");

        s2.displayInfo();
        System.out.println("/////////");
        s3.displayInfo();

        System.out.println("/////////////////////////////////////////");
        System.out.println("LAB_2");
        System.out.println("/////////////////////////////////////////");

        User u = new User("Gin", 20, "Voll-street 12", "Gin@email.com", "123");

        System.out.println("Name: " + u.name);
        System.out.println("Age: " + u.age);
        System.out.println("Address: " + u.GetAddress());

        System.out.println("/////////////////////////////////////////");
    }
}
