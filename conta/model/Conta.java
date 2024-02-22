package conta.model;
    public abstract class Conta {
        private String numero;
        private double saldo;

        public Conta(String numero, double saldo) {
            this.numero = numero;
            this.saldo = saldo;
        }


        public abstract void depositar(double valor);
        public abstract void sacar(double valor);
        public abstract void imprimirInfo();
    }
