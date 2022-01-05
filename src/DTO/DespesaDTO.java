package DTO;

public class DespesaDTO {

    private String dataPagamento_despesa, dataPagamentoEsperado_despesa, tipo_despesa;
    private Float valor_despesa;                //Define as propriedades da classe Despesa
    private int conta_despesa, id_despesa;

    /**
     * @return the dataPagamento_despesa
     */
    public String getDataPagamento_despesa() {
        return dataPagamento_despesa;
    }

    /**
     * @param dataPagamento_despesa the dataPagamento_despesa to set
     */
    public void setDataPagamento_despesa(String dataPagamento_despesa) {
        this.dataPagamento_despesa = dataPagamento_despesa;
    }

    /**
     * @return the dataPagamentoEsperado_despesa
     */
    public String getDataPagamentoEsperado_despesa() {
        return dataPagamentoEsperado_despesa;
    }

    /**
     * @param dataPagamentoEsperado_despesa the dataPagamentoEsperado_despesa to set
     */
    public void setDataPagamentoEsperado_despesa(String dataPagamentoEsperado_despesa) {
        this.dataPagamentoEsperado_despesa = dataPagamentoEsperado_despesa;
    }

    /**
     * @return the tipo_despesa
     */
    public String getTipo_despesa() {
        return tipo_despesa;
    }

    /**
     * @param tipo_despesa the tipo_despesa to set
     */
    public void setTipo_despesa(String tipo_despesa) {
        this.tipo_despesa = tipo_despesa;
    }

    /**
     * @return the valor_despesa
     */
    public Float getValor_despesa() {
        return valor_despesa;
    }

    /**
     * @param valor_despesa the valor_despesa to set
     */
    public void setValor_despesa(Float valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    /**
     * @return the conta_despesa
     */
    public int getConta_despesa() {
        return conta_despesa;
    }

    /**
     * @param conta_despesa the conta_despesa to set
     */
    public void setConta_despesa(int conta_despesa) {
        this.conta_despesa = conta_despesa;
    }

    /**
     * @return the id_despesa
     */
    public int getId_despesa() {
        return id_despesa;
    }

    /**
     * @param id_despesa the id_despesa to set
     */
    public void setId_despesa(int id_despesa) {
        this.id_despesa = id_despesa;
    }
}
