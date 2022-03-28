/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
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
public class PageInscription extends javax.swing.JFrame {

    /**
     * Creates new form PageInscription
     */
    public Connexion connect;
    private String requete;
    boolean inscriptionOK;
    private int countAge = 0;

    DefaultListModel<String> testPresence = new DefaultListModel<>();

    public PageInscription() throws SQLException, ClassNotFoundException {
        super("Page d'Inscription");
        initComponents();
        //Connection a la bdd
        connect = new Connexion("Cinema", "root", "");
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
        jLabel1 = new javax.swing.JLabel();
        PrenomClient = new javax.swing.JTextField();
        NomClient = new javax.swing.JTextField();
        EmailClient = new javax.swing.JTextField();
        LoginClient = new javax.swing.JTextField();
        AgeClient = new javax.swing.JTextField();
        BoutonInscription = new javax.swing.JButton();
        btnCo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(750, 300, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Formulaire d'inscription Client:");

        PrenomClient.setText("Prenom");
        PrenomClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrenomClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrenomClientMouseExited(evt);
            }
        });

        NomClient.setText("Nom");
        NomClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NomClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NomClientMouseExited(evt);
            }
        });

        EmailClient.setText("Email");
        EmailClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailClientMouseExited(evt);
            }
        });

        LoginClient.setText("Mot de passe");
        LoginClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginClientMouseExited(evt);
            }
        });
        LoginClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginClientActionPerformed(evt);
            }
        });

        AgeClient.setText("Age");
        AgeClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgeClientMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgeClientMouseExited(evt);
            }
        });
        AgeClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeClientKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AgeClientKeyTyped(evt);
            }
        });

        BoutonInscription.setText("Inscription");
        BoutonInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoutonInscriptionActionPerformed(evt);
            }
        });

        btnCo.setText("Connexion");
        btnCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(NomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(EmailClient))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(AgeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(LoginClient)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BoutonInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrenomClient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailClient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeClient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginClient, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoutonInscription, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginClientActionPerformed

    private void NomClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomClientMouseClicked
        NomClient.setText(null);
    }//GEN-LAST:event_NomClientMouseClicked

    private void PrenomClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomClientMouseClicked
        PrenomClient.setText(null);
    }//GEN-LAST:event_PrenomClientMouseClicked

    private void AgeClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeClientMouseClicked
        AgeClient.setText(null);
    }//GEN-LAST:event_AgeClientMouseClicked

    private void EmailClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailClientMouseClicked
        EmailClient.setText(null);
    }//GEN-LAST:event_EmailClientMouseClicked

    private void LoginClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginClientMouseClicked
        LoginClient.setText(null);
    }//GEN-LAST:event_LoginClientMouseClicked

    private void NomClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NomClientMouseExited
        if (NomClient.getText().equals("")) {
            NomClient.setText("Nom");
        }
    }//GEN-LAST:event_NomClientMouseExited

    private void PrenomClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrenomClientMouseExited
        if (PrenomClient.getText().equals("")) {
            PrenomClient.setText("Prenom");
        }
    }//GEN-LAST:event_PrenomClientMouseExited

    private void AgeClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgeClientMouseExited
        if (AgeClient.getText().equals("")) {
            AgeClient.setText("Age");
        }
    }//GEN-LAST:event_AgeClientMouseExited

    private void EmailClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailClientMouseExited
        if (EmailClient.getText().equals("")) {
            EmailClient.setText("Email");
        }
    }//GEN-LAST:event_EmailClientMouseExited

    private void LoginClientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginClientMouseExited
        if (LoginClient.getText().equals("")) {
            LoginClient.setText("Mot de passe");
        }
    }//GEN-LAST:event_LoginClientMouseExited

    private void BoutonInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoutonInscriptionActionPerformed
        requete = "INSERT INTO client(Nom,Prenom,Age,email,loginClient) VALUES" + "('" + NomClient.getText() + "','" + PrenomClient.getText() + "','" + AgeClient.getText() + "','" + EmailClient.getText() + "','" + LoginClient.getText() + "'" + ")";
        inscriptionOK = !((NomClient.getText().equals("Nom")) || (PrenomClient.getText().equals("Prenom")) || (AgeClient.getText().equals("Age")) || (EmailClient.getText().equals("Email")) || (LoginClient.getText().equals("Mot de passe")));

        //test pour savoir si le client est deja inscrit
        try {
            testPresence = connect.requestDemande("SELECT COUNT(*) FROM client WHERE email LIKE '" + EmailClient.getText() + "'");
            if (!(testPresence.get(0).equals("0"))) {
                inscriptionOK = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*catch(MySQLSyntaxErrorException e){
            JOptionPane.showMessageDialog(null, "Votre inscription a ete enregistree");
        }*/
        

        if (inscriptionOK) {
            try {
                connect.executeUpdate(requete);
            } catch (SQLException ex) {
                Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
            }
            //on enleve les valeurs precedentes des cases du formulaire
            NomClient.setText("Nom");
            PrenomClient.setText("Prenom");
            AgeClient.setText("Age");
            EmailClient.setText("Email");
            LoginClient.setText("Mot de passe");

            //On affiche le fait que l'inscription ait été faite
            JOptionPane.showMessageDialog(null, "Votre inscription a ete enregistree");

            //On ferme la page
            this.dispose();
        }
    }//GEN-LAST:event_BoutonInscriptionActionPerformed

    private void btnCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoActionPerformed
        JOptionPane.showMessageDialog(null, "Vous allez être redirige vers la page de connexion");
        this.dispose();
        try {
            PageConnexion p = new PageConnexion();
            p.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PageInscription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCoActionPerformed

    private void AgeClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeClientKeyPressed
        char c = evt.getKeyChar();
        if ((evt.getKeyCode() == 8) && (countAge < 3)) {
            countAge--;
        } else if ((evt.getKeyCode() == 8) && (countAge == 3)) {
            countAge -= 2;
        } else if ((Character.isDigit(c)) && (17 > countAge)) {
            countAge++;
        }
    }//GEN-LAST:event_AgeClientKeyPressed

    private void AgeClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeClientKeyTyped
        char c = evt.getKeyChar();
        if (countAge <= 2) {
            if (!Character.isDigit(c)) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_AgeClientKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeClient;
    private javax.swing.JButton BoutonInscription;
    private javax.swing.JTextField EmailClient;
    private javax.swing.JTextField LoginClient;
    private javax.swing.JTextField NomClient;
    private javax.swing.JTextField PrenomClient;
    private javax.swing.JButton btnCo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
