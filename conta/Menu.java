package conta;

import conta.model.Conta;

public class Menu {
    public static void main(String[] args) {

        Conta conta = new Conta("12345", 1000.0);

        conta.imprimirInfo();

        conta.depositar(500.0);

        conta.imprimirInfo();

        conta.sacar(200.0);

        conta.imprimirInfo();

        ContaCorrente contaCorrente = new ContaCorrente("123", 1000.0, 10.0);
        System.out.println("Conta Corrente:");
        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        contaCorrente.depositar(500.0);
        System.out.println("Saldo após depósito: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 2000.0, 0.05);
        System.out.println("\nConta Poupança:");
        System.out.println("Saldo inicial: " + contaPoupanca.getSaldo());
        contaPoupanca.depositar(300.0);
        System.out.println("Saldo após depósito: " + contaPoupanca.getSaldo());
    }
}
