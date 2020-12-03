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
import java.util.ArrayList;

public class EscuchaMensaje extends Observable implements Runnable {

    private int puerto;
    private ArrayList<Socket> clientes;

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

                System.out.println("Cliente conectado");
                inObjeto = new ObjectInputStream(sc.getInputStream());

                //Leo el mensaje que me envia
                msj = (Mensajes) inObjeto.readObject();
                casosMensaje = (int) msj.getTipoMensaje();

                if (casosMensaje == 1) {
                    String mensaje = msj.getMensaje();
                    System.out.println(mensaje);

                }

                this.setChanged();
                this.notifyObservers(msj);
                this.clearChanged();

                //Cierro el socket
                sc.close();
                inObjeto.close();
                System.out.println("Cliente desconectado");

            }

        } catch (IOException ex) {
            System.out.println("eror en el hilo del socket " + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EscuchaMensaje.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void enviarATodos(ArrayList<Mensajes> usuarios, Mensajes palabras) {

        for (Socket sock : clientes) {

            try {
                ObjectOutputStream outObjeto = new ObjectOutputStream(sock.getOutputStream());
                for (int i = 0; i < usuarios.size(); i++) {
                    outObjeto.writeObject(palabras);
                }
            } catch (IOException ex) {
                Logger.getLogger(EscuchaMensaje.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
