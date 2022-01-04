package DAO;

import DTO.ReceitaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReceitaDAO {       //Metódos do CRUD
    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ReceitaDTO> lista = new ArrayList<>();
    public void cadastrarReceita(ReceitaDTO objreceitadto) {
        String comando = "insert into receitas (valor, dataRecebimento, dataRecebimentoEsperado,"+
                         " descricao, conta, tipoReceita) values (?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objreceitadto.getValor_receita());
            pstm.setString(2, objreceitadto.getDataRecebimento_receita());
            pstm.setString(3, objreceitadto.getDataRecebimentoEsperado_receita());
            pstm.setString(4, objreceitadto.getDescricao_receita());
            pstm.setInt(5, objreceitadto.getConta_receita());
            pstm.setString(6, objreceitadto.getTipo_receita());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Cadastrar" + erro);
        }
    } //Insere novas receitas
    public ArrayList<ReceitaDTO> PesquisarReceita() {
        String comando = "select * from receitas";
        conexao = new ConexaoDAO().conectaBD();
        
        try {
            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ReceitaDTO objreceitadto = new ReceitaDTO();
                objreceitadto.setId_receita(rs.getInt("idReceita"));
                objreceitadto.setValor_receita(rs.getFloat("valor"));
                objreceitadto.setConta_receita(rs.getInt("conta"));
                objreceitadto.setDataRecebimento_receita(rs.getString("dataRecebimento"));
                objreceitadto.setDataRecebimentoEsperado_receita(rs.getString("dataRecebimentoEsperado"));
                objreceitadto.setDescricao_receita(rs.getString("descricao"));
                objreceitadto.setTipo_receita(rs.getString("tipoReceita"));

                lista.add(objreceitadto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Pesquisar" + erro);
        }
        return lista;
    }       //Retorna a lista de todas receitas
    public void alterarReceita(ReceitaDTO objreceitadto){
        String comando = "update receitas set valor = ?, dataRecebimento = ?, dataRecebimentoEsperado = ?," +
                         " descricao = ?, conta = ?, tipoReceita = ? where idReceita = ?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objreceitadto.getValor_receita());
            pstm.setString(2, objreceitadto.getDataRecebimento_receita());
            pstm.setString(3, objreceitadto.getDataRecebimentoEsperado_receita());
            pstm.setString(4, objreceitadto.getDescricao_receita());
            pstm.setInt(5, objreceitadto.getConta_receita());
            pstm.setString(6, objreceitadto.getTipo_receita());
            pstm.setInt(7, objreceitadto.getId_receita());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Alterar" + erro);
        }
    }   //Altera as receitas
    public void excluirReceita(ReceitaDTO objreceitadto){
        String comando = "delete from receitas where idReceita =?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setInt(1, objreceitadto.getId_receita());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Excluir" + erro);
        }
    }   //Exclui as receitas

}
