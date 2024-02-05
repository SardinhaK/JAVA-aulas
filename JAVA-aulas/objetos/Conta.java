package objetos;

public class Conta {
    private double saldo;
    private int conta;

    public Conta(int x, double SaldoIn){
        conta = x;
        saldo = SaldoIn;
    }

    public int getConta(){
        return conta;
    }

    public void setConta(int Conta){
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
