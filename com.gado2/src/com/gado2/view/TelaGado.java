/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gado2.view;

import com.model.bean.Gado;
import com.model.dao.GadoDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class TelaGado extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaGado() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableGado.getModel();
        jTableGado.setRowSorter(new TableRowSorter(modelo));
        readTable();
    }
    
    public void readTable(){
         DefaultTableModel modelo = (DefaultTableModel) jTableGado.getModel();
         modelo.setNumRows(0);
         
         GadoDAO gdao = new GadoDAO();
         for (Gado g : gdao.findByPosse()){
             modelo.addRow(new Object[]{
                 g.getIdGado(),
                 g.getRaca(),
                 g.getNascimento(),
                 g.getSexo(),
                 g.getPeso(),
                 g.getObservacao(),
             });
         }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldRacaGado = new javax.swing.JTextField();
        jTextFieldNascimentoGado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxSexoGado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPesoGado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaObservacaoGado = new javax.swing.JTextArea();
        jButtonAtualizarGado = new javax.swing.JButton();
        jButtonSalvarGado = new javax.swing.JButton();
        jButtonLimparGado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGado = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonRemoverGado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Raça:");

        jTextFieldNascimentoGado.setText("dd/mm/aaaa    ");
        jTextFieldNascimentoGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNascimentoGadoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nascimento:");

        jLabel3.setText("Sexo:");

        jComboBoxSexoGado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Macho", "Fêmea" }));

        jLabel4.setText("Peso:");

        jTextFieldPesoGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoGadoActionPerformed(evt);
            }
        });

        jLabel5.setText("Kg");

        jLabel6.setText("Observações:");

        jTextAreaObservacaoGado.setColumns(20);
        jTextAreaObservacaoGado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaObservacaoGado);

        jButtonAtualizarGado.setText("Atualizar");
        jButtonAtualizarGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarGadoActionPerformed(evt);
            }
        });

        jButtonSalvarGado.setText("Salvar");
        jButtonSalvarGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarGadoActionPerformed(evt);
            }
        });

        jButtonLimparGado.setText("Limpar");
        jButtonLimparGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparGadoActionPerformed(evt);
            }
        });

        jTableGado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Animal", "Raça", "Nascimento", "Sexo", "Peso (Kg)", "Observações"
            }
        ));
        jTableGado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableGado);

        jLabel7.setText("Rebanho:");

        jLabel8.setText("Cadastro de gado:");

        jButtonRemoverGado.setText("Remover");
        jButtonRemoverGado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverGadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jComboBoxSexoGado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldNascimentoGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldRacaGado, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesoGado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSalvarGado, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAtualizarGado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonLimparGado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonRemoverGado))))
                        .addGap(28, 28, 28)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldRacaGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldPesoGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(jButtonSalvarGado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAtualizarGado)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonLimparGado)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jComboBoxSexoGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRemoverGado)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNascimentoGado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jTextFieldPesoGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoGadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesoGadoActionPerformed

    private void jTextFieldNascimentoGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNascimentoGadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNascimentoGadoActionPerformed

    private void jButtonSalvarGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarGadoActionPerformed
        // TODO add your handling code here:
        cadastraGado();
        readTable();
    }//GEN-LAST:event_jButtonSalvarGadoActionPerformed

    private void jButtonLimparGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparGadoActionPerformed
        // TODO add your handling code here:
        limpaCampos();
    }//GEN-LAST:event_jButtonLimparGadoActionPerformed

    private void jButtonAtualizarGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarGadoActionPerformed
        // TODO add your handling code here:
        atualizaGado();
        readTable();
    }//GEN-LAST:event_jButtonAtualizarGadoActionPerformed

    private void jTableGadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGadoMouseClicked
        // TODO add your handling code here:
        Gado g = new Gado();
        
        if (jTableGado.getSelectedRow() != -1){
            jTextFieldRacaGado.setText(jTableGado.getValueAt(jTableGado.getSelectedRow(), 1).toString());
            jTextFieldNascimentoGado.setText(jTableGado.getValueAt(jTableGado.getSelectedRow(),2).toString());
            g.setSexo(jTableGado.getValueAt(jTableGado.getSelectedRow(),3).toString());//pode ser pelo jComboBoxSexoGado
            if (g.getSexo().equalsIgnoreCase("Macho")){
                jComboBoxSexoGado.setSelectedIndex(0);
            }
            else {
                jComboBoxSexoGado.setSelectedIndex(1);
            }
            jTextFieldPesoGado.setText(jTableGado.getValueAt(jTableGado.getSelectedRow(), 4).toString());
            jTextAreaObservacaoGado.setText(jTableGado.getValueAt(jTableGado.getSelectedRow(), 5).toString());
            //cbMarca.setText(jTableCarros.getValueAt(jTableCarros.getSelectedRow(), 1).toString());
        }
    }//GEN-LAST:event_jTableGadoMouseClicked

    private void jButtonRemoverGadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverGadoActionPerformed
        // TODO add your handling code here:
        
        removeGado();
        limpaCampos();
        readTable();
    }//GEN-LAST:event_jButtonRemoverGadoActionPerformed

    
    private void cadastraGado(){
        
        Gado g = new Gado();
        GadoDAO gdao = new GadoDAO();
         
        g.setRaca(jTextFieldRacaGado.getText());
        g.setNascimento(jTextFieldNascimentoGado.getText());             
        g.setSexo(jComboBoxSexoGado.getSelectedItem().toString());
        g.setPeso(Float.parseFloat(jTextFieldPesoGado.getText()));
        g.setObservacao(jTextAreaObservacaoGado.getText());
        g.setPosse(true);
        //c.setValor(Float.parseFloat(txtValor.getText()));
                
        gdao.save(g);
        //readTable();
        limpaCampos();
    }
    
    private void limpaCampos(){
      
            jTextFieldRacaGado.setText(null);
            jTextFieldNascimentoGado.setText("dd/mm/aaaa");
            jComboBoxSexoGado.setSelectedIndex(0);
            jTextFieldPesoGado.setText(null);
            jTextAreaObservacaoGado.setText(null);
    }
    
    private void atualizaGado(){
        
        Gado g = new Gado();
        GadoDAO gdao = new GadoDAO();
        
        g.setIdGado((int) jTableGado.getValueAt(jTableGado.getSelectedRow(),0));
        g.setRaca(jTextFieldRacaGado.getText());
        g.setNascimento(jTextFieldNascimentoGado.getText());             
        g.setSexo(jComboBoxSexoGado.getSelectedItem().toString());
        g.setPeso(Float.parseFloat(jTextFieldPesoGado.getText()));
        g.setObservacao(jTextAreaObservacaoGado.getText());
        g.setPosse(true);
        //c.setValor(Float.parseFloat(txtValor.getText()));
        
        gdao.update(g);
        //readTable();
        limpaCampos();
    }
    
    private void removeGado(){
        
        Gado g = new Gado();
        GadoDAO gdao = new GadoDAO();
        
           g.setIdGado((int) jTableGado.getValueAt(jTableGado.getSelectedRow(),0));
           
           gdao.remove(g.getIdGado());
        
        
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizarGado;
    private javax.swing.JButton jButtonLimparGado;
    private javax.swing.JButton jButtonRemoverGado;
    private javax.swing.JButton jButtonSalvarGado;
    private javax.swing.JComboBox<String> jComboBoxSexoGado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableGado;
    private javax.swing.JTextArea jTextAreaObservacaoGado;
    private javax.swing.JTextField jTextFieldNascimentoGado;
    private javax.swing.JTextField jTextFieldPesoGado;
    private javax.swing.JTextField jTextFieldRacaGado;
    // End of variables declaration//GEN-END:variables
}
