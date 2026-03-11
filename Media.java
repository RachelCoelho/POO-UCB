import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.println("A media e: " + media);
    }
}
