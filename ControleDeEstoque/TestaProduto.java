public class TestaProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto("Monitor 24'", 900, 10);
        Produto p2 = new Produto("CPU", 300, 25);
        Produto p3 = new Produto("Mouse", 30.5, 50);

        // Exibir todos os produtos
        p1.exibirInformacoes();
        System.out.println("*******************************");

        p2.exibirInformacoes();
        System.out.println("*******************************");

        p3.exibirInformacoes();
        System.out.println("*******************************");

        // Testando operações no p1
        p1.adicionarAoEstoque(5);
        p1.exibirInformacoes();

        System.out.println("*******************************");

        p1.removerDoEstoque(8);
        p1.exibirInformacoes();

        System.out.println("*******************************");

        p1.removerDoEstoque(50);
    }
}
