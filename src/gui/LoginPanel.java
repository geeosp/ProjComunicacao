/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import corecliente.Core;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import corecliente.GlobalClient;
import java.awt.Font;
import java.awt.FontFormatException;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import principal.Status;
import principal.OurFonts;
/**
 *
 * @author Geeo
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    public LoginPanel() throws FileNotFoundException, FontFormatException, IOException {
        initComponents();
        for (int i = 0; i < Status.getNumberOfStatus(); i++) {
            this.cBStatus.addItem(Status.whichStatus(i));
        }
        paintComponent(null);
     
      //  this.lbHermes.setFont(OurFonts.getTitleFont(72f));
    }

    private Image im = new ImageIcon(getClass().getResource("/fundo.png")).getImage();

    public void paintComponent(Graphics g) {
    	
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        tFLogin = new javax.swing.JTextField();
        lbHowYouFeeling = new javax.swing.JLabel();
        cBStatus = new javax.swing.JComboBox();
        lbServidorIp = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        tFServidorIp = new javax.swing.JTextField();
        newJPanel1 = new gui.NewJPanel();

        setMinimumSize(new java.awt.Dimension(300, 400));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 940, 919, -1));

        tFLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tFLogin.setText("user");
        tFLogin.setBorder(null);
        tFLogin.setOpaque(false);
        tFLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFLoginActionPerformed(evt);
            }
        });
        add(tFLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 20));

        lbHowYouFeeling.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHowYouFeeling.setText("How are your feeling today?");
        add(lbHowYouFeeling, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 15));

        cBStatus.setMinimumSize(new java.awt.Dimension(100, 22));
        cBStatus.setPreferredSize(new java.awt.Dimension(150, 22));
        cBStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBStatusActionPerformed(evt);
            }
        });
        add(cBStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        lbServidorIp.setText("ServidorIp");
        add(lbServidorIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bentrar.png"))); // NOI18N
        btEntrar.setBorder(null);
        btEntrar.setBorderPainted(false);
        btEntrar.setContentAreaFilled(false);
        btEntrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bentrar_clicked.png"))); // NOI18N
        btEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btEntrarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btEntrarMousePressed(evt);
            }
        });
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 140, 47));

        tFServidorIp.setText("localhost");
        tFServidorIp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFServidorIpActionPerformed(evt);
            }
        });
        add(tFServidorIp, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 90, -1));
        add(newJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        String nickname = this.tFLogin.getText();
        String ip = this.tFServidorIp.getText();
        int status = cBStatus.getSelectedIndex(); ///////////////////////
        System.out.println("Status: " + Status.whichStatus(status));

        GlobalClient.gui.logIn(nickname, 0, ip, status);

    }//GEN-LAST:event_btEntrarActionPerformed

    private void cBStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBStatusActionPerformed

    private void tFLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFLoginActionPerformed

    private void tFServidorIpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFServidorIpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFServidorIpActionPerformed

    private void btEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMouseClicked
    this.btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bentrar_clicked.png")));
    }//GEN-LAST:event_btEntrarMouseClicked

    private void btEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btEntrarMousePressed
     this.btEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bentrar_clicked.png")));
    }//GEN-LAST:event_btEntrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JComboBox cBStatus;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbHowYouFeeling;
    private javax.swing.JLabel lbServidorIp;
    private gui.NewJPanel newJPanel1;
    private javax.swing.JTextField tFLogin;
    private javax.swing.JTextField tFServidorIp;
    // End of variables declaration//GEN-END:variables
}
