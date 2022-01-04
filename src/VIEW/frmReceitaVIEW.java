package VIEW;
import DAO.ReceitaDAO;
import DTO.ReceitaDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class frmReceitaVIEW extends javax.swing.JFrame {

    public frmReceitaVIEW() {
        initComponents();   
        listarReceitas();       //Retorna o método de lista logo no pageload
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelValorReceita = new javax.swing.JLabel();
        jTextFieldValorReceita = new javax.swing.JTextField();
        jLabelDataRecebimentoReceita = new javax.swing.JLabel();
        jTextFieldDataRecebimentoReceita = new javax.swing.JTextField();
        jLabelDataRecebimentoEsperado = new javax.swing.JLabel();
        jTextFieldDataRecebimentoEsperadoReceita = new javax.swing.JTextField();
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
        jLabelIdReceira = new javax.swing.JLabel();
        jTextFieldIdReceita = new javax.swing.JTextField();
        jButtonCarregarCampos = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelValorReceita.setText("Valor");

        jLabelDataRecebimentoReceita.setText("Data Recebimento");

        jLabelDataRecebimentoEsperado.setText("Data Recebimento Esperado");

        jLabelDescricaoReceita.setText("Descrição");

        jLabelContaReceita.setText("Conta");

        jLabelTipoReceita.setText("Tipo Receita");

        jList1tipoReceita.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Salário", "Presente", "Prêmio", "Outros"};
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

        jLabelIdReceira.setText("Código");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrarReceita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVoltarReceita))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelContaReceita)
                                .addComponent(jLabelTipoReceita)
                                .addComponent(jLabelDescricaoReceita))
                            .addGap(96, 96, 96)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldDescricaoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldContaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDataRecebimentoEsperado)
                                    .addComponent(jLabelDataRecebimentoReceita)
                                    .addComponent(jLabelValorReceita)
                                    .addComponent(jLabelIdReceira))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldDataRecebimentoReceita, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDataRecebimentoEsperadoReceita, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValorReceita)
                                    .addComponent(jTextFieldIdReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCarregarCampos))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdReceira)
                            .addComponent(jTextFieldIdReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelValorReceita)
                            .addComponent(jTextFieldValorReceita))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDataRecebimentoReceita)
                            .addComponent(jTextFieldDataRecebimentoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDataRecebimentoEsperado)
                            .addComponent(jTextFieldDataRecebimentoEsperadoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescricaoReceita)
                            .addComponent(jTextFieldDescricaoReceita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelContaReceita)
                            .addComponent(jTextFieldContaReceita, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabelTipoReceita))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCarregarCampos)
                    .addComponent(jButtonVoltarReceita)
                    .addComponent(jButtonCadastrarReceita)
                    .addComponent(jButtonLimparCampos)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(470, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarReceitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarReceitaActionPerformed
       cadastrarReceita();
       listarReceitas();    //Evento do botão "Cadastrar", onde faz a inserção, atualiza a lista e limpa os campos
       limparCampos();
    }//GEN-LAST:event_jButtonCadastrarReceitaActionPerformed

    private void jButtonCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarregarCamposActionPerformed
        carregarCampos();   //Evento do botão "Carregar Campos", onde seta os TextFields com os registros selecionados
    }//GEN-LAST:event_jButtonCarregarCamposActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        limparCampos();    //Evento do botão "Limpar Campos", onde deixa em branco os TextFields
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        alterarReceita();
        listarReceitas(); //Evento do botão "Alterar", onde substitui os dados da tabela
        limparCampos();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        excluirReceita();  //Evento do botão "Excluir", onde exclui os registros selecionados
        listarReceitas();
        limparCampos();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

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
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonVoltarReceita;
    private javax.swing.JLabel jLabelContaReceita;
    private javax.swing.JLabel jLabelDataRecebimentoEsperado;
    private javax.swing.JLabel jLabelDataRecebimentoReceita;
    private javax.swing.JLabel jLabelDescricaoReceita;
    private javax.swing.JLabel jLabelIdReceira;
    private javax.swing.JLabel jLabelTipoReceita;
    private javax.swing.JLabel jLabelValorReceita;
    private javax.swing.JList<String> jList1tipoReceita;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableReceita;
    private javax.swing.JTextField jTextFieldContaReceita;
    private javax.swing.JTextField jTextFieldDataRecebimentoEsperadoReceita;
    private javax.swing.JTextField jTextFieldDataRecebimentoReceita;
    private javax.swing.JTextField jTextFieldDescricaoReceita;
    private javax.swing.JTextField jTextFieldIdReceita;
    private javax.swing.JTextField jTextFieldValorReceita;
    // End of variables declaration//GEN-END:variables

            //Métodos
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
    private void carregarCampos(){
        
        int setar = jTableReceita.getSelectedRow();
        jTextFieldIdReceita.setText(jTableReceita.getModel().getValueAt(setar, 0).toString());
        jTextFieldValorReceita.setText(jTableReceita.getModel().getValueAt(setar, 1).toString());
        jTextFieldDataRecebimentoReceita.setText(jTableReceita.getModel().getValueAt(setar, 2).toString());
        jTextFieldDataRecebimentoEsperadoReceita.setText(jTableReceita.getModel().getValueAt(setar, 3).toString());
        jTextFieldDescricaoReceita.setText(jTableReceita.getModel().getValueAt(setar, 4).toString());
        jTextFieldContaReceita.setText(jTableReceita.getModel().getValueAt(setar, 5).toString());
    }
    private void cadastrarReceita(){
        String dataRecebimentoReceita, dataRecebimentoEsperadoReceita, descricaoReceita, tipoReceita;
        Float valorReceita;
        int contaReceita;

        dataRecebimentoReceita = jTextFieldDataRecebimentoReceita.getText();
        dataRecebimentoEsperadoReceita = jTextFieldDataRecebimentoEsperadoReceita.getText();
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
    private void limparCampos(){
        jTextFieldIdReceita.setText("");
        jTextFieldValorReceita.setText("");
        jTextFieldDataRecebimentoReceita.setText("");
        jTextFieldDataRecebimentoEsperadoReceita.setText("");
        jTextFieldDescricaoReceita.setText("");
        jTextFieldContaReceita.setText("");
        jTextFieldDescricaoReceita.requestFocus();
   }
    private void alterarReceita(){
        String dataRecebimentoReceita, dataRecebimentoEsperadoReceita, descricaoReceita, tipoReceita;
        Float valorReceita;
        int contaReceita, idReceita;
        
        if(jTextFieldIdReceita == null){
        idReceita = Integer.parseInt(jTextFieldIdReceita.getText());
        dataRecebimentoReceita = jTextFieldDataRecebimentoReceita.getText();
        dataRecebimentoEsperadoReceita = jTextFieldDataRecebimentoEsperadoReceita.getText();
        descricaoReceita = jTextFieldDescricaoReceita.getText();
        tipoReceita = jList1tipoReceita.getSelectedValue();
        valorReceita = Float.parseFloat(jTextFieldValorReceita.getText());
        contaReceita = Integer.parseInt(jTextFieldContaReceita.getText());
        
        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setId_receita(idReceita);
        objreceitadto.setConta_receita(contaReceita);
        objreceitadto.setDataRecebimentoEsperado_receita(dataRecebimentoEsperadoReceita);
        objreceitadto.setDataRecebimento_receita(dataRecebimentoReceita);
        objreceitadto.setDescricao_receita(descricaoReceita);
        objreceitadto.setTipo_receita(tipoReceita);;
        objreceitadto.setValor_receita(valorReceita);
        
        ReceitaDAO objreceitadao = new ReceitaDAO();
        objreceitadao.alterarReceita(objreceitadto);
        
        }
    }
    private void excluirReceita(){
        int idReceita;
        
        idReceita = Integer.parseInt(jTextFieldIdReceita.getText());
        
        ReceitaDTO objreceitadto = new ReceitaDTO();
        objreceitadto.setId_receita(idReceita);
        ReceitaDAO objreceitadao = new ReceitaDAO();
        objreceitadao.excluirReceita(objreceitadto);
    }
}
