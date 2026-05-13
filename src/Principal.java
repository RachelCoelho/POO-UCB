import java.sql.Connection;

public class Principal {
    public static void main(String[] args) {
        // Instancia a classe de conexão
        Conexao objConexao = new Conexao();
        
        // Chama o método e armazena o resultado
        Connection con = objConexao.conectar();
        
        // Verificação lógica
        if (con != null) {
            System.out.println("Conexão realizada com sucesso!");
            
            
            try {
                con.close();
            } catch (Exception e) {
                System.err.println("Erro ao fechar conexão: " + e.getMessage());
            }
        } else {
            System.out.println("Falha ao conectar ao banco de dados.");
        }
    }
}
