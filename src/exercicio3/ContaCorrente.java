package src.exercicio3;

public class ContaCorrente {
    String numeroDaConta;
    String nomeDoCorrentista;
    double saldo;

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public ContaCorrente(String numeroDaConta, String nomeDoCorrentista, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0;
    }

}
