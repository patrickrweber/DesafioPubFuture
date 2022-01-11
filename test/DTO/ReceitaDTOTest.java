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
package DTO;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 * Classe de testes da classe ReceitaDTO
 *
 * @author Patrick Renan Weber
 */
public class ReceitaDTOTest {

    ReceitaDTO objreceitadto = new ReceitaDTO();

    public ReceitaDTOTest() {
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
     * Teste do método getDescricao_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetDescricao_receita() {
        System.out.println("getDescricao_receita");
        assertEquals(null, objreceitadto.getDescricao_receita());
    }

    /**
     * Teste do método setDescricao_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetDescricao_receita() {
        System.out.println("setDescricao_receita");
        objreceitadto.setDescricao_receita("");
    }

    /**
     * Teste do método getTipo_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetTipo_receita() {
        System.out.println("getTipo_receita");
        assertEquals(null, objreceitadto.getTipo_receita());
    }

    /**
     * Teste do método setTipo_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetTipo_receita() {
        System.out.println("setTipo_receita");
        objreceitadto.setTipo_receita("");
    }

    /**
     * Teste do método getValor_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetValor_receita() {
        System.out.println("getValor_receita");
        float valor = 0;
        assertEquals(valor, objreceitadto.getValor_receita());
    }

    /**
     * Teste do método getDescricao_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetValor_receita() {
        System.out.println("setValor_receita");
        objreceitadto.setValor_receita(0);
    }

    /**
     * Teste do método getConta_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetConta_receita() {
        System.out.println("getConta_receita");
        assertEquals(0, objreceitadto.getConta_receita());
    }

    /**
     * Teste do método setConta_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetConta_receita() {
        System.out.println("setConta_receita");
        objreceitadto.setConta_receita(0);
    }

    /**
     * Teste do método getId_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetId_receita() {
        System.out.println("getId_receita");
        assertEquals(0, objreceitadto.getId_receita());
    }

    /**
     * Teste do método setId_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetId_receita() {
        System.out.println("setId_receita");
        objreceitadto.setId_receita(0);
    }

    /**
     * Teste do método getDataRecebimento_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetDataRecebimento_receita() {
        System.out.println("getDataRecebimento_receita");
        assertEquals(null, objreceitadto.getDataRecebimento_receita());
    }

    /**
     * Teste do método setDataRecebimento_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetDataRecebimento_receita() {
        System.out.println("setDataRecebimento_receita");
        objreceitadto.setDataRecebimento_receita(null);
    }

    /**
     * Teste do método getDataInicio, da classe ReceitaDTO.
     */
    @Test
    public void testGetDataInicio() {
        System.out.println("getDataInicio");
        assertEquals(null, objreceitadto.getDataInicio());
    }

    /**
     * Teste do método setDataInicio, da classe ReceitaDTO.
     */
    @Test
    public void testSetDataInicio() {
        System.out.println("setDataInicio");
        objreceitadto.setDataInicio(null);
    }

    /**
     * Teste do método getDataFim, da classe ReceitaDTO.
     */
    @Test
    public void testGetDataFim() {
        System.out.println("getDataFim");
        assertEquals(null, objreceitadto.getDataFim());
    }

    /**
     * Teste do método setDataFim, da classe ReceitaDTO.
     */
    @Test
    public void testSetDataFim() {
        System.out.println("setDataFim");
        objreceitadto.setDataFim(null);
    }

    /**
     * Teste do método getDataRecebimentoEsperado_receita, da classe ReceitaDTO.
     */
    @Test
    public void testGetDataRecebimentoEsperado_receita() {
        System.out.println("getDataRecebimentoEsperado_receita");
        assertEquals(null, objreceitadto.getDataRecebimentoEsperado_receita());
    }

    /**
     * Teste do método setDataRecebimentoEsperado_receita, da classe ReceitaDTO.
     */
    @Test
    public void testSetDataRecebimentoEsperado_receita() {
        System.out.println("setDataRecebimentoEsperado_receita");
        objreceitadto.setDataRecebimentoEsperado_receita(null);
    }

}
