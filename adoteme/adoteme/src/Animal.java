public class Animal {  

    private int id, idade; 
    private String tipo, raca, sexo; 
    private boolean tranquilo, gostaPassear, adotado; 

    
    public Animal() {} 
    
    public Animal(String tipo, String raca, String sexo, int idade, boolean tranquilo, boolean gostaPassear) {
        this.tipo = tipo; 
        this.raca = raca; 
        this.sexo = sexo; 
        this.idade = idade; 
        this.tranquilo = tranquilo; 
        this.gostaPassear = gostaPassear; 
    }

    
    public int getId() { return id; } 
    public void setId(int id) { this.id = id; } 
    
    public String getTipo() { return tipo; } 
    public void setTipo(String tipo) { this.tipo = tipo; } 
    
    public String getRaca() { return raca; } 
    public void setRaca(String raca) { this.raca = raca; } 
    
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; } 
    
    public int getIdade() { return idade; } 
    public void setIdade(int idade) { this.idade = idade; } 
    
    public boolean isTranquilo() { return tranquilo; } 
    public void setTranquilo(boolean tranquilo) { this.tranquilo = tranquilo; } 
    
    public boolean isGostaPassear() { return gostaPassear; } 
    public void setGostaPassear(boolean gostaPassear) { this.gostaPassear = gostaPassear; } 
    
    public boolean isAdotado() {
            return adotado;
        }

    public void setAdotado(boolean adotado) {
        this.adotado = adotado;
    }
    
    
    @Override
    public String toString() {
        return "Tipo: " + tipo + " - Raça: " + raca + " - Sexo: " + sexo +
               " - Idade: " + idade + " - Calmo: " + (tranquilo ? "Sim" : "Não") + 
               " - Gosta de passear: " + (gostaPassear ? "Sim" : "Não"); 
               
    }

    
    public boolean correspondeComAdotante(Adotante adotante) {
        boolean idadeCompatível = idade >= adotante.getIdadeMinima() && idade <= adotante.getIdadeMaxima(); 
        

        boolean sexoCompatível = adotante.getSexoPreferido().equalsIgnoreCase("Indiferente") || sexo.equalsIgnoreCase(adotante.getSexoPreferido());
        

        boolean tipoCompatível = adotante.getTipoPreferido().equalsIgnoreCase("Indiferente") || tipo.equalsIgnoreCase(adotante.getTipoPreferido());
        

        boolean racaCompatível = adotante.getRacaPreferida().equalsIgnoreCase("Indiferente") || raca.equalsIgnoreCase(adotante.getRacaPreferida());
        

        boolean comportamentoCompatível = (!adotante.isPrefereTranquilo() || tranquilo) && 
                                          (!adotante.isPreferePasseios() || gostaPassear); 
        

        return idadeCompatível && sexoCompatível && tipoCompatível && racaCompatível && comportamentoCompatível;
        
    }

    
}
