package prova;

public class Conta {
    private int numeroConta;
    private String nomeTitular;
    private int idade;
    protected double saldo;

   
    public Conta() {}

   
    public Conta(int numeroConta, String nomeTitular, int idade, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.idade = idade;
        this.saldo = saldo;
    }

   
    public int getNumeroConta() { return numeroConta; }
    public void setNumeroConta(int numeroConta) { this.numeroConta = numeroConta; }

    public String getNomeTitular() { return nomeTitular; }
    public void setNomeTitular(String nomeTitular) { this.nomeTitular = nomeTitular; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public double getSaldo() { return saldo; }

    
    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;  
    }

    public boolean emprestar(double valor) {
        saldo -= valor;
        return true;
    }
}
