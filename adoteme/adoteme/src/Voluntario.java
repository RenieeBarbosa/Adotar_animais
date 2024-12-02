public class Voluntario {
    

    private int id; 
    private String nome, endereco, telefone, email, areaAtuacao; 

    
    public Voluntario() {}

    
    public Voluntario(String nome, String endereco, String telefone, String email, String areaAtuacao) {
        this.nome = nome; 
        this.endereco = endereco; 
        this.telefone = telefone; 
        this.email = email; 
        this.areaAtuacao = areaAtuacao;
    }

    

    public int getId() { 
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public String getEndereco() { 
        return endereco; 
    }
    public void setEndereco(String endereco) { 
        this.endereco = endereco;
    }

    public String getTelefone() { 
        return telefone; 
    }
    public void setTelefone(String telefone) { 
        this.telefone = telefone; 
    }

    public String getEmail() { 
        return email; 
    }
    public void setEmail(String email) { 
        this.email = email; 
    }

    public String getAreaAtuacao() { 
        return areaAtuacao; 
    }
    public void setAreaAtuacao(String areaAtuacao) { 
        this.areaAtuacao = areaAtuacao; 
    }

    
    @Override
    public String toString() {
        
        return "Nome: " + this.nome + "  -  Telefone: " + this.telefone + "  -  Área de atuação: " + this.areaAtuacao;
    }
}
