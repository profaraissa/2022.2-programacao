package principal;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raiss
 */
public class ContaCorrente extends Conta{

   private double limite;

    public ContaCorrente() {
        System.out.println("Inicializando objeto " + this + "vazio");
    }

    public ContaCorrente(Cliente titular, int numeroConta, int agencia, boolean ehPremium) {
        super(titular,numeroConta, agencia);
        this.limite = ehPremium ? 200 : 0; //verifica se é premium, se for limite é setado com 200, se não limite é setado como 0
    }

    @Override
    public String toString() {
        return "principal.Conta{" + "limite=" + limite + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", titular=" + titular + '}';
    }
    @Over
    protected boolean podeSacar(double valor) {
        double saldoTotal = this.saldo + this.limite;
        return saldoTotal >= valor;
    }
}


