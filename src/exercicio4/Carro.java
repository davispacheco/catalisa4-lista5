package src.exercicio4;

public class Carro {
    int quantidadeDePortas;
    String modelo;
    String marca;
    double potencia;
    boolean ligado;

    public Carro(int quantidadeDePortas, String modelo, String marca, boolean ligado) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = false;
    }

    public Carro(int quantidadeDePortas, String modelo, String marca, double potencia, boolean ligado) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
        this.ligado = false;
    }

    public boolean ligarCarro() {
        if (ligado) {
            ligado = false;
        } else {
            ligado = true;
        }
        return ligado;

    }
}
