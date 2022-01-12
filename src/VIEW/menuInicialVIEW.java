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

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 * Tela de menu inicial, para navegar entre demais telas
 *
 * @author Patrick Renan Weber
 */
public class menuInicialVIEW extends javax.swing.JFrame {

    public menuInicialVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemReceitas = new javax.swing.JMenuItem();
        jMenuItemDespesas = new javax.swing.JMenuItem();
        jMenuItemContas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Controle de Finanças Pessoais");

        jMenu1.setText("Navegar");

        jMenuItemReceitas.setText("Receitas");
        jMenuItemReceitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReceitasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemReceitas);

        jMenuItemDespesas.setText("Despesas");
        jMenuItemDespesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDespesasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemDespesas);

        jMenuItemContas.setText("Contas");
        jMenuItemContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemContasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemContas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento utilizado para fechar o sistema
     *
     * @param evt
     */
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    /**
     * Evento utilizado para abrir a janela de Receitas
     *
     * @param evt
     */
    private void jMenuItemReceitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReceitasActionPerformed
        fecharTela();
        frmReceitaVIEW receita = new frmReceitaVIEW();
        receita.setVisible(true);
    }//GEN-LAST:event_jMenuItemReceitasActionPerformed
    /**
     * Evento utilizado para abrir a janela de Despesas
     *
     * @param evt
     */
    private void jMenuItemDespesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDespesasActionPerformed
        fecharTela();
        frmDespesaVIEW despesa = new frmDespesaVIEW();
        despesa.setVisible(true);
    }//GEN-LAST:event_jMenuItemDespesasActionPerformed
    /**
     * Evento utilizado para abrir a janela de Contas
     *
     * @param evt
     */
    private void jMenuItemContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemContasActionPerformed
        fecharTela();
        frmContaVIEW conta = new frmContaVIEW();
        conta.setVisible(true);
    }//GEN-LAST:event_jMenuItemContasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuInicialVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItemContas;
    private javax.swing.JMenuItem jMenuItemDespesas;
    private javax.swing.JMenuItem jMenuItemReceitas;
    // End of variables declaration//GEN-END:variables
    /**
     * Método utilizado para fechar a tela
     */
    public void fecharTela() {
        WindowEvent fecharTela = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(fecharTela);
    }
}
