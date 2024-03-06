public class Conta extends ContaAbstrata {

  public Conta(String numeroInicial, double saldoInicial) {
      super(numeroInicial, saldoInicial);
  }

  public Conta(String numeroInicial) {
      super(numeroInicial, 0);
  }
  public void debitar(double valor) throws SaldoInsuficienteException {
    if (saldo >= valor) {
        saldo -= valor;
    } else {
        throw new SaldoInsuficienteException("Saldo insuficiente para debitar " + valor);
    }
}
}