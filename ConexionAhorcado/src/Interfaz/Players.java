/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author DavidVelazquez
 */
public class Players {

    private String ipHamachi;
    private String username;

    public Players() {
    }

    public Players(String ipHamachi, String username) {
        this.ipHamachi = ipHamachi;
        this.username = username;
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

}
