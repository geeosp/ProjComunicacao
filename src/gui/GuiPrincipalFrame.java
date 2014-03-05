/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import atomics.Message;
import atomics.Room;
import atomics.User;
import corecliente.Core;
import interfaces.GuiInterface;

import java.awt.Label;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JProgressBar;

import corecliente.GlobalClient;

/**
 *
 * @author Geeo
 */
public class GuiPrincipalFrame extends javax.swing.JFrame implements Runnable, GuiInterface {

//    private boolean logado = false;
    private RoomsListPanel roomsPanel;
//    private User user;
    private List<RoomFrame> roomFrameList;

    /**
     * Creates new form GuiPrincipalFrame
     */
    public GuiPrincipalFrame() {
        initComponents();
        LoginPanel l = new LoginPanel();
        l.setVisible(true);
        principalPanel.add(l);
        roomFrameList = new ArrayList<RoomFrame>();
    }

    public void run() {
        System.out.println("Heey, Gui running!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BigContainer = new javax.swing.JPanel();
        principalPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userShow1 = new gui.UserShow();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(310, 310));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        BigContainer.setBackground(new java.awt.Color(0, 59, 64));

        principalPanel.setFocusable(false);
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        principalPanel.setLayout(flowLayout1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userShow1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userShow1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BigContainerLayout = new javax.swing.GroupLayout(BigContainer);
        BigContainer.setLayout(BigContainerLayout);
        BigContainerLayout.setHorizontalGroup(
            BigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BigContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BigContainerLayout.setVerticalGroup(
            BigContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BigContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        principalPanel.getAccessibleContext().setAccessibleName("");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BigContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BigContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //System.out.print("xau");
        if (GlobalClient.user != null) {
            GlobalClient.core.logOut();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GuiPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//System.out.println("Ooie");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPrincipalFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BigContainer;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private gui.UserShow userShow1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void showNewRoom(Room room) {
        RoomFrame conversa = new RoomFrame(room);
        roomFrameList.add(conversa);
        conversa.setVisible(true);
    }

    @Override
    public void showReceivedMessage(Message msg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showReceivedSong(Object song) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void showReceivedFile(Object file) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void logIn() {
        this.principalPanel.removeAll();
        this.userShow1.getLbUserNickname().setText(GlobalClient.user.getNickname());
        //loagind window
        LoadingPanel lp = new LoadingPanel("Loading Rooms");
        this.principalPanel.add(lp);

        //loading window
        GlobalClient.core.refreshRooms();

//        this.roomsPanel = new RoomsListPanel();
//        this.roomsPanel.refreshExistingRooms(actualRooms);
//        this.roomsPanel.setVisible(true);
//        this.principalPanel.removeAll();
//        this.principalPanel.add(roomsPanel);
//        this.principalPanel.revalidate();
    }

    public void addRoomFrame(RoomFrame rf) {
        this.roomFrameList.add(rf);
    }

    public void receiveMessage(Message m) {
        for (int i = 0; i < roomFrameList.size(); i++) {
            //System.out.println(roomFrameList.get(i).getID() + " " + m.getSala_ID());
            if (roomFrameList.get(i).getID() == m.getSala_ID()) {
            	System.out.println(m.getMessage());
                roomFrameList.get(i).addMensagem(m);
            }
        }
    }

    public void showExistingRooms(ArrayList<Room> existingRooms) {
        System.out.println("Etrou aqui, rooms qnt: " + existingRooms.size());
        this.principalPanel.removeAll();
        if (existingRooms.size() != 0) {
            this.roomsPanel = new RoomsListPanel();
            this.roomsPanel.refreshExistingRooms(existingRooms);
            this.roomsPanel.setVisible(true);
            this.principalPanel.add(roomsPanel);
        } else {
            NaoExistemRooms teste = new NaoExistemRooms();
            this.principalPanel.add(teste);
        }
        this.principalPanel.revalidate();
    }

    public void showOpenedRoom(long id) {
        // TODO Auto-generated method stub
        System.out.println("chamou showOpenRoom");
    }

    public void showNewUser(long sala_ID, String sender_nickname, int newStatus) {
        //for(int i  = 0;i<GlobalClient.gui.)
        System.out.println("chamou shownewUSer");
    }

    public void alertSaiuSala(long sala_ID, String sender_nickname) {
        System.out.println("AlertSaiuSala: alertar ao usuario a saida de alguem e atualizar a lista de usuarios visiveis na conversa");
    }

    public void alertMudouStatus(long sala_ID, long sender_ID,
            String sender_nickname) {
        System.out.println("AlertMudouStatus: alertar ao usuario a mudanca de status e atualizar a lista de usuarios visiveis na conversa");

    }

    void createRoom(String roomName) {
        GlobalClient.core.createRoom(roomName);
    }

	public void refreshActualRooms(Room room) {
		// TODO Auto-generated method stub
		
	}

    void sendFile(String caminhoArquivo, long sala_id) {
      GlobalClient.core.sendFile(caminhoArquivo, sala_id);
      
    }

	public void showNewFile(String name, String sender_nickname, long sala_ID,
			long fileLink) {
		System.out.println("entrou no show new file (gui principal)");
		Message msg = new Message(00, sala_ID, "", "Novo arquivo chegou: link" + fileLink, sender_nickname);
	
		receiveMessage(msg);
		
	}

}
