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

import DAO.ReceitaDAO;
import DTO.ReceitaDTO;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * Formulário de interface para receber os valores da tabela receitas
 *
 * @author Patrick Renan Weber
 */
public class frmReceitaVIEW extends javax.swing.JFrame {

    public frmReceitaVIEW() {
        initComponents();
        listarReceitas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelValorReceita = new javax.swing.JLabel();
        jTextFieldValorReceita = new javax.swing.JTextField();
        jLabelDataRecebimentoReceita = new javax.swing.JLabel();
        jLabelDataRecebimentoEsperado = new javax.swing.JLabel();
        jTextFieldDescricaoReceita = new javax.swing.JTextField();
        jLabelDescricaoReceita = new javax.swing.JLabel();
        jLabelContaReceita = new javax.swing.JLabel();
        jLabelTipoReceita = new javax.swing.JLabel();
        jTextFieldContaReceita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1tipoReceita = new javax.swing.JList<>();
        jButtonCadastrarReceita = new javax.swing.JButton();
        jButtonVoltarReceita = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableReceita = new javax.swing.JTable();
        jLabelIdReceita = new javax.swing.JLabel();
        jTextFieldIdReceita = new javax.swing.JTextField();
        jButtonCarregarCampos = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldRecebimento = new javax.swing.JTextField();
        jTextFieldRecebimentoEsperado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFiltroTipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFiltroDataInicio = new javax.swing.JTextField();
        jTextFieldFiltroDataFim = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonFiltroData = new javax.swing.JButton();
        jButtonMostrar = new javax.swing.JButton();
        jLabelDespesaTotal = new javax.swing.JLabel();
        jTextFieldReceitaTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelValorReceita.setText("Valor");

        jLabelDataRecebimentoReceita.setText("Data Recebimento ");

        jLabelDataRecebimentoEsperado.setText("Data Recebimento Esperado ");

        jLabelDescricaoReceita.setText("Descrição");

        jLabelContaReceita.setText("Conta");

        jLabelTipoReceita.setText("Tipo Receita");

        jList1tipoReceita.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "salario", "presente", "premio", "outros"};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1tipoReceita);

        jButtonCadastrarReceita.setText("Cadastrar");
        jButtonCadastrarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarReceitaActionPerformed(evt);
            }
        });

        jButtonVoltarReceita.setText("Voltar");
        jButtonVoltarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarReceitaActionPerformed(evt);
            }
        });

        jTableReceita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Valor", "Data Recebimento", "Data Recebimento Esperado", "Descrição", "Conta", "Tipo Receita"
            }
        ));
        jScrollPane2.setViewportView(jTableReceita);

        jLabelIdReceita.setText("Código Receita");

        jTextFieldIdReceita.setEnabled(false);

        jButtonCarregarCampos.setText("Carregar Campos");
        jButtonCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarregarCamposActionPerformed(evt);
            }
        });

        jButtonLimparCampos.setText("Limpar Campos");
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Consulta por Tipo");

        jTextFieldFiltroTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldFiltroTipoKeyReleased(evt);
            }
        });

        jLabel2.setText("Consulta por Data");

        jLabel3.setText("Data Início:");

        jLabel4.setText("Data Fim:");

        jButtonFiltroData.setText("Filtrar Data");
        jButtonFiltroData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltroDataActionPerformed(evt);
            }
        });

        jButtonMostrar.setText("Mostrar Receitas");
        jButtonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarActionPerformed(evt);
            }
        });

        jLabelDespesaTotal.setText("Total Receitas");

        jTextFieldReceitaTotal.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelIdReceita)
                        .addGap(195, 195, 195))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelValorReceita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldRecebimentoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldDescricaoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataRecebimentoEsperado)
                            .addComponent(jLabelDataRecebimentoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelContaReceita)
                            .addComponent(jLabelTipoReceita)
                            .addComponent(jLabelDescricaoReceita)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldFiltroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFiltroDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButtonFiltroData)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrarReceita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVoltarReceita)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addComponent(jLabelDespesaTotal)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldReceitaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonMostrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonLimparCampos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonCarregarCampos))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdReceita)
                            .addComponent(jTextFieldIdReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorReceita)
                            .addComponent(jTextFieldValorReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataRecebimentoReceita)
                            .addComponent(jTextFieldRecebimentoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataRecebimentoEsperado)
                            .addComponent(jTextFieldRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescricaoReceita)
                            .addComponent(jTextFieldDescricaoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContaReceita)
                            .addComponent(jTextFieldContaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoReceita)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldFiltroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldFiltroDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonFiltroData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCadastrarReceita)
                            .addComponent(jButtonVoltarReceita)
                            .addComponent(jButtonAlterar)
                            .addComponent(jButtonExcluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldReceitaTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDespesaTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCarregarCampos)
                            .addComponent(jButtonLimparCampos)
                            .addComponent(jButtonMostrar)))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento utilizado para cadastrar os dados inseridos
     *
     * @param evt
     */
    private void jButtonCadastrarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarReceitaActionPerformed
        cadastrarReceita();
        listarReceitas();
        limparCampos();
    }//GEN-LAST:event_jButtonCadastrarReceitaActionPerformed
    /**
     * Evento utilizado para carregar os campos selecionados
     *
     * @param evt
     */
    private void jButtonCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposActionPerformed
        carregarCampos();
    }//GEN-LAST:event_jButtonCarregarCamposActionPerformed
    /**
     * Evento utilizado para limpar os dados preenchidos nos campos
     *
     * @param evt
     */
    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed
    /**
     * Evento utilizado para alterar as informações dos registros
     *
     * @param evt
     */
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarReceita();
        listarReceitas();
        limparCampos();
    }//GEN-LAST:event_jButtonAlterarActionPerformed
    /**
     * Evento utilizado para excluir os dados selecionados
     *
     * @param evt
     */
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirReceita();
        listarReceitas();
        limparCampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    /**
     * Evento utilizado para filtrar na lista o tipo de receita
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
     * Evento utilizado para mostrar todas as receitas registradas
     *
     * @param evt
     */
    private void jButtonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarActionPerformed
        listarReceitas();
    }//GEN-LAST:event_jButtonMostrarActionPerformed
    /**
     * Evento para voltar a tela menuInicialVIEW
     *
     * @param evt
     */
    private void jButtonVoltarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarReceitaActionPerformed
        fecharTela();
        menuInicialVIEW menuinicial = new menuInicialVIEW();
        menuinicial.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarReceitaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReceitaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCadastrarReceita;
    private javax.swing.JButton jButtonCarregarCampos;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFiltroData;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonMostrar;
    private javax.swing.JButton jButtonVoltarReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelContaReceita;
    private javax.swing.JLabel jLabelDataRecebimentoEsperado;
    private javax.swing.JLabel jLabelDataRecebimentoReceita;
    private javax.swing.JLabel jLabelDescricaoReceita;
    private javax.swing.JLabel jLabelDespesaTotal;
    private javax.swing.JLabel jLabelIdReceita;
    private javax.swing.JLabel jLabelTipoReceita;
    private javax.swing.JLabel jLabelValorReceita;
    private javax.swing.JList<String> jList1tipoReceita;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableReceita;
    private javax.swing.JTextField jTextFieldContaReceita;
    private javax.swing.JTextField jTextFieldDescricaoReceita;
    private javax.swing.JTextField jTextFieldFiltroDataFim;
    private javax.swing.JTextField jTextFieldFiltroDataInicio;
    private javax.swing.JTextField jTextFieldFiltroTipo;
    private javax.swing.JTextField jTextFieldIdReceita;
    private javax.swing.JTextField jTextFieldRecebimento;
    private javax.swing.JTextField jTextFieldRecebimentoEsperado;
    private javax.swing.JTextField jTextFieldReceitaTotal;
    private javax.swing.JTextField jTextFieldValorReceita;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que popula a TableModel
     */
    private void listarReceitas() {
        float receitaTotal = 0;
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            ReceitaDAO objreceitadao = new ReceitaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableReceita.getModel();
            model.setNumRows(0);

            ArrayList<ReceitaDTO> lista = objreceitadao.PesquisarReceita();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_receita(),
                    lista.get(num).getValor_receita(),
                    formatador.format(lista.get(num).getDataRecebimento_receita()),
                    formatador.format(lista.get(num).getDataRecebimentoEsperado_receita()),
                    lista.get(num).getDescricao_receita(),
                    lista.get(num).getConta_receita(),
                    lista.get(num).getTipo_receita()
                });
                receitaTotal += lista.get(num).getValor_receita();
            }
            jTextFieldReceitaTotal.setText("R$ " + receitaTotal);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Receitas View" + erro);

        }
    }

    /**
     * Método que carrega os campos selecionados
     */
    private void carregarCampos() {

        int setar = jTableReceita.getSelectedRow();
        jTextFieldIdReceita.setText(jTableReceita.getModel().getValueAt(setar, 0).toString());
        jTextFieldValorReceita.setText(jTableReceita.getModel().getValueAt(setar, 1).toString());
        jTextFieldRecebimento.setText(jTableReceita.getModel().getValueAt(setar, 2).toString());
        jTextFieldRecebimentoEsperado.setText(jTableReceita.getModel().getValueAt(setar, 3).toString());
        jTextFieldDescricaoReceita.setText(jTableReceita.getModel().getValueAt(setar, 4).toString());
        jTextFieldContaReceita.setText(jTableReceita.getModel().getValueAt(setar, 5).toString());
        jList1tipoReceita.setSelectedValue(jTableReceita.getModel().getValueAt(setar, 6).toString(), rootPaneCheckingEnabled);
    }

    /**
     * Método que cadastra as informações inseridas
     */
    private void cadastrarReceita() {
        String descricaoReceita, tipoReceita;
        float valorReceita;
        int contaReceita;

        String[] dataRecSep = jTextFieldRecebimento.getText().split("/");
        String[] dataRecEspSep = jTextFieldRecebimentoEsperado.getText().split("/");
        LocalDate dataRecebimentoReceita = LocalDate.of(Integer.parseInt(dataRecSep[2]), Integer.parseInt(dataRecSep[1]), Integer.parseInt(dataRecSep[0]));
        LocalDate dataRecebimentoEsperadoReceita = LocalDate.of(Integer.parseInt(dataRecEspSep[2]), Integer.parseInt(dataRecEspSep[1]), Integer.parseInt(dataRecEspSep[0]));

        descricaoReceita = jTextFieldDescricaoReceita.getText();
        tipoReceita = jList1tipoReceita.getSelectedValue();
        valorReceita = Float.parseFloat(jTextFieldValorReceita.getText());
        contaReceita = Integer.parseInt(jTextFieldContaReceita.getText());

        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setConta_receita(contaReceita);
        objreceitadto.setValor_receita(valorReceita);
        objreceitadto.setDataRecebimento_receita(dataRecebimentoReceita);
        objreceitadto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperadoReceita);
        objreceitadto.setDescricao_receita(descricaoReceita);
        objreceitadto.setTipo_receita(tipoReceita);

        ReceitaDAO objreceitadao = new ReceitaDAO();
        objreceitadao.cadastrarReceita(objreceitadto);
    }

    /**
     * Método que limpa os campos preenchidos
     */
    private void limparCampos() {
        jTextFieldIdReceita.setText("");
        jTextFieldValorReceita.setText("");
        jTextFieldRecebimento.setText("");
        jTextFieldRecebimentoEsperado.setText("");
        jTextFieldDescricaoReceita.setText("");
        jTextFieldContaReceita.setText("");
        jList1tipoReceita.clearSelection();
        jTextFieldFiltroDataInicio.setText("");
        jTextFieldFiltroDataFim.setText("");

    }

    /**
     * Método que altera as informações com os dados preenchidos
     */
    private void alterarReceita() {
        String descricaoReceita, tipoReceita;
        Float valorReceita;
        int contaReceita, idReceita;
        String[] dataRecSep = jTextFieldRecebimento.getText().split("/");
        String[] dataRecEspSep = jTextFieldRecebimentoEsperado.getText().split("/");

        LocalDate dataRecebimentoReceita = LocalDate.of(Integer.parseInt(dataRecSep[2]), Integer.parseInt(dataRecSep[1]), Integer.parseInt(dataRecSep[0]));
        LocalDate dataRecebimentoEsperadoReceita = LocalDate.of(Integer.parseInt(dataRecEspSep[2]), Integer.parseInt(dataRecEspSep[1]), Integer.parseInt(dataRecEspSep[0]));

        idReceita = Integer.parseInt(jTextFieldIdReceita.getText());
        descricaoReceita = jTextFieldDescricaoReceita.getText();
        tipoReceita = jList1tipoReceita.getSelectedValue();
        valorReceita = Float.parseFloat(jTextFieldValorReceita.getText());
        contaReceita = Integer.parseInt(jTextFieldContaReceita.getText());

        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setId_receita(idReceita);
        objreceitadto.setConta_receita(contaReceita);
        objreceitadto.setDataRecebimento_receita(dataRecebimentoReceita);
        objreceitadto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperadoReceita);
        objreceitadto.setDescricao_receita(descricaoReceita);
        objreceitadto.setTipo_receita(tipoReceita);
        objreceitadto.setValor_receita(valorReceita);

        ReceitaDAO objreceitadao = new ReceitaDAO();
        objreceitadao.alterarReceita(objreceitadto);

    }

    /**
     * Método que exclui os registros carregados
     */
    private void excluirReceita() {
        int idReceita;

        idReceita = Integer.parseInt(jTextFieldIdReceita.getText());

        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setId_receita(idReceita);
        ReceitaDAO objreceitadao = new ReceitaDAO();
        objreceitadao.excluirReceita(objreceitadto);
    }

    /**
     * Método de pesquisa por filtro da tabela receitas
     */
    private void filtro(String query) {
        DefaultTableModel dm;
        dm = (DefaultTableModel) jTableReceita.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dm);
        jTableReceita.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    /**
     * Método de pesquisa por data da tabela receitas
     */
    private void filtroData() {

        String[] dataInSep;
        dataInSep = jTextFieldFiltroDataInicio.getText().split("/");
        String[] dataFimSep;
        dataFimSep = jTextFieldFiltroDataFim.getText().split("/");
        LocalDate dataInicio;
        dataInicio = LocalDate.of(Integer.parseInt(dataInSep[2]), Integer.parseInt(dataInSep[1]), Integer.parseInt(dataInSep[0]));
        LocalDate dataFim;
        dataFim = LocalDate.of(Integer.parseInt(dataFimSep[2]), Integer.parseInt(dataFimSep[1]), Integer.parseInt(dataFimSep[0]));

        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setDataInicio(dataInicio);
        objreceitadto.setDataFim(dataFim);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            ReceitaDAO objreceitadao = new ReceitaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableReceita.getModel();
            model.setNumRows(0);

            ArrayList<ReceitaDTO> lista = objreceitadao.PesquisarData(objreceitadto);

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_receita(),
                    lista.get(num).getValor_receita(),
                    formatador.format(lista.get(num).getDataRecebimento_receita()),
                    formatador.format(lista.get(num).getDataRecebimentoEsperado_receita()),
                    lista.get(num).getDescricao_receita(),
                    lista.get(num).getConta_receita(),
                    lista.get(num).getTipo_receita()
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
