package LAB_2;

public class Account {
    protected String email;
    protected String password;

    public Account(String email, String password) {
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
