package executavel;
import objetos.Conta;
import objetos.Poupanca;
import objetos.Banco;
import objetos.ContaEspec;

import javax.swing.JOptionPane;
//fiz uma alteração aqui
public class Cadastra {
    public static void main(String[] args){
        Banco meiaBoca = new Banco ();
        int tela = 1;
        // CONTAS PRÉ DEFINIDAS
        Conta c1 = new Conta("111-x",100.0);
        Conta c2 = new Conta("112-x", 150.0);
        Poupanca p1 = new Poupanca("113-y", 100);
        Poupanca p2 = new Poupanca("114-y", 100);
        ContaEspec e1 = new ContaEspec("115-z", 100);
        ContaEspec e2 = new ContaEspec("116-z", 100);
        meiaBoca.cadastarConta(c1);
        meiaBoca.cadastarConta(c2);
        meiaBoca.cadastrarPoupanca(p1);
        meiaBoca.cadastrarPoupanca(p2);
        meiaBoca.cadastrarContaEspec(e1);
        meiaBoca.cadastrarContaEspec(e2);


        while (tela != 0) {
            tela = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo ao Banco Meia Boca \n\n" + "1 para criar uma conta\n" + "2 para fazer um deposito\n" + "3 para um saque\n" + "4 para uma tranferencia\n" + "5 para ver as contas\n " + "0 para sair\n"));
            if (tela == 1){
                int tipoNovaConta;
                tipoNovaConta = Integer.parseInt(JOptionPane.showInputDialog(null, "Sua conta será:  \n" + "1 para conta corrente \n" + "2 para conta poupança\n" + "3 para conta especial \n" ));
                if(tipoNovaConta == 1){
                    Conta novaConta = new Conta(null, 0.0);
                    novaConta.setConta(String.valueOf(JOptionPane.showInputDialog("Conta: ")));
                    novaConta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta: ")));
                    meiaBoca.cadastarConta(novaConta);
                }else if(tipoNovaConta == 2){
                    Poupanca novaConta = new Poupanca(null, 0.0);
                    novaConta.setConta(String.valueOf(JOptionPane.showInputDialog("Conta: ")));
                    novaConta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta: ")));
                    meiaBoca.cadastrarPoupanca(novaConta);
                }else if(tipoNovaConta ==3){
                    ContaEspec novaConta = new ContaEspec(null, 0.0);
                    novaConta.setConta(String.valueOf(JOptionPane.showInputDialog("Conta: ")));
                    novaConta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta: ")));
                    meiaBoca.cadastrarContaEspec(novaConta);
                }
            }else if(tela == 2){
                meiaBoca.creditarConta(String.valueOf(JOptionPane.showInputDialog("Conta: ")), Double.parseDouble(JOptionPane.showInputDialog("Valor: ")));
            }else if (tela == 3){
                meiaBoca.debitarConta(String.valueOf(JOptionPane.showInputDialog("Conta: ")), Double.parseDouble(JOptionPane.showInputDialog("Valor: ")));
            }else if (tela == 4){
                
            }else if (tela == 5){
                JOptionPane.showMessageDialog(null, "Contas: \n" + meiaBoca.listaContas() + "\nContas Popança: \n" + meiaBoca.listaContasPoup() +"\nContas Especiais: \n" + meiaBoca.listaContasEspec() );
                
            }
        }

        //Conta c1 = new Conta(111,100.0);
        //Conta c2 = new Conta(112, 150.0);

        //Poupanca poup = new Poupanca(6, 10000);
        //poup.renderJuros(0.5);ConPane.showInputDialog("Conta 1")));
        //c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta 1")));
        //c2.setConta(Integer.parseInt(JOptionPane.showInputDialog("Conta 2")));
        //c2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta 2")));
        //c.Transferir(c2, Double.parseDouble(JOptionPane.showInputDialog("Quanto quer transferir?")));
        //JOptionPane.showMessageDialog(null, "Conta 1: " + c.getConta() + "\n" + "Saldo: " + c.getSaldo() + "\n" + "Conta 2: " + c2.getConta() + "\n" + "Saldo: " + c2.getSaldo());

        //Banco nubank = new Banco ();
        //nubank.cadastarConta(c1);
        //nubank.cadastarConta(c2);
        //nubank.creditarConta(111, 200);
        //JOptionPane.showMessageDialog(null, "Conta 1: " + c1.getSaldo() + "Conta 2: " + c2.getSaldo());

        //ContaEspec contae;
        //contae = new ContaEspec("21.342-7", 100.0);
        //((ContaEspec)contae).Creditar(200.00);
        //contae.Debitar(100.00);
        //contae.renderBonus();
        //System.out.print(contae.getSaldo());
        //JOptionPane.showMessageDialog(null, "Conata Especial: " + contae.getSaldo());
    }
    
}
