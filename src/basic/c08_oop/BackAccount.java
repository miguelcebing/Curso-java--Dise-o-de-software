package basic.c08_oop;

public class BackAccount {
    //Atributos
    double balance;

    // Constructor
    public BackAccount(double balance) {
        this.balance = balance;
    }

    //metodo

    public double deposit(double amount) {
        balance = balance + amount;
        System.out.println("The deposited balance is " + balance);
        return balance;


    }
}
