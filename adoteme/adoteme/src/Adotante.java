public class Adotante {
    

    private int id; 
    private String nome, endereco, telefone, email; 

    
    private int idadeMinima, idadeMaxima; 
    private String sexoPreferido, tipoPreferido, racaPreferida; 
    private boolean prefereTranquilo, preferePasseios; 

    
    public Adotante() {}

    
    public Adotante(String nome, String endereco, String telefone, String email, int idadeMinima, int idadeMaxima, 
                    String sexoPreferido, String tipoPreferido, String racaPreferida, 
                    boolean prefereTranquilo, boolean preferePasseios) {
        this.nome = nome; 
        this.endereco = endereco; 
        this.telefone = telefone; 
        this.email = email; 
        this.idadeMinima = idadeMinima; 
        this.idadeMaxima = idadeMaxima; 
        this.sexoPreferido = sexoPreferido; 
        this.tipoPreferido = tipoPreferido; 
        this.racaPreferida = racaPreferida; 
        this.prefereTranquilo = prefereTranquilo; 
        this.preferePasseios = preferePasseios; 
    }

    
    public int getId() { return id; } 
    public void setId(int id) { this.id = id; } 

    public String getNome() { return nome; } 
    public void setNome(String nome) { this.nome = nome; } 

    public String getEndereco() { return endereco; } 
    public void setEndereco(String endereco) { this.endereco = endereco; } 

    public String getTelefone() { return telefone; } 
    public void setTelefone(String telefone) { this.telefone = telefone; } 

    public String getEmail() { return email; } 
    public void setEmail(String email) { this.email = email; } 

   
    public int getIdadeMinima() { return idadeMinima; } 
    public void setIdadeMinima(int idadeMinima) { this.idadeMinima = idadeMinima; } 

    public int getIdadeMaxima() { return idadeMaxima; } 
    public void setIdadeMaxima(int idadeMaxima) { this.idadeMaxima = idadeMaxima; } 

    public String getSexoPreferido() { return sexoPreferido; } 
    public void setSexoPreferido(String sexoPreferido) { this.sexoPreferido = sexoPreferido; } 

    public String getTipoPreferido() { return tipoPreferido; } 
    public void setTipoPreferido(String tipoPreferido) { this.tipoPreferido = tipoPreferido; } 

    public String getRacaPreferida() { return racaPreferida; } 
    public void setRacaPreferida(String racaPreferida) { this.racaPreferida = racaPreferida; } 

    public boolean isPrefereTranquilo() { return prefereTranquilo; } 
    public void setPrefereTranquilo(boolean prefereTranquilo) { this.prefereTranquilo = prefereTranquilo; } 

    public boolean isPreferePasseios() { return preferePasseios; } 
    public void setPreferePasseios(boolean preferePasseios) { this.preferePasseios = preferePasseios; }

    
    public boolean correspondeComAnimal(Animal animal) {
        boolean idadeCompatível = animal.getIdade() >= idadeMinima && animal.getIdade() <= idadeMaxima; 
        boolean sexoCompatível = sexoPreferido.equalsIgnoreCase("Indiferente") || animal.getSexo().equalsIgnoreCase(sexoPreferido); 
        boolean tipoCompatível = tipoPreferido.equalsIgnoreCase("Indiferente") || animal.getTipo().equalsIgnoreCase(tipoPreferido);
        boolean racaCompatível = racaPreferida.equalsIgnoreCase("Indiferente") || animal.getRaca().equalsIgnoreCase(racaPreferida); 
        boolean comportamentoCompatível = (!prefereTranquilo || animal.isTranquilo()) && 
                                           (!preferePasseios || animal.isGostaPassear());

        return idadeCompatível && sexoCompatível && tipoCompatível && racaCompatível && comportamentoCompatível; 
    }

    
    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Telefone: " + this.telefone + 
               " - Preferência: " + tipoPreferido + " " + racaPreferida + 
               " (Idade: " + idadeMinima + "-" + idadeMaxima + ", Sexo: " + sexoPreferido + ")"; 
    }
}
