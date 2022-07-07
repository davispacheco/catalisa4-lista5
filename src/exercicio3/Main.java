package src.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        ContaCorrente contaCorrente = new ContaCorrente("3158", "João da Silva");
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("Escolha sua opção.");
            System.out.println("1: Informações da conta corrente");
            System.out.println("2: Depositar dinheiro");
            System.out.println("3: Sacar dinheiro");
            System.out.println("4: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Número da conta: " + contaCorrente.numeroDaConta);
                    System.out.println("Nome do correntista: " + contaCorrente.nomeDoCorrentista);
                    System.out.println("Saldo: " + contaCorrente.saldo);
                    repeticaoMenu = true;
                    break;
                case "2":
                    boolean repeticaoDepositar = true;
                    while (repeticaoDepositar) {
                        System.out.println("Quanto deseja depositar?");
                        double valorDeposito = input.nextDouble();
                        if (valorDeposito <= 0) {
                            System.out.println("Não pode depositar valor menor ou igual a 0.");
                            repeticaoDepositar = true;
                        } else {
                            contaCorrente.depositoConta(valorDeposito);
                            System.out.println("Depósito realizado com sucesso!");
                            repeticaoDepositar = false;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "3":
                    boolean repeticaoSacar = true;
                    while (repeticaoSacar) {
                        System.out.println("Quanto deseja sacar?");
                        double valorSaque = input.nextDouble();
                        if (valorSaque <= 0) {
                            System.out.println("Não pode sacar um valor menor ou igual a 0.");
                            repeticaoSacar = true;
                        } else if (valorSaque > contaCorrente.saldo) {
                            System.out.println("Não pode sacar um valor maior do que possui na conta.");
                            repeticaoSacar = true;
                        } else {
                            contaCorrente.saqueConta(valorSaque);
                            System.out.println("Saque realizado com sucesso!");
                            repeticaoSacar = false;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "4":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    repeticaoMenu = true;
            }
        }
        input.close();

    }
}
