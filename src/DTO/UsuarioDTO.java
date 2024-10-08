
package DTO;


public class UsuarioDTO {
    private String Usuario;
    private String Login;
    private String senha;
    private int idUsuario;

    public UsuarioDTO(String Usuario, String Login, String senha, int idUsuario) {
        this.Usuario = Usuario;
        this.Login = Login;
        this.senha = senha;
        this.idUsuario = idUsuario;
    }

    

    

    // Getters e Setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    public String getUsuario() { return Usuario; }
    public void setUsuario(String Usuario) { this.Usuario = Usuario; }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    

    @Override
    public String toString() {
        return Usuario + " - " + idUsuario;
    }
}

