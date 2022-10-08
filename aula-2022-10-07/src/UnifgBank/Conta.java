/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnifgBank;

/**
 *
 * @author raiss
 */
public class Conta {

    private double saldo;
    private double limite;
    private int agencia;
    private int numeroConta;
    private Cliente titular;

    public Conta() {
        System.out.println("Inicializando objeto " + this + "vazio");
    }

    public Conta(Cliente titular, int numeroConta, int agencia, boolean ehPremium) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.limite = ehPremium ? 200 : 0; //verifica se é premium, se for limite é setado com 200, se não limite é setado como 0
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Conta{" + "limite=" + limite + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", titular=" + titular + '}';
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else {
            this.saldo += valor;
        }

    }

    private boolean podeSacar(double valor) {
        double saldoTotal = this.saldo + this.limite;
        return saldoTotal >= valor;
    }

    public void sacar(double valor) {
        if (this.podeSacar(valor)) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    public double verSaldo() {
        return this.saldo;
    }

    public void transferir(Conta destino, double valor) {
        if (this.podeSacar(valor)) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
