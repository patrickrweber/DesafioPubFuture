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
import java.time.LocalDate;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Classe de testes da classe DespesaDAO
 *
 * @author Patrick Renan Weber
 */
public class DespesaDAOTest {

    DespesaDAO objdespesadao = new DespesaDAO();
    DespesaDTO objdespesadto = new DespesaDTO();

    public DespesaDAOTest() {
    }

    public static void setUpClass() {
    }

    public static void tearDownClass() {
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    /**
     * Teste do método cadastrarDespesa, da classe DespesaDAO
     */
    @Test
    public void testCadastrarDespesa() {
        System.out.println("cadastrarDespesa");
        
        LocalDate dataPagamento = LocalDate.of(2022, 01, 10);
        LocalDate dataPagamentoEsperado = LocalDate.of(2022, 01, 10);
        objdespesadto.setConta_despesa(1);
        objdespesadto.setTipo_despesa("");
        objdespesadto.setValor_despesa(0);
        objdespesadto.setDataPagamento_despesa(dataPagamento);
        objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperado);
        objdespesadao.cadastrarDespesa(objdespesadto);
    }

    /**
     * Teste do método pesquisarDespesa, da classe DespesaDAO
     */
    @Test
    public void testPesquisarDespesa() {
        System.out.println("PesquisarDespesa");
        ArrayList<DespesaDTO> lista = objdespesadao.PesquisarDespesa();
        ArrayList<DespesaDTO> result = objdespesadao.PesquisarDespesa();
        assertEquals(lista, result);
    }

    /**
     * Teste do método alterarDespesa, da classe DespesaDAO.
     */
    @Test
    public void testAlterarDespesa() {
        System.out.println("alterarDespesa");
        LocalDate dataPagamento = LocalDate.of(2022, 01, 10);
        LocalDate dataPagamentoEsperado = LocalDate.of(2022, 01, 10);
        objdespesadto.setConta_despesa(1);
        objdespesadto.setTipo_despesa("");
        objdespesadto.setValor_despesa(0);
        objdespesadto.setDataPagamento_despesa(dataPagamento);
        objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperado);

        objdespesadao.alterarDespesa(objdespesadto);
    }

    /**
     * Teste do método excluirDespesa, da classe DespesaDAO
     */
    @Test
    public void testExcluirDespesa() {
        System.out.println("excluirDespesa");
        objdespesadao.excluirDespesa(objdespesadto);
    }

    /**
     * Teste do método pesquisarData, da classe DespesaDAO
     */
    @Test
    public void testPesquisarData() {
        System.out.println("PesquisarData");
        ArrayList<DespesaDTO> lista = objdespesadao.PesquisarData(objdespesadto);
        ArrayList<DespesaDTO> result = objdespesadao.PesquisarData(objdespesadto);
        assertEquals(lista, result);
    }

}
