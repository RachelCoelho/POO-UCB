public class Main {

    public static void main(String[] args) {

        Retangulo r = new Retangulo(5, 3);
        Circulo c = new Circulo(2);

        System.out.println("=== Retângulo ===");
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        System.out.println("\n=== Círculo ===");
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}
