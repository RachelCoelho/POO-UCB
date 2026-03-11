import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, novoSalario;

        System.out.print("Digite o salario: ");
        salario = sc.nextDouble();

        novoSalario = salario * 1.25;

        System.out.println("Novo salario: " + novoSalario);
    }
}
