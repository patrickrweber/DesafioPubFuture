/*
 * The MIT License
 *
 * Copyright 2022 Patrick Renan Weber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package DAO;

import DTO.ReceitaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * Classe de acesso à tabela receitas do banco de dados
 *
 * @author Patrick Renan Weber
 */
public class ReceitaDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ReceitaDTO> lista = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

    /**
     * Método de inserção das receitas no banco de dados
     *
     * @param objreceitadto Objeto da classe ReceitaDTO
     */
    public void cadastrarReceita(ReceitaDTO objreceitadto) {
        String comando = "insert into receitas (valor, dataRecebimento, dataRecebimentoEsperado,"
                + " descricao, contas_idContas, tipoReceita) values (?, ?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conectaBD();

        Date dataRecebimento = Date.valueOf(objreceitadto.getDataRecebimento_receita());
        Date dataRecebimentoEsperado = Date.valueOf(objreceitadto.getDataRecebimentoEsperado_receita());

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objreceitadto.getValor_receita());
            pstm.setDate(2, dataRecebimento);
            pstm.setDate(3, dataRecebimentoEsperado);
            pstm.setString(4, objreceitadto.getDescricao_receita());
            pstm.setInt(5, objreceitadto.getConta_receita());
            pstm.setString(6, objreceitadto.getTipo_receita());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Cadastrar " + erro);
        }
    }

    /**
     * Método que retorna uma lista da tabela receitas do banco de dados
     *
     * @return lista
     */
    public ArrayList<ReceitaDTO> PesquisarReceita() {
        String comando = "select * from receitas";
        conexao = new ConexaoDAO().conectaBD();

        try {

            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Date dataRec = rs.getDate("dataRecebimento");
                LocalDate dataRecebimento = dataRec.toLocalDate();
                Date dataRecEsp = rs.getDate("dataRecebimentoEsperado");
                LocalDate dataRecebimentoEsperado = dataRecEsp.toLocalDate();
                ReceitaDTO objreceitadto = new ReceitaDTO();
                objreceitadto.setId_receita(rs.getInt("idReceitas"));
                objreceitadto.setValor_receita(rs.getFloat("valor"));
                objreceitadto.setConta_receita(rs.getInt("contas_idContas"));
                objreceitadto.setDataRecebimento_receita(dataRecebimento);
                objreceitadto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperado);
                objreceitadto.setDescricao_receita(rs.getString("descricao"));
                objreceitadto.setTipo_receita(rs.getString("tipoReceita"));

                lista.add(objreceitadto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Pesquisar " + erro);
        }
        return lista;
    }

    /**
     * Método que altera os registros da tabela receitas através do Id
     * especificado
     *
     * @param objreceitadto Objeto da classe ReceitaDTO
     */
    public void alterarReceita(ReceitaDTO objreceitadto) {
        String comando = "update receitas set valor = ?, dataRecebimento = ?, dataRecebimentoEsperado = ?,"
                + " descricao = ?, contas_idContas = ?, tipoReceita = ? where idReceitas = ?";
        conexao = new ConexaoDAO().conectaBD();
        Date dataRecebimento = Date.valueOf(objreceitadto.getDataRecebimento_receita());
        Date dataRecebimentoEsperado = Date.valueOf(objreceitadto.getDataRecebimentoEsperado_receita());

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objreceitadto.getValor_receita());
            pstm.setDate(2, dataRecebimento);
            pstm.setDate(3, dataRecebimentoEsperado);
            pstm.setString(4, objreceitadto.getDescricao_receita());
            pstm.setInt(5, objreceitadto.getConta_receita());
            pstm.setString(6, objreceitadto.getTipo_receita());
            pstm.setInt(7, objreceitadto.getId_receita());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Alterar " + erro);
        }
    }

    /**
     * Método que faz a exclusão de registros da tabela receitas do banco de
     * dados
     *
     * @param objreceitadto Objeto da classe ReceitaDTO
     */
    public void excluirReceita(ReceitaDTO objreceitadto) {
        String comando = "delete from receitas where idReceitas =?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setInt(1, objreceitadto.getId_receita());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Excluir " + erro);
        }
    }

    /**
     * Método que gera uma lista das receitas filtradas através de um período
     * estipulado
     *
     * @param objreceitadto Objeto da classe ReceitaDTO
     * @return lista
     */
    public ArrayList<ReceitaDTO> PesquisarData(ReceitaDTO objreceitadto) {
        String comando = "select * from receitas where dataRecebimento between '" + objreceitadto.getDataInicio() + "' and '" + objreceitadto.getDataFim() + "'";
        conexao = new ConexaoDAO().conectaBD();

        try {

            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Date dataRec = rs.getDate("dataRecebimento");
                LocalDate dataRecebimento = dataRec.toLocalDate();
                Date dataRecEsp = rs.getDate("dataRecebimentoEsperado");
                LocalDate dataRecebimentoEsperado = dataRecEsp.toLocalDate();
                ReceitaDTO objreceita1dto = new ReceitaDTO();
                objreceita1dto.setId_receita(rs.getInt("idReceitas"));
                objreceita1dto.setValor_receita(rs.getFloat("valor"));
                objreceita1dto.setConta_receita(rs.getInt("contas_idContas"));
                objreceita1dto.setDataRecebimento_receita(dataRecebimento);
                objreceita1dto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperado);
                objreceita1dto.setDescricao_receita(rs.getString("descricao"));
                objreceita1dto.setTipo_receita(rs.getString("tipoReceita"));

                lista.add(objreceita1dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ReceitaDAO Pesquisar " + erro);
        }
        return lista;
    }

}
