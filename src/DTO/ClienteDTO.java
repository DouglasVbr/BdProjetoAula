
package DTO;


public class ClienteDTO {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;

    // Construtores, getters e setters
    public ClienteDTO(String nome, String endereco, String telefone, String email, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getCpf() { return cpf; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    

    // Método toString para exibição (pode ser usado na lista)
    @Override
    public String toString() {
        return nome + " - " + cpf;
    }
}

