package br.com.DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import br.com.Views.TelaPrincipal;
//import br.com.Views.TelaUsuario;
import br.com.Views.TeladeCadastrodeUsuários;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {
    
    // Atributos para conexão com o banco de dados
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    // Método para adicionar um usuário no banco
    public void adicionarUsuario(UsuarioDTO usuario) {
        String sql = "INSERT INTO tb_usuarios (id_usuario, nome, email, nome_usuario, senha) VALUES (?, ?, ?, ?, ?)";

        try {
            conexao = ConexaoDAO.conector(); // Conectar ao banco de dados
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, usuario.getIdUsuario());
            pst.setString(2, usuario.getLogin());
            
            pst.setString(3, usuario.getUsuario());
            pst.setString(4, usuario.getSenha());
            pst.setString(5, usuario.getPerfil());

            pst.executeUpdate(); // Executa a inserção no banco
            JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar usuário: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para editar um usuário no banco
    public void editarUsuario(UsuarioDTO usuario) {
        String sql = "UPDATE tb_usuarios SET nome = ?, email = ?, nome_usuario = ?, senha = ? WHERE id_usuario = ?";

        try {
            conexao = ConexaoDAO.conector();
            pst = conexao.prepareStatement(sql);
            
            pst.setString(1, usuario.getLogin());
            pst.setString(2, usuario.getUsuario());
            pst.setString(3, usuario.getSenha());
            pst.setInt(4, usuario.getIdUsuario());
            pst.setString(5, usuario.getPerfil());
            

            int atualizado = pst.executeUpdate();
            if (atualizado > 0) {
                JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar usuário.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao editar usuário: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para listar todos os usuários do banco
    public List<UsuarioDTO> listarUsuarios() {
        String sql = "SELECT * FROM tb_usuarios";
        List<UsuarioDTO> usuarios = new ArrayList<>();

        try {
            conexao = ConexaoDAO.conector();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                UsuarioDTO usuario = new UsuarioDTO();
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setUsuario(rs.getString("nome_usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setLogin("login");
                usuario.setPerfil("Perfil");
                
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return usuarios;
    }

    // Método para realizar o login de um usuário
    public boolean logar(UsuarioDTO objUsuarioDTO) {
        String sql = "SELECT * FROM tb_usuarios WHERE login = ? and senha = ?";
        conexao = ConexaoDAO.conector();
        try {
            // preparar a consulta no banco em função ao que foi inserido nas caixas de texto
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objUsuarioDTO.getLogin());
            pst.setString(2, objUsuarioDTO.getSenha());
            
            //execulta a query 
            rs = pst.executeQuery();

            if (rs.next()) {
                
                String Perfil = rs.getString(5);
                // Login bem-sucedido
                return true;
                
                // tratamento de perfil 
                
                
                  
                  
                
                
            } else {
                // Login falhou
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao logar: " + e.getMessage());
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Método para deletar um usuário
    public void deletarUsuario(int idUsuario) {
        String sql = "DELETE FROM tb_usuarios WHERE id_usuario = ?";
        try {
            conexao = ConexaoDAO.conector();
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idUsuario);

            int deletado = pst.executeUpdate();
            if (deletado > 0) {
                JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao deletar usuário.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar usuário: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (conexao != null) conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        
        
    }
}
