
package br.com.DAO;


import DTO.Usuario;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    
    String sql = "delete from tbusuarios where id_usuario = ?";
    Conexao = ConexaoDAO.conector();
    
    
    
    
    
    public void editar(){
    
        String sql = "update tb_usuarios set usuario = ?, login = ?, senha = ? where id_usuario = ?";
                conexao = ConexaoDAO.conector();
                try {
                    Pst = conexao.prepareStatement(sql);
                    Pst.setInt(1, Usuario.get());
                    Pst.setString(2, usuario.getLogin());
                    Pst.setString(3, usuario.getSenha());
                    Pst.setString(4, usuario.getUsuario());
                            
                            
               int add = Pst.executeUpdate();
               if(add > 0 ){
               
                   conexao.close();
               }
                    
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"método editar" +  e);
        }
    }
    
    // classe onde vão ficar todos os métodos relacionados a consulta no banco
    
    Connection conexao = null;
    PreparedStatement Pst = null;
    ResultSet rs = null;

    public void adicionarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO usuarios ( id_Usuario, nome, email, nome_usuario, senha) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setString(4, usuario.getUsuario());
            
            stmt.executeUpdate();

        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }

    public List<UsuarioDTO> listarUsuarios() {
        String sql = "SELECT * FROM usuarios";
        List<UsuarioDTO> usuarios = new ArrayList<>();

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setIdUsuario(rs.getInt("id"));
                usuario.setUsuario(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public void editar(UsuarioDTO objUsuarioDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void logar(UsuarioDTO objusuarioDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

