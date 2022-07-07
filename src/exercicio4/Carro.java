package src.exercicio4;

public class Carro {
    int quantidadeDePortas;
    String modelo;
    String marca;
    double potencia;
    boolean ligado = false;

    public Carro(int quantidadeDePortas, String modelo, String marca) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro(int quantidadeDePortas, String modelo, String marca, double potencia) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
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
