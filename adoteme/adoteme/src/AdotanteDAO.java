import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdotanteDAO {
    
    public void inserir(Adotante adotante) {
       
        String sql = "INSERT INTO adotante (nome, endereco, telefone, email, idade_minima, idade_maxima, sexo_preferido, tipo_preferido, raca_preferida, prefere_tranquilo, prefere_passeios) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
               
            stmt.setString(1, adotante.getNome());
            stmt.setString(2, adotante.getEndereco());
            stmt.setString(3, adotante.getTelefone());
            stmt.setString(4, adotante.getEmail());
            stmt.setInt(5, adotante.getIdadeMinima());
            stmt.setInt(6, adotante.getIdadeMaxima());
            stmt.setString(7, adotante.getSexoPreferido());
            stmt.setString(8, adotante.getTipoPreferido());
            stmt.setString(9, adotante.getRacaPreferida());
            stmt.setBoolean(10, adotante.isPrefereTranquilo());
            stmt.setBoolean(11, adotante.isPreferePasseios());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }

    public List<Adotante> listarAdotantes() {
        String sql = "SELECT * FROM adotante";
        List<Adotante> adotantes = new ArrayList<>();

        try (Connection conn = conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Adotante adotante = new Adotante(
                rs.getString("nome"),
                rs.getString("endereco"),
                rs.getString("telefone"),
                rs.getString("email"),
                rs.getInt("idade_minima"),
                rs.getInt("idade_maxima"),
                rs.getString("sexo_preferido"),
                rs.getString("tipo_preferido"),
                rs.getString("raca_preferida"),
                rs.getBoolean("prefere_tranquilo"),
                rs.getBoolean("prefere_passeios"));
                
                adotantes.add(adotante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adotantes;
        
    }


}