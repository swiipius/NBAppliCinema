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
public class PageSelecPrix extends javax.swing.JFrame {

    Integer somme = 0;
    int nbPlaceMembre, nbPlaceSenior, nbPlaceEnfant, nbPlacePasCo;
    public boolean isCo, choixOk = false;
    String sommeStr;
    DefaultListModel<String> listModel = new DefaultListModel<>();
    DefaultListModel<String> listModelFilm = new DefaultListModel<>();
    DefaultListModel<String> listModelHeure = new DefaultListModel<>();
    String Synopsis, requete;
    int taille;
    Connexion connect;
    int film, client, seance;

    /**
     * Creates new form PageSelecPrix
     */
    public PageSelecPrix(boolean ConnexionValid, int id_film, int id_client, int id_seance) throws SQLException, ClassNotFoundException {
        initComponents();

        isCo = ConnexionValid;

        if (ConnexionValid) {
            PanelCo.setVisible(true);
            PanelPasCo.setVisible(false);
        } else {
            PanelCo.setVisible(false);
            PanelPasCo.setVisible(true);
        }

        btnAchat.setEnabled(false);

        film = id_film;
        client = id_client;
        seance = id_seance;

        connect = new Connexion("Cinema", "root", "");
        //Affichage du resume
        String textAffich;
        requete = "SELECT titre,prenomRealisateur,nomRealisateur,duree,genre,note,synopsis FROM film WHERE ID_Film = " + id_film + ";";
        listModel = connect.requestDemande(requete);

        //Reduction de la longueur du synopsis avec des '\n' pour que le panneau ne soit pas trop grand
        taille = listModel.get(5).length();
        Synopsis = listModel.get(5);
        StringBuilder str = new StringBuilder(Synopsis);
        for (int i = 1; 150 * i < taille; i++) {
            str.insert(150 * i, '\n');
        }

        //Affichage des infos
        textAffich = "Titre : " + listModel.get(6) + "\nRealisateur : " + listModel.get(0) + " " + listModel.get(1) + "\nDuree : " + (String) listModel.get(2) + "\ngenre : " + listModel.get(3) + "\nNote : " + (String) listModel.get(4) + "\nSynopsis : \n" + str;
        ResumeFilm.setText(textAffich);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Total = new javax.swing.JTextPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelCo = new javax.swing.JPanel();
        Membre = new javax.swing.JSpinner();
        Senior = new javax.swing.JSpinner();
        Enfant = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PanelPasCo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pasCo = new javax.swing.JSpinner();
        btnAchat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResumeFilm = new javax.swing.JTextPane();
        Selecplace = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ImageFond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(954, 604));
        setPreferredSize(new java.awt.Dimension(860, 604));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(null);

        jScrollPane2.setViewportView(Total);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(323, 528, 86, 30);

        PanelCo.setBackground(new java.awt.Color(168, 26, 3));

