package LAB_1;

public class StudentInfo {
    private String full_name;
    private String group;
    private String specialization;

    public StudentInfo(String full_name, String group, String specialization) {
        this.full_name = full_name;
        this.group = group;
        this.specialization = specialization;
    }

    public void displayInfo() {
        System.out.println("Full_name: " + this.full_name);
        System.out.println("Group: " + this.group);
        System.out.println("Specialization: " + this.specialization);
    }
}
