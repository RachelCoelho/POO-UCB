
package com.mycompany.poo;

public class App {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao", 40);
        p1.mostrarDados();
  
        Funcionario f1 = new Funcionario("Maria", 35, 2800.00);
        f1.mostrarDados();
        
        ChefeDeDepartamento cd = new ChefeDeDepartamento("Luis", 60, 5000.00,"RH");
        cd.mostrarDados();
    }
}
