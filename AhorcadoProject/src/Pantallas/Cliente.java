package Pantallas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {

    private String host;
    private int puerto;
    private Mensajes objetoMensaje;

    public Cliente(String host, int puerto, Mensajes objetoMensaje) {
        this.host = host;
        this.puerto = puerto;
        this.objetoMensaje = objetoMensaje;
    }

    @Override
    public void run() {
        //Host del servidor
        //Puerto del servidor
        DataOutputStream out;
        ObjectOutputStream outObjeto;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(host, puerto);

            outObjeto = new ObjectOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            outObjeto.writeObject(objetoMensaje);

            System.out.println("Se envio el mensaje: " + objetoMensaje.getMensaje());
            sc.close();
            outObjeto.close();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
