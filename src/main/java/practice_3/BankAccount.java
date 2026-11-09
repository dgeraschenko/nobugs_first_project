package practice_3;

public class BankAccount {

    // поля
    String owner;
    double balance;

    // конструктор
    public BankAccount(String owner, double balance) {

        this.owner = owner;
        this.balance = balance;

    }

    // геттеры
    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    // сеттеры
    void setOwner(String owner) {
        this.owner = owner;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    // методы
    public void deposit(double amount) {
        double summ_deposite = balance + amount;
        setBalance(summ_deposite);
    }

    public void withdraw(double amount) {
        double summ_withdraw = balance - amount;
        setBalance(summ_withdraw);
    }

    void printBalance() {
        System.out.println("Состояние баланса: " + balance);
    }


}
