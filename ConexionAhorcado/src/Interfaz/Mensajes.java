/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.Serializable;

/**
 *
 * @author DavidVelazquez
 */
@SuppressWarnings("serial")
public class Mensajes implements Serializable {

    private static final long serialVersionUID = 8799656478674716638L;
    private String palabra;
    private String tema;
    private String pista;
    private int tipoMensaje;
    private String mensaje;
    private String ipHamachi;
    private String username;
    private String ipServer;
    private int score;

    public Mensajes() {
        super();
    }

    public Mensajes(String palabra, String tema, String pista, int tipoMensaje, String mensaje, String ipHamachi, String username, String ipServer, int score) {
        super();
        this.palabra = palabra;
        this.tema = tema;
        this.pista = pista;
        this.tipoMensaje = tipoMensaje;
        this.mensaje = mensaje;
        this.ipHamachi = ipHamachi;
        this.username = username;
        this.ipServer = ipServer;
        this.score = score;
    }

    /**
     * @return the palabra
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param palabra the palabra to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the tema
     */
    public String getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(String tema) {
        this.tema = tema;
    }

    /**
     * @return the pista
     */
    public String getPista() {
        return pista;
    }

    /**
     * @param pista the pista to set
     */
    public void setPista(String pista) {
        this.pista = pista;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the ipHamachi
     */
    public String getIpHamachi() {
        return ipHamachi;
    }

    /**
     * @param ipHamachi the ipHamachi to set
     */
    public void setIpHamachi(String ipHamachi) {
        this.ipHamachi = ipHamachi;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the ipServer
     */
    public String getIpServer() {
        return ipServer;
    }

    /**
     * @param ipServer the ipServer to set
     */
    public void setIpServer(String ipServer) {
        this.ipServer = ipServer;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the tipoMensaje
     */
    public int getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * @param tipoMensaje the tipoMensaje to set
     */
    public void setTipoMensaje(int tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }

}
