package DTO;

public class ReceitaDTO {
    
    private String  dataRecebimento_receita, dataRecebimentoEsperado_receita, descricao_receita, tipo_receita;
    private Float valor_receita;
    private int conta_receita, id_receita;

    public String getDataRecebimento_receita() {
        return dataRecebimento_receita;
    }
    
    public void setDataRecebimento_receita(String dataRecebimento_receita) {
        this.dataRecebimento_receita = dataRecebimento_receita;
    }
    
    public String getDataRecebimentoEsperado_receita() {
        return dataRecebimentoEsperado_receita;
    }

    public void setDataRecebimentoEsperado_receita(String dataRecebimentoEsperado_receita) {
        this.dataRecebimentoEsperado_receita = dataRecebimentoEsperado_receita;
    }

    public String getDescricao_receita() {
        return descricao_receita;
    }

    public void setDescricao_receita(String descricao_receita) {
        this.descricao_receita = descricao_receita;
    }

    public String getTipo_receita() {
        return tipo_receita;
    }

    public void setTipo_receita(String tipo_receita) {
        this.tipo_receita = tipo_receita;
    }

    public Float getValor_receita() {
        return valor_receita;
    }

    public void setValor_receita(Float valor_receita) {
        this.valor_receita = valor_receita;
    }

    public int getConta_receita() {
        return conta_receita;
    }

    public void setConta_receita(int conta_receita) {
        this.conta_receita = conta_receita;
    }

    public int getId_receita() {
        return id_receita;
    }

    public void setId_receita(int id_receita) {
        this.id_receita = id_receita;
    }

}
