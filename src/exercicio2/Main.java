package src.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Pessoa pessoa = new Pessoa("Maria", 17, 50.0, 1.50);
        Scanner input = new Scanner(System.in);
        System.out.println("O que deseja?");
        System.out.println("1: Emagrecer");
        System.out.println("2: Engordar");
        System.out.println("3: Envelhecer");
        input.close();
    }
}
