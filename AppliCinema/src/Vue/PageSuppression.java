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
import jdbc2020.*;

/**
 *
 * @author pierr
 * extrait de code issu de https://waytolearnx.com/2020/05/jlist-java-swing.html
 */
public class PageSuppression extends JFrame {
    
    public Connexion maconnection;
    public ArrayList<String> listFilm ;
    private String requete;
    private String[] listAffiche;
    private JList<String> listeTitreFilm;
    public JPanel precherche, plist;
    public JTextField films;
    
    public PageSuppression() throws SQLException, ClassNotFoundException{              

        // creation par heritage de la fenetre
        super("Suppression");

        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, 400, 400);
        setResizable(true);
        setVisible(true);
        
        //creation des panneaux
        precherche = new JPanel();
        plist = new JPanel();
        
        //creation des layout
        plist.setLayout(new GridLayout(1, 3));
        precherche.setLayout(new GridLayout(1, 4));
        
        //Recupération des films de la BDD
        //Connecion a la BDD
        maconnection = new Connexion("Cinema", "root", "");
        requete = "SELECT titre FROM film";
        listFilm = maconnection.remplirChampsRequete(requete);
        
        // creation des textes
        films= new JTextField();
        
        //Transformation de ArrayList a Strin[]
        for(int i = 0; i<listFilm.size(); i++){
            listAffiche = listFilm.toArray(new String[0]);
        }
        
        listeTitreFilm = new JList<>(listAffiche);
        
        plist.add(listeTitreFilm);
        precherche.add(films);
        
        add("North", precherche);
        add("Center", plist);
        
        // pour fermer la fenetre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
         
    }
}
