package DAO;

import DTO.ReceitaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ReceitaDAO {

    Connection conexao;
    PreparedStatement pstm;

    public void cadastrarReceita(ReceitaDTO objreceitadto) {
        String comando = "insert into receitas (valor, dataRecebimento, dataRecebimentoEsperado, descricao, conta, tipoReceita) values (?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1,objreceitadto.getValor_receita());
            pstm.setString(2,objreceitadto.getDataRecebimento_receita());
            pstm.setString(3, objreceitadto.getDataRecebimentoEsperado_receita());
            pstm.setString(4, objreceitadto.getDescricao_receita());
            pstm.setInt(5, objreceitadto.getConta_receita());
            pstm.setString(6, objreceitadto.getTipo_receita());
            
            pstm.execute();
            pstm.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO" + erro);
        }
    }
 

}
