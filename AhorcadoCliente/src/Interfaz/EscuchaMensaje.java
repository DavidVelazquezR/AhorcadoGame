package Interfaz;

import cjb.ci.Mensaje;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaz.Mensajes;

public class EscuchaMensaje extends Observable implements Runnable {

    private int puerto;

    public EscuchaMensaje(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {

        ServerSocket servidor = null;
        Socket sc = null;
        ObjectInputStream inObjeto;
        Mensajes msj = null;
        int casosMensaje = 0;

        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {

                //Espero a que un cliente se conecte
                sc = servidor.accept();

                System.out.println("Servidor conectado");
                inObjeto = new ObjectInputStream(sc.getInputStream());

                //Leo el mensaje que me envia
                msj = (Mensajes) inObjeto.readObject();
                casosMensaje = (int) msj.getTipoMensaje();

                if (casosMensaje == 0) {
                    String mensaje = msj.getMensaje();
                    System.out.println(mensaje);

                } else if (casosMensaje == 2) {
                    String mensaje = msj.getMensaje();
                    System.out.println(mensaje);
                }

                this.setChanged();
                this.notifyObservers(msj);
                this.clearChanged();

                //Cierro el socket
                sc.close();
                inObjeto.close();
                System.out.println("servidor desconectado");

            }

        } catch (IOException ex) {
            System.out.println("eror en el hilo del socket " + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EscuchaMensaje.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
