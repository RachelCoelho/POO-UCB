package com.mycompany.sistemabancario;

public class ContaCorrente extends ContaBancaria {

    private double taxa;

    public ContaCorrente(String titular, double saldoInicial, double taxa) {
        super(titular, saldoInicial);
        this.taxa = taxa;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxa;

        if (valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
        } else {
            System.out.println("Saldo insuficiente (com taxa)!");
        }
    }
}
