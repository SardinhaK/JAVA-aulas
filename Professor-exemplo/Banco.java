public class Banco {
    private RepositorioContas repositorio;
    private double taxa = 0.01;

    public Banco(RepositorioContas repositorio) {
        this.repositorio = repositorio;
    }

    public ContaAbstrata procurarConta(String numero) throws ContaNaoEncontradaException {
        return repositorio.procurar(numero); 
    }

    public void cadastrarConta(ContaAbstrata c) throws ContaJaCadastradaException {
        if (repositorio.existe(c.getNumero())) {
            throw new ContaJaCadastradaException("Conta com número " + c.getNumero() + " já está cadastrada.");
        } else {
            repositorio.inserir(c);
        }
    }

    public void debitarConta(String numero, double valor) {
        try {
            ContaAbstrata c = repositorio.procurar(numero);
            c.debitar(valor);
            repositorio.atualizar(c);
        } catch (ContaNaoEncontradaException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void creditarConta(String numero, double valor) {
        try {
            ContaAbstrata c = repositorio.procurar(numero);
            c.creditar(valor);
            repositorio.atualizar(c);
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void transferir(String contaOrigem, String contaDestino, double valor) {
        try {
            ContaAbstrata origem = repositorio.procurar(contaOrigem);
            ContaAbstrata destino = repositorio.procurar(contaDestino);
            origem.debitar(valor);
            destino.creditar(valor);
            repositorio.atualizar(origem);
            repositorio.atualizar(destino);
        } catch (ContaNaoEncontradaException | SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public void renderJuros(String numero) {
        try {
            ContaAbstrata c = repositorio.procurar(numero);
            if (c instanceof Poupanca) {
                ((Poupanca) c).renderJuros(taxa);
                repositorio.atualizar(c);
            } else {
                System.out.println("Conta não é uma poupança.");
            }
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }

    public void renderBonus(String numero) {
        try {
            ContaAbstrata c = repositorio.procurar(numero);
            if (c instanceof ContaEspecial) {
                ((ContaEspecial) c).renderBonus();
                repositorio.atualizar(c);
            } else {
                System.out.println("Conta não é uma conta especial.");
            }
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}