public class Animal {  // Declaração da classe Animal, que representa um animal.

    private int id; // ID do animal, usado para identificar o animal de forma única.
    private String tipo; // Tipo do animal (cachorro, gato, etc.).
    private String raca; // Raça do animal.
    private String sexo; // Sexo do animal.
    private int idade; // Idade do animal.
    private boolean tranquilo; // Indica se o animal é calmo (true ou false).
    private boolean gostaPassear; // Indica se o animal gosta de passear (true ou false).

    // Construtor padrão
    public Animal() {} // Construtor vazio, usado para criar um objeto Animal sem passar valores.

    // Construtor com parâmetros
    public Animal(String tipo, String raca, String sexo, int idade, boolean tranquilo, boolean gostaPassear) {
        this.tipo = tipo; // Atribui o tipo passado como parâmetro à variável tipo.
        this.raca = raca; // Atribui a raça passada como parâmetro à variável raca.
        this.sexo = sexo; // Atribui o sexo passado como parâmetro à variável sexo.
        this.idade = idade; // Atribui a idade passada como parâmetro à variável idade.
        this.tranquilo = tranquilo; // Atribui o valor de tranquilo passado como parâmetro à variável tranquilo.
        this.gostaPassear = gostaPassear; // Atribui o valor de gostaPassear passado como parâmetro à variável gostaPassear.
    }

    // Getters e setters
    public int getId() { return id; } // Método getter para obter o valor do id.
    public void setId(int id) { this.id = id; } // Método setter para definir o valor do id.
    
    public String getTipo() { return tipo; } // Método getter para obter o valor do tipo.
    public void setTipo(String tipo) { this.tipo = tipo; } // Método setter para definir o valor do tipo.
    
    public String getRaca() { return raca; } // Método getter para obter o valor da raça.
    public void setRaca(String raca) { this.raca = raca; } // Método setter para definir o valor da raça.
    
    public String getSexo() { return sexo; } // Método getter para obter o valor do sexo.
    public void setSexo(String sexo) { this.sexo = sexo; } // Método setter para definir o valor do sexo.
    
    public int getIdade() { return idade; } // Método getter para obter o valor da idade.
    public void setIdade(int idade) { this.idade = idade; } // Método setter para definir o valor da idade.
    
    public boolean isTranquilo() { return tranquilo; } // Método getter para obter o valor de tranquilo.
    public void setTranquilo(boolean tranquilo) { this.tranquilo = tranquilo; } // Método setter para definir o valor de tranquilo.
    
    public boolean isGostaPassear() { return gostaPassear; } // Método getter para obter o valor de gostaPassear.
    public void setGostaPassear(boolean gostaPassear) { this.gostaPassear = gostaPassear; } // Método setter para definir o valor de gostaPassear.

    // Método toString para exibir informações do animal
    @Override
    public String toString() {
        return "Tipo: " + tipo + " - Raça: " + raca + " - Sexo: " + sexo +
               " - Idade: " + idade + " - Calmo: " + (tranquilo ? "Sim" : "Não") + // Exibe se o animal é calmo ou não.
               " - Gosta de passear: " + (gostaPassear ? "Sim" : "Não"); // Exibe se o animal gosta de passear ou não.
    }

    // Método para verificar compatibilidade com adotante
    public boolean correspondeComAdotante(Adotante adotante) {
        boolean idadeCompatível = idade >= adotante.getIdadeMinima() && idade <= adotante.getIdadeMaxima(); 
        // Verifica se a idade do animal está dentro da faixa de idade do adotante.

        boolean sexoCompatível = adotante.getSexoPreferido().equalsIgnoreCase("Indiferente") || sexo.equalsIgnoreCase(adotante.getSexoPreferido());
        // Verifica se o sexo do animal é compatível com o preferido pelo adotante (ou "Indiferente").

        boolean tipoCompatível = adotante.getTipoPreferido().equalsIgnoreCase("Indiferente") || tipo.equalsIgnoreCase(adotante.getTipoPreferido());
        // Verifica se o tipo do animal (cachorro, gato, etc.) é compatível com o preferido pelo adotante (ou "Indiferente").

        boolean racaCompatível = adotante.getRacaPreferida().equalsIgnoreCase("Indiferente") || raca.equalsIgnoreCase(adotante.getRacaPreferida());
        // Verifica se a raça do animal é compatível com a preferida pelo adotante (ou "Indiferente").

        boolean comportamentoCompatível = (!adotante.isPrefereTranquilo() || tranquilo) && 
                                          (!adotante.isPreferePasseios() || gostaPassear); 
        // Verifica se o comportamento do animal é compatível com as preferências do adotante (tranquilo ou gosta de passear).

        return idadeCompatível && sexoCompatível && tipoCompatível && racaCompatível && comportamentoCompatível;
        // Retorna true se todas as condições forem verdadeiras, ou seja, o animal é compatível com o adotante.
    }
}
