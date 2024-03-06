public class ContaImposto extends ContaAbstrata {
    public static final double CPMF = 0.01;

    public ContaImposto(String numeroInicial, double saldoInicial) {
        super(numeroInicial, saldoInicial);
    }
    public void debitar(double valor) {
        double valorDebitado = valor + valor * CPMF;
        if (saldo >= valorDebitado) {
            saldo -= valorDebitado;
        } else {
            System.out.println("Saldo insuficiente para a transação mais o imposto.");
        }
    }
}
