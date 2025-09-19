
public class Access_Modifire {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.username = "Hari om verma";
        ba.setPassword("asdfasdfhgj");
        // You can print username, but not password (it's private)
        System.out.println("Username: " + ba.username);
    }
}

class BankAccount {
    public String username;
    private String password;

    // Package-private method (no modifier)
    void setPassword(String pwd) {
        password = pwd;
    }
}