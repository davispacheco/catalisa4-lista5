package src.exercicio1;

public class Bola {
    double circunferencia;
    String cor;
    String marca;
    double velocidade;

    public Bola(double circunferencia, String cor, String marca, double velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Bola{" +
                "circunferencia=" + circunferencia +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}
