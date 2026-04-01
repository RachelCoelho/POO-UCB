package com.mycompany.poo;


public class Funcionario extends Pessoa {
    private double salario;
    
    public Funcionario(String nome, int idade, double salario){
        super(nome, idade);
        this.salario = salario;
    }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println(" Salario: " + salario);
    }
}
