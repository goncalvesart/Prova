package prova;

public class ContaPoupanca extends Conta {
    private final double rendimento = 0.07;

    // Construtor padrão
    public ContaPoupanca() {}

    // Construtor personalizado
    public ContaPoupanca(int numeroConta, String nomeTitular, int idade, double saldo) {
        super(numeroConta, nomeTitular, idade, saldo);
    }

    // Método para aplicar o rendimento
    public void aplicarRendimento() {
        saldo += saldo * rendimento;
    }
}

