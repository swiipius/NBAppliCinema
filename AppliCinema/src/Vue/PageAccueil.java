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
 * @author prohd
 */
public class PageAccueil extends JFrame implements ActionListener, ItemListener{

    public Connexion maconnexion;
    public JButton b1,b2;
    public JPanel p0, p1, haut;
    public JTextField films;
    public JLabel titre;
    
    public PageAccueil() {
        //titre au desssus de la page
        super("CINEMA ECE");
        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, 400, 400);
        setResizable(true);
        setVisible(true);
        
        //deux bouttons de la page d'acceuil
        b1=new JButton("Connexion");
        b2=new JButton("Compte");
        
        // creation des textes
        
        films= new JTextField();
        
        // creation des labels
        titre= new JLabel("CINEMA ECE", JLabel.CENTER);

        //creation des panneaux
        p0 = new JPanel();
        p1 = new JPanel();
        haut = new JPanel();
        
        //mise en page des panneaux
        p0.setLayout(new GridLayout(1, 3));
        haut.setLayout(new GridLayout(2, 1));
        p1.setLayout(new GridLayout(1, 4));
        
        
        // ajout des objets graphqiues dans les panneaux
        p0.add(titre);
        p0.add(films);
        p0.add(b1);
        p0.add(b2);
        haut.add("North", p0);
        
        //reactivite des bouttons
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        // couleurs des objets graphiques
        


        // disposition geographique des panneaux
        add("North", haut);
        add("Center", p1);
        
        // pour fermer la fenetre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // tout fermer												System.exit(0); // tout fermer
            }
        });
    }

    ////////////////////////J'override ces deux methodes afin qu'il n'y ai pas de message d'erreur à cause du côté abstrait de celles-ci
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
