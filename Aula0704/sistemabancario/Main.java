package com.mycompany.sistemabancario;

public class Main {
    
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("João", 1000, 5);
        ContaPoupanca cp = new ContaPoupanca("Maria", 2000, 0.05);

        System.out.println("=== Conta Corrente ===");
        cc.sacar(100);
        cc.exibirDados();

        System.out.println("\n=== Conta Poupança ===");
        cp.aplicarRendimento();
        cp.exibirDados();
    }
}
