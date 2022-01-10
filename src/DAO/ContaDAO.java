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
 *
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
     *
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
            JOptionPane.showMessageDialog(null, "ContaDAO Excluir " + erro);
        }
    }

    /**
     * Método que seleciona os registros em ordem crescendo através dos ids
     * estipulados
     *
     * @param objcontadto Objeto da classe ContaDTO
     * @return lista
     */
    public ArrayList<ContaDTO> transferirSaldoASC(ContaDTO objcontadto) {
        String comando = "select * from contas where idContas =" + objcontadto.getConta1() + " OR idContas =" + objcontadto.getConta2();
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ContaDTO objconta1dto = new ContaDTO();
                objconta1dto.setId_conta(rs.getInt("idContas"));
                objconta1dto.setSaldo_conta(rs.getFloat("saldo"));
                objconta1dto.setTipo_conta(rs.getString("tipoConta"));
                objconta1dto.setInstituicao(rs.getString("instituicaoFinanceira"));

                lista.add(objconta1dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Transferir " + erro);
        }
        return lista;
    }

    /**
     * Método que seleciona os registros em ordem decrescente através dos ids
     * estipulados
     *
     * @param objcontadto Objeto da classe ContaDTO
     * @return lista
     */
    public ArrayList<ContaDTO> transferirSaldoDSC(ContaDTO objcontadto) {
        String comando = "select * from contas where idContas =" + objcontadto.getConta1() + " OR idContas =" + objcontadto.getConta2() + " order by idContas desc";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            rs = pstm.executeQuery();

            while (rs.next()) {
                ContaDTO objconta1dto = new ContaDTO();
                objconta1dto.setId_conta(rs.getInt("idContas"));
                objconta1dto.setSaldo_conta(rs.getFloat("saldo"));
                objconta1dto.setTipo_conta(rs.getString("tipoConta"));
                objconta1dto.setInstituicao(rs.getString("instituicaoFinanceira"));

                lista.add(objconta1dto);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Transferir " + erro);
        }
        return lista;
    }

    /**
     * Método que faz o update no banco de dados com os novos valores de saldo
     *
     * @param objcontadto Objeto da classe ContaDTO
     */
    public void alterarSaldo1(ContaDTO objcontadto) {
        String comando = "update contas set saldo = ? where idContas = ?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objcontadto.getNovoSaldo1());
            pstm.setInt(2, objcontadto.getConta1());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Alterar Saldo " + erro);
        }
    }

    /**
     * Método que faz o update no banco de dados com os novos valores de saldo
     *
     * @param objcontadto Objeto da classe ContaDTO
     */
    public void alterarSaldo2(ContaDTO objcontadto) {
        String comando = "update contas set saldo = ? where idContas = ?";
        conexao = new ConexaoDAO().conectaBD();

        try {
            pstm = conexao.prepareStatement(comando);
            pstm.setFloat(1, objcontadto.getNovoSaldo2());
            pstm.setInt(2, objcontadto.getConta2());
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ContaDAO Alterar Saldo " + erro);
        }
    }

}
