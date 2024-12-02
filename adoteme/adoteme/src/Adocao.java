import java.util.Date; 

public class Adocao { 

    private int id; 
    private Animal animal; 
    private Adotante adotante; 
    private Date dataAdocao; 

    
    public Adocao() {} 

    
    public Adocao(Animal animal, Adotante adotante) {
        
        if (animal != null && adotante != null && animal.correspondeComAdotante(adotante)) {
            this.animal = animal; 
            this.adotante = adotante; 
            this.dataAdocao = new Date(); 
        } else {
            
            throw new IllegalArgumentException("O animal e o adotante não são compatíveis.");
        }
    }

    
    public int getId() { return id; } 
    public void setId(int id) { this.id = id; } 
    public Animal getAnimal() { return animal; } 
    public void setAnimal(Animal animal) { this.animal = animal; } 
    public Adotante getAdotante() { return adotante; } 
    public void setAdotante(Adotante adotante) { this.adotante = adotante; } 
    public Date getDataAdocao() { return dataAdocao; } 
    public void setDataAdocao(Date dataAdocao) { this.dataAdocao = dataAdocao; } 

    
    @Override
    public String toString() {
        
        String animalNome = (this.animal != null) ? this.animal.getTipo() + " - " + this.animal.getRaca() : "Animal não especificado";
        
        String adotanteNome = (this.adotante != null) ? this.adotante.getNome() : "Adotante não especificado";
        
        return "Animal: " + animalNome + "  -  Adotante: " + adotanteNome + "  -  Data: " + this.dataAdocao;
    }
}