package src.exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Scanner input = new Scanner(System.in);
        Quadrado quadrado = new Quadrado(10);
        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Mostrar valor do lado do quadrado");
            System.out.println("2: Alterar valor do lado do quadrado");
            System.out.println("3: Calcular a área do quadrado");
            System.out.println("4: Finalizar");
            String opcao = input.next();
            switch (opcao) {
                case "1":
                    System.out.println("O valor atual do lado do quadrado é:" + quadrado.retornarValorDoLado());
                    repeticaoMenu = true;
                    break;
                case "2":
                    boolean repeticaoLadoDoQuadrado = true;
                    while (repeticaoLadoDoQuadrado) {
                        System.out.println("Informe o valor que deseja definir como lado do quadrado:");
                        double ladoDoQuadrado = input.nextDouble();
                        if (ladoDoQuadrado <= 0) {
                            System.out.println("O lado do quadrado não pode ser menor ou igual a 0.");
                            repeticaoLadoDoQuadrado = true;
                        } else {
                            quadrado.mudarValorDoLado(ladoDoQuadrado);
                            System.out.println("Lado do quadrado alterado com sucesso!");
                            repeticaoLadoDoQuadrado = false;
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "3":
                    double areaDoQuadrado = quadrado.calcularArea(quadrado.tamanhoDoLado);
                    System.out.println("A área do quadrado, cujo lado é " + quadrado.tamanhoDoLado + " é: " + areaDoQuadrado);
                    repeticaoMenu = true;
                    break;
                case "4":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
}
