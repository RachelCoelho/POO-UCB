import java.util.Scanner;

public class Salario com percentual de aumento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, percentual, aumento, novoSalario;

        System.out.print("Digite o salario: ");
        salario = sc.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        percentual = sc.nextDouble();

        aumento = salario * (percentual / 100);
        novoSalario = salario + aumento;

        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salario: " + novoSalario);
    }
}