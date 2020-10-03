/*Count.java
Classe com metodos get e set para nome, numero e saldo de um cliente*/

public class Account {
    private int number;
    private String name;
    private double balance;
    private double account;
    private double tax;
    private double taxx;

    public Account(int number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void toWithdraw(double value) {
        this.balance = this.balance - value;
    }

    public void toDeposit(double value) {
        this.balance = balance + value;
    }

    public void valueAccount(double value) {
        this.account = value;
    }

    public double getValueAccount() {
        return this.account;
    }

    public void payAccount(double account) {
        if (getBalance() > 0 && account <= getBalance()) {
            this.balance = getBalance() - account;
        }
    }

    public void setMonthlyTax(double tax){
        this.taxx = tax;
    }

    public  double getMonthlyTax(){
        return this.taxx;
    }

}
