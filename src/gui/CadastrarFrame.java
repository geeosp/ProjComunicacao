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
public class CadastrarFrame extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public CadastrarFrame() {
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

        buttonGroup2 = new javax.swing.ButtonGroup();
        lbLogin = new javax.swing.JLabel();
        tFLogin = new javax.swing.JTextField();
        tFSenha = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        lbSenha1 = new javax.swing.JLabel();
        tFSenha1 = new javax.swing.JTextField();
        lbApelido = new javax.swing.JLabel();
        tFLogin1 = new javax.swing.JTextField();
        rBHomem = new javax.swing.JRadioButton();
        rBMulher = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(280, 280));
        setName(""); // NOI18N
        setNextFocusableComponent(tFLogin);
        setPreferredSize(new java.awt.Dimension(280, 280));

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

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        lbSenha1.setText("Senha");

        tFSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFSenha1ActionPerformed(evt);
            }
        });

        lbApelido.setText("Apelido");

        tFLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFLogin1ActionPerformed(evt);
            }
        });

        rBHomem.setText("Homem");
        rBHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBHomemActionPerformed(evt);
            }
        });

        rBMulher.setText("Mulher");

        jLabel1.setText("Eu sou:");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btEntrar)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbLogin)
                            .addComponent(lbSenha)
                            .addComponent(lbSenha1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFSenha1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tFSenha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tFLogin, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbApelido)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tFLogin1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rBHomem)
                                .addGap(18, 18, 18)
                                .addComponent(rBMulher)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tFSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApelido)
                    .addComponent(tFLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBMulher)
                    .addComponent(rBHomem)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(247, 247, 247)
                .addComponent(btEntrar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFLoginActionPerformed

    private void tFSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFSenhaActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEntrarActionPerformed

    private void tFSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFSenha1ActionPerformed

    private void tFLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFLogin1ActionPerformed

    private void rBHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBHomemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBHomemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbApelido;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbSenha1;
    private javax.swing.JRadioButton rBHomem;
    private javax.swing.JRadioButton rBMulher;
    private javax.swing.JTextField tFLogin;
    private javax.swing.JTextField tFLogin1;
    private javax.swing.JTextField tFSenha;
    private javax.swing.JTextField tFSenha1;
    // End of variables declaration//GEN-END:variables
}
