package DTO;

public class ContaDTO {

    private String instituicao, tipo_conta;
    private Float saldo_conta;                //Define as propriedades da classe Conta
    private int id_conta;

    /**
     * @return the instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * @param instituicao the instituicao to set
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    /**
     * @return the saldo_conta
     */
    public Float getSaldo_conta() {
        return saldo_conta;
    }

    /**
     * @param saldo_conta the saldo_conta to set
     */
    public void setSaldo_conta(Float saldo_conta) {
        this.saldo_conta = saldo_conta;
    }

    /**
     * @return the id_conta
     */
    public int getId_conta() {
        return id_conta;
    }

    /**
     * @param id_conta the id_conta to set
     */
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    /**
     * @return the tipo_conta
     */
    public String getTipo_conta() {
        return tipo_conta;
    }

    /**
     * @param tipo_conta the tipo_conta to set
     */
    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }
}
