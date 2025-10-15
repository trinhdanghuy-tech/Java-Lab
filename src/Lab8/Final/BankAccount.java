package Lab8.Final;

public class BankAccount {
    private String username;
    private String password;
    private double balance;
    public BankAccount(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        if (password.length() < 6) {
            throw new WeakPasswordException("Password qua ngắn");
        }

    }

    public void withdraw(double amount) throws NegativeBalanceException {
        if (amount > balance) {
            throw new NegativeBalanceException("Số dư không đủ");
        }
        else  {
            System.out.println("Rút tiền thành công. số dư còn lại: " + (balance - amount));
        }
    }

}
