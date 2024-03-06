package objetos;

public class ContaEspec extends Conta {
    private double bonus;

    public ContaEspec(String numero, double SaldoIn) {
        super(numero, SaldoIn); 
        bonus = 0.0; 
    }

    public void Creditar(double valor) {
        super.Creditar(valor); 
        bonus = bonus + (valor * 0.01); 
    }

    public void renderBonus() {
        super.Creditar(this.bonus); 
        bonus = 0; 
    }

    public double getBonus() {
        return this.bonus;
    }
}
