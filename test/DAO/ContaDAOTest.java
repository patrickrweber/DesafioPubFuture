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
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

/**
 * Classe de testes da classe ContaDAO
 *
 * @author Patrick Renan Weber
 */
public class ContaDAOTest {

    ContaDAO objcontadao = new ContaDAO();
    ContaDTO objcontadto = new ContaDTO();

    public ContaDAOTest() {
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
     * Teste do método cadastrarConta, da classe ContaDAO
     */
    @Test
    public void testCadastrarConta() {
        System.out.println("cadastrarConta");
        objcontadto.setSaldo_conta(0);
        objcontadto.setInstituicao("");
        objcontadto.setTipo_conta("");
        
        objcontadao.cadastrarConta(objcontadto);
    }

    /**
     * Teste do método pesquisarConta, da classe ContaDAO
     */
    @Test
    public void testPesquisarConta() {
        System.out.println("PesquisarConta");
        ArrayList<ContaDTO> lista = objcontadao.PesquisarConta();
        ArrayList<ContaDTO> result = objcontadao.PesquisarConta();
        assertEquals(lista, result);
    }

    /**
     * Teste do método alterarConta, da classe ContaDAO
     */
    @Test
    public void testAlterarConta() {
        System.out.println("alterarConta");
        objcontadao.alterarConta(objcontadto);
    }

    /**
     * Teste do método excluir, da classe ContaDAO
     */
    @Test
    public void testExcluirConta() {
        System.out.println("excluirConta");
        objcontadao.excluirConta(objcontadto);
    }

    /**
     * Teste do método transferirSaldoASC, da classe ContaDAO
     */
    @Test
    public void testTransferirSaldoASC() {
        System.out.println("transferirSaldoASC");
        ArrayList<ContaDTO> lista = objcontadao.transferirSaldoASC(objcontadto);
        ArrayList<ContaDTO> result = objcontadao.transferirSaldoASC(objcontadto);
        assertEquals(lista, result);
    }

    /**
     * Teste do método transferirSaldoDSC, da classe ContaDAO
     */
    @Test
    public void testTransferirSaldoDSC() {
        System.out.println("transferirSaldoDSC");
        ArrayList<ContaDTO> lista = objcontadao.transferirSaldoDSC(objcontadto);
        ArrayList<ContaDTO> result = objcontadao.transferirSaldoDSC(objcontadto);
        assertEquals(lista, result);
    }

    /**
     * Teste do método alterarSaldo1, da classe ContaDAO
     */
    @Test
    public void testAlterarSaldo1() {
        System.out.println("alterarSaldo1");
        objcontadao.alterarSaldo1(objcontadto);
    }

    /**
     * Teste do método alterarSaldo2, da classe ContaDAO
     */
    @Test
    public void testAlterarSaldo2() {
        System.out.println("alterarSaldo2");
        objcontadao.alterarSaldo2(objcontadto);
    }

}
