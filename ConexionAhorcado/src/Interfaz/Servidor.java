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

public class Servidor extends Observable implements Runnable {

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;
        ObjectOutputStream outObjeto;
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

                System.out.println("Cliente conectado");
                inObjeto = new ObjectInputStream(sc.getInputStream());

                //Leo el mensaje que me envia
                msj = (Mensajes) inObjeto.readObject();

                casosMensaje = msj.getTipoMensaje();

                if (casosMensaje == 1) {
                    String mensaje = (String) msj.getMensaje();
                    System.out.println(mensaje);

                }

                this.setChanged();
                this.notifyObservers(casosMensaje);
                this.clearChanged();

                //Cierro el socket
                sc.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            System.out.println("eror en el hilo del socket " + ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("eror en el objeto del socket " + ex);
        }

    }

}
