package DTO;

/**
 * Classe de transferências de dados através dos métodos get e set
 *
 * @author Patrick Renan Weber
 */
public class ReceitaDTO {

    private String dataRecebimento_receita, dataRecebimentoEsperado_receita, descricao_receita, tipo_receita;
    private Float valor_receita;
    private int conta_receita, id_receita;

    /**
     * Método get da propriedade DataRecebimento_receita
     *
     * @return dataRecebimento_receita
     */
    public String getDataRecebimento_receita() {
        return dataRecebimento_receita;
    }

    /**
     * Método set da propriedade DataRecebimento_receita
     *
     * @param dataRecebimento_receita Fornece a data de recebimento da receita
     */
    public void setDataRecebimento_receita(String dataRecebimento_receita) {
        this.dataRecebimento_receita = dataRecebimento_receita;
    }

    /**
     * Método get da propriedade DataRecebimentoEsperado_receita
     *
     * @return dataRecebimentoEsperado_receita
     */
    public String getDataRecebimentoEsperado_receita() {
        return dataRecebimentoEsperado_receita;
    }

    /**
     * Método set da propriedade DataRecebimentoEsperado_receita
     *
     * @param dataRecebimentoEsperado_receita Fornece a data de recebimento
     * esperado da receita
     */
    public void setDataRecebimentoEsperado_receita(String dataRecebimentoEsperado_receita) {
        this.dataRecebimentoEsperado_receita = dataRecebimentoEsperado_receita;
    }

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

}
