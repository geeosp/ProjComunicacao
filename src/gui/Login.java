/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

/**
 *
 * @author Geeo
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogin = new javax.swing.JLabel();
        tFLogin = new javax.swing.JTextField();
        tFSenha = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        cBEspiar = new javax.swing.JCheckBox();
        lbFirstTime = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        cBEspiar1 = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(255, 240));
        setName(""); // NOI18N
        setNextFocusableComponent(lbSenha);
        setPreferredSize(new java.awt.Dimension(255, 245));

        lbLogin.setText("Login");

        tFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFLoginActionPerformed(evt);
            }
        });

        tFSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFSenhaActionPerformed(evt);
            }
        });

        lbSenha.setText("Senha");

        cBEspiar.setText("Só quero dar uma espiadinha");
        cBEspiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBEspiarActionPerformed(evt);
            }
        });

        lbFirstTime.setForeground(new java.awt.Color(0, 153, 153));
        lbFirstTime.setText("É a sua primeira vez?");
        lbFirstTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFirstTimeMouseClicked(evt);
            }
        });

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        cBEspiar1.setText("Entrar como convidado");
        cBEspiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBEspiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogin)
                            .addComponent(lbSenha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFSenha)
                            .addComponent(tFLogin)))
                    .addComponent(lbFirstTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btEntrar))
                    .addComponent(cBEspiar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cBEspiar, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin)
                    .addComponent(tFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(tFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBEspiar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cBEspiar)
                .addGap(16, 16, 16)
                .addComponent(btEntrar)
                .addGap(7, 7, 7)
                .addComponent(lbFirstTime)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFLoginActionPerformed

    private void tFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFSenhaActionPerformed

    private void cBEspiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBEspiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBEspiarActionPerformed

    private void lbFirstTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFirstTimeMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbFirstTimeMouseClicked

    private void cBEspiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBEspiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBEspiar1ActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JCheckBox cBEspiar;
    private javax.swing.JCheckBox cBEspiar1;
    private javax.swing.JLabel lbFirstTime;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTextField tFLogin;
    private javax.swing.JTextField tFSenha;
    // End of variables declaration//GEN-END:variables
}
