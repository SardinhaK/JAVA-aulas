public class RepositorioContasArray implements RepositorioContas {
    private ContaAbstrata[] contas;
    private int indice;

    public RepositorioContasArray() {
        contas = new ContaAbstrata[10];
        indice = 0;
    }

    public void inserir(ContaAbstrata conta) {
        if (indice < contas.length) {
            contas[indice] = conta;
            indice++;
        } else {
            System.out.println("Repositório cheio!");
        }
    }

    public ContaAbstrata procurar(String numero) throws ContaNaoEncontradaException {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return contas[i];
            }
        }
        throw new ContaNaoEncontradaException("Conta " + numero + " não encontrada.");
    }

    public void remover(String numero) throws ContaNaoEncontradaException {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                contas[i] = contas[indice - 1];
                contas[indice - 1] = null;
                indice--;
                return;
            }
        }
        throw new ContaNaoEncontradaException("Conta " + numero + " não encontrada para remoção.");
    }

    public void atualizar(ContaAbstrata conta) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(conta.getNumero())) {
                contas[i] = conta;
                return;
            }
        }
    }

    public boolean existe(String numero) {
        for (int i = 0; i < indice; i++) {
            if (contas[i].getNumero().equals(numero)) {
                return true;
            }
        }
        return false;
    }
}