package Interfaz;

import Atxy2k.CustomTextField.RestrictedTextField;
import cjb.ci.Mensaje;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Observer;
import java.util.Observable;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Partida extends javax.swing.JFrame implements Observer {

    Mensajes playerClient = new Mensajes();
    int xy, xx;
    ArrayList<Mensajes> palabras = new ArrayList<Mensajes>();
    String[] adivina = null;///establece guines de cada letra
    ArrayList<String> letras = new ArrayList<String>();
    int errores = 0;
    int rondas = 0;
    int score = 0;
    ImageIcon[] img = new ImageIcon[7];
    Mensajes copy_ob = new Mensajes();

    public Partida(Mensajes p) {
        initComponents();
        this.setLocationRelativeTo(null);
        for (int i = 0; i < img.length; i++) {
            img[i] = new ImageIcon("src/Imagenes/i" + (i) + ".png");
        }
        //para restriccion en casilla
        RestrictedTextField r = new RestrictedTextField(jtfletra);
        r.setOnlyNums(false);
        r.setOnlyText(true);
        r.setAcceptSpace(true);

        //para cronometro
        tiem = new Timer(10, acciones);
        playerClient = p;

        EscuchaMensaje s = new EscuchaMensaje(5000);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlscore = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlpalabra = new javax.swing.JTextField();
        jtfletra = new javax.swing.JTextField();
        Acces = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLMessage = new javax.swing.JLabel();
        jlimagen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jltema = new javax.swing.JLabel();
        jlpista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(213, 241, 227));
        jPanel1.setForeground(new java.awt.Color(51, 255, 141));
        jPanel1.setEnabled(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 720));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlscore.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlscore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlscore.setText("0.0");
        jlscore.setToolTipText("");
        jPanel1.add(jlscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 37, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Tema:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 50, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/close.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 11, -1, 30));

        jPanel3.setBackground(new java.awt.Color(254, 249, 231));

        jlpalabra.setEditable(false);
        jlpalabra.setBackground(new java.awt.Color(255, 255, 255));
        jlpalabra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlpalabra.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfletra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtfletra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfletra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfletraKeyTyped(evt);
            }
        });

        Acces.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        Acces.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar.png"))); // NOI18N
        Acces.setText("Enviar");
        Acces.setBorder(null);
        Acces.setBorderPainted(false);
        Acces.setContentAreaFilled(false);
        Acces.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Acces.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar 2.png"))); // NOI18N
        Acces.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar 2.png"))); // NOI18N
        Acces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccesActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("00:00");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("seg");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/free-time.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(jtfletra, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Acces, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfletra, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Acces, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, -1, -1));

        jlimagen.setBackground(new java.awt.Color(254, 249, 231));
        jlimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i0.png"))); // NOI18N
        jlimagen.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ganso.png")))); // NOI18N
        jPanel1.add(jlimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 52, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Score");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, 30));

        jltema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jltema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jltema.setToolTipText("");
        jPanel1.add(jltema, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 100, 30));

        jlpista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlpista.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlpista.setText("Pista:");
        jPanel1.add(jlpista, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 530, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Timer tiem;
    private int s = 15, cs = 0;

    private ActionListener acciones = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                --s;
            }
            if (s == 60) {
                s = 0;
            }
            actualizarLabel();

            if (s == 0) {
                tiem.stop();
                JOptionPane.showMessageDialog(null, "Tu tiempo se ha terminado", "Tiempo agotado", JOptionPane.INFORMATION_MESSAGE);
                errores++;
                jlimagen.setIcon(img[errores]);
                if (errores == 6) {
                    rondas++;
                    errores = 0;
                    adivina = null;
                    letras.clear();
                    jlimagen.setIcon(img[0]);
                    comienza(copy_ob);
                } else {
                    tiem.start();
                }

                s = 15;
                cs = 0;
                tiem.start();
            }
        }

    };

    private void actualizarLabel() {
        String tiempo = (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs;
        jLabel7.setText(tiempo);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Iniciar temporizador

    }//GEN-LAST:event_formWindowOpened

    private void AccesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccesActionPerformed
        String valor_let = jtfletra.getText();
        ArrayList<Integer> posciones = new ArrayList<Integer>();
        tiem.stop();
        s = 15;
        cs = 0;
        if (letras.contains(valor_let)) {
            Mensaje.exito(this, "Letra correcta");
            if (Mensaje.pregunta(this, "¿Continuar?") == JOptionPane.YES_OPTION) {
                for (int i = 0; i < letras.size(); i++) {
                    if (letras.get(i).equals(valor_let)) {
                        posciones.add(i);
                    }
                }
                for (int i = 0; i < posciones.size(); i++) {
                    adivina[posciones.get(i)] = valor_let;
                }
                String pal_ff = "";
                for (int i = 0; i < adivina.length; i++) {
                    pal_ff = pal_ff + adivina[i] + " ";
                }
                System.out.println("-" + Arrays.toString(adivina));
                jlpalabra.setText(pal_ff);
                boolean victoria = verifica_win();
                if (victoria) {
                    Mensaje.exito(this, "Ronda ganada");
                    score++;
                    jlscore.setText("" + score);
                    rondas++;
                    errores = 0;
                    adivina = null;
                    letras.clear();
                    jlimagen.setIcon(img[0]);

                    comienza(copy_ob);
                } else {
                    tiem.start();
                }
            } else {
                AccesActionPerformed(null);
            }

        } else {
            Mensaje.error(this, "Letra incorrecta");

            if (Mensaje.pregunta(this, "¿Continuar?") == JOptionPane.YES_OPTION) {
                errores++;
                jlimagen.setIcon(img[errores]);
                if (errores == 6) {
                    Mensaje.error(this, "Ronda perdida");
                    rondas++;
                    errores = 0;
                    adivina = null;
                    letras.clear();
                    jlimagen.setIcon(img[0]);
                    comienza(copy_ob);
                } else {
                    tiem.start();
                }
            } else {
                AccesActionPerformed(null);
            }
        }
        jtfletra.setText("");


    }//GEN-LAST:event_AccesActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
