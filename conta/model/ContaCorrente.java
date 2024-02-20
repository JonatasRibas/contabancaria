package conta.model;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private double taxaManutencao;

    public ContaCorrente(String numero, double saldo, double taxaManutencao) {
        this.numero = numero;
        this.saldo = saldo;
        this.taxaManutencao = taxaManutencao;
    }

}

public class ContaPoupanca {
    private String numero;
    private double saldo;
    private double taxaRendimento;

    public ContaPoupanca(String numero, double saldo, double taxaRendimento) {
        this.numero = numero;
        this.saldo = saldo;
        this.taxaRendimento = taxaRendimento;
    }

}
