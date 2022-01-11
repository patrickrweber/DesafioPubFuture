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
package VIEW;

import org.junit.Test;

/**
 * Classe de testes da classe menuInicialVIEW
 *
 * @author Patrick Renan Weber
 */
public class menuInicialVIEWTest {

    public menuInicialVIEWTest() {
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
     * Teste do método main, da classe menuInicialVIEW
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        menuInicialVIEW.main(args);
    }

    /**
     * Teste do método fecharTela, da classe menuInicialVIEW
     */
    @Test
    public void testFecharTela() {
        System.out.println("fecharTela");
        menuInicialVIEW instance = new menuInicialVIEW();
        instance.fecharTela();
    }

}