        Membre.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Membre.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                MembreStateChanged(evt);
            }
        });

        Senior.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Senior.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SeniorStateChanged(evt);
            }
        });

        Enfant.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Enfant.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EnfantStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tarif Membre : (10€)");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tarif Senior : (8€)");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tarif enfant : (6€)");

        javax.swing.GroupLayout PanelCoLayout = new javax.swing.GroupLayout(PanelCo);
        PanelCo.setLayout(PanelCoLayout);
        PanelCoLayout.setHorizontalGroup(
            PanelCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(PanelCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Enfant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Senior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Membre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        PanelCoLayout.setVerticalGroup(
            PanelCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(PanelCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Membre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(PanelCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(PanelCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enfant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        PanelPasCo.setBackground(new java.awt.Color(168, 26, 3));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Plein tarif : (12€)");

        pasCo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        pasCo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pasCoStateChanged(evt);
            }
        });

        javax.swing.GroupLayout PanelPasCoLayout = new javax.swing.GroupLayout(PanelPasCo);
        PanelPasCo.setLayout(PanelPasCoLayout);
        PanelPasCoLayout.setHorizontalGroup(
            PanelPasCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPasCoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(pasCo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        PanelPasCoLayout.setVerticalGroup(
            PanelPasCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPasCoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(PanelPasCoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pasCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(PanelCo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelPasCo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(PanelPasCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(PanelCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPasCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelCo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.add(jLayeredPane1);
        jLayeredPane1.setBounds(234, 260, 346, 254);

        btnAchat.setBackground(new java.awt.Color(168, 26, 3));
        btnAchat.setForeground(new java.awt.Color(0, 0, 0));
        btnAchat.setText("Finaliser la commande");
        btnAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAchatActionPerformed(evt);
            }
        });
        jPanel1.add(btnAchat);
        btnAchat.setBounds(420, 530, 140, 25);

        jScrollPane1.setViewportView(ResumeFilm);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 860, 161);

        Selecplace.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Selecplace.setForeground(new java.awt.Color(0, 0, 0));
        Selecplace.setText("Selection des places");
        jPanel1.add(Selecplace);
        Selecplace.setBounds(260, 20, 440, 47);

        jLabel1.setText("Total Commande :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(234, 533, 85, 25);

        ImageFond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/PageSelecPrix.png"))); // NOI18N
        jPanel1.add(ImageFond);
        ImageFond.setBounds(-20, 0, 930, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MembreStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_MembreStateChanged
        somme = (Integer) Enfant.getValue() * 6 + (Integer) Senior.getValue() * 8 + (Integer) Membre.getValue() * 10;
        sommeStr = somme.toString();
        Total.setText(sommeStr);
        affichageBtn(somme);
    }//GEN-LAST:event_MembreStateChanged

    private void pasCoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pasCoStateChanged
        String spinner;

        somme = (Integer) pasCo.getValue() * 12;
        spinner = somme.toString();
        Total.setText(spinner);
        affichageBtn(somme);
    }//GEN-LAST:event_pasCoStateChanged

    private void SeniorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SeniorStateChanged
        somme = (Integer) Enfant.getValue() * 6 + (Integer) Senior.getValue() * 8 + (Integer) Membre.getValue() * 10;
        sommeStr = somme.toString();
        Total.setText(sommeStr);
        affichageBtn(somme);
    }//GEN-LAST:event_SeniorStateChanged

    private void EnfantStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EnfantStateChanged
        somme = (Integer) Enfant.getValue() * 6 + (Integer) Senior.getValue() * 8 + (Integer) Membre.getValue() * 10;
        sommeStr = somme.toString();
        Total.setText(sommeStr);
        affichageBtn(somme);
    }//GEN-LAST:event_EnfantStateChanged

    private void btnAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAchatActionPerformed
        try {
            checkReduction(film, seance);
        } catch (SQLException ex) {
            Logger.getLogger(PageSelecPrix.class.getName()).log(Level.SEVERE, null, ex);
        }
        PagePayement pp = new PagePayement(isCo, (Integer) Membre.getValue(), (Integer) Senior.getValue(), (Integer) Enfant.getValue(), (Integer) pasCo.getValue(), film, seance, client);
        nbPlaceVendu();
        this.dispose();
        pp.setVisible(true);
        choixOk = true;
    }//GEN-LAST:event_btnAchatActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (!choixOk) {
            try {
                PageSeance ps = new PageSeance(film, client, isCo);
                ps.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(PageSelecPrix.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PageSelecPrix.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowClosed

    public void total() {
        int total = (int) Membre.getValue() * 10 + (int) Senior.getValue() * 8 + (int) Enfant.getValue() * 6;
    }

    public void nbPlaceVendu() {
        nbPlaceMembre = (int) Membre.getValue();
        nbPlaceSenior = (int) Senior.getValue();
        nbPlaceEnfant = (int) Enfant.getValue();
        nbPlacePasCo = (int) pasCo.getValue();

    }

    public void affichageBtn(int total) {
        if (total > 0) {
            btnAchat.setEnabled(true);
        } else {
            btnAchat.setEnabled(false);
        }
    }
    
    public void checkReduction(int id_film, int id_seance) throws SQLException{
        listModelFilm = connect.requestDemande("SELECT pourcentage FROM reduction WHERE id_film = " + id_film + " ORDER BY pourcentage DESC;");
        listModelHeure = connect.requestDemande("SELECT pourcentage FROM reduction JOIN seance  WHERE seance.heureDebut < reduction.conditionHeure AND seance.id_seance = "+seance+" ORDER BY pourcentage DESC;");
        if(listModelFilm.size()!=0){
            int valeurReduc = Integer.parseInt(listModelFilm.get(0));
            somme =somme * (100-valeurReduc)/100;
            JOptionPane.showMessageDialog(null, "La reduction a été appliquée, le nouveau prix est de "+somme);
        }
        else if(listModelHeure.size()!=0){
            int valeurReduc = Integer.parseInt(listModelHeure.get(0));
            somme =somme * (100-valeurReduc)/100;
            JOptionPane.showMessageDialog(null, "La reduction a été appliquée, le nouveau prix est de "+somme);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PageReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageReduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PageSelecPrix(false, 2, 0, 0).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PageSelecPrix.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PageSelecPrix.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Enfant;
    private javax.swing.JLabel ImageFond;
    private javax.swing.JSpinner Membre;
    private javax.swing.JPanel PanelCo;
    private javax.swing.JPanel PanelPasCo;
    private javax.swing.JTextPane ResumeFilm;
    private javax.swing.JLabel Selecplace;
    private javax.swing.JSpinner Senior;
    private javax.swing.JTextPane Total;
    private javax.swing.JButton btnAchat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner pasCo;
    // End of variables declaration//GEN-END:variables
}
