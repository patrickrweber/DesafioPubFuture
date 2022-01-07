package DTO;

import java.time.LocalDate;

/**
 * Classe de transferências de dados através dos métodos get e set
 *
 * @author Patrick Renan Weber
 */
public class DespesaDTO {

    private String tipo_despesa;
    private Float valor_despesa;
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
    public Float getValor_despesa() {
        return valor_despesa;
    }

    /**
     * Método set da propriedade Valor_despesa
     *
     * @param valor_despesa Fornece o valor da despesa em específico
     */
    public void setValor_despesa(Float valor_despesa) {
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
     * @return the dataPagamento_despesa
     */
    public LocalDate getDataPagamento_despesa() {
        return dataPagamento_despesa;
    }

    /**
     * @param dataPagamento_despesa the dataPagamento_despesa to set
     */
    public void setDataPagamento_despesa(LocalDate dataPagamento_despesa) {
        this.dataPagamento_despesa = dataPagamento_despesa;
    }

    /**
     * @return the dataPagamentoEsperado_despesa
     */
    public LocalDate getDataPagamentoEsperado_despesa() {
        return dataPagamentoEsperado_despesa;
    }

    /**
     * @param dataPagamentoEsperado_despesa the dataPagamentoEsperado_despesa to set
     */
    public void setDataPagamentoEsperado_despesa(LocalDate dataPagamentoEsperado_despesa) {
        this.dataPagamentoEsperado_despesa = dataPagamentoEsperado_despesa;
    }

    /**
     * @return the dataInicio
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public LocalDate getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
