//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente(1000);
        ContaBancaria cp = new ContaPoupanca(1000);
        ContaBancaria ci = new ContaInvestimento(1000, 2);

        cc.sacar(300); // Funciona corretamente
        cp.sacar(300); // Funciona, mas comportamento diferente
        ci.sacar(300); // Lança mensagem de erro por bloqueio
    }
}