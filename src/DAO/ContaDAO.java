package DAO;

import DTO.ContaDTO;
import DTO.ReceitaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe de acesso à tabela Contas do banco de dados
 * @author Patrick Renan Weber
 */
public class ContaDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ContaDTO> lista = new ArrayList<>();

    /**
     * Método de inserção das contas no banco de dados
     *
     * @param objcontadto Objeto da classe ContaDTO
     */
    public void cadastrarConta(ContaDTO objcontadto) {
        String comando = "insert into contas (saldo, tipoConta, instituicaoFinanceira) values (?, ?, ?)";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objcontadto.getSaldo_conta());
            pstm.setString(2, objcontadto.getTipo_conta());
            pstm.setString(3, objcontadto.getInstituicao());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Cadastrar" + erro);
        }
    }

    /**
     * Método que retorna uma lista da tabela Contas do banco de dados
     * @return lista
     */
    public ArrayList<ContaDTO> PesquisarConta() {
        String comando = "select * from contas";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ContaDTO objcontadto = new ContaDTO();
                objcontadto.setId_conta(rs.getInt("idContas"));
                objcontadto.setSaldo_conta(rs.getFloat("saldo"));
                objcontadto.setTipo_conta(rs.getString("tipoConta"));
                objcontadto.setInstituicao(rs.getString("instituicaoFinanceira"));

                lista.add(objcontadto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Pesquisar" + erro);
        }
        return lista;
    }       

    /**
     * Método que altera os registros da tabela Contas através do Id
     * especificado
     * 
     * @param objcontadto Objeto da classe ContaDTO
     */
    public void alterarConta(ContaDTO objcontadto) {
        String comando = "update contas set saldo = ?, tipoConta = ?, instituicaoFinanceira = ? where idContas = ?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objcontadto.getSaldo_conta());
            pstm.setString(2, objcontadto.getTipo_conta());
            pstm.setString(3, objcontadto.getInstituicao());
            pstm.setInt(4, objcontadto.getId_conta());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Alterar" + erro);
        }
    }

    /**
     * Método que faz a exclusão de registros da tabela Contas do banco de dados
     *
     * @param objcontadto Objeto da classe ContaDTO
     */
    public void excluirConta(ContaDTO objcontadto) {
        String comando = "delete from contas where idContas =?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setInt(1, objcontadto.getId_conta());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Excluir" + erro);
        }
    }

}
