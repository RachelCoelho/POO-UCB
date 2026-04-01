package com.mycompany.poo;

public class Pessoa {
    
    private String nome;
    private int idade;
    
    public Pessoa() {
    
    }
    
    public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + nome + " idade: " + idade);
    }  
    
}
