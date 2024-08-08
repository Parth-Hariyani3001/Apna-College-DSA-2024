
public class BankAccount {

    public static void main(String[] args) {
        Bank acct1 = new Bank();
        acct1.username = "Parth Hariyani";
        acct1.setPassword("1234");

        System.out.println(acct1.getPassword());
    }
}

class Bank {

    public String username;
    private String password;

    public void setPassword(String pwd) {
        this.password = pwd;
    }

    public String getPassword() {
        return this.password;
    }
}
