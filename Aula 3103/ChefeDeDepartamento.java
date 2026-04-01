package com.mycompany.poo;

public class ChefeDeDepartamento extends Funcionario {
    private String departamento;
    
    public ChefeDeDepartamento (String nome, int idade, double salario, String departamento){
        super(nome, idade, salario);
        this.departamento = departamento; 
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Departamento: " + departamento);
    }
}
