import java.util.Scanner;

public class Soma de quatro números inteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, soma;

        System.out.print("Digite o primeiro numero: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        n2 = sc.nextInt();

        System.out.print("Digite o terceiro numero: ");
        n3 = sc.nextInt();

        System.out.print("Digite o quarto numero: ");
        n4 = sc.nextInt();

        soma = n1 + n2 + n3 + n4;

        System.out.println("A soma e: " + soma);
    }
}