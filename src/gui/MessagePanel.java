package gui;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author geeo
 */
public class MessagePanel extends javax.swing.JPanel implements ComponentListener {

    /**
     * Creates new form MessagemPanel
     */
    public MessagePanel() {
        initComponents();
    }

    public MessagePanel(String mensagem, String usuario, String hora) {
        initComponents();
        this.lbNameUser.setText(usuario);
        this.lbMensagem.setText(mensagem);
        this.lbMensagem.addComponentListener(this);
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
        jPanel1 = new javax.swing.JPanel();
        lbNameUser = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbMensagem = new javax.swing.JTextArea();

        jToggleButton1.setText("jToggleButton1");

        setFocusable(false);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(215, 66));
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setOpaque(false);

        lbNameUser.setText("Name");

        lbHora.setText("Hora");

        jPanel2.setBackground(new java.awt.Color(51, 255, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        lbMensagem.setColumns(20);
        lbMensagem.setLineWrap(true);
        lbMensagem.setText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKLLLLLLLLLLLLLLLLLLLLLLLLLLLLLMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNOOOOOOOOOOOOOOOOOOPPPPPPPPPPPPPPPPPPPPPPPPPQQQQQQQQQQQQQQQQQQQQQQQQQQQQRRRRRRRRRRRRRRRRRRRRRRRRRSSSSSSSSSSSSSSSSSSSSSSSSSSSSTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTUUUUUUUUUUUUUUUUUUUUVVVVVVVVVVVVVVVVVVVVVVVWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWXXXXXXXXXXXXXXXXXXXXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        lbMensagem.setWrapStyleWord(true);
        lbMensagem.setFocusable(false);
        lbMensagem.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.add(lbMensagem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNameUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                        .addComponent(lbHora)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameUser)
                    .addComponent(lbHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbHora;
    private javax.swing.JTextArea lbMensagem;
    private javax.swing.JLabel lbNameUser;
    // End of variables declaration//GEN-END:variables

    public void componentResized(ComponentEvent ce) {
        resizeAgain();
    }

    public void componentMoved(ComponentEvent ce) {
        System.out.println("moved");
    }

    public void componentShown(ComponentEvent ce) {
        System.out.println("Showed");
    }

    public void componentHidden(ComponentEvent ce) {
        System.out.println("hided");
    }

    public void resizeAgain() {
        
        int fontSize = this.lbMensagem.getFont().getSize();
        int width = this.jPanel2.getWidth();
        //int characters = this.lbMensagem.getCaretPosition();
        int characters = this.lbMensagem.getText().length();//o getCaretPosition parou de funcionar, do nada!??
        int newHeight = 3 * lbHora.getHeight();
        double taxaCharPerLine = width * 50 / 453;
        //O códigd tá aqui, onde dá o resize
        if (characters > taxaCharPerLine) {
            double qntLines = (characters / taxaCharPerLine);
            newHeight = (int) (this.lbHora.getHeight()*2.5+((0.87*fontSize)*qntLines)+5);//valores altamente experimentais
        }
        width = this.jPanel2.getWidth();
        this.setPreferredSize(new Dimension(width, newHeight));
        this.revalidate();

        this.setMaximumSize(new Dimension(3276723 + 1, newHeight + 1));

    }
     
}
