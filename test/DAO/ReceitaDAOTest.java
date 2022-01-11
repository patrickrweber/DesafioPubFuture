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
import java.time.LocalDate;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Classe de testes da classe ReceitaDAO
 *
 * @author Patrick Renan Weber
 */
public class ReceitaDAOTest {

    ReceitaDAO objreceitadao = new ReceitaDAO();
    ReceitaDTO objreceitadto = new ReceitaDTO();

    public ReceitaDAOTest() {
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
     * Teste do método cadastrarReceita, da classe ReceitaDAO
     */
    @Test
    public void testCadastrarReceita() {
        LocalDate dataRecebimento = LocalDate.of(2022, 01, 10);
        LocalDate dataRecebimentoEsperado = LocalDate.of(2022, 01, 10);

        objreceitadto.setConta_receita(1);
        objreceitadto.setDescricao_receita("");
        objreceitadto.setTipo_receita("");
        objreceitadto.setValor_receita(0);
        objreceitadto.setDataRecebimento_receita(dataRecebimento);
        objreceitadto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperado);

        objreceitadao.cadastrarReceita(objreceitadto);
    }

    /**
     * Teste do método pesquisarReceita, da classe ReceitaDAO
     */
    @Test
    public void testPesquisarReceita() {
        System.out.println("PesquisarReceita");
        ArrayList<ReceitaDTO> lista = objreceitadao.PesquisarReceita();
        ArrayList<ReceitaDTO> result = objreceitadao.PesquisarReceita();
        assertEquals(lista, result);
    }

    /**
     * Teste do método alterarReceita, da classe ReceitaDAO
     */
    @Test
    public void testAlterarReceita() {
        System.out.println("alterarReceita");
        LocalDate dataRecebimento = LocalDate.of(2022, 01, 10);
        LocalDate dataRecebimentoEsperado = LocalDate.of(2022, 01, 10);

        objreceitadto.setConta_receita(0);
        objreceitadto.setDescricao_receita("");
        objreceitadto.setTipo_receita("");
        objreceitadto.setValor_receita(0);
        objreceitadto.setDataRecebimento_receita(dataRecebimento);
        objreceitadto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperado);

        objreceitadao.alterarReceita(objreceitadto);
    }

    /**
     * Teste do método excluirReceita, da classe ReceitaDAO
     */
    @Test
    public void testExcluirReceita() {
        System.out.println("excluirReceita");
        objreceitadao.excluirReceita(objreceitadto);
    }

    /**
     * Teste do método pesquisarData, da classe ReceitaDAO.
     */
    @Test
    public void testPesquisarData() {
        System.out.println("PesquisarData");
        ArrayList<ReceitaDTO> lista = objreceitadao.PesquisarData(objreceitadto);
        ArrayList<ReceitaDTO> result = objreceitadao.PesquisarData(objreceitadto);
        assertEquals(lista, result);
    }

}
