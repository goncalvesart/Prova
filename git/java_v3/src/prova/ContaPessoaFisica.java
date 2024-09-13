package prova;

public class ContaPessoaFisica extends Conta {
    private double limiteSaque;
    private double limiteEmprestimo;

    
    public ContaPessoaFisica() {}

    public ContaPessoaFisica(int numeroConta, String nomeTitular, int idade, double saldo, double limiteSaque, double limiteEmprestimo) {
        super(numeroConta, nomeTitular, idade, saldo);
        this.limiteSaque = limiteSaque;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteSaque() { 
        return limiteSaque; 
    }
    public void setLimiteSaque(double limiteSaque) { 
        this.limiteSaque = limiteSaque; 
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo; 
    }
    public void setLimiteEmprestimo(double limiteEmprestimo) { 
        this.limiteEmprestimo = limiteEmprestimo; 
    }

    
    @Override
    public boolean emprestar(double valor) {
        if (valor <= limiteEmprestimo) {
            saldo -= (valor + 15);  
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= (valor + 3)) {  
            saldo -= (valor + 3);
            return true;
        }
        return false;
    }
}

