/*Saving.java 
classe de conta poupanca que aplica rendimento mensal*/

public class Savings extends Account {

    private static final double PERCENTUAL = 0.02;

    public Savings(int number, String name, double balance) {
        super(number, name, balance);
        
    }
    public double getPercentual(){
        return this.PERCENTUAL * getBalance();
    }
}