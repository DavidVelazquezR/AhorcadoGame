package Interfaz;

import Atxy2k.CustomTextField.RestrictedTextField;
import cjb.ci.Mensaje;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author uriel
 */
public class LoginClient extends javax.swing.JFrame {

    Mensajes playerClient = new Mensajes();
    String ipHamachi = "";
    int xy, xx;

    /**
     * Creates new form Login
     */
    public LoginClient() {
        initComponents();
        this.setLocationRelativeTo(null);

        //Restricciones
        RestrictedTextField Usuario = new RestrictedTextField(jTFUsername);
        Usuario.setLimit(10);
        RestrictedTextField IP = new RestrictedTextField(jTFIpServer);
        IP.setLimit(15);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jTFIpServer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Acces = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(254, 249, 231));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(213, 241, 227));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Desarrollado por @Broos");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 750, 80));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logogoose.png"))); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 70));

        jTFUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFUsername.setText("Usuario");
        jPanel5.add(jTFUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 190, 40));

        jTFIpServer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFIpServer.setText("ID");
        jPanel5.add(jTFIpServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 190, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ordenador-portatil.png"))); // NOI18N
        jLabel11.setText("ID");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/individual.png"))); // NOI18N
        jLabel12.setText("Nombre del Jugador:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 94, 190, 40));

        Acces.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Acces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorcado1.png"))); // NOI18N
        Acces.setText("Let's Go");
        Acces.setBorder(null);
        Acces.setBorderPainted(false);
        Acces.setContentAreaFilled(false);
        Acces.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Acces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahoracao2.png"))); // NOI18N
        Acces.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahoracao2.png"))); // NOI18N
        Acces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesActionPerformed(evt);
            }
        });
        jPanel5.add(Acces, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, 40));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AccesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesActionPerformed
        //Aqui cambie la restriccion
        if ((jTFUsername.getText().length() > 4) && !(jTFUsername.getText().length() < 11)) {
            Mensaje.error(this, "Usuario debe tener de 5 a 10 caracteres");
        } else if (jTFIpServer.getText().length() > 16 && jTFIpServer.getText().length() < 11) {
            Mensaje.error(this, "IP incorrecta");
        } else {
            playerClient.setIpHamachi(ipHamachi);
            playerClient.setUsername(jTFUsername.getText());
            playerClient.setIpServer(jTFIpServer.getText());
            String mensaje = "Soy " + playerClient.getUsername() + " y mi ip es: " + playerClient.getIpHamachi();
            playerClient.setMensaje(mensaje);
            playerClient.setTipoMensaje(1);

            EnviarMensaje c = new EnviarMensaje(playerClient.getIpServer(), 5000, playerClient);
            Thread t = new Thread(c);
            t.start();
            boolean wait = true;

            Partida p = new Partida(playerClient);
            this.dispose();
            p.setVisible(true);
        }
    }//GEN-LAST:event_AccesActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String aux = "";
        Enumeration e = null;
        try {
            e = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            Logger.getLogger(LoginClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (e.hasMoreElements()) {
            NetworkInterface n = (NetworkInterface) e.nextElement();
            Enumeration ee = n.getInetAddresses();
            while (ee.hasMoreElements()) {
                InetAddress i = (InetAddress) ee.nextElement();
                aux = i.getHostAddress();
                aux = aux.substring(0, 2);
                if (aux.equals("25")) {
                    ipHamachi = i.getHostAddress();
                }

            }
        }
        System.out.println("Mi ip de hamachi es: " + ipHamachi);
    }//GEN-LAST:event_formWindowOpened

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

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
            java.util.logging.Logger.getLogger(LoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginClient().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acces;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTFIpServer;
    private javax.swing.JTextField jTFUsername;
    // End of variables declaration//GEN-END:variables
}
