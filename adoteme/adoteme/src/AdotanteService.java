import java.util.List;

public class AdotanteService {
    private AdotanteDAO adotanteDAO; 

    public AdotanteService() {
        this.adotanteDAO = new AdotanteDAO();
    }

    public void adicionarAdotante(Adotante adotante) {
        if (adotante == null) {
            throw new IllegalArgumentException("O adotante não pode ser nulo.");
            
        }

       
        adotanteDAO.inserir(adotante);
    }
    

        
    
    public List<Adotante> listarTodosAdotantes() {
        return adotanteDAO.listarAdotantes();
    }
}
