/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc2020.*;
import java.net.URL;
import java.io.*;
import javax.imageio.ImageIO;

/**
 *
 * @author prohd
 */
public class PageAccueil extends javax.swing.JFrame {

    public Connexion connect;
    private final String requete = "SELECT titre FROM film";
    private int taille;
    private String Synopsis;
    public int client;
    public int id_film;
    private String str;
    byte[] imageFilm = null;
    ResultSet rs;
    PreparedStatement pst;

    PageConnexion pc = new PageConnexion();

    DefaultListModel<String> listModel = new DefaultListModel<>();
    DefaultListModel<String> listModel1 = new DefaultListModel<>();
    DefaultListModel<byte[]> listModel2 = new DefaultListModel<>();
    private boolean connexionValid;
    private boolean IsEmp;

    /**
     * Creates new form PageAccueil
     *
     * @param connexionValid
     * @param Emp
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public PageAccueil(boolean connexionValid, boolean Emp) throws SQLException, ClassNotFoundException {
        super("ECE CINEMA, Le meilleur site de reservation de place de cinema  ");
        initComponents();
        BoutonSeancesFilmSelectione.setEnabled(false);
        PanelDescriptionAccueil.setVisible(false);
        //Connection a la bdd
        connect = new Connexion("Cinema", "root", "");
        listModel = connect.requestDemande(requete);
        TitreFilmsAccueil.setModel(listModel);
        IsEmp = Emp;
        this.connexionValid = connexionValid;

        /*listModel1 = connect.requestDemande(requeteInfo);
        descriptionFilmsAccueil.setModel(listModel1);*/
        //Affichage des boutons de connexion/inscription (ou non si connexion effectué)
        affichageBtnCo(connexionValid, IsEmp);
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
        LabelLogoAccueil = new javax.swing.JLabel();
        barreRechercheAccueil = new javax.swing.JTextField();
        PanelDescriptionAccueil = new javax.swing.JPanel();
        descriptionFilmsAccueilText = new javax.swing.JTextPane();
        labelDescriptionFilmAccueil = new javax.swing.JLabel();
        labelImages = new javax.swing.JLabel();
        PanelBoutonSeances = new javax.swing.JPanel();
        BoutonSeancesFilmSelectione = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelAccesCpt = new javax.swing.JPanel();
        btnCpt = new javax.swing.JButton();
        PanelCoIns = new javax.swing.JPanel();
        ConnexionBoutonAccueil = new javax.swing.JButton();
        InscriptionBoutonAccueil = new javax.swing.JButton();
        PanelEmp = new javax.swing.JPanel();
        btnSeances = new javax.swing.JButton();
        btnFilms = new javax.swing.JButton();
        BoutonStatisques = new javax.swing.JButton();
        btnRed = new javax.swing.JButton();

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

        descriptionFilmsAccueilText.setMaximumSize(new java.awt.Dimension(6, 22));

        labelDescriptionFilmAccueil.setText("                                       Description des films");
        labelDescriptionFilmAccueil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelDescriptionAccueilLayout = new javax.swing.GroupLayout(PanelDescriptionAccueil);
        PanelDescriptionAccueil.setLayout(PanelDescriptionAccueilLayout);
        PanelDescriptionAccueilLayout.setHorizontalGroup(
            PanelDescriptionAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descriptionFilmsAccueilText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelDescriptionFilmAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
            .addComponent(labelImages, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelDescriptionAccueilLayout.setVerticalGroup(
            PanelDescriptionAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDescriptionAccueilLayout.createSequentialGroup()
                .addComponent(labelDescriptionFilmAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionFilmsAccueilText, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelImages, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnCpt.setText("Mon Compte");
        btnCpt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAccesCptLayout = new javax.swing.GroupLayout(PanelAccesCpt);
        PanelAccesCpt.setLayout(PanelAccesCptLayout);
        PanelAccesCptLayout.setHorizontalGroup(
            PanelAccesCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesCptLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnCpt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        PanelAccesCptLayout.setVerticalGroup(
            PanelAccesCptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAccesCptLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnCpt)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ConnexionBoutonAccueil.setText("Connexion");
        ConnexionBoutonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConnexionBoutonAccueilActionPerformed(evt);
            }
        });

        InscriptionBoutonAccueil.setText("Inscription");
        InscriptionBoutonAccueil.setMaximumSize(new java.awt.Dimension(85, 25));
        InscriptionBoutonAccueil.setMinimumSize(new java.awt.Dimension(835, 25));
        InscriptionBoutonAccueil.setPreferredSize(new java.awt.Dimension(85, 25));
        InscriptionBoutonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InscriptionBoutonAccueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCoInsLayout = new javax.swing.GroupLayout(PanelCoIns);
        PanelCoIns.setLayout(PanelCoInsLayout);
        PanelCoInsLayout.setHorizontalGroup(
            PanelCoInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoInsLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(ConnexionBoutonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(InscriptionBoutonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PanelCoInsLayout.setVerticalGroup(
            PanelCoInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCoInsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelCoInsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConnexionBoutonAccueil)
                    .addComponent(InscriptionBoutonAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSeances.setText("Gestion Seances");
        btnSeances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeancesActionPerformed(evt);
            }
        });

        btnFilms.setText("Gestion Films");
        btnFilms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmsActionPerformed(evt);
            }
        });

