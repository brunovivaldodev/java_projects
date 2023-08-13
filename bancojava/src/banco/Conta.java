package banco;

import javax.swing.JOptionPane;
import java.lang.Math;
import java.lang.IllegalArgumentException;

public class Conta {

    private int numeroDaConta;
    private double saldo;
    private static int totalDeContas;
    public Cliente Titular = new Cliente();

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void saca(int quantidade) throws saldoInsuficienteException {

        if (this.saldo < quantidade) {

            System.out.println(quantidade + " Maior que saldo Disponível");
            throw new saldoInsuficienteException("Saldo Insuficiente,"+"tente um valor menor") ;
        } else {

            this.saldo -= quantidade;
            // JOptionPane.showMessageDialog(null, quantidade + " Foi retirado da sua conta.\nO seu saldo atual é "+ this.saldo, "Sacar Dinheiro", JOptionPane.PLAIN_MESSAGE);
            System.out.println(quantidade + " Foi retirado da sua conta.\nO seu saldo atual é " + this.saldo);
           
        }

    }

    public void deposita(int quantidade) {

        this.saldo += quantidade;
        // JOptionPane.showMessageDialog(null, quantidade + " Foi Depositado na sua conta.\nO seu saldo atual é "+ this.saldo, "Depositar Dinheiro", JOptionPane.PLAIN_MESSAGE);
        System.out.println(quantidade + " Foi Depositado da sua conta.\nO seu saldo atual é " + this.saldo);
    }

    public boolean trasnfere(Conta destino, int valor) {

        if (this.saldo < valor) {

            System.out.println("Não é possível transferir o dinheiro");
            return false;
        } else {

            this.saldo -= valor;
            destino.saldo += valor;
            System.out.println("Trânsferencia efectuada , o seu saldo actual é de " + this.saldo);
            return true;
        }

    }

    public Conta() {
        Conta.totalDeContas += 1;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + ",bruno ="+ Titular.getCpf() +",  Titular=" + Titular.getNome() + '}';
    }

    
    
    
}
