package src.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        boolean repeticaoCorDaBola = true;
        Bola bola = new Bola("Jabulane", "branca", 5.0, "plástico");
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("O que quer fazer?");
            System.out.println("1: Mostrar cor da bola");
            System.out.println("2: Mudar cor da bola");
            System.out.println("3: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("A cor atual da bola é: " + bola.mostraCor());
                    repeticaoMenu = true;
                    break;
                case "2":
                    while (repeticaoCorDaBola) {
                        System.out.println("Escolha um número, de 1 a 3. 4 retorna à cor padrão.");
                        String opcaoMudaCor = input.next();
                        String corAtual = bola.cor;
                        switch (opcaoMudaCor) {
                            case "1":
                                bola.mudaCor("1");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            case "2":
                                bola.mudaCor("2");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            case "3":
                                bola.mudaCor("3");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            case "4":
                                bola.mudaCor("4");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                repeticaoCorDaBola = true;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "3":
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
