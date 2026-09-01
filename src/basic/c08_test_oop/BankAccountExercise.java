package basic.c08_test_oop;

public class BankAccountExercise {
    //Atributos
    private double balance;

    //Constructor
    public BankAccountExercise(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Set to 0.");
        }
    }

    //Metodos
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Es lo mismo que balance = balance + amount
            System.out.println("Successfully deposited: " + amount);
            return amount;
        } else {
            System.out.println("Error: Deposit amount must be greater than zero.");
        }
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Resta el dinero del saldo
            System.out.println("Successfully withdrew: " + amount);
            return amount;
        } else {
            System.out.println("Error: Invalid withdrawal amount or insufficient funds.");
            return amount;
        }
    }
}

