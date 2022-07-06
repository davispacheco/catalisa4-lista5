package src.exercicio6;

public class Quadrado {
    double tamanhoDoLado;

    public Quadrado(double tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarValorDoLado(double novoValorDoLado) {
        tamanhoDoLado = novoValorDoLado;
    }

    public double retornarValorDoLado() {
        return tamanhoDoLado;
    }
    public double calcularArea(double tamanhoDoLado) {
        double areaDoQuadrado = tamanhoDoLado * tamanhoDoLado;
        return areaDoQuadrado;
    }
}
