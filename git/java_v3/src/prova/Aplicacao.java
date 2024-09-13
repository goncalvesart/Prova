package prova;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.println("Cadastro da Conta Empresarial 1");
        ContaEmpresarial contaEmpresarial1 = cadastrarContaEmpresarial(input);
        
        System.out.println("Cadastro da Conta Empresarial 2");
        ContaEmpresarial contaEmpresarial2 = cadastrarContaEmpresarial(input);

       
        System.out.println("Cadastro da Conta Pessoa Física 1");
        ContaPessoaFisica contaPessoaFisica1 = cadastrarContaPessoaFisica(input);
        
        System.out.println("Cadastro da Conta Pessoa Física 2");
        ContaPessoaFisica contaPessoaFisica2 = cadastrarContaPessoaFisica(input);

        System.out.println("Cadastro da Conta Pessoa Física 3");
        ContaPessoaFisica contaPessoaFisica3 = cadastrarContaPessoaFisica(input);

    
        System.out.println("Cadastro da Conta Poupança 1");
        ContaPoupanca contaPoupanca1 = cadastrarContaPoupanca(input);
        
        System.out.println("Cadastro da Conta Poupança 2");
        ContaPoupanca contaPoupanca2 = cadastrarContaPoupanca(input);

      
        emitirExtratoConta(contaEmpresarial1);
        emitirExtratoConta(contaEmpresarial2);
        emitirExtratoConta(contaPessoaFisica1);
        emitirExtratoConta(contaPessoaFisica2);
        emitirExtratoConta(contaPessoaFisica3);
        emitirExtratoConta(contaPoupanca1);
        emitirExtratoConta(contaPoupanca2);
    }

    
    public static ContaEmpresarial cadastrarContaEmpresarial(Scanner input) {
        System.out.print("Número da conta: ");
        int numeroConta = input.nextInt();
        System.out.print("Nome do titular: ");
        String nomeTitular = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();
        System.out.print("Limite para saque: ");
        double limiteSaque = input.nextDouble();
        System.out.print("Limite para empréstimo: ");
        double limiteEmprestimo = input.nextDouble();
        
        return new ContaEmpresarial(numeroConta, nomeTitular, idade, saldo, limiteSaque, limiteEmprestimo);
    }

    public static ContaPessoaFisica cadastrarContaPessoaFisica(Scanner input) {
        System.out.print("Número da conta: ");
        int numeroConta = input.nextInt();
        System.out.print("Nome do titular: ");
        String nomeTitular = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();
        System.out.print("Limite para saque: ");
        double limiteSaque = input.nextDouble();
        System.out.print("Limite para empréstimo: ");
        double limiteEmprestimo = input.nextDouble();

        return new ContaPessoaFisica(numeroConta, nomeTitular, idade, saldo, limiteSaque, limiteEmprestimo);
    }

    public static ContaPoupanca cadastrarContaPoupanca(Scanner input) {
        System.out.print("Número da conta: ");
        int numeroConta = input.nextInt();
        System.out.print("Nome do titular: ");
        String nomeTitular = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();

        return new ContaPoupanca(numeroConta, nomeTitular, idade, saldo);
    }

 
    public static void emitirExtratoConta(Conta conta) {
        System.out.println("Conta: " + conta.getNumeroConta() + ", Titular: " + conta.getNomeTitular() + ", Saldo: R$ " + conta.getSaldo());
    }
}
