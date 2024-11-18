public class Voluntario {
    // Declaração da classe Voluntario, que representa um voluntário com informações pessoais e área de atuação.

    private int id; // ID do voluntário - identificador único para o voluntário.
    private String nome; // Nome do voluntário.
    private String endereco; // Endereço do voluntário.
    private String telefone; // Telefone do voluntário.
    private String email; // E-mail do voluntário.
    private String areaAtuacao; // Área de atuação do voluntário (exemplo: cuidado de animais).

    // Construtor padrão da classe Voluntario, que inicializa o objeto sem parâmetros.
    public Voluntario(String nomeVoluntario, String enderecoVoluntario, String telefoneVoluntario, String emailVoluntario) {}

    // Construtor com parâmetros para inicializar um objeto Voluntario com as informações fornecidas.
    public Voluntario(String nome, String endereco, String telefone, String email, String areaAtuacao) {
        this.nome = nome; // Inicializa o nome do voluntário com o valor passado como parâmetro.
        this.endereco = endereco; // Inicializa o endereço do voluntário com o valor passado como parâmetro.
        this.telefone = telefone; // Inicializa o telefone do voluntário com o valor passado como parâmetro.
        this.email = email; // Inicializa o e-mail do voluntário com o valor passado como parâmetro.
        this.areaAtuacao = areaAtuacao; // Inicializa a área de atuação do voluntário com o valor passado como parâmetro.
    }

    // Métodos getters e setters para acessar e modificar os atributos da classe.

    public int getId() { 
        return id; // Retorna o ID do voluntário.
    }
    public void setId(int id) { 
        this.id = id; // Define o ID do voluntário.
    }

    public String getNome() { 
        return nome; // Retorna o nome do voluntário.
    }
    public void setNome(String nome) { 
        this.nome = nome; // Define o nome do voluntário.
    }

    public String getEndereco() { 
        return endereco; // Retorna o endereço do voluntário.
    }
    public void setEndereco(String endereco) { 
        this.endereco = endereco; // Define o endereço do voluntário.
    }

    public String getTelefone() { 
        return telefone; // Retorna o telefone do voluntário.
    }
    public void setTelefone(String telefone) { 
        this.telefone = telefone; // Define o telefone do voluntário.
    }

    public String getEmail() { 
        return email; // Retorna o e-mail do voluntário.
    }
    public void setEmail(String email) { 
        this.email = email; // Define o e-mail do voluntário.
    }

    public String getAreaAtuacao() { 
        return areaAtuacao; // Retorna a área de atuação do voluntário.
    }
    public void setAreaAtuacao(String areaAtuacao) { 
        this.areaAtuacao = areaAtuacao; // Define a área de atuação do voluntário.
    }

    // Método toString para representar o objeto Voluntario de forma legível.
    @Override
    public String toString() {
        // Retorna uma representação legível do voluntário, incluindo nome, telefone e área de atuação.
        return "Nome: " + this.nome + "  -  Telefone: " + this.telefone + "  -  Área de atuação: " + this.areaAtuacao;
    }
}
