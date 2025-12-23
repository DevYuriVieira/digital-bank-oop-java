package DigitalBank;

public class Main {
    public static void main(String[] args) {
        Cliente soto = new Cliente();
        soto.setNome("Soto");

        Conta cc = new ContaCorrente(soto);
        Conta poupanca = new ContaPoupanca(soto);

        cc.imprimirExtrato();
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
