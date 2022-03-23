/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.*;

/**
 *
 * @author pierr
 */
public class testLits extends JFrame implements ItemListener{
    public Connexion maconnection;
    public ArrayList<String> listFilm ;
    private String requete;
    private String[] listAffiche;
    private JList<String> listeTitreFilm;
    public JPanel precherche, plist;
    public JTextField films;
  
    public testLits() throws SQLException, ClassNotFoundException 
    {
        //Recupération des films de la BDD
        //Connecion a la BDD
        maconnection = new Connexion("Cinema", "root", "");
        requete = "SELECT titre FROM film";
        listFilm = maconnection.remplirChampsRequete(requete);
 
        //créer la liste des langages
        //Transformation de ArrayList a Strin[]
        for(int i = 0; i<listFilm.size(); i++){
            listAffiche = listFilm.toArray(new String[0]);
        }
        
        listeTitreFilm = new JList<>(listAffiche);
        
        add(listeTitreFilm);
         
        this.setTitle("Exemple de JList");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
     
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                try {
                    new testLits();
                } catch (SQLException ex) {
                    Logger.getLogger(testLits.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(testLits.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent evt) {
        // sélection d'une requete et afficher ses résultats
        /*if (evt.getSource() == listeTitreFilm) {
            // recuperer la liste des lignes de la requete selectionnee
            String filmselectionne = listeTitreFilm.getSelectedItem();
            System.out.println("test1");
        }*/
    }
}
