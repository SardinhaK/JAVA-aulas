package objetos;

public class Banco{
    private Conta[] contas;
    private int indice = 0;


    public String listaContas(){
        String resposta = "";
        for(int a = 0; a < indice; a++){
            resposta += " conta: " + contas[a].getConta() + "  saldo: " + contas[a].getSaldo() + "\n";
        }
        return resposta;
    }

    public int numContas(){
        return indice;
    }
   

    public Banco () {
        contas = new Conta[100];
    }
    public void cadastarConta(Conta c){
        contas[indice] = c;
        indice++;
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

    public void renderBonus(String numero){
        Conta c = procurarConta(numero);
        if (c instanceof Poupanca){
            ((Poupanca)c).renderJuros(indice); 
        }
    }


}
