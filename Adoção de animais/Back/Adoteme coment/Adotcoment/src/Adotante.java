public class Adotante {
    // Declaração da classe Adotante, que representa uma pessoa que deseja adotar um animal.

    private int id; // ID do adotante - identificador único do adotante.
    private String nome; // Nome do adotante.
    private String endereco; // Endereço do adotante.
    private String telefone; // Telefone do adotante.
    private String email; // E-mail do adotante.

    // Novos atributos de preferências do adotante em relação ao animal a ser adotado:
    private int idadeMinima; // Idade mínima do animal preferido para adoção.
    private int idadeMaxima; // Idade máxima do animal preferido para adoção.
    private String sexoPreferido; // Sexo preferido do animal (masculino/feminino/indiferente).
    private String tipoPreferido; // Tipo de animal preferido (cachorro, gato, etc.).
    private String racaPreferida; // Raça preferida do animal.
    private boolean prefereTranquilo; // Prefere animais calmos?
    private boolean preferePasseios; // Prefere animais que gostam de passeios?

    // Construtor padrão da classe Adotante, que inicializa o objeto sem parâmetros.
    public Adotante() {}

    // Construtor com parâmetros que inicializa um objeto Adotante com informações fornecidas.
    public Adotante(String nome, String endereco, String telefone, String email, int idadeMinima, int idadeMaxima, 
                    String sexoPreferido, String tipoPreferido, String racaPreferida, 
                    boolean prefereTranquilo, boolean preferePasseios) {
        this.nome = nome; // Inicializa o nome do adotante com o valor passado como parâmetro.
        this.endereco = endereco; // Inicializa o endereço do adotante com o valor passado como parâmetro.
        this.telefone = telefone; // Inicializa o telefone do adotante com o valor passado como parâmetro.
        this.email = email; // Inicializa o e-mail do adotante com o valor passado como parâmetro.
        this.idadeMinima = idadeMinima; // Inicializa a idade mínima do animal preferido com o valor passado como parâmetro.
        this.idadeMaxima = idadeMaxima; // Inicializa a idade máxima do animal preferido com o valor passado como parâmetro.
        this.sexoPreferido = sexoPreferido; // Inicializa o sexo preferido do animal com o valor passado como parâmetro.
        this.tipoPreferido = tipoPreferido; // Inicializa o tipo de animal preferido com o valor passado como parâmetro.
        this.racaPreferida = racaPreferida; // Inicializa a raça preferida do animal com o valor passado como parâmetro.
        this.prefereTranquilo = prefereTranquilo; // Inicializa a preferência por animais tranquilos.
        this.preferePasseios = preferePasseios; // Inicializa a preferência por animais que gostam de passeios.
    }

    // Métodos getters e setters para os atributos básicos (id, nome, endereco, telefone, email).
    public int getId() { return id; } // Retorna o ID do adotante.
    public void setId(int id) { this.id = id; } // Define o ID do adotante.

    public String getNome() { return nome; } // Retorna o nome do adotante.
    public void setNome(String nome) { this.nome = nome; } // Define o nome do adotante.

    public String getEndereco() { return endereco; } // Retorna o endereço do adotante.
    public void setEndereco(String endereco) { this.endereco = endereco; } // Define o endereço do adotante.

    public String getTelefone() { return telefone; } // Retorna o telefone do adotante.
    public void setTelefone(String telefone) { this.telefone = telefone; } // Define o telefone do adotante.

    public String getEmail() { return email; } // Retorna o e-mail do adotante.
    public void setEmail(String email) { this.email = email; } // Define o e-mail do adotante.

    // Métodos getters e setters para as preferências do adotante (idade, sexo, tipo, raça, comportamentos).
    public int getIdadeMinima() { return idadeMinima; } // Retorna a idade mínima do animal preferido.
    public void setIdadeMinima(int idadeMinima) { this.idadeMinima = idadeMinima; } // Define a idade mínima do animal preferido.

    public int getIdadeMaxima() { return idadeMaxima; } // Retorna a idade máxima do animal preferido.
    public void setIdadeMaxima(int idadeMaxima) { this.idadeMaxima = idadeMaxima; } // Define a idade máxima do animal preferido.

    public String getSexoPreferido() { return sexoPreferido; } // Retorna o sexo preferido do animal.
    public void setSexoPreferido(String sexoPreferido) { this.sexoPreferido = sexoPreferido; } // Define o sexo preferido do animal.

    public String getTipoPreferido() { return tipoPreferido; } // Retorna o tipo de animal preferido.
    public void setTipoPreferido(String tipoPreferido) { this.tipoPreferido = tipoPreferido; } // Define o tipo de animal preferido.

    public String getRacaPreferida() { return racaPreferida; } // Retorna a raça preferida do animal.
    public void setRacaPreferida(String racaPreferida) { this.racaPreferida = racaPreferida; } // Define a raça preferida do animal.

    public boolean isPrefereTranquilo() { return prefereTranquilo; } // Retorna a preferência por animais tranquilos.
    public void setPrefereTranquilo(boolean prefereTranquilo) { this.prefereTranquilo = prefereTranquilo; } // Define a preferência por animais tranquilos.

    public boolean isPreferePasseios() { return preferePasseios; } // Retorna a preferência por animais que gostam de passeios.
    public void setPreferePasseios(boolean preferePasseios) { this.preferePasseios = preferePasseios; } // Define a preferência por animais que gostam de passeios.

    // Método para verificar se o adotante pode adotar um animal com base nas suas preferências.
    public boolean correspondeComAnimal(Animal animal) {
        boolean idadeCompatível = animal.getIdade() >= idadeMinima && animal.getIdade() <= idadeMaxima; // Verifica se a idade do animal é compatível com as preferências.
        boolean sexoCompatível = sexoPreferido.equalsIgnoreCase("Indiferente") || animal.getSexo().equalsIgnoreCase(sexoPreferido); // Verifica se o sexo do animal é compatível com a preferência.
        boolean tipoCompatível = tipoPreferido.equalsIgnoreCase("Indiferente") || animal.getTipo().equalsIgnoreCase(tipoPreferido); // Verifica se o tipo do animal é compatível com a preferência.
        boolean racaCompatível = racaPreferida.equalsIgnoreCase("Indiferente") || animal.getRaca().equalsIgnoreCase(racaPreferida); // Verifica se a raça do animal é compatível com a preferência.
        boolean comportamentoCompatível = (!prefereTranquilo || animal.isTranquilo()) && // Verifica se o comportamento do animal é compatível com a preferência do adotante.
                                           (!preferePasseios || animal.isGostaPassear());

        return idadeCompatível && sexoCompatível && tipoCompatível && racaCompatível && comportamentoCompatível; // Retorna verdadeiro se o animal corresponder a todas as preferências do adotante.
    }

    // Método toString para representar o objeto Adotante de forma legível.
    @Override
    public String toString() {
        return "Nome: " + this.nome + " - Telefone: " + this.telefone + // Exibe nome e telefone do adotante.
               " - Preferência: " + tipoPreferido + " " + racaPreferida + // Exibe o tipo e raça preferidos do adotante.
               " (Idade: " + idadeMinima + "-" + idadeMaxima + ", Sexo: " + sexoPreferido + ")"; // Exibe a faixa de idade e o sexo preferido.
    }
}
