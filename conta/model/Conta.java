package conta.model;

public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void imprimirInfo() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo: " + saldo);
    }

    public static class ContaPoupanca {
        private String numero;
        private double saldo;
        private double taxaRendimento;

        public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
            this.numero = numero;
            this.saldo = saldo;
            this.taxaRendimento = taxaRendimento;
        }

    }

    public static class ContaCorrente {
        private String numero;
        private double saldo;
        private double taxaManutencao;

        public ContaCorrente(String numero, double saldo, double taxaManutencao) {
            this.numero = numero;
            this.saldo = saldo;
            this.taxaManutencao = taxaManutencao;
        }

    }
}
