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

import java.time.LocalDate;

/**
 * Classe de transferências de dados através dos métodos get e set
 *
 * @author Patrick Renan Weber
 */
public class DespesaDTO {

    private String tipo_despesa;
    private float valor_despesa;
    private int conta_despesa, id_despesa;
    private LocalDate dataPagamento_despesa, dataPagamentoEsperado_despesa, dataInicio, dataFim;

    /**
     * Método get da propriedade Tipo_despesa
     *
     * @return tipo_despesa
     */
    public String getTipo_despesa() {
        return tipo_despesa;
    }

    /**
     * Método set da propriedade Tipo_despesa
     *
     * @param tipo_despesa Fornece o tipo da despesa (Alimentação, Educação,
     * Lazer, Moradia, Roupa, Saúde, Transporte, Outros
     */
    public void setTipo_despesa(String tipo_despesa) {
        this.tipo_despesa = tipo_despesa;
    }

    /**
     * Método get da propriedade Valor_despesa
     *
     * @return valor_despesa
     */
    public float getValor_despesa() {
        return valor_despesa;
    }

    /**
     * Método set da propriedade Valor_despesa
     *
     * @param valor_despesa Fornece o valor da despesa em específico
     */
    public void setValor_despesa(float valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    /**
     * Método get da propriedade Conta_despesa
     *
     * @return conta_despesa
     */
    public int getConta_despesa() {
        return conta_despesa;
    }

    /**
     * Método set da propriedade Conta_despesa
     *
     * @param conta_despesa Fornece o número da conta relacionado a despesa
     */
    public void setConta_despesa(int conta_despesa) {
        this.conta_despesa = conta_despesa;
    }

    /**
     * Método get da propriedade Id_despesa
     *
     * @return id_despesa
     */
    public int getId_despesa() {
        return id_despesa;
    }

    /**
     * Método set da propriedade Id_despesa
     *
     * @param id_despesa Fornece o id da depesa
     */
    public void setId_despesa(int id_despesa) {
        this.id_despesa = id_despesa;
    }

    /**
     * Método get da propriedade DataPagamento_despesa
     *
     * @return dataPagamento_despesa
     */
    public LocalDate getDataPagamento_despesa() {
        return dataPagamento_despesa;
    }

    /**
     * Método set da propriedade DataPagamento_despesa
     *
     * @param dataPagamento_despesa Fornece a data de pagamento da despesa
     */
    public void setDataPagamento_despesa(LocalDate dataPagamento_despesa) {
        this.dataPagamento_despesa = dataPagamento_despesa;
    }

    /**
     * Método get da propriedade DataPagamentoEsperado_despesa
     *
     * @return dataPagamentoEsperado_despesa
     */
    public LocalDate getDataPagamentoEsperado_despesa() {
        return dataPagamentoEsperado_despesa;
    }

    /**
     * Método set da propriedade DataPagamentoEsperado_despesa
     *
     * @param dataPagamentoEsperado_despesa Fornece a data de pagamento esperado
     * da despesa
     */
    public void setDataPagamentoEsperado_despesa(LocalDate dataPagamentoEsperado_despesa) {
        this.dataPagamentoEsperado_despesa = dataPagamentoEsperado_despesa;
    }

    /**
     * Método get da propriedade DataInicio
     *
     * @return dataInicio
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * Método set da propriedade DataInicio
     *
     * @param dataInicio Fornece a data de Inicio do filtro por data
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Método get da propriedade DataFim
     *
     * @return dataFim
     */
    public LocalDate getDataFim() {
        return dataFim;
    }

    /**
     * Método set da propriedade DataFim
     *
     * @param dataFim Fornece a data de fim do filtro por data
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
