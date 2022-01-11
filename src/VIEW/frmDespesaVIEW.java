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

import DAO.DespesaDAO;
import DTO.DespesaDTO;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * Formulário de interface para receber os valores da tabela despesas
 *
 * @author Patrick Renan Weber
 */
public class frmDespesaVIEW extends javax.swing.JFrame {

    public frmDespesaVIEW() {
        initComponents();
        listarDespesas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jList1tipoDespesa = new javax.swing.JList<>();
        jLabelTipoDespesa = new javax.swing.JLabel();
        jTextFieldContaDespesa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableDespesas = new javax.swing.JTable();
        jButtonCadastrarDespesa = new javax.swing.JButton();
        jLabelIdDespesa = new javax.swing.JLabel();
        jButtonVoltarDespesa = new javax.swing.JButton();
        jTextFieldIdDespesa = new javax.swing.JTextField();
        jButtonCarregarCamposDespesa = new javax.swing.JButton();
        jLabelValorDespesa = new javax.swing.JLabel();
        jTextFieldValorDespesa = new javax.swing.JTextField();
        jLabelDataPagamentoDespesa = new javax.swing.JLabel();
        jTextFieldDataPagementoDespesa = new javax.swing.JTextField();
        jLabelDataPagementoEsperadoDespesa = new javax.swing.JLabel();
        jTextFieldDataPagamentoEsperadoDespesa = new javax.swing.JTextField();
        jButtonLimparCamposDespesa = new javax.swing.JButton();
        jButtonAlterarDespesa = new javax.swing.JButton();
        jButtonExcluirDespesa = new javax.swing.JButton();
        jLabelConsultaFiltro = new javax.swing.JLabel();
        jTextFieldFiltroTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFiltroDataInicio = new javax.swing.JTextField();
        jTextFieldFiltroDataFim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonFiltroData = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jLabelDespesaTotal = new javax.swing.JLabel();
        jTextFieldDespesaTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1tipoDespesa.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "alimentacao", "educacao", "lazer", "moradia", "roupa", "saude", "transporte", "outros"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });

        jLabelTipoDespesa.setText("Tipo Despesa");

        jTableDespesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Valor", "Data Pagamento", "Data Pagamento Esperado","Conta", "Tipo Despesa" }
        ));
        jScrollPane2.setViewportView(jTableDespesas);

        jButtonCadastrarDespesa.setText("Cadastrar");
        jButtonCadastrarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarDespesaActionPerformed(evt);
            }
        });

        jLabelIdDespesa.setText("Código");

        jButtonVoltarDespesa.setText("Voltar");
        jButtonVoltarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarDespesaActionPerformed(evt);
            }
        });

        jTextFieldIdDespesa.setEnabled(false);

        jButtonCarregarCamposDespesa.setText("Carregar Campos");
        jButtonCarregarCamposDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposDespesaActionPerformed(evt);
            }
        });

        jLabelValorDespesa.setText("Valor");

        jLabelDataPagamentoDespesa.setText("Data Pagamento");

        jTextFieldDataPagementoDespesa.setToolTipText("");

        jLabelDataPagementoEsperadoDespesa.setText("Data Pagamento Esperado");

        jButtonLimparCamposDespesa.setText("Limpar Campos");
        jButtonLimparCamposDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposDespesaActionPerformed(evt);
            }
        });

        jButtonAlterarDespesa.setText("Alterar");
        jButtonAlterarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarDespesaActionPerformed(evt);
            }
        });

        jButtonExcluirDespesa.setText("Excluir");
        jButtonExcluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirDespesaActionPerformed(evt);
            }
        });

        jLabelConsultaFiltro.setText("Consulta por Tipo");

        jTextFieldFiltroTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroTipoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Filtros");

        jLabel3.setText("Data Início:");

        jLabel4.setText("Data Fim:");

        jButtonFiltroData.setText("Filtrar Data");
        jButtonFiltroData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltroDataActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar Depesas");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jLabelDespesaTotal.setText("Total Depesas");

        jTextFieldDespesaTotal.setEnabled(false);

        jLabel1.setText("Conta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldIdDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIdDespesa)
                            .addComponent(jTextFieldDataPagementoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataPagementoEsperadoDespesa)
                            .addComponent(jTextFieldDataPagamentoEsperadoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataPagamentoDespesa)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jList1tipoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelValorDespesa)
                            .addComponent(jLabelTipoDespesa))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldFiltroDataInicio)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabelConsultaFiltro)
                                                    .addComponent(jTextFieldFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabelDespesaTotal)
                                                .addGap(42, 42, 42)
                                                .addComponent(jTextFieldDespesaTotal)))
                                        .addGap(26, 26, 26))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldFiltroDataFim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonFiltroData)
                                        .addGap(50, 50, 50))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrarDespesa)
                        .addGap(2, 2, 2)
                        .addComponent(jButtonAlterarDespesa)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonExcluirDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVoltarDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButtonMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparCamposDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarregarCamposDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelConsultaFiltro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldFiltroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFiltroDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFiltroData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jTextFieldValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTipoDespesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jList1tipoDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdDespesa)
                            .addComponent(jLabelValorDespesa)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIdDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldContaDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataPagamentoDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jTextFieldDataPagementoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDataPagementoEsperadoDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDataPagamentoEsperadoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDespesaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDespesaTotal))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLimparCamposDespesa)
                        .addComponent(jButtonCarregarCamposDespesa)
                        .addComponent(jButtonMostrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCadastrarDespesa)
                        .addComponent(jButtonAlterarDespesa)
                        .addComponent(jButtonExcluirDespesa)
                        .addComponent(jButtonVoltarDespesa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento utilizado para cadastrar os dados inseridos
     *
     * @param evt
     */
    private void jButtonCadastrarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarDespesaActionPerformed
        cadastrarDespesa();
        listarDespesas();
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonCadastrarDespesaActionPerformed
    /**
     * Evento utilizado para carregar os campos selecionados
     *
     * @param evt
     */
    private void jButtonCarregarCamposDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposDespesaActionPerformed
        carregarCamposDespesa();
    }//GEN-LAST:event_jButtonCarregarCamposDespesaActionPerformed
    /**
     * Evento utilizado para limpar os dados preenchidos nos campos
     *
     * @param evt
     */
    private void jButtonLimparCamposDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposDespesaActionPerformed
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonLimparCamposDespesaActionPerformed
    /**
     * Evento utilizado para alterar as informações dos registros
     *
     * @param evt
     */
    private void jButtonAlterarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarDespesaActionPerformed
        alterarDespesa();
        listarDespesas();
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonAlterarDespesaActionPerformed
    /**
     * Evento utilizado para excluir os dados selecionados
     *
     * @param evt
     */
    private void jButtonExcluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirDespesaActionPerformed
        excluirDespesa();
        listarDespesas();
        limparCamposDespesa();
    }//GEN-LAST:event_jButtonExcluirDespesaActionPerformed
    /**
     * Evento utilizado para filtrar na lista o tipo de despesa
     *
     * @param evt
     */
    private void jTextFieldFiltroTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroTipoKeyReleased
        String query = jTextFieldFiltroTipo.getText();
        filtro(query);
    }//GEN-LAST:event_jTextFieldFiltroTipoKeyReleased
    /**
     * Evento utilizado para filtrar na lista registros em um período de data
     *
     * @param evt
     */
    private void jButtonFiltroDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltroDataActionPerformed
        filtroData();
    }//GEN-LAST:event_jButtonFiltroDataActionPerformed
    /**
     * Evento utilizado para mostrar todas as despesas registradas
     *
     * @param evt
     */
    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        listarDespesas();
    }//GEN-LAST:event_jButtonMostrarActionPerformed
    /**
     * Evento para voltar a tela menuInicialVIEW
     *
     * @param evt
     */
    private void jButtonVoltarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarDespesaActionPerformed
        fecharTela();
        menuInicialVIEW menuinicial = new menuInicialVIEW();
        menuinicial.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarDespesaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDespesaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarDespesa;
    private javax.swing.JButton jButtonCadastrarDespesa;
    private javax.swing.JButton jButtonCarregarCamposDespesa;
    private javax.swing.JButton jButtonExcluirDespesa;
    private javax.swing.JButton jButtonFiltroData;
    private javax.swing.JButton jButtonLimparCamposDespesa;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonVoltarDespesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelConsultaFiltro;
    private javax.swing.JLabel jLabelDataPagamentoDespesa;
    private javax.swing.JLabel jLabelDataPagementoEsperadoDespesa;
    private javax.swing.JLabel jLabelDespesaTotal;
    private javax.swing.JLabel jLabelIdDespesa;
    private javax.swing.JLabel jLabelTipoDespesa;
    private javax.swing.JLabel jLabelValorDespesa;
    private javax.swing.JList<String> jList1tipoDespesa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableDespesas;
    private javax.swing.JTextField jTextFieldContaDespesa;
    private javax.swing.JTextField jTextFieldDataPagamentoEsperadoDespesa;
    private javax.swing.JTextField jTextFieldDataPagementoDespesa;
    private javax.swing.JTextField jTextFieldDespesaTotal;
    private javax.swing.JTextField jTextFieldFiltroDataFim;
    private javax.swing.JTextField jTextFieldFiltroDataInicio;
    private javax.swing.JTextField jTextFieldFiltroTipo;
    private javax.swing.JTextField jTextFieldIdDespesa;
    private javax.swing.JTextField jTextFieldValorDespesa;
    // End of variables declaration//GEN-END:variables
    /**
     * Método que atualiza a TableModel
     */
    private void listarDespesas() {
        float despesaTotal = 0;
        DespesaDAO objdespesadao = new DespesaDAO();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {

            DefaultTableModel model = (DefaultTableModel) jTableDespesas.getModel();
            model.setNumRows(0);

            ArrayList<DespesaDTO> lista = objdespesadao.PesquisarDespesa();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_despesa(),
                    lista.get(num).getValor_despesa(),
                    formatador.format(lista.get(num).getDataPagamento_despesa()),
                    formatador.format(lista.get(num).getDataPagamentoEsperado_despesa()),
                    lista.get(num).getConta_despesa(),
                    lista.get(num).getTipo_despesa()});
                despesaTotal += lista.get(num).getValor_despesa();
            }
            jTextFieldDespesaTotal.setText("R$ " + despesaTotal);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Despesas View" + erro);

        }
    }

    /**
     * Método que carrega os campos selecionados
     */
    private void carregarCamposDespesa() {

        int setar = jTableDespesas.getSelectedRow();
        jTextFieldIdDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 0).toString());
        jTextFieldValorDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 1).toString());
        jTextFieldDataPagementoDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 2).toString());
        jTextFieldDataPagamentoEsperadoDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 3).toString());
        jTextFieldContaDespesa.setText(jTableDespesas.getModel().getValueAt(setar, 4).toString());
        jList1tipoDespesa.setSelectedValue(jTableDespesas.getModel().getValueAt(setar, 5).toString(), rootPaneCheckingEnabled);
    }

    /**
     * Método que cadastra as informações inseridas
     */
    private void cadastrarDespesa() {
        String tipoDespesa;
        Float valorDespesa;
        int contaDespesa;

        String[] dataPagSep = jTextFieldDataPagementoDespesa.getText().split("/");
        String[] dataPagEspSep = jTextFieldDataPagamentoEsperadoDespesa.getText().split("/");
        LocalDate dataPagamento = LocalDate.of(Integer.parseInt(dataPagSep[2]), Integer.parseInt(dataPagSep[1]), Integer.parseInt(dataPagSep[0]));
        LocalDate dataPagamentoEsperado = LocalDate.of(Integer.parseInt(dataPagEspSep[2]), Integer.parseInt(dataPagEspSep[1]), Integer.parseInt(dataPagEspSep[0]));

        tipoDespesa = jList1tipoDespesa.getSelectedValue();
        valorDespesa = Float.parseFloat(jTextFieldValorDespesa.getText());
        contaDespesa = Integer.parseInt(jTextFieldContaDespesa.getText());

        DespesaDTO objdespesadto = new DespesaDTO();

        objdespesadto.setConta_despesa(contaDespesa);
        objdespesadto.setValor_despesa(valorDespesa);
        objdespesadto.setDataPagamento_despesa(dataPagamento);
        objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperado);
        objdespesadto.setTipo_despesa(tipoDespesa);

        DespesaDAO objdespesadao = new DespesaDAO();
        objdespesadao.cadastrarDespesa(objdespesadto);
    }

    /**
     * Método que limpa os campos preenchidos
     */
    private void limparCamposDespesa() {
        jTextFieldIdDespesa.setText("");
        jTextFieldValorDespesa.setText("");
        jTextFieldDataPagementoDespesa.setText("");
        jTextFieldDataPagamentoEsperadoDespesa.setText("");
        jTextFieldContaDespesa.setText("");
        jList1tipoDespesa.clearSelection();
        jTextFieldFiltroDataInicio.setText("");
        jTextFieldFiltroDataFim.setText("");

    }

    /**
     * Método que altera as informações com os dados preenchidos
     */
    private void alterarDespesa() {
        String tipoDespesa;
        Float valorDespesa;
        int contaDespesa, idDespesa;

        String[] dataPagSep = jTextFieldDataPagementoDespesa.getText().split("/");
        String[] dataPagEspSep = jTextFieldDataPagamentoEsperadoDespesa.getText().split("/");
        LocalDate dataPagamento = LocalDate.of(Integer.parseInt(dataPagSep[2]), Integer.parseInt(dataPagSep[1]), Integer.parseInt(dataPagSep[0]));
        LocalDate dataPagamentoEsperado = LocalDate.of(Integer.parseInt(dataPagEspSep[2]), Integer.parseInt(dataPagEspSep[1]), Integer.parseInt(dataPagEspSep[0]));

        idDespesa = Integer.parseInt(jTextFieldIdDespesa.getText());
        tipoDespesa = jList1tipoDespesa.getSelectedValue();
        valorDespesa = Float.parseFloat(jTextFieldValorDespesa.getText());
        contaDespesa = Integer.parseInt(jTextFieldContaDespesa.getText());

        DespesaDTO objdespesadto = new DespesaDTO();
        objdespesadto.setId_despesa(idDespesa);
        objdespesadto.setConta_despesa(contaDespesa);
        objdespesadto.setDataPagamentoEsperado_despesa(dataPagamentoEsperado);
        objdespesadto.setDataPagamento_despesa(dataPagamento);
        objdespesadto.setTipo_despesa(tipoDespesa);
        objdespesadto.setValor_despesa(valorDespesa);

        DespesaDAO objdespesadao = new DespesaDAO();
        objdespesadao.alterarDespesa(objdespesadto);

    }

    /**
     * Método que exclui os registros carregados
     */
    private void excluirDespesa() {
        int idDespesa;

        idDespesa = Integer.parseInt(jTextFieldIdDespesa.getText());

        DespesaDTO objdespesadto = new DespesaDTO();
        objdespesadto.setId_despesa(idDespesa);
        DespesaDAO objdespesadao = new DespesaDAO();
        objdespesadao.excluirDespesa(objdespesadto);
    }

    /**
     * Método de pesquisa por filtro da tabela despesas
     */
    private void filtro(String query) {
        DefaultTableModel dm;
        dm = (DefaultTableModel) jTableDespesas.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jTableDespesas.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    private void filtroData() {

        String[] dataInSep;
        dataInSep = jTextFieldFiltroDataInicio.getText().split("/");
        String[] dataFimSep;
        dataFimSep = jTextFieldFiltroDataFim.getText().split("/");
        LocalDate dataInicio;
        dataInicio = LocalDate.of(Integer.parseInt(dataInSep[2]), Integer.parseInt(dataInSep[1]), Integer.parseInt(dataInSep[0]));
        LocalDate dataFim;
        dataFim = LocalDate.of(Integer.parseInt(dataFimSep[2]), Integer.parseInt(dataFimSep[1]), Integer.parseInt(dataFimSep[0]));

        DespesaDTO objdespesadto = new DespesaDTO();
        objdespesadto.setDataInicio(dataInicio);
        objdespesadto.setDataFim(dataFim);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            DespesaDAO objreceitadao = new DespesaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableDespesas.getModel();
            model.setNumRows(0);

            ArrayList<DespesaDTO> lista = objreceitadao.PesquisarData(objdespesadto);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_despesa(),
                    lista.get(num).getValor_despesa(),
                    formatador.format(lista.get(num).getDataPagamento_despesa()),
                    formatador.format(lista.get(num).getDataPagamentoEsperado_despesa()),
                    lista.get(num).getConta_despesa(),
                    lista.get(num).getTipo_despesa()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Receitas Data View " + erro);

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
