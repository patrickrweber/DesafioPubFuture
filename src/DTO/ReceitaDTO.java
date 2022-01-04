package DTO;

public class ReceitaDTO {
    
    private String  dataRecebimento_receita, dataRecebimentoEsperado_receita, descricao_receita, tipo_receita;
    private Float valor_receita;
    private int conta_receita;

    /**
     * @return the dataRecebimento_receita
     */
    public String getDataRecebimento_receita() {
        return dataRecebimento_receita;
    }

    /**
     * @param dataRecebimento_receita the dataRecebimento_receita to set
     */
    public void setDataRecebimento_receita(String dataRecebimento_receita) {
        this.dataRecebimento_receita = dataRecebimento_receita;
    }

    /**
     * @return the dataRecebimentoEsperado_receita
     */
    public String getDataRecebimentoEsperado_receita() {
        return dataRecebimentoEsperado_receita;
    }

    /**
     * @param dataRecebimentoEsperado_receita the dataRecebimentoEsperado_receita to set
     */
    public void setDataRecebimentoEsperado_receita(String dataRecebimentoEsperado_receita) {
        this.dataRecebimentoEsperado_receita = dataRecebimentoEsperado_receita;
    }

    /**
     * @return the descricao_receita
     */
    public String getDescricao_receita() {
        return descricao_receita;
    }

    /**
     * @param descricao_receita the descricao_receita to set
     */
    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }

    /**
     * @return the tipo_receita
     */
    public String getTipo_receita() {
        return tipo_receita;
    }

    /**
     * @param tipo_receita the tipo_receita to set
     */
    public void setTipo_receita(String tipo_receita) {
        this.tipo_receita = tipo_receita;
    }

    /**
     * @return the valor_receita
     */
    public Float getValor_receita() {
        return valor_receita;
    }

    /**
     * @param valor_receita the valor_receita to set
     */
    public void setValor_receita(Float valor_receita) {
        this.valor_receita = valor_receita;
    }

    /**
     * @return the conta_receita
     */
    public int getConta_receita() {
        return conta_receita;
    }

    /**
     * @param conta_receita the conta_receita to set
     */
    public void setConta_receita(int conta_receita) {
        this.conta_receita = conta_receita;
    }

}
