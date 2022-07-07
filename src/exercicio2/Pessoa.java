package src.exercicio2;

public class Pessoa {
    String nome;
    int idade;
    double peso;
    double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0;
        this.altura = altura;
    }

    public void envelhecer() {
        idade++;
        altura += 0.5;
    }

    public void engordar(double quantidadeDePeso) {
        peso += quantidadeDePeso;
    }

    public void emagrecer(double quantidadeDePeso) {
        peso -= quantidadeDePeso;
    }

    public void crescer(double quantidadeDeCentimetros) {
        altura += quantidadeDeCentimetros;
    }
}
