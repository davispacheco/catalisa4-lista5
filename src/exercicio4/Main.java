package src.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Carro carro = new Carro(4, "Bola", "Gol");
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("Escolha sua opção.");
            System.out.println("1: Informações sobre o carro");
            System.out.println("2: Ligar/desligar o carro");
            System.out.println("3: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Quantidade de portas:" + carro.quantidadeDePortas);
                    System.out.println("Modelo:" + carro.modelo);
                    System.out.println("Marca: " + carro.marca);
                    System.out.println("Potência:" + carro.potencia);
                    System.out.print("Estado: ");
                    if (carro.ligado) {
                        System.out.println("ligado");
                    } else {
                        System.out.println("Desligado");
                    }
                    repeticaoMenu = true;
                    break;
                case "2":
                    carro.ligarCarro();
                    if (carro.ligado) {
                        System.out.println("Carro ligado!");
                    } else {
                        System.out.println("Carro desligado!");
                    }
                    repeticaoMenu = true;
                    break;
                case "3":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
