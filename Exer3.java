import java.util.Scanner;

public class Media ponderada de tres notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3;
        double p1, p2, p3;
        double media;

        System.out.print("Digite a nota 1: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o peso 1: ");
        p1 = sc.nextDouble();

        System.out.print("Digite a nota 2: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o peso 2: ");
        p2 = sc.nextDouble();

        System.out.print("Digite a nota 3: ");
        n3 = sc.nextDouble();
        System.out.print("Digite o peso 3: ");
        p3 = sc.nextDouble();

        media = (n1*p1 + n2*p2 + n3*p3) / (p1 + p2 + p3);

        System.out.println("Media ponderada: " + media);
    }
}