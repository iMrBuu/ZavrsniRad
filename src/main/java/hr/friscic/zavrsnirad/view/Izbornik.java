/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.view;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

/**
 *
 * @author K1R4
 */
public class Izbornik extends javax.swing.JFrame {

    Timer timer;

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        jmNaslovGrana.setText((Aplikacija.NASLOV_APP));
        setTitle("SMV APP");

        jmiOperateri.setVisible(Aplikacija.isAdmin());
        jmiMarke.setVisible(Aplikacija.isAdmin());

        ActionListener actionListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                lblDateTime.setText(dtf.format(now));
            }
        };

        timer = new Timer(1000, actionListener);
        timer.setInitialDelay(0);
        timer.start();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblDateTime = new javax.swing.JLabel();
        lblFacebook = new javax.swing.JLabel();
        lblTwitter = new javax.swing.JLabel();
        lblInstagram = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmNaslovGrana = new javax.swing.JMenu();
        jmiKlijenti = new javax.swing.JMenuItem();
        jmiVozila = new javax.swing.JMenuItem();
        jmiServisi = new javax.swing.JMenuItem();
        jmiRadnici = new javax.swing.JMenuItem();
        jmiMarke = new javax.swing.JMenuItem();
        jmiOperateri = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jmiIzlaz = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(640, 426));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\K1R4\\Downloads\\peter-broomfield-m3m-lnR90uM-unsplash.jpg")); // NOI18N

        lblDateTime.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N

        lblFacebook.setIcon(new javax.swing.ImageIcon("E:\\jp22\\ZavrsniRad\\src\\main\\resources\\icons\\iconfinder_social_media_social_media_logo_facebook_2993778.png")); // NOI18N
        lblFacebook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblFacebookMouseReleased(evt);
            }
        });

        lblTwitter.setIcon(new javax.swing.ImageIcon("E:\\jp22\\ZavrsniRad\\src\\main\\resources\\icons\\iconfinder_social_media_social_media_logo_twitter_2993737.png")); // NOI18N
        lblTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblTwitterMouseReleased(evt);
            }
        });

        lblInstagram.setIcon(new javax.swing.ImageIcon("E:\\jp22\\ZavrsniRad\\src\\main\\resources\\icons\\iconfinder_social_media_social_media_logo_instagram_2993766.png")); // NOI18N
        lblInstagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblInstagramMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblInstagram)
                .addGap(18, 18, 18)
                .addComponent(lblTwitter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFacebook)
                .addGap(18, 18, 18)
                .addComponent(lblDateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDateTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFacebook, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(lblTwitter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInstagram, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jmNaslovGrana.setText("GLAVNI IZBORNIK");
        jmNaslovGrana.setFont(new java.awt.Font("Russo One", 0, 14)); // NOI18N

        jmiKlijenti.setText("Klijenti");
        jmiKlijenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiKlijentiActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiKlijenti);

        jmiVozila.setText("Vozila");
        jmiVozila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVozilaActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiVozila);

        jmiServisi.setText("Servisi");
        jmiServisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiServisiActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiServisi);

        jmiRadnici.setText("Radnici");
        jmiRadnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRadniciActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiRadnici);

        jmiMarke.setText("Marke");
        jmiMarke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMarkeActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiMarke);

        jmiOperateri.setText("Operateri");
        jmiOperateri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOperateriActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiOperateri);
        jmNaslovGrana.add(jSeparator4);

        jmiIzlaz.setText("Izlaz");
        jmiIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzlazActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiIzlaz);

        jMenuBar1.add(jmNaslovGrana);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzlazActionPerformed
        dispose();
    }//GEN-LAST:event_jmiIzlazActionPerformed

    private void jmiOperateriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOperateriActionPerformed
        new Operateri().setVisible(true);
    }//GEN-LAST:event_jmiOperateriActionPerformed

    private void jmiKlijentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiKlijentiActionPerformed
        new Klijenti().setVisible(true);
    }//GEN-LAST:event_jmiKlijentiActionPerformed

    private void jmiRadniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRadniciActionPerformed
        new Radnici().setVisible(true);
    }//GEN-LAST:event_jmiRadniciActionPerformed

    private void jmiMarkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMarkeActionPerformed
        new Marke().setVisible(true);
    }//GEN-LAST:event_jmiMarkeActionPerformed

    private void jmiVozilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVozilaActionPerformed
        new Vozila().setVisible(true);
    }//GEN-LAST:event_jmiVozilaActionPerformed

    private void jmiServisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiServisiActionPerformed
        new Servisi().setVisible(true);
    }//GEN-LAST:event_jmiServisiActionPerformed

    private void lblFacebookMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFacebookMouseReleased
        try {
            Desktop.getDesktop().browse(new URI("https://www.facebook.com/"));
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Došlo je do poteškoće...");
        }
    }//GEN-LAST:event_lblFacebookMouseReleased

    private void lblInstagramMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInstagramMouseReleased
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/?hl=en"));
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Došlo je do poteškoće...");
        }
    }//GEN-LAST:event_lblInstagramMouseReleased

    private void lblTwitterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTwitterMouseReleased
        try {
            Desktop.getDesktop().browse(new URI("https://twitter.com/"));
        } catch (URISyntaxException | IOException ex) {
            System.out.println("Došlo je do poteškoće...");
        }
    }//GEN-LAST:event_lblTwitterMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu jmNaslovGrana;
    private javax.swing.JMenuItem jmiIzlaz;
    private javax.swing.JMenuItem jmiKlijenti;
    private javax.swing.JMenuItem jmiMarke;
    private javax.swing.JMenuItem jmiOperateri;
    private javax.swing.JMenuItem jmiRadnici;
    private javax.swing.JMenuItem jmiServisi;
    private javax.swing.JMenuItem jmiVozila;
    private javax.swing.JLabel lblDateTime;
    private javax.swing.JLabel lblFacebook;
    private javax.swing.JLabel lblInstagram;
    private javax.swing.JLabel lblTwitter;
    // End of variables declaration//GEN-END:variables
}
