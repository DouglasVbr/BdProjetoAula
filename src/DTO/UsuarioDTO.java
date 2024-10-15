
package DTO;


public class UsuarioDTO {
    private String Usuario;
    private String Login;
    private String senha;
    private int idUsuario;
    private String Perfil;

    public UsuarioDTO(String Usuario, String Login, String senha, int idUsuario, String Perfil) {
        this.Usuario = Usuario;
        this.Login = Login;
        this.senha = senha;
        this.idUsuario = idUsuario;
        this.Perfil = Perfil;
    }

    public UsuarioDTO() {
         
    }

    public UsuarioDTO(String nome, String email, String nomeDeUsuario, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UsuarioDTO(String string, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    public String getPerfil() {
        return Perfil;
    }

    // Getters e Setters
    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

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

