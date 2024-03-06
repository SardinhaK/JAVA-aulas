public class Programa {
    public static void main(String[] args) {
        RepositorioContas repositorio = new RepositorioContasArray();
        Banco banco = new Banco(repositorio);

        try {
            System.out.println("Saldo da conta 21.342-7 = " + banco.procurarConta("21.342-7").getSaldo());
            System.out.println("Saldo da conta 32.234-4 = " + banco.procurarConta("32.234-4").getSaldo());
            System.out.println("Saldo da conta 47.465-2 = " + banco.procurarConta("47.465-2").getSaldo());
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}