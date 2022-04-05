/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;
import DAO.*;

/**
 *
 * @author pierr
 */
public class PageSuppression extends javax.swing.JFrame {

    
    private FilmDAO film;
    
    private int count = 0;
    private String path = "";
    private InputStream is;

    DefaultListModel<String> listModelTitre = new DefaultListModel<>();

    public PageSuppression() throws SQLException, ClassNotFoundException {
        super("Gestion des Films");
        initComponents();

        btnDel.setEnabled(false);
        //connection a la bdd
        film = new FilmDAO("cinema", "root", "");
        
        //ajout des titres des films dans la liste
        listModelTitre = film.getFilmTitre();
        listTitreFilm.setModel(listModelTitre);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTitreFilm = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        Titre = new javax.swing.JTextField();
        PrenomReal = new javax.swing.JTextField();
        NomReal = new javax.swing.JTextField();
        Genre = new javax.swing.JTextField();
        Synopsis = new javax.swing.JTextField();
        btnRech = new javax.swing.JButton();
        Recherche = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        RechercheImage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Note = new javax.swing.JFormattedTextField();
        Duree = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowclosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(168, 26, 3));

        listTitreFilm.setBackground(new java.awt.Color(0, 0, 0));
        listTitreFilm.setForeground(new java.awt.Color(255, 255, 255));
        listTitreFilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTitreFilmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listTitreFilm);

        btnAdd.setBackground(new java.awt.Color(0, 0, 0));
        btnAdd.setForeground(new java.awt.Color(168, 26, 3));
        btnAdd.setText("AJOUTER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setBackground(new java.awt.Color(0, 0, 0));
        btnDel.setForeground(new java.awt.Color(168, 26, 3));
        btnDel.setText("SUPPRIMER");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        Titre.setBackground(new java.awt.Color(0, 0, 0));
        Titre.setForeground(new java.awt.Color(255, 255, 255));
        Titre.setText("Titre");
        Titre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TitreMouseExited(evt);
            }
        });
        Titre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TitreKeyTyped(evt);
            }
        });

        PrenomReal.setBackground(new java.awt.Color(0, 0, 0));
        PrenomReal.setForeground(new java.awt.Color(255, 255, 255));
        PrenomReal.setText("PrenomReal");
        PrenomReal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenomRealMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrenomRealMouseExited(evt);
            }
        });
        PrenomReal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PrenomRealKeyTyped(evt);
            }
        });

        NomReal.setBackground(new java.awt.Color(0, 0, 0));
        NomReal.setForeground(new java.awt.Color(255, 255, 255));
        NomReal.setText("NomReal");
        NomReal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomRealMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomRealMouseExited(evt);
            }
        });
        NomReal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NomRealKeyTyped(evt);
            }
        });

        Genre.setBackground(new java.awt.Color(0, 0, 0));
        Genre.setForeground(new java.awt.Color(255, 255, 255));
        Genre.setText("Genre");
        Genre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GenreMouseExited(evt);
            }
        });
        Genre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GenreKeyTyped(evt);
            }
        });

        Synopsis.setBackground(new java.awt.Color(0, 0, 0));
        Synopsis.setForeground(new java.awt.Color(255, 255, 255));
        Synopsis.setText("Synopsis");
        Synopsis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SynopsisMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SynopsisMouseExited(evt);
            }
        });

        btnRech.setBackground(new java.awt.Color(0, 0, 0));
        btnRech.setForeground(new java.awt.Color(168, 26, 3));
        btnRech.setText("Recheche");
        btnRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechActionPerformed(evt);
            }
        });

        Recherche.setBackground(new java.awt.Color(0, 0, 0));
        Recherche.setForeground(new java.awt.Color(255, 255, 255));
        Recherche.setText("Recherche");
        Recherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RechercheMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RechercheMouseExited(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setForeground(new java.awt.Color(168, 26, 3));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        RechercheImage.setBackground(new java.awt.Color(0, 0, 0));
        RechercheImage.setForeground(new java.awt.Color(168, 26, 3));
        RechercheImage.setText("Parcourir les images");
        RechercheImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechercheImageActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Durée :");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Note :");

        Note.setBackground(new java.awt.Color(0, 0, 0));
        Note.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Note.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#.#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Note.setText(".");

        Duree.setBackground(new java.awt.Color(0, 0, 0));
        Duree.setForeground(new java.awt.Color(255, 255, 255));
        try {
            Duree.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PrenomReal, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomReal))
                            .addComponent(Titre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(Duree, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(Note, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RechercheImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Synopsis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Recherche)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnRech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Titre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PrenomReal, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(NomReal))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Genre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(Note)
                            .addComponent(Duree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Synopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RechercheImage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Suppression d'un film dans la bdd
     * @param evt 
     */
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        String SelectedTitle = (String) listTitreFilm.getSelectedValue();//Capture de l'element selectionne
        int index = listTitreFilm.getSelectedIndex();
        DefaultListModel<String> eltRech = new DefaultListModel<>();
        
        try {
            eltRech = film.getRealByTitre(SelectedTitle);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
        }

        String textAffich = "Voulez vous supprimer ce film ?\n" + SelectedTitle + "\n" + eltRech.get(1) + ", " + eltRech.get(0);
        int result = JOptionPane.showConfirmDialog(null, textAffich, "Suppression", JOptionPane.YES_NO_OPTION);

        //si on choisit de supprimer le film, on appel la methode delFilmByTitreAndReal qui supprime dans la bdd
        if (result == JOptionPane.YES_OPTION) {
            listModelTitre.removeElementAt(index);
            try {
                film.delFilmByTitreAndReal(SelectedTitle, eltRech.get(1));
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
            }
            //message de suppression
            JOptionPane.showMessageDialog(null, "Film Supprime");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    /**
     * Active le bouton supression lors de la selection d'un film dans la jlist
     * @param evt 
     */
    private void listTitreFilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTitreFilmMouseClicked
        //si la liste des films n'est pas vide, on active le bouton de suprression
        if (listTitreFilm.getSelectedIndex() > -1) {
            btnDel.setEnabled(true);
            //BtnAdd.setEnabled(false);
        }
    }//GEN-LAST:event_listTitreFilmMouseClicked

    /**
     * Ajoute un film dans la bdd
     * @param evt 
     */
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //si un champ est vide, on ne peut pas ajouter un film dans la bdd
        if ((Titre.getText().equals("")) || (Titre.getText().equals("Titre")) || (PrenomReal.getText().equals("")) || (PrenomReal.getText().equals("PrenomReal")) || (NomReal.getText().equals("")) || (NomReal.getText().equals("NomReal")) || (Duree.getText().equals("")) || (Note.getText().equals("")) || (Note.getText().equals("Note")) || (Genre.getText().equals("")) || (Genre.getText().equals("Genre")) || (Synopsis.getText().equals("")) || (Synopsis.getText().equals("Synopsis")) || ("".equals(path))) {
            JOptionPane.showMessageDialog(null, "Veuillez completer tout les champs");
        } else {
            try {
                //on ajoute le nouveau film dans la bdd avec les champs qu'on vient de remplir
                film.addFilm(Titre.getText(), NomReal.getText(), PrenomReal.getText(), Duree.getText(), Genre.getText(), Note.getText(), Synopsis.getText(), path);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
            }
            //on ajoute le titre du nouveau film dans la liste
            listModelTitre.addElement(Titre.getText());
            JOptionPane.showMessageDialog(null, "Le film a ete ajoute");
            //on vide les champs
            Titre.setText("Titre");
            PrenomReal.setText("Prenomreal");
            NomReal.setText("NomReal");
            //Duree.setText("Duree");
            Genre.setText("Genre");
            Note.setText("Note");
            Synopsis.setText("Synopsis");
            path = "";
        }
    }//GEN-LAST:event_btnAddActionPerformed

    /**
     * Si on clique sur l'espace d'entrée du champ, il se vide
     * @param evt 
     */
    private void TitreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreMouseClicked
        if (Titre.getText().equals("Titre")) {
            Titre.setText(null);
        }
    }//GEN-LAST:event_TitreMouseClicked

    /**
     * Si on sort du champ est qu'il est vide alors on remet le texte
     * @param evt 
     */
    private void PrenomRealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomRealMouseClicked
        if (PrenomReal.getText().equals("PrenomReal")) {
            PrenomReal.setText(null);
        }
    }//GEN-LAST:event_PrenomRealMouseClicked

    /**
     * si on clique sur l'espace d'entrée du champ, il se vide
     * @param evt 
     */
    private void NomRealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomRealMouseClicked
        if (NomReal.getText().equals("NomReal")) {
            NomReal.setText(null);
        }
    }//GEN-LAST:event_NomRealMouseClicked

    /**
     * si on clique sur l'espace d'entrée du champ, il se vide
     * @param evt 
     */
    private void GenreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenreMouseClicked
        if (Genre.getText().equals("Genre")) {
            Genre.setText(null);
        }
    }//GEN-LAST:event_GenreMouseClicked

    /**
     * i on clique sur l'espace d'entrée du champ, il se vide
     * @param evt 
     */
    private void SynopsisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SynopsisMouseClicked
        if (Synopsis.getText().equals("Synopsis")) {
            Synopsis.setText(null);
        }
    }//GEN-LAST:event_SynopsisMouseClicked

    /**
     * si on quitte l'espace d'entrée du champ vide, il se reinitialise
     * @param evt 
     */
    private void TitreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitreMouseExited
        if (Titre.getText().equals("")) {
            Titre.setText("Titre");
        }
    }//GEN-LAST:event_TitreMouseExited

    /**
     * si on quitte l'espace d'entrée du champ vide, il se reinitialise
     * @param evt 
     */
    private void PrenomRealMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomRealMouseExited
        if (PrenomReal.getText().equals("")) {
            PrenomReal.setText("PrenomReal");
        }
    }//GEN-LAST:event_PrenomRealMouseExited

    /**
     * si on quitte l'espace d'entrée du champ vide, il se reinitialise
     * @param evt 
     */
    private void NomRealMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomRealMouseExited
        if (NomReal.getText().equals("")) {
            NomReal.setText("NomReal");
        }
    }//GEN-LAST:event_NomRealMouseExited

    /**
     * si on quitte l'espace d'entrée du champ vide, il se reinitialise
     * @param evt 
     */
    private void GenreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenreMouseExited
        if (Genre.getText().equals("")) {
            Genre.setText("Genre");
        }
    }//GEN-LAST:event_GenreMouseExited

    /**
     * si on quitte l'espace d'entrée du champ vide, il se reinitialise
     * @param evt 
     */
    private void SynopsisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SynopsisMouseExited
        if (Synopsis.getText().equals("")) {
            Synopsis.setText("Synopsis");
        }
    }//GEN-LAST:event_SynopsisMouseExited

    /**
     * si on clique sur l'espace d'entrée du champ, il se vide
     * @param evt 
     */
    private void RechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercheMouseClicked
        Recherche.setText(null);
    }//GEN-LAST:event_RechercheMouseClicked

    /**
     * si on quitte l'espace d'entrée du champ vide, il se reinitialise
     * @param evt 
     */
    private void RechercheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RechercheMouseExited
        if (Recherche.getText().equals("")) {
            Recherche.setText("Recherche");
        }
    }//GEN-LAST:event_RechercheMouseExited

    /**
     * Lance la recherche d'un film par rapport a un titre dans bdd
     * @param evt 
     */
    private void btnRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechActionPerformed
        //on verifie que le champ de recherche soit rempli, et si c'est le cas, on filtre la liste en fonction du titre
        if ((Recherche.getText().equals("")) || (PrenomReal.getText().equals("Recherche"))) {
            JOptionPane.showMessageDialog(null, "Veuillez rentrer un titre à chercher");
        } else {
            try {
                listModelTitre = film.getTitreByTitreApprox(Recherche.getText());
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
            }
            listTitreFilm.setModel(listModelTitre);
            //après coup, on reinitialise la barre de recherche
            Recherche.setText("Recherche");
        }
    }//GEN-LAST:event_btnRechActionPerformed

    /**
     * on annulle le fitre de la barre de recherche
     * @param evt 
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        try {
            listModelTitre = film.getFilmTitre();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
        }
        listTitreFilm.setModel(listModelTitre);
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * Blindage du titre (pas de " ou ')
     * @param evt 
     */
    private void TitreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TitreKeyTyped
        //blindage du titre
        char c = evt.getKeyChar();
        if ((c == '"') || (c == ';')) {
            evt.consume();
        }
    }//GEN-LAST:event_TitreKeyTyped

    /**
     * Blindage du PrenomReal (pas de " ou ')
     * @param evt 
     */
    private void PrenomRealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrenomRealKeyTyped
        //blindage du prenomRea
        char c = evt.getKeyChar();
        if ((c == '"') || (c == '\'')) {
            evt.consume();
        }
    }//GEN-LAST:event_PrenomRealKeyTyped

    /**
     * Blindage du NomReal (pas de " ou ')
     * @param evt 
     */
    private void NomRealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NomRealKeyTyped
        //blindage du nomRea
        char c = evt.getKeyChar();
        if ((c == '"') || (c == ';')) {
            evt.consume();
        }
    }//GEN-LAST:event_NomRealKeyTyped

    /**
     * Blindage du Genre (pas de " ou ')
     * @param evt 
     */
    private void GenreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GenreKeyTyped
        //blindage du genre
        char c = evt.getKeyChar();
        if ((c == '"') || (c == ';')) {
            evt.consume();
        }
    }//GEN-LAST:event_GenreKeyTyped

    /**
     * Rechrche de l'image dans pc
     * @param evt 
     */
    private void RechercheImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechercheImageActionPerformed
        //https://www.youtube.com/watch?v=4syhRRe6iDg
        //youtiber: Source Code PH 
        //methode pour ajouter une image dans la bdd
        JFileChooser fileChooser = new JFileChooser();
        //retriction du type de fichier cherché
        FileNameExtensionFilter filtre = new FileNameExtensionFilter("PNG JPG  ET JPEG", "png", "jpeg", "jpg");
        fileChooser.addChoosableFileFilter(filtre);
        int load = fileChooser.showOpenDialog(null);

        if (load == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //on receptionne le chemin absolu de l'image
            path = file.getAbsolutePath();
            int taille = path.length();
            //on rajaoute un antislash a chaque reccurence d'un autre, afin que cela ne soit pas supprimé dans la bdd
            String chaine2 = "";
            for (int i = 0; i < taille; i++) {
                chaine2 += path.charAt(i);
                if (path.charAt(i) == '\\') {
                    chaine2 += '\\';
                }
            }
            path = "";
            path = chaine2;
            try {
                
                is = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }


    }//GEN-LAST:event_RechercheImageActionPerformed

    private void windowclosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowclosing
        this.dispose();
        PageAccueil pa;
        try {
            pa = new PageAccueil(true, true);
            pa.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageSuppression.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_windowclosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Duree;
    private javax.swing.JTextField Genre;
    private javax.swing.JTextField NomReal;
    private javax.swing.JFormattedTextField Note;
    private javax.swing.JTextField PrenomReal;
    private javax.swing.JTextField Recherche;
    private javax.swing.JButton RechercheImage;
    private javax.swing.JTextField Synopsis;
    private javax.swing.JTextField Titre;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnRech;
    private javax.swing.JButton btnReset;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listTitreFilm;
    // End of variables declaration//GEN-END:variables
}
