/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author prohd
 */
public class Seance {
    private int id;
    private int salle;
    private int id_film;
    private String date;
    private String heuredebut;
    
    public Seance(){
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the salle
     */
    public int getSalle() {
        return salle;
    }

    /**
     * @param salle the salle to set
     */
    public void setSalle(int salle) {
        this.salle = salle;
    }

    /**
     * @return the id_film
     */
    public int getId_film() {
        return id_film;
    }

    /**
     * @param id_film the id_film to set
     */
    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the heuredebut
     */
    public String getHeuredebut() {
        return heuredebut;
    }

    /**
     * @param heuredebut the heuredebut to set
     */
    public void setHeuredebut(String heuredebut) {
        this.heuredebut = heuredebut;
    }
       
    //on affiche les informations de la séance
    @Override
    public String toString(){
        return "Salle : "+salle+"\nID_Film : "+id_film+"\nDate : "+date+"\nHeure debut : "+heuredebut;
    }
}
