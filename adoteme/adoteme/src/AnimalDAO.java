import java.sql.*; 
import java.util.ArrayList; 
import java.util.List; 

public class AnimalDAO {
    public void inserir(Animal animal) {
       
        String sql = "INSERT INTO animal (tipo, raca, sexo, idade, tranquilo, gosta_passear, adotado) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                
            stmt.setString(1, animal.getTipo());
            stmt.setString(2, animal.getRaca());
            stmt.setString(3, animal.getSexo());
            stmt.setInt(4, animal.getIdade());
            stmt.setBoolean(5, animal.isTranquilo());
            stmt.setBoolean(6, animal.isGostaPassear());
            stmt.setBoolean(7, animal.isAdotado());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
    
    
    public List<Animal> listarTodos() {
        String sql = "SELECT * FROM animal";
        List<Animal> animais = new ArrayList<>();

        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Animal animal = new Animal();
                animal.setId(rs.getInt("id"));
                animal.setTipo(rs.getString("tipo"));
                animal.setRaca(rs.getString("raca"));
                animal.setSexo(rs.getString("sexo"));
                animal.setIdade(rs.getInt("idade"));
                animal.setTranquilo(rs.getBoolean("tranquilo"));
                animal.setGostaPassear(rs.getBoolean("gosta_passear"));
                animal.setAdotado(rs.getBoolean("adotado"));
                animais.add(animal);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return animais;
        
    }
}
