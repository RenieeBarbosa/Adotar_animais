import java.util.Date; // Importa a classe Date do pacote java.util para manipulação de datas

public class Adocao { // Declaração da classe Adocao

    private int id; // ID da adoção
    private Animal animal; // Animal que foi adotado
    private Adotante adotante; // Adotante que adotou o animal
    private Date dataAdocao; // Data em que a adoção ocorreu

    // Construtor padrão
    public Adocao() {} // Permite criar um objeto Adocao sem parâmetros

    // Construtor com parâmetros, já atribui a data de adoção automaticamente
    public Adocao(Animal animal, Adotante adotante) {
        // Verifica se animal e adotante não são nulos e se são compatíveis
        if (animal != null && adotante != null && animal.correspondeComAdotante(adotante)) {
            this.animal = animal; // Atribui o animal à variável de instância
            this.adotante = adotante; // Atribui o adotante à variável de instância
            this.dataAdocao = new Date(); // Define a data de adoção como a data e hora atuais
        } else {
            // Lança uma exceção se animal e adotante não forem compatíveis
            throw new IllegalArgumentException("O animal e o adotante não são compatíveis.");
        }
    }

    // Métodos getters e setters
    public int getId() { return id; } // Retorna o ID da adoção
    public void setId(int id) { this.id = id; } // Define o ID da adoção
    public Animal getAnimal() { return animal; } // Retorna o animal adotado
    public void setAnimal(Animal animal) { this.animal = animal; } // Define o animal adotado
    public Adotante getAdotante() { return adotante; } // Retorna o adotante
    public void setAdotante(Adotante adotante) { this.adotante = adotante; } // Define o adotante
    public Date getDataAdocao() { return dataAdocao; } // Retorna a data da adoção
    public void setDataAdocao(Date dataAdocao) { this.dataAdocao = dataAdocao; } // Define a data da adoção

    // Método toString para exibir as informações de adoção
    @Override
    public String toString() {
        // Obtém o nome do animal ou uma mensagem padrão se não estiver especificado
        String animalNome = (this.animal != null) ? this.animal.getTipo() + " - " + this.animal.getRaca() : "Animal não especificado";
        // Obtém o nome do adotante ou uma mensagem padrão se não estiver especificado
        String adotanteNome = (this.adotante != null) ? this.adotante.getNome() : "Adotante não especificado";
        // Retorna uma string formatada com as informações da adoção
        return "Animal: " + animalNome + "  -  Adotante: " + adotanteNome + "  -  Data: " + this.dataAdocao;
    }
}