        BoutonStatisques.setText("Statistiques");
        BoutonStatisques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonStatisquesActionPerformed(evt);
            }
        });

        btnRed.setText("Réduction");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEmpLayout = new javax.swing.GroupLayout(PanelEmp);
        PanelEmp.setLayout(PanelEmpLayout);
        PanelEmpLayout.setHorizontalGroup(
            PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BoutonStatisques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFilms, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelEmpLayout.setVerticalGroup(
            PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeances)
                    .addComponent(btnFilms))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoutonStatisques)
                    .addComponent(btnRed))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(PanelAccesCpt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelCoIns, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelEmp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(PanelCoIns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAccesCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(PanelEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(18, 18, 18)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(PanelCoIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelAccesCpt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(PanelEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
                        .addGap(22, 22, 22)
                        .addComponent(PanelDescriptionAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 108, Short.MAX_VALUE)
                        .addComponent(barreRechercheAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rechercheAccueilBouton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelBoutonSeances, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelAccueilLayout.setVerticalGroup(
            PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAccueilLayout.createSequentialGroup()
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelLogoAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rechercheAccueilBouton)
                            .addComponent(barreRechercheAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addGroup(PanelAccueilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAccueilLayout.createSequentialGroup()
                                .addComponent(LabelTitreFilmAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PanelDescriptionAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelAccueilLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelBoutonSeances, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rechercheAccueilBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheAccueilBoutonActionPerformed
        // si la barre de recherche n'est pas vide ou si elle n'est pas = "titre de film", on filtre l'affichage des films
        if (!"titre de film".equals(barreRechercheAccueil.getText())) {
            String requeteFiltre = "SELECT titre FROM film WHERE titre LIKE '%" + barreRechercheAccueil.getText() + "%'";
            try {
                listModel = connect.requestDemande(requeteFiltre);
                TitreFilmsAccueil.setModel(listModel);
            } catch (SQLException ex) {
                Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_rechercheAccueilBoutonActionPerformed

    private void ConnexionBoutonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConnexionBoutonAccueilActionPerformed
        pc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ConnexionBoutonAccueilActionPerformed

    private void InscriptionBoutonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InscriptionBoutonAccueilActionPerformed
        //redirection vers la page d'inscription;
        PageInscription pi = null;
        try {
            pi = new PageInscription();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        pi.setVisible(true);
    }//GEN-LAST:event_InscriptionBoutonAccueilActionPerformed

    private void barreRechercheAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barreRechercheAccueilActionPerformed

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
            if (!IsEmp) {
                BoutonSeancesFilmSelectione.setEnabled(true);
            } else {
                BoutonSeancesFilmSelectione.setEnabled(false);
            }
            String textAffich;
            String titreSelectionne = (String) TitreFilmsAccueil.getSelectedValue();
            //on rceupere toute les info des films
            String requeteInfo = "SELECT titre,prenomRealisateur,nomRealisateur,duree,genre,note,synopsis,id_film,affiche FROM film WHERE titre LIKE '" + titreSelectionne + "'";
            //requete pour augmenter le nombre de vues à chaque fois d'on appuie sur le titre d'un film
            String requeteModifNBvues = "UPDATE film SET nombreVues = nombreVues + 1 WHERE titre = '" + titreSelectionne + "'";
            try {
                listModel1 = connect.requestDemande(requeteInfo);
                connect.stmt.executeUpdate(requeteModifNBvues);
            } catch (SQLException ex) {
                Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
            }
            id_film = Integer.parseInt(listModel1.get(6));
            //System.out.println(id_film);
            //Reduction de la longueur du synopsis avec des '\n' pour que le panneau ne soit pas trop grand
            taille = listModel1.get(5).length();
            Synopsis = listModel1.get(5);
            StringBuilder str = new StringBuilder(Synopsis);
            for (int i = 1; 70 * i < taille; i++) {
                str.insert(70 * i, '\n');
            }

            //Affichage des infos
            textAffich = "Titre : " + (String) TitreFilmsAccueil.getSelectedValue() + "\nRealisateur : " + listModel1.get(0) + " " + listModel1.get(1) + "\nDuree : " + (String) listModel1.get(2) + "min\ngenre : " + listModel1.get(3) + "\nNote : " + (String) listModel1.get(4) + "\nSynopsis : \n" + str;
            descriptionFilmsAccueilText.setText(textAffich);

            String path = listModel1.get(7);
            ////////////////////
            //affichage d'une image stockée avec son chemin dans la bdd des films
            //code imspiré de la video youtube https://www.youtube.com/watch?v=oxT2G4gxsxc de Indra Subedi 
            if (!"".equals(path)) {

                ImageIcon ii = new ImageIcon(path);
                Image im = ii.getImage().getScaledInstance(labelImages.getWidth(), labelImages.getHeight(), Image.SCALE_SMOOTH);
                labelImages.setIcon(new ImageIcon(im));
                try {
                    File image = new File(path);
                    FileInputStream fis = new FileInputStream(image);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    byte[] buf = new byte[1024];
                    for (int readNum; (readNum = fis.read(buf)) != -1;) {
                        bos.write(buf, 0, readNum);
                    }
                    imageFilm = bos.toByteArray();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }

        }
    }//GEN-LAST:event_TitreFilmsAccueilMouseClicked

    private void TitreFilmsAccueilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreFilmsAccueilMouseReleased
        PanelDescriptionAccueil.setVisible(false);
        //BoutonSeancesFilmSelectione.setEnabled(false);
        descriptionFilmsAccueilText.setText("");
    }//GEN-LAST:event_TitreFilmsAccueilMouseReleased

    private void TitreFilmsAccueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreFilmsAccueilMouseExited
        /*PanelDescriptionAccueil.setVisible(false);
        descriptionFilmsAccueilText.setText("");*/
    }//GEN-LAST:event_TitreFilmsAccueilMouseExited

    private void BoutonSeancesFilmSelectioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonSeancesFilmSelectioneActionPerformed
        PageSeance pse;
        try {
            pse = new PageSeance(id_film, client, connexionValid);
            pse.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_BoutonSeancesFilmSelectioneActionPerformed

    private void btnCptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCptActionPerformed
        PageHistoFact ph;
        try {
            ph = new PageHistoFact(connexionValid, client);
            ph.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCptActionPerformed

    private void btnSeancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeancesActionPerformed
        try {
            GestiondeSeance gs = new GestiondeSeance();
            gs.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSeancesActionPerformed

    private void btnFilmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmsActionPerformed
        try {
            PageSuppression ps = new PageSuppression();
            ps.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFilmsActionPerformed

    private void BoutonStatisquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonStatisquesActionPerformed
        PageStats pStats = null;
        try {
            pStats = new PageStats();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        pStats.setVisible(true);
    }//GEN-LAST:event_BoutonStatisquesActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        try {
            PageReduction pr = new PageReduction();
            pr.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageAccueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRedActionPerformed

    public void affichageBtnCo(boolean COk, boolean Emp) {
        if (COk) {
            if (Emp) {
                PanelAccesCpt.setVisible(false);
                PanelCoIns.setVisible(false);
                PanelEmp.setVisible(true);
                BoutonSeancesFilmSelectione.setEnabled(false);
            } else {
                PanelAccesCpt.setVisible(true);
                PanelCoIns.setVisible(false);
                PanelEmp.setVisible(false);
            }
        } else {
            PanelAccesCpt.setVisible(false);
            PanelCoIns.setVisible(true);
            PanelEmp.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonSeancesFilmSelectione;
    private javax.swing.JButton BoutonStatisques;
    private javax.swing.JButton ConnexionBoutonAccueil;
    private javax.swing.JButton InscriptionBoutonAccueil;
    private javax.swing.JLabel LabelLogoAccueil;
    private javax.swing.JLabel LabelTitreFilmAccueil;
    private javax.swing.JPanel PanelAccesCpt;
    private javax.swing.JPanel PanelAccueil;
    private javax.swing.JPanel PanelBoutonSeances;
    private javax.swing.JPanel PanelCoIns;
    private javax.swing.JPanel PanelDescriptionAccueil;
    private javax.swing.JPanel PanelEmp;
    private javax.swing.JList<String> TitreFilmsAccueil;
    private javax.swing.JTextField barreRechercheAccueil;
    private javax.swing.JButton btnCpt;
    private javax.swing.JButton btnFilms;
    private javax.swing.JButton btnRed;
    private javax.swing.JButton btnSeances;
    private javax.swing.JTextPane descriptionFilmsAccueilText;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescriptionFilmAccueil;
    private javax.swing.JLabel labelImages;
    private javax.swing.JButton rechercheAccueilBouton;
    // End of variables declaration//GEN-END:variables
}
