package DTO;

/**
 * Classe de transferências de dados através dos métodos get e set
 *
 * @author Patrick Renan Weber
 */
public class ContaDTO {

    private String instituicao, tipo_conta;
    private Float saldo_conta;
    private int id_conta;

    /**
     * Método get da propriedade instituicao
     *
     * @return instituicao
     */
    public String getInstituicao() {
        return instituicao;
    }

    /**
     * Método set da propriedade instituicao
     *
     * @param instituicao Fornece o nome da instituição financeira
     */
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    /**
     * Método get da propriedade saldo_conta
     *
     * @return saldo_conta
     */
    public Float getSaldo_conta() {
        return saldo_conta;
    }

    /**
     * Método set da propriedade saldo_conta
     *
     * @param saldo_conta Fornece o saldo referente a conta
     */
    public void setSaldo_conta(Float saldo_conta) {
        this.saldo_conta = saldo_conta;
    }

    /**
     * Método get da propriedade Id_conta
     *
     * @return id_conta
     */
    public int getId_conta() {
        return id_conta;
    }

    /**
     * Método set da propriedade id_conta
     *
     * @param id_conta Fornece o id da conta
     */
    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }

    /**
     * Método get da propriedade tipo_conta
     *
     * @return tipo_conta
     */
    public String getTipo_conta() {
        return tipo_conta;
    }

    /**
     * Método set da propriedade tipo_conta
     *
     * @param tipo_conta Fornece o tipo da conta (Carteira, corrente, poupança)
     */
    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }
}
