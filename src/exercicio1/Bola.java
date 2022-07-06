package src.exercicio1;

public class Bola {
    double circunferencia;
    String marca;
    String cor;
    double velocidade;

    public Bola(double circunferencia, String marca, String cor, double velocidade) {
        this.circunferencia = circunferencia;
        this.marca = marca;
        this.cor = cor;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Bola{" +
                "circunferencia=" + circunferencia +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
