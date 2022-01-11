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
package VIEW;

import DAO.ContaDAO;
import DTO.ContaDTO;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Formulário de interface para receber os valores da tabela contas
 *
 * @author Patrick Renan Weber
 */
public class frmContaVIEW extends javax.swing.JFrame {

    public frmContaVIEW() {
        initComponents();
        listarcontas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelValorSaldo = new javax.swing.JLabel();
        jButtonCadastrarConta = new javax.swing.JButton();
        jTextFieldSaldo = new javax.swing.JTextField();
        jButtonVoltarConta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableConta = new javax.swing.JTable();
        jLabelIdConta = new javax.swing.JLabel();
        jTextFieldIdConta = new javax.swing.JTextField();
        jButtonCarregarCamposConta = new javax.swing.JButton();
        jButtonLimparCamposConta = new javax.swing.JButton();
        jButtonAlterarConta = new javax.swing.JButton();
        jTextFieldInstituicao = new javax.swing.JTextField();
        jButtonExcluirConta = new javax.swing.JButton();
        jLabelInstituicao = new javax.swing.JLabel();
        jLabelTipoConta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1tipoConta = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSaldoTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldConta1 = new javax.swing.JTextField();
        jTextFieldConta2 = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonTransferir = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelValorSaldo.setText("Saldo");

        jButtonCadastrarConta.setText("Cadastrar");
        jButtonCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarContaActionPerformed(evt);
            }
        });

        jButtonVoltarConta.setText("Voltar");
        jButtonVoltarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarContaActionPerformed(evt);
            }
        });

        jTableConta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Saldo", "Tipo Conta", "Instituição"
            }
        ));
        jScrollPane2.setViewportView(jTableConta);

        jLabelIdConta.setText("Código Conta");

        jTextFieldIdConta.setEnabled(false);

        jButtonCarregarCamposConta.setText("Carregar Campos");
        jButtonCarregarCamposConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposContaActionPerformed(evt);
            }
        });

        jButtonLimparCamposConta.setText("Limpar Campos");
        jButtonLimparCamposConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposContaActionPerformed(evt);
            }
        });

        jButtonAlterarConta.setText("Alterar");
        jButtonAlterarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarContaActionPerformed(evt);
            }
        });

        jButtonExcluirConta.setText("Excluir");
        jButtonExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirContaActionPerformed(evt);
            }
        });

        jLabelInstituicao.setText("Instituição");

        jLabelTipoConta.setText("Tipo Conta");

        jList1tipoConta.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Carteira", "Conta Corrente", "Poupança"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1tipoConta);

        jLabel1.setText("Saldo Total");

        jTextFieldSaldoTotal.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Transferência");

        jLabel3.setText("De (Número conta)");

        jLabel4.setText("Para (Número conta)");

        jLabel5.setText("Valor");

        jButtonTransferir.setText("Transferir");
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar Contas");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldIdConta, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jLabelValorSaldo)
                    .addComponent(jLabelInstituicao)
                    .addComponent(jLabelIdConta)
                    .addComponent(jTextFieldInstituicao))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldConta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonTransferir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(jTextFieldSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jButtonCadastrarConta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonAlterarConta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonExcluirConta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonVoltarConta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButtonMostrar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonLimparCamposConta)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButtonCarregarCamposConta)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdConta)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldConta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldConta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonTransferir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldSaldoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelValorSaldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldInstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTipoConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltarConta)
                    .addComponent(jButtonCadastrarConta)
                    .addComponent(jButtonLimparCamposConta)
                    .addComponent(jButtonAlterarConta)
                    .addComponent(jButtonExcluirConta)
                    .addComponent(jButtonMostrar)
                    .addComponent(jButtonCarregarCamposConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento utilizado para cadastrar os dados inseridos
     *
     * @param evt
     */
    private void jButtonCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarContaActionPerformed
        cadastrarConta();
        limparCamposConta();
        listarcontas();
    }//GEN-LAST:event_jButtonCadastrarContaActionPerformed
    /**
     * Evento utilizado para carregar os campos selecionados
     *
     * @param evt
     */
    private void jButtonCarregarCamposContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposContaActionPerformed
        carregarCamposConta();
    }//GEN-LAST:event_jButtonCarregarCamposContaActionPerformed
    /**
     * Evento utilizado para limpar os dados preenchidos nos campos
     *
     * @param evt
     */
    private void jButtonLimparCamposContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposContaActionPerformed
        limparCamposConta();
    }//GEN-LAST:event_jButtonLimparCamposContaActionPerformed
    /**
     * Evento utilizado para alterar as informações dos registros
     *
     * @param evt
     */
    private void jButtonAlterarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarContaActionPerformed
        alterarConta();
        limparCamposConta();
        listarcontas();
    }//GEN-LAST:event_jButtonAlterarContaActionPerformed
    /**
     * Evento utilizado para excluir os dados selecionados
     *
     * @param evt
     */
    private void jButtonExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirContaActionPerformed
        excluirConta();
        limparCamposConta();
        listarcontas();
    }//GEN-LAST:event_jButtonExcluirContaActionPerformed

    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        listarcontas();
    }//GEN-LAST:event_jButtonMostrarActionPerformed
    /**
     * Evento utilizado para mostrar todas as contas registradas
     *
     * @param evt
     */
    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed
        transferirSaldo();
        listarcontas();
    }//GEN-LAST:event_jButtonTransferirActionPerformed
    /**
     * Evento para voltar a tela menuInicialVIEW
     *
     * @param evt
     */
    private void jButtonVoltarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarContaActionPerformed
        fecharTela();
        menuInicialVIEW menuinicial = new menuInicialVIEW();
        menuinicial.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarContaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmContaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarConta;
    private javax.swing.JButton jButtonCadastrarConta;
    private javax.swing.JButton jButtonCarregarCamposConta;
    private javax.swing.JButton jButtonExcluirConta;
    private javax.swing.JButton jButtonLimparCamposConta;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JButton jButtonVoltarConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelIdConta;
    private javax.swing.JLabel jLabelInstituicao;
    private javax.swing.JLabel jLabelTipoConta;
    private javax.swing.JLabel jLabelValorSaldo;
    private javax.swing.JList<String> jList1tipoConta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConta;
    private javax.swing.JTextField jTextFieldConta1;
    private javax.swing.JTextField jTextFieldConta2;
    private javax.swing.JTextField jTextFieldIdConta;
    private javax.swing.JTextField jTextFieldInstituicao;
    private javax.swing.JTextField jTextFieldSaldo;
    private javax.swing.JTextField jTextFieldSaldoTotal;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que atualiza a TableModel e faz a soma do saldo total
     */
    private void listarcontas() {
        float saldoTotal = 0;
        try {
            ContaDAO objcontadao = new ContaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableConta.getModel();
            model.setNumRows(0);

            ArrayList<ContaDTO> lista = objcontadao.PesquisarConta();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_conta(),
                    lista.get(num).getSaldo_conta(),
                    lista.get(num).getTipo_conta(),
                    lista.get(num).getInstituicao(),});
                saldoTotal += lista.get(num).getSaldo_conta();
            }
            jTextFieldSaldoTotal.setText("R$ " + saldoTotal);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Contas View" + erro);

        }
    }

    /**
     * Método que carrega os campos selecionados
     */
    private void carregarCamposConta() {

        int setar = jTableConta.getSelectedRow();
        jTextFieldIdConta.setText(jTableConta.getModel().getValueAt(setar, 0).toString());
        jTextFieldSaldo.setText(jTableConta.getModel().getValueAt(setar, 1).toString());
        jTextFieldInstituicao.setText(jTableConta.getModel().getValueAt(setar, 3).toString());
        jList1tipoConta.setSelectedValue(jTableConta.getModel().getValueAt(setar, 2).toString(), rootPaneCheckingEnabled);
    }

    /**
     * Método que cadastra as informações inseridas
     */
    private void cadastrarConta() {
        String tipoConta, instituicao;
        Float saldo;

        tipoConta = jList1tipoConta.getSelectedValue();
        saldo = Float.parseFloat(jTextFieldSaldo.getText());
        instituicao = (jTextFieldInstituicao.getText());

        ContaDTO objcontadto = new ContaDTO();

        objcontadto.setTipo_conta(tipoConta);
        objcontadto.setSaldo_conta(saldo);
        objcontadto.setInstituicao(instituicao);

        ContaDAO objcontadao = new ContaDAO();
        objcontadao.cadastrarConta(objcontadto);
    }

    /**
     * Método que limpa os campos preenchidos
     */
    private void limparCamposConta() {
        jTextFieldIdConta.setText("");
        jTextFieldSaldo.setText("");
        jTextFieldInstituicao.setText("");
        jList1tipoConta.clearSelection();
        jTextFieldConta1.setText("");
        jTextFieldConta2.setText("");
        jTextFieldValor.setText("");
    }

    /**
     * Método que altera as informações com os dados preenchidos
     */
    private void alterarConta() {
        String tipoConta, instituicao;
        Float saldo;
        int idConta;

        idConta = Integer.parseInt(jTextFieldIdConta.getText());
        saldo = Float.parseFloat(jTextFieldSaldo.getText());
        instituicao = jTextFieldInstituicao.getText();
        tipoConta = jList1tipoConta.getSelectedValue();

        ContaDTO objcontadto = new ContaDTO();
        objcontadto.setId_conta(idConta);
        objcontadto.setSaldo_conta(saldo);
        objcontadto.setTipo_conta(tipoConta);
        objcontadto.setInstituicao(instituicao);
        ContaDAO objcontadao = new ContaDAO();
        objcontadao.alterarConta(objcontadto);

    }

    /**
     * Método que exclui os registros carregados
     */
    private void excluirConta() {
        int idConta;

        idConta = Integer.parseInt(jTextFieldIdConta.getText());

        ContaDTO objcontadto = new ContaDTO();
        objcontadto.setId_conta(idConta);

        ContaDAO objcontadao = new ContaDAO();
        objcontadao.excluirConta(objcontadto);
    }

    /**
     * Método que faz a transferência de saldo entre contas
     */
    private void transferirSaldo() {
        float saldoConta1 = 0, saldoConta2 = 0, valorTransferencia = 0, novoSaldo1 = 0, novoSaldo2 = 0;
        int idConta1, idConta2;

        idConta1 = Integer.parseInt(jTextFieldConta1.getText());
        idConta2 = Integer.parseInt(jTextFieldConta2.getText());

        valorTransferencia = Float.parseFloat(jTextFieldValor.getText());

        ContaDTO objcontadto = new ContaDTO();
        objcontadto.setConta1(idConta1);
        objcontadto.setConta2(idConta2);
        if (idConta1 < idConta2) {
            try {
                ContaDAO objcontadao = new ContaDAO();

                DefaultTableModel model = (DefaultTableModel) jTableConta.getModel();
                model.setNumRows(0);

                ArrayList<ContaDTO> lista = objcontadao.transferirSaldoASC(objcontadto);

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_conta(),
                        lista.get(num).getSaldo_conta(),
                        lista.get(num).getTipo_conta(),
                        lista.get(num).getInstituicao(),});

                }
                saldoConta1 = lista.get(0).getSaldo_conta();
                saldoConta2 = lista.get(1).getSaldo_conta();
                novoSaldo1 = saldoConta1 - valorTransferencia;
                novoSaldo2 = saldoConta2 + valorTransferencia;

                objcontadto.setNovoSaldo1(novoSaldo1);
                objcontadto.setNovoSaldo2(novoSaldo2);

                objcontadao.alterarSaldo1(objcontadto);
                objcontadao.alterarSaldo2(objcontadto);

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Transferir ASC View " + erro);

            }
        }
        if (idConta1 > idConta2) {
            try {
                ContaDAO objcontadao = new ContaDAO();

                DefaultTableModel model = (DefaultTableModel) jTableConta.getModel();
                model.setNumRows(0);

                ArrayList<ContaDTO> lista = objcontadao.transferirSaldoDSC(objcontadto);

                for (int num = 0; num < lista.size(); num++) {
                    model.addRow(new Object[]{
                        lista.get(num).getId_conta(),
                        lista.get(num).getSaldo_conta(),
                        lista.get(num).getTipo_conta(),
                        lista.get(num).getInstituicao(),});

                }
                saldoConta1 = lista.get(0).getSaldo_conta();
                saldoConta2 = lista.get(1).getSaldo_conta();
                novoSaldo1 = saldoConta1 - valorTransferencia;
                novoSaldo2 = saldoConta2 + valorTransferencia;

                objcontadto.setNovoSaldo1(novoSaldo1);
                objcontadto.setNovoSaldo2(novoSaldo2);

                objcontadao.alterarSaldo1(objcontadto);
                objcontadao.alterarSaldo2(objcontadto);

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Transferir DSC View " + erro);

            }
        }
    }

    /**
     * Método utilizado para fechar a tela
     */
    public void fecharTela() {
        WindowEvent fecharTela = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(fecharTela);
    }
}
