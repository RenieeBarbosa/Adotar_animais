import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 

public class conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/adoteme";
    
    private static final String USER = "postgres";  
    private static final String PASSWORD = "1234"; 
    

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados", e);
        }
    }
   
}
