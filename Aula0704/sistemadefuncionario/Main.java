public class Main {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Ana", 25);
        Funcionario f = new Funcionario("Carlos", 30, 2500);
        Gerente g = new Gerente("Marcos", 40, 5000, "TI");

        System.out.println("=== Pessoa ===");
        p.exibirDados();

        System.out.println("\n=== Funcionário ===");
        f.exibirDados();

        System.out.println("\n=== Gerente ===");
        g.exibirDados();
    }
}
