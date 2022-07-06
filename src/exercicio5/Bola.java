package src.exercicio5;

public class Bola {
    String nome;
    String cor;
    double circunferencia;
    String material;

    public Bola(String nome, String cor, double circunferencia, String material) {
        this.nome = nome;
        this.cor = "branca";
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public String mudaCor(String numeroDaCor) {
        switch (numeroDaCor) {
            case "1":
                cor = "azul";
                break;
            case "2":
                cor = "amarela";
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
