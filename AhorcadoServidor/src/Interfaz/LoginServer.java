package Interfaz;

import BD.ManipulaDBC;
import BD.Querys;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class LoginServer extends javax.swing.JFrame implements Observer {

    String ipHamachi = "";
    int xy, xx;
    Connection con;
    private EscuchaMensaje s;

    public static int counterUsers = 0;
    ArrayList<Mensajes> usuariosRegistro = new ArrayList<Mensajes>();
    ArrayList<Mensajes> mensajesPalabras = new ArrayList<Mensajes>();

    ArrayList<Object> mapeoPalabras = new ArrayList<Object>();
    ArrayList<Object> mapeoTema = new ArrayList<Object>();
    ArrayList<Object> mapeoPista = new ArrayList<Object>();
    ArrayList<Object> palabrasAhorcado = new ArrayList<Object>();

    int ban = 4;

    /**
     * Creates new form Login
     */
    public LoginServer() {
        initComponents();
        this.setLocationRelativeTo(null);

        s = new EscuchaMensaje(5000);
        s.addObserver(this);
        Thread t0 = new Thread(s);
        t0.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAHistory = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTFIPServer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jLabel9.setText("Desarrollado por @KONOHAGAKURE");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(556, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 750, 80));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 40, 40));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("IP del Servidor:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 100, 40));

        jTAHistory.setEditable(false);
        jTAHistory.setColumns(20);
        jTAHistory.setRows(5);
        jTAHistory.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTAHistory);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 540, 190));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logogoose.png"))); // NOI18N
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 70));
        jPanel5.add(jTFIPServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        con = ManipulaDBC.conectaDB();

        String aux = "";
        Enumeration e = null;
        try {
            e = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException ex) {
            Logger.getLogger(LoginServer.class.getName()).log(Level.SEVERE, null, ex);
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
        jTFIPServer.setText(ipHamachi);

        jTFIPServer.setEditable(false);

        //Preparamos las consultas a BD de las palabras
        Querys q = new Querys();

        ArrayList<Object> numeroP = new ArrayList<Object>();

        try {
            mapeoPalabras = q.Seleccion(con, "Contenido", "palabras", "");
            mapeoPista = q.Seleccion(con, "Pista", "palabras", "");
            mapeoTema = q.Seleccion(con, "Tema", "palabras", "");
        } catch (Exception es) {
            System.out.println("Error en la consulta de BD..." + es);
        }

        int sizeP = mapeoPalabras.size();
        int num = 0;
        for (int i = 0; i < 4; i++) {
            num = ((int) Math.floor(Math.random() * (sizeP + 1)));
            if(numeroP.contains(num)) i--;
            else  numeroP.add(num);
        }
        int auxRandom = 0;
        for (int i = 0; i < 4; i++) {
            Mensajes palabras = new Mensajes();
            palabras.setPalabra((String) mapeoPalabras.get((int) numeroP.get(auxRandom)));
            System.out.println("Palabra " + aux + ": " + (String) mapeoPalabras.get((int) numeroP.get(auxRandom)));
            palabras.setPista((String) mapeoPista.get((int) numeroP.get(auxRandom)));
            palabras.setTema((String) mapeoTema.get((int) numeroP.get(auxRandom)));
            palabras.setMensaje("ya puedes Jugar");
            palabras.setTipoMensaje(3);
            mensajesPalabras.add(palabras);
            auxRandom++;
        }
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ManipulaDBC.desconectaDB(con);
    }//GEN-LAST:event_formWindowClosed

    public void agrega(ArrayList<Object> array, int n, JComboBox jc) {
        int aux = 0;
        for (int i = 0; i < n; i++) {
            jc.addItem(array.get(aux));
            aux = aux + 3;
        }
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
            java.util.logging.Logger.getLogger(LoginServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginServer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAHistory;
    private javax.swing.JTextField jTFIPServer;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Mensajes obj = (Mensajes) arg;

        if (obj.getTipoMensaje() == 1) {///
            Mensajes objF1 = obj;
            Mensajes objF2 = obj;
            this.jTAHistory.append("\n" + ((Mensajes) arg).getMensaje());
            counterUsers++;
            System.out.println("Numero de usuarios conectados: " + counterUsers);
            this.jTAHistory.append("\nNumero de usuarios conectados: " + counterUsers);

            if (usuariosRegistro.isEmpty()) {
                usuariosRegistro.add(objF1);
            } else if (usuariosRegistro.size() == 1) {
                usuariosRegistro.add(objF1);
            } else {
                System.out.println("Ya no aceptamos usuarios ue >:v\n a chigar a su madre");
            }
            if(counterUsers == 1){
                objF1.setTipoMensaje(0);
                objF1.setMensaje("El server dice que esperes: " + usuariosRegistro.get(counterUsers - 1).getUsername() + "\n");
                //objF1.setPalabrasFull(mensajesPalabras);
                EnviarMensaje c = new EnviarMensaje(usuariosRegistro.get(counterUsers - 1).getIpHamachi(), 5000, objF1);
                Thread t1 = new Thread(c);
                t1.start();
            }else if(counterUsers == 2){
                objF1.setTipoMensaje(2);
                objF1.setMensaje("Ya puedes empezar 1 e.e\n");
                System.out.println("1~"+usuariosRegistro.get(1).getUsername());
                objF1.setPalabrasFull(mensajesPalabras);
                EnviarMensaje c = new EnviarMensaje(usuariosRegistro.get(1).getIpHamachi(), 5000, objF1);
                Thread t2 = new Thread(c);
                t2.start();
                while(t2.isAlive()){}
                objF2.setTipoMensaje(2);
                objF2.setMensaje("Ya puedes empezar 2 e.e \n");
                System.out.println("0~"+usuariosRegistro.get(0).getUsername());
                objF2.setPalabrasFull(mensajesPalabras);
                EnviarMensaje c2 = new EnviarMensaje(usuariosRegistro.get(0).getIpHamachi(), 5000, objF2);
                Thread t3 = new Thread(c2);
                t3.start();
                this.jTAHistory.append("\nJuegos Iniciados ");
            }
        }

    }

}
