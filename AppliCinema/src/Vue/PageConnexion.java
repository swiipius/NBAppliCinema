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
public class PageConnexion extends javax.swing.JFrame {

    public Connexion connect;
    private String requeteClient, requeteEmploye;
    private String email, NomEmploye;
    private boolean employe = true;
    public boolean connexionValid = false;
    public boolean EmpCo;
    PageAccueil pa;

    public PageConnexion() throws SQLException, ClassNotFoundException {
        super("Connexion");
        //Connection a la bdd
        connect = new Connexion("Cinema", "root", "");

        initComponents();

        //Initialisation Panel
        PanelClient.setVisible(true);
        PanelEmploye.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        PanelEmploye = new javax.swing.JPanel();
        lblIdentifiant = new javax.swing.JLabel();
        Identifiant = new javax.swing.JTextField();
        PanelClient = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        PanelCommun = new javax.swing.JPanel();
        MotDePasse = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnCo = new javax.swing.JButton();
        chechEmp = new javax.swing.JCheckBox();
        btnInscription = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(800, 350, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblIdentifiant.setText("Identifiant :");

        Identifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdentifiantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelEmployeLayout = new javax.swing.GroupLayout(PanelEmploye);
        PanelEmploye.setLayout(PanelEmployeLayout);
        PanelEmployeLayout.setHorizontalGroup(
            PanelEmployeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmployeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEmployeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdentifiant))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelEmployeLayout.setVerticalGroup(
            PanelEmployeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmployeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIdentifiant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblEmail.setText("Email :");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClientLayout = new javax.swing.GroupLayout(PanelClient);
        PanelClient.setLayout(PanelClientLayout);
        PanelClientLayout.setHorizontalGroup(
            PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        PanelClientLayout.setVerticalGroup(
            PanelClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmail)
                .addGap(8, 8, 8)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setLayer(PanelEmploye, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(PanelClient, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(PanelEmploye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(105, Short.MAX_VALUE)
                    .addComponent(PanelEmploye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jLabel2.setText("Mot de passe :");

        btnCo.setText("Connexion");
        btnCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoActionPerformed(evt);
            }
        });

        chechEmp.setText("Employé");
        chechEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chechEmpActionPerformed(evt);
            }
        });

        btnInscription.setText("Inscription");
        btnInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscriptionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCommunLayout = new javax.swing.GroupLayout(PanelCommun);
        PanelCommun.setLayout(PanelCommunLayout);
        PanelCommunLayout.setHorizontalGroup(
            PanelCommunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCommunLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCommunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCommunLayout.createSequentialGroup()
                        .addComponent(MotDePasse)
                        .addContainerGap())
                    .addGroup(PanelCommunLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelCommunLayout.createSequentialGroup()
                        .addComponent(btnCo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(chechEmp))))
            .addGroup(PanelCommunLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btnInscription)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelCommunLayout.setVerticalGroup(
            PanelCommunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCommunLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MotDePasse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(PanelCommunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCo)
                    .addComponent(chechEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnInscription))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(PanelCommun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCommun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void btnCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoActionPerformed
        if (!employe) {
            if ((Identifiant.getText().equals("")) || (MotDePasse.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            } else {
                requeteEmploye = "SELECT loginEmploye FROM employe WHERE NomEmploye LIKE '" + Identifiant.getText() + "'";
                try {
                    if ((connect.requestDemande(requeteEmploye).get(0)).equals(MotDePasse.getText())) {
                        JOptionPane.showMessageDialog(null, "Connexion");
                        connexionValid = true;
                        EmpCo = true;
                        this.dispose();
                        pa = new PageAccueil(true, true);
                        pa.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mot de passe erroné");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ArrayIndexOutOfBoundsException e) {
                    JOptionPane.showMessageDialog(null, "Identifiant inconnu");
                    Identifiant.setText(null);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            if ((Email.getText().equals("")) || (MotDePasse.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs");
            } else {
                requeteClient = "SELECT loginClient FROM client WHERE email LIKE '" + Email.getText() + "'";
                try {
                    if ((connect.requestDemande(requeteClient).get(0)).equals(MotDePasse.getText())) {
                        JOptionPane.showMessageDialog(null, "Connexion");
                        connexionValid = true;
                        EmpCo = false;
                        this.dispose();
                        pa = new PageAccueil(true, false);
                        pa.setVisible(true);
                        pa.client = Integer.parseInt((String) (connect.requestDemande("SELECT id_client FROM client WHERE email = '"+Email.getText()+"'")).get(0));
                    } else {
                        JOptionPane.showMessageDialog(null, "Mot de passe erroné");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ArrayIndexOutOfBoundsException e) {
                    JOptionPane.showMessageDialog(null, "Identifiant inconnu");
                    Email.setText(null);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnCoActionPerformed

    private void chechEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chechEmpActionPerformed
        if (employe) {
            PanelEmploye.setVisible(true);
            PanelClient.setVisible(false);
        } else {
            PanelEmploye.setVisible(false);
            PanelClient.setVisible(true);
        }
        employe = !employe;
    }//GEN-LAST:event_chechEmpActionPerformed

    private void btnInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscriptionActionPerformed
        JOptionPane.showMessageDialog(null, "Vous allez être redirige vers la page d'inscription");
        this.dispose();
        try {
            PageInscription p = new PageInscription();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInscriptionActionPerformed

    private void IdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdentifiantActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            if (!connexionValid) {
                pa = new PageAccueil(true, EmpCo);
                pa.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PageConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PageConnexion().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(PageConnexion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Identifiant;
    private javax.swing.JPasswordField MotDePasse;
    private javax.swing.JPanel PanelClient;
    private javax.swing.JPanel PanelCommun;
    private javax.swing.JPanel PanelEmploye;
    private javax.swing.JButton btnCo;
    private javax.swing.JButton btnInscription;
    private javax.swing.JCheckBox chechEmp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIdentifiant;
    // End of variables declaration//GEN-END:variables
}
