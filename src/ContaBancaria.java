
class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    //Adição de verificação para não aceitar saques de valores neutros ou negativos
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else if (valor <= 0) {
            System.out.println("O valor do saque precisa ser positivo.");
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

