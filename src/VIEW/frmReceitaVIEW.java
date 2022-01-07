package VIEW;

import DAO.ReceitaDAO;
import DTO.ReceitaDTO;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelValorReceita.setText("Valor");

        jLabelDataRecebimentoReceita.setText("Data Recebimento   Mês/Dia/Ano");

        jLabelDataRecebimentoEsperado.setText("Data Recebimento Esperado Mês/Dia/Ano");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelContaReceita)
                                    .addComponent(jLabelTipoReceita)
                                    .addComponent(jLabelDescricaoReceita)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jTextFieldFiltroTipo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(jTextFieldContaReceita, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelDataRecebimentoEsperado)
                                        .addComponent(jLabelValorReceita)
                                        .addComponent(jLabelIdReceita)
                                        .addComponent(jLabelDataRecebimentoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldValorReceita, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(jTextFieldIdReceita)
                                        .addComponent(jTextFieldRecebimento)
                                        .addComponent(jTextFieldRecebimentoEsperado)))
                                .addComponent(jTextFieldDescricaoReceita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrarReceita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonVoltarReceita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonFiltroData))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldFiltroDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFiltroDataFim))))
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarregarCampos))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdReceita)
                            .addComponent(jTextFieldIdReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorReceita)
                            .addComponent(jTextFieldValorReceita))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataRecebimentoReceita)
                            .addComponent(jTextFieldRecebimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataRecebimentoEsperado)
                            .addComponent(jTextFieldRecebimentoEsperado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescricaoReceita)
                            .addComponent(jTextFieldDescricaoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelContaReceita)
                            .addComponent(jTextFieldContaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipoReceita)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldFiltroTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldFiltroDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldFiltroDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarregarCampos)
                    .addComponent(jButtonVoltarReceita)
                    .addComponent(jButtonCadastrarReceita)
                    .addComponent(jButtonLimparCampos)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFiltroData))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento do botão Cadastrar
     *
     * @param evt
     */
    private void jButtonCadastrarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarReceitaActionPerformed
        cadastrarReceita();
        listarReceitas();    //Evento do botão "Cadastrar", onde faz a inserção, atualiza a lista e limpa os campos
        limparCampos();
    }//GEN-LAST:event_jButtonCadastrarReceitaActionPerformed
    /**
     * Evento do botão Carregar Campos
     *
     * @param evt
     */
    private void jButtonCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposActionPerformed
        carregarCampos();   //Evento do botão "Carregar Campos", onde seta os TextFields com os registros selecionados
    }//GEN-LAST:event_jButtonCarregarCamposActionPerformed
    /**
     * Evento do botão Limpar Campos
     *
     * @param evt
     */
    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        limparCampos();    //Evento do botão "Limpar Campos", onde deixa em branco os TextFields
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed
    /**
     * Evento do botão Alterar
     *
     * @param evt
     */
    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarReceita();
        listarReceitas(); //Evento do botão "Alterar", onde substitui os dados da tabela
        limparCampos();
    }//GEN-LAST:event_jButtonAlterarActionPerformed
    /**
     * Evento do botão Excluir
     *
     * @param evt
     */
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirReceita();  //Evento do botão "Excluir", onde exclui os registros selecionados
        listarReceitas();
        limparCampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTextFieldFiltroTipoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltroTipoKeyReleased
        String query = jTextFieldFiltroTipo.getText();
        filtro(query);
    }//GEN-LAST:event_jTextFieldFiltroTipoKeyReleased

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
    private javax.swing.JButton jButtonVoltarReceita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelContaReceita;
    private javax.swing.JLabel jLabelDataRecebimentoEsperado;
    private javax.swing.JLabel jLabelDataRecebimentoReceita;
    private javax.swing.JLabel jLabelDescricaoReceita;
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
    private javax.swing.JTextField jTextFieldValorReceita;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que atualiza a TableModel
     */
    private void listarReceitas() {
        try {
            ReceitaDAO objreceitadao = new ReceitaDAO();

            DefaultTableModel model = (DefaultTableModel) jTableReceita.getModel();
            model.setNumRows(0);

            ArrayList<ReceitaDTO> lista = objreceitadao.PesquisarReceita();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_receita(),
                    lista.get(num).getValor_receita(),
                    lista.get(num).getDataRecebimento_receita(),
                    lista.get(num).getDataRecebimentoEsperado_receita(),
                    lista.get(num).getDescricao_receita(),
                    lista.get(num).getConta_receita(),
                    lista.get(num).getTipo_receita()
                });
            }

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
    }

    /**
     * Método que cadastra as informações inseridas
     */
    private void cadastrarReceita() {
        String descricaoReceita, tipoReceita;
        Float valorReceita;
        int contaReceita;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date dataRecebimentoReceita = new java.util.Date(jTextFieldRecebimento.getText());
        java.util.Date dataRecebimentoEsperadoReceita = new java.util.Date(jTextFieldRecebimentoEsperado.getText());

        Date b = new java.sql.Date(dataRecebimentoReceita.getTime());
        Date c = new java.sql.Date(dataRecebimentoEsperadoReceita.getTime());

        descricaoReceita = jTextFieldDescricaoReceita.getText();
        tipoReceita = jList1tipoReceita.getSelectedValue();
        valorReceita = Float.parseFloat(jTextFieldValorReceita.getText());
        contaReceita = Integer.parseInt(jTextFieldContaReceita.getText());

        ReceitaDTO objreceitadto = new ReceitaDTO();

        objreceitadto.setConta_receita(contaReceita);
        objreceitadto.setValor_receita(valorReceita);
        objreceitadto.setDataRecebimento_receita(b);
        objreceitadto.setDataRecebimentoEsperado_receita(c);
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
        jTextFieldDescricaoReceita.requestFocus();
    }

    /**
     * Método que altera as informações com os dados preenchidos
     */
    private void alterarReceita() {
        String descricaoReceita, tipoReceita;
        Float valorReceita;
        int contaReceita, idReceita;
        java.util.Date dataRecebimentoReceita = new java.util.Date((jTextFieldRecebimento.getText()));
        java.util.Date dataRecebimentoEsperadoReceita = new java.util.Date(jTextFieldRecebimentoEsperado.getText());

        java.sql.Date b = new java.sql.Date(dataRecebimentoReceita.getTime());
        java.sql.Date c = new java.sql.Date(dataRecebimentoEsperadoReceita.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        idReceita = Integer.parseInt(jTextFieldIdReceita.getText());
        descricaoReceita = jTextFieldDescricaoReceita.getText();
        tipoReceita = jList1tipoReceita.getSelectedValue();
        valorReceita = Float.parseFloat(jTextFieldValorReceita.getText());
        contaReceita = Integer.parseInt(jTextFieldContaReceita.getText());

        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setId_receita(idReceita);
        objreceitadto.setConta_receita(contaReceita);
        objreceitadto.setDataRecebimentoEsperado_receita(b);
        objreceitadto.setDataRecebimento_receita(c);
        objreceitadto.setDescricao_receita(descricaoReceita);
        objreceitadto.setTipo_receita(tipoReceita);;
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
    private void filtro(String query){
        DefaultTableModel dm;
        dm = (DefaultTableModel) jTableReceita.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        jTableReceita.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
}
