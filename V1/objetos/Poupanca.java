package objetos;

public class Poupanca extends Conta {
    public Poupanca (String conta, double saldo){
        super(conta, saldo);
    }
    public void renderJuros (double taxa){
        double juros = this.getSaldo() * taxa;
        this.Creditar(juros);
    }
}

