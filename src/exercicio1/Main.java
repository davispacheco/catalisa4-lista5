package src.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        boolean repeticaoCorDaBola = true;
        Bola bola1 = new Bola(5.0, "branca", "XYZ", "plástico", 4.0);
        System.out.println(bola1);
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("O que quer fazer?");
            System.out.println("1: Mostrar cor da bola");
            System.out.println("2: Mudar cor da bola");
            System.out.println("3: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("A cor atual da bola é: " + bola1.mostraCor());
                    repeticaoMenu = true;
                    break;
                case "2":
                    while (repeticaoCorDaBola) {
                        System.out.println("Escolha um número, de 1 a 3. 4 retorna à cor padrão.");
                        String opcaoTrocaCor = input.next();
                        String corAtual = bola1.cor;
                        switch (opcaoTrocaCor) {
                            case "1":
                                bola1.trocaCor("1");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola1.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            case "2":
                                bola1.trocaCor("2");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola1.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            case "3":
                                bola1.trocaCor("3");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola.mostraCor());
                                repeticaoCorDaBola = false;
                                break;
                            case "4":
                                bola1.trocaCor("4");
                                System.out.println("Cor da bola alterada de " + corAtual + " para " + bola1.mostraCor());
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
                    System.out.println("Testando outros objetos bola...");
                    Bola bola2 = new Bola(7.0, "preta", "ABC", "couro", 4.0);
                    System.out.println(bola2);
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
