package Lab8.Final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeBalanceException , WeakPasswordException{
        try (Scanner input = new Scanner(System.in))  {

            System.out.print("Nhập username: ");
            String username = input.nextLine();
            System.out.println("Nhập password: ");
            String password = input.nextLine();
            System.out.println("Nhập số dư: ");
            int balance = input.nextInt();
            System.out.println("Nhập số tiền cần rút: ");
            double amount = input.nextDouble();
            BankAccount User1 = new BankAccount(username, password, balance);
            User1.withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Kết thúc giao dịch");
        }
    }
}
