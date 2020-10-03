public class Investment extends Account {

    private static final double ANNUAL_TAX = 0.15;

    public Investment(int number, String name, double balance) {
        super(number, name, balance);
    }

    public double annualTax(){
        return this.ANNUAL_TAX * getMonthlyTax() * 12;
    }
}