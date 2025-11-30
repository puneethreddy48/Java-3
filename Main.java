class BankAccount {
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String name, double amount) {
        accountHolder = name;
        balance = amount;
    }

    // Methods
    void deposit(double amt) {
        balance += amt;
    }
void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void display() {
        System.out.println(accountHolder + " has balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi", 5000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.display();
    }
}