//        LoginClient l = new LoginClient();
//        l.setVisible(true);
//        //Parar el cronometro
        if (tiem.isRunning()) {
            tiem.stop();
        }
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jtfletraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfletraKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            evt.setKeyChar(Character.toUpperCase(c));
        }
        if (jtfletra.getText().length() > 0) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfletraKeyTyped

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Partida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Partida().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acces;
    private javax.swing.JLabel jLMessage;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlimagen;
    private javax.swing.JTextField jlpalabra;
    private javax.swing.JLabel jlpista;
    private javax.swing.JLabel jlscore;
    private javax.swing.JLabel jltema;
    private javax.swing.JTextField jtfletra;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        //por si se quiere cambiar algo en cliente por respuesta del server
        Mensajes obj = (Mensajes) arg;

        if (obj.getTipoMensaje() == 0) {///espera
            this.jLMessage.setText(obj.getMensaje());

        } else if (obj.getTipoMensaje() == 2) {//iniciar
            this.jLMessage.setText(obj.getMensaje());
            System.out.println("Palabra 1: " + obj.getPalabrasFull().get(0).getPalabra());
            System.out.println("Palabra 2: " + obj.getPalabrasFull().get(1).getPalabra());
            inicia_juego(obj);

        } else if (obj.getTipoMensaje() == 4) {//recibe ganador
            this.jLMessage.setText(obj.getMensaje());
            Mensaje.exito(this, obj.getMensaje());
            LoginClient xd = new LoginClient();
            xd.setVisible(true);
            this.dispose();
        }else if (obj.getTipoMensaje()==6) {
            Mensaje.error(this, obj.getMensaje());
            this.dispose();
            new LoginClient().setVisible(true);
        }
    }

    private void inicia_juego(Mensajes obj) {
        if (Mensaje.pregunta(this, "¿Estas seguro de comenzar la partida?") == JOptionPane.YES_OPTION) {
            comienza(obj);
        } else {
            inicia_juego(obj);
        }

    }
    boolean repetir = true;

    private void comienza(Mensajes obj) {
        if (rondas == 2) {
            String mensaje = "Soy " + playerClient.getUsername() + " ya termine de jugar";
            playerClient.setMensaje(mensaje);
            playerClient.setTipoMensaje(3);
            playerClient.setScore(score);
            jLMessage.setText("Esperando al otro jugador...");
            EnviarMensaje c = new EnviarMensaje(playerClient.getIpServer(), 5000, playerClient);
            rondas=0;
            errores = 0;
            rondas = 0;
            score = 0;
            playerClient=null;
            palabras.clear();
            adivina=null;
            letras.clear();
            copy_ob=null;
            Thread t = new Thread(c);
            t.start();
        } else {
            copy_ob = obj;
            String palabra, tema, pista;
            Mensaje.exito(this, "Comienza ronda " + (rondas + 1));
            errores = 0;
            repetir = false;
            palabra = obj.getPalabrasFull().get(rondas).getPalabra().trim();
            tema = obj.getPalabrasFull().get(rondas).getTema().trim();
            pista = obj.getPalabrasFull().get(rondas).getPista().trim();
            jltema.setText(tema);
            jlpista.setText("Pista: " + pista);
            ronda(palabra, errores);
            tiem.start();
        }

    }

    private void ronda(String palabra, int errores) {
        adivina = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                adivina[i] = "  ";
            } else {
                adivina[i] = "_ ";
            }
            letras.add(palabra.charAt(i) + "");
        }
        String adivinaf = "";
        for (int j = 0; j < adivina.length; j++) {
            adivinaf = adivinaf + adivina[j];
        }
        jlpalabra.setText(adivinaf);
    }

    private boolean verifica_win() {

        if (!Arrays.toString(adivina).equals(letras.toString())) {
            return false;
        }

        return true;
    }

}
