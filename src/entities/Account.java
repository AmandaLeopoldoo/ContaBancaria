package entities;

public class Account {

    private final int numeroConta;
    private String nome;
    private double deposito;

    public Account(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public Account(int numeroConta, String nome, double DepositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(DepositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public void deposito(double valorDeposito) {
        this.deposito += valorDeposito;
    }

    public void saque(double valorsaque) {
        this.deposito -= valorsaque + 5.00;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f",
                numeroConta, nome, deposito);
    }
}
