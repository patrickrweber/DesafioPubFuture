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

import DTO.DespesaDTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
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
                + " tipoDespesa, contas_idContas) values (?, ?, ?, ?, ?)";
        conexao = new ConexaoDAO().conectaBD();

        Date dataPagamento = Date.valueOf(objdespesadto.getDataPagamento_despesa());
        Date dataPagamentoEsperado = Date.valueOf(objdespesadto.getDataPagamentoEsperado_despesa());

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objdespesadto.getValor_despesa());
            pstm.setDate(2, dataPagamento);
            pstm.setDate(3, dataPagamentoEsperado);
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
                Date dataPag = rs.getDate("dataPagamento");
                LocalDate dataPagamento = dataPag.toLocalDate();
                Date dataPagEsp = rs.getDate("dataPagamentoEsperado");
                LocalDate dataPagamentoEsperado = dataPagEsp.toLocalDate();
                DespesaDTO objdespesadto = new DespesaDTO();
                objdespesadto.setId_despesa(rs.getInt("idDespesas"));
                objdespesadto.setValor_despesa(rs.getFloat("valor"));
                objdespesadto.setConta_despesa(rs.getInt("contas_idContas"));
                objdespesadto.setDataPagamento_despesa(dataPagamento);
                objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperado);
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
                + " contas_idContas = ?, tipoDespesa = ? where idDespesas = ?";
        conexao = new ConexaoDAO().conectaBD();

        Date dataPagamento = Date.valueOf(objdespesadto.getDataPagamento_despesa());
        Date dataPagamentoEsperado = Date.valueOf(objdespesadto.getDataPagamentoEsperado_despesa());

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objdespesadto.getValor_despesa());
            pstm.setDate(2, dataPagamento);
            pstm.setDate(3, dataPagamentoEsperado);
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
        String comando = "delete from despesas where idDespesas =?";
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

    /**
     * Método que gera uma lista das despesas filtradas através de um período
     * estipulado
     *
     * @param objdespesadto Objeto da classe DespesaDTO
     * @return lista
     */
    public ArrayList<DespesaDTO> PesquisarData(DespesaDTO objdespesadto) {
        String comando = "select * from despesas where dataPagamento between '" + objdespesadto.getDataInicio() + "' and '" + objdespesadto.getDataFim() + "'";
        conexao = new ConexaoDAO().conectaBD();

        try {

            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Date dataPag = rs.getDate("dataPagamento");
                LocalDate dataPagamento = dataPag.toLocalDate();
                Date dataPagEsp = rs.getDate("dataPagamentoEsperado");
                LocalDate dataPagamentoEsperado = dataPagEsp.toLocalDate();
                DespesaDTO objdespesa1dto = new DespesaDTO();
                objdespesa1dto.setId_despesa(rs.getInt("idDespesas"));
                objdespesa1dto.setValor_despesa(rs.getFloat("valor"));
                objdespesa1dto.setConta_despesa(rs.getInt("contas_idContas"));
                objdespesa1dto.setDataPagamento_despesa(dataPagamento);
                objdespesa1dto.setDataPagamentoEsperado_despesa(dataPagamentoEsperado);
                objdespesa1dto.setTipo_despesa(rs.getString("tipoDespesa"));

                lista.add(objdespesa1dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "DespesaDAO Pesquisar " + erro);
        }
        return lista;
    }

}
