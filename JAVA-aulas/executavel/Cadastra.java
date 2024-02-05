package executavel;
import objetos.Conta;
import objetos.Poupanca;
import objetos.Banco;

import javax.swing.JOptionPane;

public class Cadastra {
    public static void main(String[] args){
        Conta c1 = new Conta(111,100.0);
        Conta c2 = new Conta(112, 150.0);
        //Poupanca poup = new Poupanca(6, 10000);
        //poup.renderJuros(0.5);
        //JOptionPane.showMessageDialog(null, "rende: " + poup.getSaldo());
        //c.setConta(Integer.parseInt(JOptionPane.showInputDialog("Conta 1")));
        //c.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta 1")));
        //c2.setConta(Integer.parseInt(JOptionPane.showInputDialog("Conta 2")));
        //c2.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo da conta 2")));
        //c.Transferir(c2, Double.parseDouble(JOptionPane.showInputDialog("Quanto quer transferir?")));
        //JOptionPane.showMessageDialog(null, "Conta 1: " + c.getConta() + "\n" + "Saldo: " + c.getSaldo() + "\n" + "Conta 2: " + c2.getConta() + "\n" + "Saldo: " + c2.getSaldo());

        Banco nubank = new Banco ();
        nubank.cadastarConta(c1);
        nubank.cadastarConta(c2);
        nubank.creditarConta(111, 200);
        JOptionPane.showMessageDialog(null, "Conta 1: " + c1.getSaldo());

    }
    
}
