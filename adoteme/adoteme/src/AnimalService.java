import java.util.List;

public class AnimalService {
    private AnimalDAO animalDAO;

    public AnimalService() {
        this.animalDAO = new AnimalDAO();
    }

    public void adicionarAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("O animal não pode ser nulo.");
            
        }

        animalDAO.inserir(animal);
    }
    
    public List<Animal> listarTodosAnimais() {
        return animalDAO.listarTodos();
    }
}
