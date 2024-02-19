package objetos;

public class Conta {
    private double saldo;
    private String conta;

    public Conta(String x, double SaldoIn){
        conta = x;
        saldo = SaldoIn;
    }

    public String getConta(){
        return conta;
    }

    public void setConta(String Conta){
        this.conta = Conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void Creditar(double valor){
        saldo += valor;
    }

    public void Debitar(double valor){
        saldo -= valor;
    }

    public void Transferir(Conta destino, double valor){
        this.Debitar(valor);
        destino.Creditar(valor);
    }
}
