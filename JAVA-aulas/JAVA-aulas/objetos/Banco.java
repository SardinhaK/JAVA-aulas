package objetos;

public class Banco{
    private Conta[] contas;
    private int indice = 0;
    private Poupanca[] poupancas;
    private int indiceP;
    private ContaEspec[] contaEspecs;
    private int indiceE;

    public Banco () {
        contas = new Conta[100];
        poupancas = new Poupanca[100];
        contaEspecs = new ContaEspec[100];
    }
    public void cadastarConta(Conta c){
        contas[indice] = c;
        indice++;
    }
    public void cadastrarPoupanca(Poupanca p) {
        poupancas[indiceP] = p;
        indiceP++;
    }
    public void cadastrarContaEspec(ContaEspec e) {
        contaEspecs[indiceE] = e;
        indiceE++;
    }

    private Conta procurarConta(String numero) {
    int i = 0;
    boolean achou = false;
    Conta resposta = null;

        while ((!achou) && (i < indice)) {
            if (contas[i].getConta().equals(numero)) {
                achou = true;
                resposta = contas[i];
            } else {
                i = i + 1;
            }
        }

        return resposta;
    }

    public void debitarConta(String numero, double valor) {
        Conta c;
        c = this.procurarConta(numero);
        c.Debitar(valor);
    }

    public void creditarConta(String numero, double valor) {
        Conta c;
        c = this.procurarConta(numero);
        c.Creditar(valor);
    }



}
