package universidade.prova.teste;

import universidade.prova.ProvaFafifo;
import universidade.prova.ProvaUCB;

public class Teste {
    public static void main(String[] args) {
        // Teste UCB
        ProvaUCB ucb = new ProvaUCB();
        ucb.setNotas(6.0, 5.0, 8.5); // AV3 substitui o 5.0
        
        System.out.println("=== RESULTADO UCB ===");
        System.out.println("Media Final: " + ucb.calcularMedia());
        System.out.println("Situacao: " + (ucb.aprovado() ? "Aprovado" : "Reprovado"));

        System.out.println("\n--------------------\n");

        // Teste Fafifo
        ProvaFafifo fafifo = new ProvaFafifo();
        fafifo.setNotas(5.0, 4.0, 7.0); // AV3 com peso 3
        
        System.out.println("=== RESULTADO FAFIFO ===");
        System.out.println("Media Final: " + fafifo.calcularMedia());
        System.out.println("Situacao: " + (fafifo.aprovado() ? "Aprovado" : "Reprovado"));
    }
}
