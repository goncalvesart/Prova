package prova;

public class ContaPoupanca extends Conta {
    private final double rendimento = 0.07;

 
    public ContaPoupanca() {}

  
    public ContaPoupanca(int numeroConta, String nomeTitular, int idade, double saldo) {
        super(numeroConta, nomeTitular, idade, saldo);
    }

   
    public void aplicarRendimento() {
        saldo += saldo * rendimento;
    }
}

