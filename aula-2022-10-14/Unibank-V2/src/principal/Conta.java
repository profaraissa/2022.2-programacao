package principal;

public class Conta {

    protected double saldo;
    protected int agencia;
    protected int numeroConta;
    protected Cliente titular;

    public Conta() {
        System.out.println("Inicializando objeto " + this + "vazio");
    }

    public Conta(Cliente titular, int numeroConta, int agencia) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
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
        return "principal.Conta{" +
                "saldo=" + saldo +
                ", agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", titular=" + titular +
                '}';
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido");
        } else {
            this.saldo += valor;
        }

    }

    protected boolean podeSacar(double valor) {
        double saldoTotal = this.saldo;
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

    public void transferir(ContaCorrente destino, double valor) {
        if (this.podeSacar(valor)) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
