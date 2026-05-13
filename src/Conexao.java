import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Dados de conexão
    private final String url = "jdbc:mysql://localhost:3306/aula_java";
    private final String usuario = "root";
    private final String senha = "1234";

    public Connection conectar() {
        Connection conn = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            
            conn = DriverManager.getConnection(url, usuario, senha);
            
        } catch (ClassNotFoundException e) {
            System.err.println("Erro: Driver JDBC não encontrado! " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro: Falha na conexão com o banco! " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
        
        return conn;
    }
}
