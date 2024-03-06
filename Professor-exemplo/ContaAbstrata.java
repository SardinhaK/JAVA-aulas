public abstract class ContaAbstrata {
    protected String numero;
    protected double saldo;
    
    public ContaAbstrata(String numeroInicial, double saldoInicial) {
        numero = numeroInicial;
        saldo = saldoInicial;
    }

    public void creditar(double valor) {
        saldo += valor;
    }
    
    public abstract void debitar(double valor) throws SaldoInsuficienteException;

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }
}