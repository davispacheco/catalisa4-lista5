package src.exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Scanner input = new Scanner(System.in);
        Retangulo retangulo = new Retangulo(10.0, 20.0);
        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Mostrar valor dos lados do retângulo");
            System.out.println("2: Alterar valor dos lados do retângulo");
            System.out.println("3: Calcular a área do retângulo");
            System.out.println("4: Calcular o perímetro do retângulo");
            System.out.println("5: Finalizar");
            String opcao = input.next();
            switch (opcao) {
                case "1":
                    System.out.println(retangulo.retornarValorDosLados());
                    repeticaoMenu = true;
                    break;
                case "2":
                    boolean repeticaoBaseRetangulo = true;
                    while (repeticaoBaseRetangulo) {
                        System.out.println("Informe o valor que deseja definir como base do retângulo:");
                        double baseDoRetangulo = input.nextDouble();
                        if (baseDoRetangulo <= 0) {
                            System.out.println("O valor da base do retângulo não pode ser menor ou igual a 0.");
                            repeticaoBaseRetangulo = true;
                        } else {
                            boolean repeticaoAlturaRetangulo = true;
                            while (repeticaoAlturaRetangulo) {
                                System.out.println("Informe o valor que deseja definir como altura do retângulo:");
                                double alturaDoRetangulo = input.nextDouble();
                                if (alturaDoRetangulo <= 0) {
                                    System.out.println("O valor da altura do retângulo não pode ser menor ou igual a 0.");
                                    repeticaoAlturaRetangulo = true;
                                } else {
                                    retangulo.mudarValorDosLados(baseDoRetangulo, alturaDoRetangulo);
                                    System.out.println("Base e altura do retângulo alteradas com sucesso!");
                                    repeticaoBaseRetangulo = false;
                                    repeticaoAlturaRetangulo = false;
                                }
                            }
                        }
                    }
                    repeticaoMenu = true;
                    break;
                case "3":
                    double areaDoRetangulo = retangulo.calcularArea(retangulo.base, retangulo.altura);
                    System.out.println("A área do retângulo, cuja base é " + retangulo.base + " e a altura, " + retangulo.altura + " é: " + areaDoRetangulo);
                    repeticaoMenu = true;
                    break;
                case "4":
                    double perimetroDoRetangulo = retangulo.calcularPerimetro(retangulo.base, retangulo.altura);
                    System.out.println("O perímetro do retângulo, cuja base é " + retangulo.base + " e a altura, " + retangulo.altura + " é: " + perimetroDoRetangulo);
                    repeticaoMenu = true;
                    break;
                case "5":
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

