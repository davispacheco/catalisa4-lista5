package src.exercicio1;

public class Bola {
    double circunferencia;
    String cor;
    String marca;
    String material;
    Double velocidade;

    public Bola(double circunferencia, String cor, String marca, String material, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Bola{" +
                "circunferencia=" + circunferencia +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", material='" + material + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public String trocaCor(String numeroDaCor) {
        switch (numeroDaCor) {
            case "1":
                cor = "azul";
                break;
            case "2":
                cor = "amarela";
                break;
            case "3":
                cor = "vermelha";
                break;
            default:
                cor = "branca";
        }
        return cor;
    }

    public String mostraCor() {
        return cor;
    }
}
