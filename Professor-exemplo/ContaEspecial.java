public class ContaEspecial extends Conta {

private double bonus; 

public ContaEspecial(String numero) {
        super (numero);
        bonus = 0.0;
}
public void creditar(double valor) {
    super.creditar(valor);
    bonus = bonus + (valor * 0.01);
}

public void renderBonus() {
    super.creditar(this.bonus); 
    bonus = 0;
}
public double getBonus() {
    return this.bonus;
}

}  

