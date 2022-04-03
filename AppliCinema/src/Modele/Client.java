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
public class Client {
    
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String email;
    private String loginClient;
    
    public Client(){
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
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the loginClient
     */
    public String getLoginClient() {
        return loginClient;
    }

    /**
     * @param loginClient the loginClient to set
     */
    public void setLoginClient(String loginClient) {
        this.loginClient = loginClient;
    }
    
    /**
     * 
     * @return les infromations du client
     */
    @Override
    public String toString(){
        return "Nom : "+nom+"\nPrenom : "+prenom+"\nAge : "+age+"\nE-mail : "+email+"\nloginClient : "+loginClient;
    }
}
