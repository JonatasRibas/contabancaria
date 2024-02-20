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
    }
}
