package objetos;

public class Banco{
    private Conta[] contas;
    private int indice = 0;
    private Poupanca[] poupancas;
    private int indiceP;

    public Banco () {
        contas = new Conta[100];
        poupancas = new Poupanca[100];
    }
    public void cadastarConta(Conta c){
        contas[indice] = c;
        indice++;
    }
    public void cadastrarPoupanca(Poupanca p) {
        poupancas[indiceP] = p;
        indiceP++;
    }

    private Conta procurarConta(int numero) {
    int i = 0;
    boolean achou = false;
    Conta resposta = null;

    while ((!achou) && (i < indice)) {
        if (contas[i].getConta() == numero) {
            achou = true;
            resposta = contas[i];
        } else {
            i = i + 1;
        }
    }

    return resposta;
}

    public void debitarConta(int numero, double valor) {
        Conta c;
        c = this.procurarConta(numero);
        c.Debitar(valor);
    }

    public void creditarConta(int numero, double valor) {
        Conta c;
        c = this.procurarConta(numero);
        c.Creditar(valor);
    }



}
