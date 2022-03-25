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
public class PageAccueil extends javax.swing.JFrame {

    public Connexion connect;
    private final String requete= "SELECT titre FROM film";
    private final  String requete1= "SELECT nomRealisateur FROM film WHERE titre= titreSelectionne";
    private final  String requete2= "SELECT prenomRealisateur FROM film WHERE titre= titreSelectionne";
    private final  String requete3= "SELECT duree FROM film WHERE titre= titreSelectionne";
    private final  String requete4= "SELECT genre FROM film WHERE titre= titreSelectionne";
    private final  String requete5= "SELECT note FROM film WHERE titre= titreSelectionne";
    private final  String requete6= "SELECT synopsis FROM film WHERE titre= titreSelectionne";
    private final String requete7= "SELECT titre FROM film WHERE titre= titreSelectionne";
    
    
    DefaultListModel<String> listModel = new DefaultListModel<>();
    DefaultListModel<String> listModel1 = new DefaultListModel<>();

    /**
     * Creates new form PageAccueil
     *
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public PageAccueil() throws SQLException, ClassNotFoundException {
        super("ECE CINEMA, Le meilleur site de reservation de place de cinema  ");
        initComponents();
        BoutonSeancesFilmSelectione.setEnabled(false);
        PanelDescriptionAccueil.setVisible(false);
        //Connection a la bdd
        connect = new Connexion("Cinema", "root", "");
        listModel = connect.requestDemande(requete);
        TitreFilmsAccueil.setModel(listModel);
                    
        /*listModel1 = connect.requestDemande(requeteInfo);
        descriptionFilmsAccueil.setModel(listModel1);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAccueil = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TitreFilmsAccueil = new javax.swing.JList<>();
        LabelTitreFilmAccueil = new javax.swing.JLabel();
        rechercheAccueilBouton = new javax.swing.JButton();
        ConnexionBoutonAccueil = new javax.swing.JButton();
        InscriptionBoutonAccueil = new javax.swing.JButton();
        LabelLogoAccueil = new javax.swing.JLabel();
        barreRechercheAccueil = new javax.swing.JTextField();
        PanelDescriptionAccueil = new javax.swing.JPanel();
        descriptionFilmsAccueilText = new javax.swing.JTextPane();
        labelDescriptionFilmAccueil = new javax.swing.JLabel();
        PanelBoutonSeances = new javax.swing.JPanel();
        BoutonSeancesFilmSelectione = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitreFilmsAccueil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TitreFilmsAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitreFilmsAccueilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TitreFilmsAccueilMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TitreFilmsAccueilMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TitreFilmsAccueil);
        TitreFilmsAccueil.getAccessibleContext().setAccessibleName("ListefilmsAccueil");
        TitreFilmsAccueil.getAccessibleContext().setAccessibleDescription("affichage des titres des films sur la page accueil");

        LabelTitreFilmAccueil.setText("                                        Liste des Films");
        LabelTitreFilmAccueil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rechercheAccueilBouton.setText("recherche");
        rechercheAccueilBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheAccueilBoutonActionPerformed(evt);
            }
        });

        ConnexionBoutonAccueil.setText("Connexion");
        ConnexionBoutonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionBoutonAccueilActionPerformed(evt);
            }
        });

        InscriptionBoutonAccueil.setText("Inscription");
        InscriptionBoutonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscriptionBoutonAccueilActionPerformed(evt);
            }
        });

        LabelLogoAccueil.setText("                                           ECE CINEMA");

        barreRechercheAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barreRechercheAccueilMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                barreRechercheAccueilMouseExited(evt);
            }
        });
        barreRechercheAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barreRechercheAccueilActionPerformed(evt);
            }
        });

        PanelDescriptionAccueil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelDescriptionFilmAccueil.setText("                                       Description des films");
        labelDescriptionFilmAccueil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelDescriptionAccueilLayout = new javax.swing.GroupLayout(PanelDescriptionAccueil);
        PanelDescriptionAccueil.setLayout(PanelDescriptionAccueilLayout);
        PanelDescriptionAccueilLayout.setHorizontalGroup(
            PanelDescriptionAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descriptionFilmsAccueilText)
            .addComponent(labelDescriptionFilmAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );
        PanelDescriptionAccueilLayout.setVerticalGroup(
            PanelDescriptionAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDescriptionAccueilLayout.createSequentialGroup()
                .addComponent(labelDescriptionFilmAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionFilmsAccueilText, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BoutonSeancesFilmSelectione.setText("Seances Disponibles");
        BoutonSeancesFilmSelectione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonSeancesFilmSelectioneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBoutonSeancesLayout = new javax.swing.GroupLayout(PanelBoutonSeances);
        PanelBoutonSeances.setLayout(PanelBoutonSeancesLayout);
        PanelBoutonSeancesLayout.setHorizontalGroup(
            PanelBoutonSeancesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBoutonSeancesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BoutonSeancesFilmSelectione, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelBoutonSeancesLayout.setVerticalGroup(
            PanelBoutonSeancesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BoutonSeancesFilmSelectione, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelAccueilLayout = new javax.swing.GroupLayout(PanelAccueil);
        PanelAccueil.setLayout(PanelAccueilLayout);
        PanelAccueilLayout.setHorizontalGroup(
            PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAccueilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LabelLogoAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelTitreFilmAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 153, Short.MAX_VALUE)
                        .addComponent(barreRechercheAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechercheAccueilBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(ConnexionBoutonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InscriptionBoutonAccueil)
                        .addGap(5, 5, 5))
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(PanelDescriptionAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PanelBoutonSeances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelAccueilLayout.setVerticalGroup(
            PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAccueilLayout.createSequentialGroup()
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLogoAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(InscriptionBoutonAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                                .addComponent(ConnexionBoutonAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rechercheAccueilBouton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(barreRechercheAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAccueilLayout.createSequentialGroup()
                                .addComponent(LabelTitreFilmAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PanelDescriptionAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAccueilLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelBoutonSeances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheAccueilBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheAccueilBoutonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rechercheAccueilBoutonActionPerformed

    private void ConnexionBoutonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionBoutonAccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConnexionBoutonAccueilActionPerformed

    private void InscriptionBoutonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscriptionBoutonAccueilActionPerformed
        //redirection vers la page d'inscription;
        PageInscription pi = new PageInscription();
        pi.setVisible(true);
    }//GEN-LAST:event_InscriptionBoutonAccueilActionPerformed

    private void barreRechercheAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barreRechercheAccueilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barreRechercheAccueilActionPerformed

    private void barreRechercheAccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barreRechercheAccueilMouseClicked
        barreRechercheAccueil.setText(null);
    }//GEN-LAST:event_barreRechercheAccueilMouseClicked

    private void barreRechercheAccueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barreRechercheAccueilMouseExited
        if (barreRechercheAccueil.getText().equals("")) {
            barreRechercheAccueil.setText("titre de film");
        }
    }//GEN-LAST:event_barreRechercheAccueilMouseExited

    private void TitreFilmsAccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreFilmsAccueilMouseClicked
        if (TitreFilmsAccueil.getSelectedIndex() > -1) {
            PanelDescriptionAccueil.setVisible(true);
            BoutonSeancesFilmSelectione.setEnabled(true);
            String textAffich="";
            String titreSelectionne = (String) TitreFilmsAccueil.getSelectedValue();
            String requeteInfo="SELECT titre,prenomRealisateur,nomRealisateur,duree,genre,note,synopsis FROM film WHERE titre LIKE '" + titreSelectionne + "'";
            try {
                listModel1 = connect.requestDemande(requeteInfo);
            } catch (SQLException ex) {
                Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
            }
            textAffich="Titre:"+listModel1.get(6)+"\nRealisateur:"+listModel1.get(0)+" "+listModel1.get(1)+"\nduree:"+(String)listModel1.get(2)+"\ngenre:"+listModel1.get(3)+"\nnote:"+(String)listModel1.get(4)+"\nsynopsis:"+listModel1.get(5);
            descriptionFilmsAccueilText.setText(textAffich);
            
        }
    }//GEN-LAST:event_TitreFilmsAccueilMouseClicked

    private void TitreFilmsAccueilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreFilmsAccueilMouseReleased
        PanelDescriptionAccueil.setVisible(false);
        BoutonSeancesFilmSelectione.setEnabled(false);
        descriptionFilmsAccueilText.setText("");
    }//GEN-LAST:event_TitreFilmsAccueilMouseReleased

    private void TitreFilmsAccueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreFilmsAccueilMouseExited
        /*PanelDescriptionAccueil.setVisible(false);
        descriptionFilmsAccueilText.setText("");*/
    }//GEN-LAST:event_TitreFilmsAccueilMouseExited

    private void BoutonSeancesFilmSelectioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonSeancesFilmSelectioneActionPerformed
        //il faut faire le lien vers une autre page qui sera celle de la liste des seances avec le titre du film selectionne
        try {
            
            PageSuppression p = new PageSuppression();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BoutonSeancesFilmSelectioneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonSeancesFilmSelectione;
    private javax.swing.JButton ConnexionBoutonAccueil;
    private javax.swing.JButton InscriptionBoutonAccueil;
    private javax.swing.JLabel LabelLogoAccueil;
    private javax.swing.JLabel LabelTitreFilmAccueil;
    private javax.swing.JPanel PanelAccueil;
    private javax.swing.JPanel PanelBoutonSeances;
    private javax.swing.JPanel PanelDescriptionAccueil;
    private javax.swing.JList<String> TitreFilmsAccueil;
    private javax.swing.JTextField barreRechercheAccueil;
    private javax.swing.JTextPane descriptionFilmsAccueilText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescriptionFilmAccueil;
    private javax.swing.JButton rechercheAccueilBouton;
    // End of variables declaration//GEN-END:variables
}
