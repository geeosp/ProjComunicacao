package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geeo
 */
public class MessagemPanel extends javax.swing.JPanel {

    /**
     * Creates new form MessagemPanel
     */
    public MessagemPanel() {
        initComponents();
    }
    public MessagemPanel(String mensagem, String usuario, String hora){
        initComponents();
        this.lbNameUser.setText(usuario);
        this.lbMensagem.setText(mensagem);
        this.lbHora.setText(hora);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lbNameUser = new javax.swing.JLabel();
        lbMensagem = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(32767, 20));
        setPreferredSize(new java.awt.Dimension(389, 50));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        lbNameUser.setText("Name");

        lbMensagem.setText("Mensagem");

        lbHora.setText("Hora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNameUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbHora))
                    .addComponent(lbMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameUser)
                    .addComponent(lbHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbMensagem)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbNameUser;
    // End of variables declaration//GEN-END:variables
}
