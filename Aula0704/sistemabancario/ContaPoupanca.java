package com.mycompany.sistemabancario;

public class ContaPoupanca extends ContaBancaria {

    private final double rendimento;

    public ContaPoupanca(String titular, double saldoInicial, double rendimento) {
        super(titular, saldoInicial);
        this.rendimento = rendimento;
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimento;
    }
}
