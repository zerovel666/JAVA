package LAB_2.Task_1;

public class Account {
    protected String email;
    protected String password;

    Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public boolean Register(String email, String password) {
        if (email == this.email && password == this.password) {
            return true;
        } else {
            return false;
        }
    }
}
