package prova;

public class ContaPessoaFisica extends Conta {
    private double limiteSaque;
    private double limiteEmprestimo;

    // Construtor padrão
    public ContaPessoaFisica() {}

    // Construtor personalizado
    public ContaPessoaFisica(int numeroConta, String nomeTitular, int idade, double saldo, double limiteSaque, double limiteEmprestimo) {
        super(numeroConta, nomeTitular, idade, saldo);
        this.limiteSaque = limiteSaque;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    // Métodos Getters e Setters
    public double getLimiteSaque() { return limiteSaque; }
    public void setLimiteSaque(double limiteSaque) { this.limiteSaque = limiteSaque; }

    public double getLimiteEmprestimo() { return limiteEmprestimo; }
    public void setLimiteEmprestimo(double limiteEmprestimo) { this.limiteEmprestimo = limiteEmprestimo; }

    // Sobrecarga de métodos
    @Override
    public boolean emprestar(double valor) {
        if (valor <= limiteEmprestimo) {
            saldo -= (valor + 15);  // Taxa de R$ 15,00
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= (valor + 3)) {  // Taxa de R$ 3,00
            saldo -= (valor + 3);
            return true;
        }
        return false;
    }
}

