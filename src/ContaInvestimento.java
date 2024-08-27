class ContaInvestimento extends ContaBancaria {
    private int periodosBloqueio;

    public ContaInvestimento(double saldoInicial, int periodosBloqueio) {
        super(saldoInicial);
        this.periodosBloqueio = periodosBloqueio;
    }

    @Override
    public void sacar(double valor) {
        if (periodosBloqueio > 0) {
            System.out.println("Não é permitido sacar de uma conta de investimento antes do fim do período de bloqueio.");
        } else if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
        } else if (valor <= 0) {
            System.out.println("O valor do saque precisa ser positivo.");
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    public void reduzirPeriodoBloqueio() {
        if (periodosBloqueio > 0) {
            periodosBloqueio--;
        }
    }
}

