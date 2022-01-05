package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {               //Classe que faz a conexão do MySQL com Java
    
    public Connection conectaBD(){      //Método que conecta o banco de dados
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/desafiopubfuture?user=root&password=";
            conexao = DriverManager.getConnection(url);     //Define a url para conexão do banco local e adicionar o driver
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + e.getMessage());
        }
        return conexao;
    }   
}
