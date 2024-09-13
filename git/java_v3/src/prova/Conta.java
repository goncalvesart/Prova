package prova;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private int idade;
    protected double saldo;

    // Construtor padrão
    public Conta() {}

    // Construtor personalizado
    public Conta(int numeroConta, String nomeTitular, int idade, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.idade = idade;
        this.saldo = saldo;
    }

    // Métodos Getters e Setters (exceto para saldo)
    public int getNumeroConta() { return numeroConta; }
    public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta; }

    public String getNomeTitular() { return nomeTitular; }
    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getSaldo() { return saldo; }

    // Métodos de operação
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;  // Não permite saque sem saldo
    }

    public boolean emprestar(double valor) {
        saldo -= valor;
        return true;
    }
}
