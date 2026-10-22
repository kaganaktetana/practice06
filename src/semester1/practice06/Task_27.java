package semester1.practice06;

public class Task_27 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("UA123", 1000);

        account.deposit(500);
        System.out.println("Баланс: " + account.getBalance());

        boolean result = account.withdraw(2000);
        System.out.println("Зняття успішне: " + result);

        account.withdraw(300);
        System.out.println("Баланс після зняття: "
                + account.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Сума поповнення має бути більшою за 0.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("Операцію відхилено.");
            return false;
        }

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}