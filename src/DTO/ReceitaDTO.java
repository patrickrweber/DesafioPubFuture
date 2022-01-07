package DTO;

import java.sql.Date;

/**
 * Classe de transferências de dados através dos métodos get e set
 *
 * @author Patrick Renan Weber
 */
public class ReceitaDTO {

    private String descricao_receita, tipo_receita;
    private Float valor_receita;
    private int conta_receita, id_receita;
    private Date dataRecebimento_receita, dataInicio, dataFim;
    private Date dataRecebimentoEsperado_receita;



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
    public Float getValor_receita() {
        return valor_receita;
    }

    /**
     * Método set da propriedade Valor_receita
     *
     * @param valor_receita Fornece o valor da receita
     */
    public void setValor_receita(Float valor_receita) {
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
     * @return the dataRecebimento_receita
     */
    public Date getDataRecebimento_receita() {
        return dataRecebimento_receita;
    }

    /**
     * @param dataRecebimento_receita the dataRecebimento_receita to set
     */
    public void setDataRecebimento_receita(Date dataRecebimento_receita) {
        this.dataRecebimento_receita = dataRecebimento_receita;
    }

    /**
     * @return the dataRecebimentoEsperado_receita
     */
    public Date getDataRecebimentoEsperado_receita() {
        return dataRecebimentoEsperado_receita;
    }

    /**
     * @param dataRecebimentoEsperado_receita the dataRecebimentoEsperado_receita to set
     */
    public void setDataRecebimentoEsperado_receita(Date dataRecebimentoEsperado_receita) {
        this.dataRecebimentoEsperado_receita = dataRecebimentoEsperado_receita;
    }

    /**
     * @return the dataInicio
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
}
