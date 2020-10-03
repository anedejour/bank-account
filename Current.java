/*Current.java
Classe que permite pagar contas e cobrar tarifa mensal*/

public class Current extends Account {

    private static final double TARIFF = 0.05;

    public Current(int number, String name, double balance) {
        super(number, name, balance);
    }
 
    public double getPayAccount(){
        return this.getBalance() - getValueAccount();
    }

    public double getTariff(){
        return this.getBalance() * TARIFF;
    }
}