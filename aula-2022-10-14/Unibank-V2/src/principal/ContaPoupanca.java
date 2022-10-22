package principal;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca() {
        System.out.println("Inicializando objeto " + this + "vazio");
    }

    public ContaPoupanca(Cliente titular, int numeroConta, int agencia, double taxaJuros) {
        super();
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "taxaJuros=" + taxaJuros +
                ", saldo=" + saldo +
                ", agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", titular=" + titular +
                '}';
    }
}
