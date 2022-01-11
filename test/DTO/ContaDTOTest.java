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
 * Classe de testes da classe ContaDTO
 *
 * @author Patrick Renan Weber
 */
public class ContaDTOTest {

    ContaDTO objcontadto = new ContaDTO();

    public ContaDTOTest() {
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
     * Teste do método getInstituicao, da classe ContaDTO.
     */
    @Test
    public void testGetInstituicao() {
        System.out.println("getInstituicao");
        assertEquals(null, objcontadto.getInstituicao());

    }

    /**
     * Teste do método setInstituicao, da classe ContaDTO.
     */
    @Test
    public void testSetInstituicao() {
        System.out.println("setInstituicao");
        objcontadto.setInstituicao("");

    }

    /**
     * Teste do método getSaldo_conta, da classe ContaDTO.
     */
    @Test
    public void testGetSaldo_conta() {
        System.out.println("getSaldo_conta");
        float valor = 0;
        assertEquals(valor, objcontadto.getSaldo_conta());

    }

    /**
     * Teste do método setSaldo_conta, da classe ContaDTO.
     */
    @Test
    public void testSetSaldo_conta() {
        System.out.println("setSaldo_conta");
        objcontadto.setSaldo_conta(0);

    }

    /**
     * Teste do método getId_conta, da classe ContaDTO.
     */
    @Test
    public void testGetId_conta() {
        System.out.println("getId_conta");
        assertEquals(0, objcontadto.getId_conta());

    }

    /**
     * Teste do método setId_conta, da classe ContaDTO.
     */
    @Test
    public void testSetId_conta() {
        System.out.println("setId_conta");
        objcontadto.setId_conta(0);

    }

    /**
     * Teste do método getTipo_conta, da classe ContaDTO.
     */
    @Test
    public void testGetTipo_conta() {
        System.out.println("getTipo_conta");
        assertEquals(null, objcontadto.getTipo_conta());

    }

    /**
     * Teste do método setTipo_conta, da classe ContaDTO.
     */
    @Test
    public void testSetTipo_conta() {
        System.out.println("setTipo_conta");
        objcontadto.setTipo_conta("");

    }

    /**
     * Teste do método getConta1, da classe ContaDTO.
     */
    @Test
    public void testGetConta1() {
        System.out.println("getConta1");
        assertEquals(0, objcontadto.getConta1());

    }

    /**
     * Teste do método setConta1, da classe ContaDTO.
     */
    @Test
    public void testSetConta1() {
        System.out.println("setConta1");
        objcontadto.setConta1(0);

    }

    /**
     * Teste do método getConta2, da classe ContaDTO.
     */
    @Test
    public void testGetConta2() {
        System.out.println("getConta2");
        assertEquals(0, objcontadto.getConta2());

    }

    /**
     * Teste do método setConta2, da classe ContaDTO.
     */
    @Test
    public void testSetConta2() {
        System.out.println("setConta2");
        objcontadto.setConta2(0);

    }

    /**
     * Teste do método getNovoSaldo1, da classe ContaDTO.
     */
    @Test
    public void testGetNovoSaldo1() {
        System.out.println("getNovoSaldo1");
        float saldo = 0;
        assertEquals(saldo, objcontadto.getNovoSaldo1());

    }

    /**
     * Teste do método setNovoSaldo1, da classe ContaDTO.
     */
    @Test
    public void testSetNovoSaldo1() {
        System.out.println("setNovoSaldo1");
        objcontadto.setNovoSaldo1(0);

    }

    /**
     * Teste do método getNovoSaldo2, da classe ContaDTO.
     */
    @Test
    public void testGetNovoSaldo2() {
        System.out.println("getNovoSaldo2");
        float saldo = 0;
        assertEquals(saldo, objcontadto.getNovoSaldo2());

    }

    /**
     * Teste do método setNovoSaldo2, da classe ContaDTO.
     */
    @Test
    public void testSetNovoSaldo2() {
        System.out.println("setNovoSaldo2");
        objcontadto.setNovoSaldo2(0);

    }

}
