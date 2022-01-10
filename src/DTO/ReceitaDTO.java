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
public class ReceitaDTO {

    private String descricao_receita, tipo_receita;
    private float valor_receita;
    private int conta_receita, id_receita;
    private LocalDate dataRecebimento_receita, dataInicio, dataFim, dataRecebimentoEsperado_receita;

    /**
     * Método get da propriedade Descricao_receita
     *
     * @return descricao_receita
     */
    public String getDescricao_receita() {
        return descricao_receita;
    }

    /**
     * Método set da propriedade Descricao_receita
     *
     * @param descricao_receita Fornece a descrição da receita
     */
    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }

    /**
     * Método get da propriedade Tipo_receita
     *
     * @return tipo_receita
     */
    public String getTipo_receita() {
        return tipo_receita;
    }

    /**
     * Método set da propriedade Tipo_receita
     *
     * @param tipo_receita Fornece o tipo da receita (Salário, Presente, Prêmio,
     * Outros)
     */
    public void setTipo_receita(String tipo_receita) {
        this.tipo_receita = tipo_receita;
    }

    /**
     * Método get da propriedade Valor_receita
     *
     * @return valor_receita
     */
    public float getValor_receita() {
        return valor_receita;
    }

    /**
     * Método set da propriedade Valor_receita
     *
     * @param valor_receita Fornece o valor da receita
     */
    public void setValor_receita(float valor_receita) {
        this.valor_receita = valor_receita;
    }

    /**
     * Método get da propriedade Conta_receita
     *
     * @return conta_receita
     */
    public int getConta_receita() {
        return conta_receita;
    }

    /**
     * Método set da propriedade Conta_receita
     *
     * @param conta_receita Fornece a conta de receita
     */
    public void setConta_receita(int conta_receita) {
        this.conta_receita = conta_receita;
    }

    /**
     * Método get da propriedade Id_receita
     *
     * @return id_receita
     */
    public int getId_receita() {
        return id_receita;
    }

    /**
     * Método set da propriedade getId_receita
     *
     * @param id_receita Fornece o Id da receita
     */
    public void setId_receita(int id_receita) {
        this.id_receita = id_receita;
    }

    /**
     * Método get da propriedade DataRecebimento_receita
     *
     * @return dataRecebimento_receita
     */
    public LocalDate getDataRecebimento_receita() {
        return dataRecebimento_receita;
    }

    /**
     * Método set da propriedade DataRecebimento_receita
     *
     * @param dataRecebimento_receita Fornece a data de recebimento da receita
     */
    public void setDataRecebimento_receita(LocalDate dataRecebimento_receita) {
        this.dataRecebimento_receita = dataRecebimento_receita;
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
     * @param dataInicio fornece a data de início para o filtro por data
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
     * @param dataFim Fornece a data de fim para o filtro por data
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Método get da propriedade DataRecebimentoEsperado_receita
     *
     * @return dataRecebimentoEsperado_receita
     */
    public LocalDate getDataRecebimentoEsperado_receita() {
        return dataRecebimentoEsperado_receita;
    }

    /**
     * Método set da propriedade DataRecebimentoEsperado_receita
     *
     * @param dataRecebimentoEsperado_receita Fornece a data de recebimento
     * esperado da receita
     */
    public void setDataRecebimentoEsperado_receita(LocalDate dataRecebimentoEsperado_receita) {
        this.dataRecebimentoEsperado_receita = dataRecebimentoEsperado_receita;
    }
}
