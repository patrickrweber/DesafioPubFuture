/*
 * The MIT License
 *
 * Copyright 2022 Patrick Renan Weber.
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
package DTO;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * Classe de testes da classe DespesaDTO
 *
 * @author Patrick Renan Weber
 */
public class DespesaDTOTest {

    DespesaDTO objdespesadto = new DespesaDTO();

    public DespesaDTOTest() {
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
     * Teste do método getTipo_despesa, da classe DespesaDTO.
     */
    @Test
    public void testGetTipo_despesa() {
        System.out.println("getTipo_despesa");
        assertEquals(null, objdespesadto.getTipo_despesa());
    }

    /**
     * Teste do método setTipo_despesa, da classe DespesaDTO.
     */
    @Test
    public void testSetTipo_despesa() {
        System.out.println("setTipo_despesa");
        objdespesadto.setTipo_despesa("");
    }

    /**
     * Teste do método getValor_despesa, da classe DespesaDTO.
     */
    @Test
    public void testGetValor_despesa() {
        System.out.println("getValor_despesa");
        float valor = 0;
        assertEquals(valor, objdespesadto.getValor_despesa());
    }

    /**
     * Teste do método setValor_despesa, da classe DespesaDTO.
     */
    @Test
    public void testSetValor_despesa() {
        System.out.println("setValor_despesa");
        objdespesadto.setValor_despesa(0);
    }

    /**
     * Teste do método getConta_despesa, da classe DespesaDTO.
     */
    @Test
    public void testGetConta_despesa() {
        System.out.println("getConta_despesa");
        assertEquals(0, objdespesadto.getConta_despesa());
    }

    /**
     * Teste do método setConta_despesa, da classe DespesaDTO.
     */
    @Test
    public void testSetConta_despesa() {
        System.out.println("setConta_despesa");
        objdespesadto.setConta_despesa(0);
    }

    /**
     * Teste do método getId_despesa, da classe DespesaDTO.
     */
    @Test
    public void testGetId_despesa() {
        System.out.println("getId_despesa");
        assertEquals(0, objdespesadto.getId_despesa());
    }

    /**
     * Teste do método setId_despesa, da classe DespesaDTO.
     */
    @Test
    public void testSetId_despesa() {
        System.out.println("setId_despesa");
        objdespesadto.setId_despesa(0);
    }

    /**
     * Teste do método getPagamento_despesa, da classe DespesaDTO.
     */
    @Test
    public void testGetDataPagamento_despesa() {
        System.out.println("getDataPagamento_despesa");
        assertEquals(null, objdespesadto.getDataPagamento_despesa());
    }

    /**
     * Teste do método setDataPagamento_despesa, da classe DespesaDTO.
     */
    @Test
    public void testSetDataPagamento_despesa() {
        System.out.println("setDataPagamento_despesa");
        objdespesadto.setDataPagamento_despesa(null);
    }

    /**
     * Teste do método getDataPagamentoEsperado_despesa, da classe DespesaDTO.
     */
    @Test
    public void testGetDataPagamentoEsperado_despesa() {
        System.out.println("getDataPagamentoEsperado_despesa");
        assertEquals(null, objdespesadto.getDataPagamentoEsperado_despesa());
    }

    /**
     * Teste do método setDataPagamentoEsperado_despesa, da classe DespesaDTO.
     */
    @Test
    public void testSetDataPagamentoEsperado_despesa() {
        System.out.println("setDataPagamentoEsperado_despesa");
        objdespesadto.setDataPagamentoEsperado_despesa(null);
    }

    /**
     * Teste do método getDataInicio, da classe DespesaDTO.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        assertEquals(null, objdespesadto.getDataInicio());
    }

    /**
     * Teste do método setDataInicio, da classe DespesaDTO.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        objdespesadto.setDataInicio(null);
    }

    /**
     * Teste do método getDataFim, da classe DespesaDTO.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        assertEquals(null, objdespesadto.getDataFim());
    }

    /**
     * Teste do método setDataFim, da classe DespesaDTO.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        objdespesadto.setDataFim(null);
    }

}
