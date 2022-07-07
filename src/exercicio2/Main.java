package src.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Pessoa pessoa = new Pessoa("Maria", 17, 50.0, 150.0);
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Dados sobre a pessoa");
            System.out.println("2: Envelhecer");
            System.out.println("3: Engordar");
            System.out.println("4: Emagrecer");
            System.out.println("5: Crescer");
            System.out.println("6: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Nome: " + pessoa.nome);
                    System.out.println("Idade: " + pessoa.idade);
                    System.out.println("Peso: " + pessoa.peso);
                    System.out.println("Altura: " + (pessoa.altura / 100));
                    repeticaoMenu = true;
                    break;
                case "2":
                    pessoa.envelhecer();
                    System.out.println("A pessoa envelheceu!");
                    repeticaoMenu = true;
                    break;
                case "3":
                    boolean repeticaoEngordar = true;
                    while (repeticaoEngordar) {
                        System.out.println("Quantos quilos a pessoa deseja engordar?");
                        double quantidadeDePeso = input.nextDouble();
                        if (quantidadeDePeso <= 0) {
                            System.out.println("A pessoa não pode engordar com uma quantidade menor ou igual a 0.");
                            repeticaoEngordar = true;
                        } else {
                            pessoa.engordar(quantidadeDePeso);
                            System.out.println("A pessoa engordou!");
                            repeticaoEngordar = false;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "4":
                    boolean repeticaoEmagrecer = true;
                    while (repeticaoEmagrecer) {
                        System.out.println("Quantos quilos a pessoa deseja emagrecer?");
                        double quantidadeDePeso = input.nextDouble();
                        if (quantidadeDePeso <= 0) {
                            System.out.println("A pessoa não pode emagrecer com uma quantidade menor ou igual a 0.");
                            repeticaoEmagrecer = true;
                        } else if (quantidadeDePeso > pessoa.peso * 0.8) {
                            System.out.println("A pessoa não pode emagrecer mais que 80 porcento de seu peso atual.");
                            repeticaoEmagrecer = true;
                        } else {
                            pessoa.emagrecer(quantidadeDePeso);
                            System.out.println("A pessoa emagreceu!");
                            repeticaoEmagrecer = false;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "5":
                    boolean repeticaoCrescer = true;
                    while (repeticaoCrescer) {
                        System.out.println("Quantos centímetros a pessoa deseja crescer?");
                        double quantidadeDeCentimetros = input.nextDouble();
                        if (quantidadeDeCentimetros <= 0) {
                            System.out.println("A pessoa não pode crescer com um valor menor ou igual a 0.");
                            repeticaoCrescer = true;
                        } else {
                            pessoa.crescer(quantidadeDeCentimetros);
                            System.out.println("A pessoa cresceu!");
                            repeticaoCrescer = false;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "6":
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
