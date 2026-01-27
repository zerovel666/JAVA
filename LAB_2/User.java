package LAB_2;

public class User extends Account {

    public static final int MAX_AGE = 120;

    public String name; // Ссылочная переменная, хранит ссылку на объект в памяти
    public int age; // Примитивная переменная, содержит в себе конкретную информацию //Публичная
                    // переменная доступна из любого места
    private String address; // Приватная переменная доступна только внутри класса

    public User(String name, int age, String address, String email, String password) {
        super(email, password);
        if (age > MAX_AGE || age < 0) {
            throw new IllegalArgumentException("Age is not valid");
        }

        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String GetAddress() {
        return this.address;
    }

    public void SetAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean Register(String email, String password) {
        boolean credentialsOk = super.Register(email, password);

        if (credentialsOk && this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
