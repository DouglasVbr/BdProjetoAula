package br.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class ConexaoDAO {

    public static Connection conector() {

        java.sql.Connection conexao = null;

        String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/bdprojetoaula";

        String user = "root";

        String password = "root";

        try {
            Class.forName(driver);

            conexao = DriverManager.getConnection(url, user, password);

            return conexao;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "conexão falhou" + e.getMessage());

            return null;

        }

    }
}
