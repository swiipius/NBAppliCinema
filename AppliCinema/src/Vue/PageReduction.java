/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import DAO.*;
import javax.swing.JOptionPane;
import Modele.Reduction;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import jdbc2020.*;

/**
 *
 * @author pierr
 */
public class PageReduction extends javax.swing.JFrame {

    public ReductionDAO reduc;
    public FilmDAO film;

    private String Heure = "", titreFilm, id_film = "";
    DefaultListModel<String> listModelTitre = new DefaultListModel<>();
    DefaultListModel<String> listModelID = new DefaultListModel<>();
    DefaultListModel<String> listModelReduc = new DefaultListModel<>();
    DefaultListModel<String> listModelReducAffich = new DefaultListModel<>();
    private boolean testHeure = false, testMinute = false;

    /**
     * Creates new form PageReduction
     *
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public PageReduction() throws SQLException, ClassNotFoundException {
        initComponents();
        
        //Initialisation des panneaux et des boutons
        PanelChoixFilm.setVisible(false);
        PanelReduc.setVisible(true);
        PanelChoixHeure.setVisible(false);
        btnValid.setEnabled(false);
        btnValidHeure.setEnabled(false);
        btnDel.setEnabled(false);

        //Creation de la combo box
        film = new FilmDAO("cinema", "root", "");
        listModelTitre = film.getFilmTitre();
        for (int i = 0; i < listModelTitre.size(); i++) {
            choixFilm.addItem(listModelTitre.get(i));
        }
        
        //creation de la JList
        reduc = new ReductionDAO("cinema", "root", "");
        listModelReduc = reduc.getReduc();
        for(int i = 0; i<listModelReduc.size(); i+=4){
            if(listModelReduc.get(i+2)==null){
                listModelReducAffich.add(i/3, listModelReduc.get(i)+ ", "+ null+ ", "+listModelReduc.get(i+1));
            }
            else{
                listModelReducAffich.add(i/3, listModelReduc.get(i)+ ", "+ film.getFilmByID(listModelReduc.get(i+3)).get(0)+ ", "+listModelReduc.get(i+1));
            }
        }    
        ListReduc.setModel(listModelReducAffich);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AjoutReduc = new javax.swing.JLayeredPane();
        PanelChoixFilm = new javax.swing.JPanel();
        choixFilm = new javax.swing.JComboBox<>();
        btnValidChoix = new javax.swing.JButton();
        PanelChoixHeure = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        SliderMinute = new javax.swing.JSlider();
        HeureAffiche = new javax.swing.JLabel();
        MinuteAffiche = new javax.swing.JLabel();
        SliderHeure = new javax.swing.JSlider();
        HeureTxt = new javax.swing.JLabel();
        MinuteTxt = new javax.swing.JLabel();
        btnValidHeure = new javax.swing.JButton();
        PanelReduc = new javax.swing.JPanel();
        sReduction = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnHeure = new javax.swing.JRadioButton();
        btnFilm = new javax.swing.JRadioButton();
        btnValid = new javax.swing.JButton();
        SupprReduc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListReduc = new javax.swing.JList<>();
        btnDel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        choixFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choixFilmActionPerformed(evt);
            }
        });

        btnValidChoix.setText("Valider");
        btnValidChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidChoixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChoixFilmLayout = new javax.swing.GroupLayout(PanelChoixFilm);
        PanelChoixFilm.setLayout(PanelChoixFilmLayout);
        PanelChoixFilmLayout.setHorizontalGroup(
            PanelChoixFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixFilmLayout.createSequentialGroup()
                .addGroup(PanelChoixFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoixFilmLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(choixFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoixFilmLayout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnValidChoix)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelChoixFilmLayout.setVerticalGroup(
            PanelChoixFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixFilmLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(choixFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnValidChoix)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        PanelChoixHeure.setPreferredSize(new java.awt.Dimension(280, 280));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText(":");

        SliderMinute.setMaximum(59);
        SliderMinute.setValue(30);
        SliderMinute.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderMinuteStateChanged(evt);
            }
        });

        HeureAffiche.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        MinuteAffiche.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        SliderHeure.setMaximum(24);
        SliderHeure.setValue(12);
        SliderHeure.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderHeureStateChanged(evt);
            }
        });

        HeureTxt.setText("Heures :");

        MinuteTxt.setText("Minutes");

        btnValidHeure.setText("Valider");
        btnValidHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidHeureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelChoixHeureLayout = new javax.swing.GroupLayout(PanelChoixHeure);
        PanelChoixHeure.setLayout(PanelChoixHeureLayout);
        PanelChoixHeureLayout.setHorizontalGroup(
            PanelChoixHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixHeureLayout.createSequentialGroup()
                .addGroup(PanelChoixHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelChoixHeureLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(HeureAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(MinuteAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoixHeureLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(HeureTxt)
                        .addGap(12, 12, 12)
                        .addComponent(SliderHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoixHeureLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(MinuteTxt)
                        .addGap(16, 16, 16)
                        .addComponent(SliderMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChoixHeureLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btnValidHeure)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelChoixHeureLayout.setVerticalGroup(
            PanelChoixHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChoixHeureLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelChoixHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeureAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(MinuteAffiche, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(PanelChoixHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HeureTxt)
                    .addComponent(SliderHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelChoixHeureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MinuteTxt)
                    .addComponent(SliderMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnValidHeure)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelReduc.setPreferredSize(new java.awt.Dimension(280, 280));

        sReduction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sReductionMouseExited(evt);
            }
        });

        jLabel1.setText("Pourcentage de Reduction :");

        buttonGroup1.add(btnHeure);
        btnHeure.setText("Heure");
        btnHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeureActionPerformed(evt);
            }
        });

        buttonGroup1.add(btnFilm);
        btnFilm.setText("Film");
        btnFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmActionPerformed(evt);
            }
        });

        btnValid.setText("Valider");
        btnValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelReducLayout = new javax.swing.GroupLayout(PanelReduc);
        PanelReduc.setLayout(PanelReducLayout);
        PanelReducLayout.setHorizontalGroup(
            PanelReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReducLayout.createSequentialGroup()
                .addGroup(PanelReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReducLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(PanelReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFilm)
                            .addComponent(btnHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValid)))
                    .addGroup(PanelReducLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sReduction, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        PanelReducLayout.setVerticalGroup(
            PanelReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReducLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PanelReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sReduction, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnHeure)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFilm)
                .addGap(26, 26, 26)
                .addComponent(btnValid)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        AjoutReduc.setLayer(PanelChoixFilm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AjoutReduc.setLayer(PanelChoixHeure, javax.swing.JLayeredPane.DEFAULT_LAYER);
        AjoutReduc.setLayer(PanelReduc, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout AjoutReducLayout = new javax.swing.GroupLayout(AjoutReduc);
        AjoutReduc.setLayout(AjoutReducLayout);
        AjoutReducLayout.setHorizontalGroup(
            AjoutReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AjoutReducLayout.createSequentialGroup()
                .addComponent(PanelReduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(AjoutReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AjoutReducLayout.createSequentialGroup()
                    .addComponent(PanelChoixFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 14, Short.MAX_VALUE)))
            .addGroup(AjoutReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AjoutReducLayout.createSequentialGroup()
                    .addComponent(PanelChoixHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AjoutReducLayout.setVerticalGroup(
            AjoutReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelReduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(AjoutReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AjoutReducLayout.createSequentialGroup()
                    .addComponent(PanelChoixFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(AjoutReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AjoutReducLayout.createSequentialGroup()
                    .addComponent(PanelChoixHeure, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Ajout Réduction", AjoutReduc);

        ListReduc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListReducMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListReduc);

        btnDel.setText("Supprimer");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SupprReducLayout = new javax.swing.GroupLayout(SupprReduc);
        SupprReduc.setLayout(SupprReducLayout);
        SupprReducLayout.setHorizontalGroup(
            SupprReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupprReducLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SupprReducLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnDel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SupprReducLayout.setVerticalGroup(
            SupprReducLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SupprReducLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Suppression Réduction", SupprReduc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Bouton de selection de l'heure
    private void btnHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeureActionPerformed
        PanelChoixHeure.setVisible(true);
        PanelReduc.setVisible(false);
        id_film = null;
    }//GEN-LAST:event_btnHeureActionPerformed

    //Bouton de selection du film
    private void btnFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmActionPerformed
        PanelChoixFilm.setVisible(true);
        PanelReduc.setVisible(false);
        Heure = null;
    }//GEN-LAST:event_btnFilmActionPerformed

    //Nouton de valisation de l'ajout
    private void btnValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidActionPerformed

        reduc = new ReductionDAO("cinema", "root", "");
        try {
            reduc.addReduction(id_film, Heure, sReduction.getText());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageReduction.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "La reduction a été ajoutée");
    }//GEN-LAST:event_btnValidActionPerformed

    //Bouton de valisation du choix du film
    private void btnValidChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidChoixActionPerformed
        PanelChoixFilm.setVisible(false);
        PanelReduc.setVisible(true);
        testAfficheBtnValid();
    }//GEN-LAST:event_btnValidChoixActionPerformed

    //Paramétrage du slider de selection de l'heure
    private void SliderHeureStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderHeureStateChanged
        HeureAffiche.setText(Integer.toString(SliderHeure.getValue()));
        testHeure = true;
        if(testHeure&&testMinute){
            btnValidHeure.setEnabled(true);
        }
    }//GEN-LAST:event_SliderHeureStateChanged

    //Parametrage du slider de selection des minutes
    private void SliderMinuteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderMinuteStateChanged
        MinuteAffiche.setText(Integer.toString(SliderMinute.getValue()));
        testMinute = true;
        if(testHeure&&testMinute){
            btnValidHeure.setEnabled(true);
        }
    }//GEN-LAST:event_SliderMinuteStateChanged

    //Bouton de validation du choix de l'heure
    private void btnValidHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidHeureActionPerformed
        PanelChoixHeure.setVisible(false);
        PanelReduc.setVisible(true);
        Heure = Integer.toString(SliderHeure.getValue()) + ":" + Integer.toString(SliderMinute.getValue());
        testAfficheBtnValid();
    }//GEN-LAST:event_btnValidHeureActionPerformed

    //Affichage ou non du bouton de validation de la reduc
    private void sReductionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sReductionMouseExited
        testAfficheBtnValid();
    }//GEN-LAST:event_sReductionMouseExited

    //Recuperation des infos du film a partir de celuis selectionne dans la combo box
    private void choixFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choixFilmActionPerformed
        film = new FilmDAO("cinema", "root", "");
        titreFilm = (String) choixFilm.getSelectedItem();
        try {
            listModelID = film.getFilmByTitre(titreFilm);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageReduction.class.getName()).log(Level.SEVERE, null, ex);
        }
        id_film = listModelID.get(9);
    }//GEN-LAST:event_choixFilmActionPerformed

    //Detection selection dans la JList pour afficher le bouton de suppression
    private void ListReducMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListReducMouseClicked
        if (ListReduc.getSelectedIndex() > -1) {
            btnDel.setEnabled(true);
        }
    }//GEN-LAST:event_ListReducMouseClicked

    //Action realisee quand le bouton de suppression est actionne
    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        //Recuperation de la promo selectionnee
        int index = ListReduc.getSelectedIndex();
        
        //Correspondance avec l'ID de la promo
        String id_promo = listModelReduc.get(index * 4 + 3);
        try {
            //Supprime l'element de la BDD
            reduc.delReducByID(id_promo);
            //Retire l'element supprime de la list
            listModelReducAffich.removeElementAt(index);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PageReduction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDelActionPerformed

    //Test pour l'affichage du bouton de validation de la reudc (uniquement si tout est rempli)
    public void testAfficheBtnValid() {
        if ((sReduction.getText().equals("")) && ((Heure.equals("")) || (id_film != null))) {
            btnValid.setEnabled(false);
        }
        else{
            btnValid.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane AjoutReduc;
    private javax.swing.JLabel HeureAffiche;
    private javax.swing.JLabel HeureTxt;
    private javax.swing.JList<String> ListReduc;
    private javax.swing.JLabel MinuteAffiche;
    private javax.swing.JLabel MinuteTxt;
    private javax.swing.JPanel PanelChoixFilm;
    private javax.swing.JPanel PanelChoixHeure;
    private javax.swing.JPanel PanelReduc;
    private javax.swing.JSlider SliderHeure;
    private javax.swing.JSlider SliderMinute;
    private javax.swing.JPanel SupprReduc;
    private javax.swing.JButton btnDel;
    private javax.swing.JRadioButton btnFilm;
    private javax.swing.JRadioButton btnHeure;
    private javax.swing.JButton btnValid;
    private javax.swing.JButton btnValidChoix;
    private javax.swing.JButton btnValidHeure;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> choixFilm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField sReduction;
    // End of variables declaration//GEN-END:variables
}
