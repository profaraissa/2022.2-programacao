
public class Main {

    public static void main(String[] args) {
        Cliente thomas = new Cliente();
        Cliente teixeira = new Cliente();
        thomas.setNome("Thomas Jefferson");
        teixeira.setNome("Teixeira");

        ContaCorrente cc = new ContaCorrente(thomas);
        ContaPoupanca poupanca = new ContaPoupanca(teixeira);

        cc.imprimirExtrato();
        cc.depositar(100);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
