public class Bank {
    public static void main(String[] args) {

        Savings account1 = new Savings(0001, "Ane", 890);
        Current account2 = new Current(0002, "Maria", 930);
        Investment account3 = new Investment (0003, "Gustavo", 2.200);
        account1.toDeposit(120);
        account2.valueAccount(390);
        account3.setMonthlyTax(100);

        System.out.printf("Após o depósito realizado agora, a conta Popunça de %s está no valor de %.2f%n",
        account1.getName(), account1.getBalance());
        System.out.printf("Rendimento mensal: %.2f", account1.getPercentual());

        System.out.println();

        System.out.printf("%n%s pagou a conta no valor de %.2f .Saldo atual é de: %.2f %n", account2.getName(), account2.getValueAccount(), account2.getPayAccount());
        System.out.printf("Correntista paga o valor de %.2f em tarifa mensal", account2.getTariff());

        System.out.println();

        System.out.printf("%nConta Investimento de %s: Aplicação mensal de %.2f %n", account3.getName(), account3.getMonthlyTax());
        System.out.printf("Imposto de renda anual: %.2f", account3.annualTax());
    }
}
