public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidadeEmEstoque);
    }

    public void adicionarAoEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
    }

    public void removerDoEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }
}
