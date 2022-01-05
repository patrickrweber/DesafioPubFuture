package DAO;

import DTO.DespesaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe de acesso à tabela Despesas do banco de dados
 *
 * @author Patrick Renan Weber
 */
public class DespesaDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<DespesaDTO> lista = new ArrayList<>();

    /**
     * Método de inserção das despesas no banco de dados
     *
     * @param objdespesadto Objeto da classe DespesaDTO
     */
    public void cadastrarDespesa(DespesaDTO objdespesadto) {
        String comando = "insert into despesas (valor, dataPagamento, dataPagamentoEsperado,"
                + " tipoDespesa, conta) values (?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objdespesadto.getValor_despesa());
            pstm.setString(2, objdespesadto.getDataPagamento_despesa());
            pstm.setString(3, objdespesadto.getDataPagamentoEsperado_despesa());
            pstm.setString(4, objdespesadto.getTipo_despesa());
            pstm.setInt(5, objdespesadto.getConta_despesa());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DespesaDAO Cadastrar" + erro);
        }
    }

    /**
     * Método que retorna uma lista da tabela Despesas do banco de dados
     *
     * @return lista
     */
    public ArrayList<DespesaDTO> PesquisarDespesa() {
        String comando = "select * from despesas";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                DespesaDTO objdespesadto = new DespesaDTO();
                objdespesadto.setId_despesa(rs.getInt("idDespesa"));
                objdespesadto.setValor_despesa(rs.getFloat("valor"));
                objdespesadto.setConta_despesa(rs.getInt("conta"));
                objdespesadto.setDataPagamento_despesa(rs.getString("dataPagamento"));
                objdespesadto.setDataPagamentoEsperado_despesa(rs.getString("dataPagamentoEsperado"));
                objdespesadto.setTipo_despesa(rs.getString("tipoDespesa"));

                lista.add(objdespesadto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DespesaDAO Pesquisar" + erro);
        }
        return lista;
    }

    /**
     * Método que altera os registros da tabela Despesas através do Id
     * especificado
     *
     * @param objdespesadto Objeto da classe ContaDTO
     */
    public void alterarDespesa(DespesaDTO objdespesadto) {
        String comando = "update despesas set valor = ?, dataPagamento = ?, dataPagamentoEsperado = ?,"
                + " conta = ?, tipoDespesa = ? where idDespesa = ?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objdespesadto.getValor_despesa());
            pstm.setString(2, objdespesadto.getDataPagamento_despesa());
            pstm.setString(3, objdespesadto.getDataPagamentoEsperado_despesa());
            pstm.setInt(4, objdespesadto.getConta_despesa());
            pstm.setString(5, objdespesadto.getTipo_despesa());
            pstm.setInt(6, objdespesadto.getId_despesa());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DespesaDAO Alterar" + erro);
        }
    }

    /**
     * Método que faz a exclusão de registros da tabela Despesas do banco de
     * dados
     *
     * @param objdespesadto Objeto da classe DespesaDTO
     */
    public void excluirDespesa(DespesaDTO objdespesadto) {
        String comando = "delete from despesas where idDespesa =?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setInt(1, objdespesadto.getId_despesa());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DespesaDAO Excluir" + erro);
        }
    }

}
