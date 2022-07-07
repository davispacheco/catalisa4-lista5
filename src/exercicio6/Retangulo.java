package src.exercicio6;

public class Retangulo {
    Double base;
    double altura;

    public Retangulo(Double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorDosLados(double novaBase, double novaAltura) {
        base = novaBase;
        altura = novaAltura;
    }

    public String retornarValorDosLados() {
        String valorDosLados = "Valor da base: " + base + ".\nValor da altura: " + altura + ".";
        return valorDosLados;
    }

    public double calcularArea(double base, double altura) {
        double areaDoRetangulo = base * altura;
        return areaDoRetangulo;
    }

    public double calcularPerimetro(double base, double altura) {
        double perimetroDoRetangulo = (base + altura) * 2;
        return perimetroDoRetangulo;
    }
}
