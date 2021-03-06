/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.friscic.zavrsnirad.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import hr.friscic.zavrsnirad.controller.ObradaKlijent;
import hr.friscic.zavrsnirad.controller.ObradaMarka;
import hr.friscic.zavrsnirad.controller.ObradaVozilo;
import hr.friscic.zavrsnirad.model.Klijent;
import hr.friscic.zavrsnirad.model.Marka;
import hr.friscic.zavrsnirad.model.Vozilo;
import hr.friscic.zavrsnirad.model.Vozilo.VrstaVozila;
import hr.friscic.zavrsnirad.utility.Iznimka;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author K1R4
 */
public class Vozila extends javax.swing.JFrame {

    private ObradaVozilo obrada;
    private Vozilo entitet;

    /**
     * Creates new form Vozila
     */
    public Vozila() {
        initComponents();
        obrada = new ObradaVozilo();
        setTitle("SMV APP - Vozila");
        ucitajPodatke();
        cmbVrstaVozila.setModel(new DefaultComboBoxModel(Vozilo.VrstaVozila.values()));

        DefaultComboBoxModel<Klijent> mk = new DefaultComboBoxModel<>();
        new ObradaKlijent().getPodaci().forEach(k -> {
            mk.addElement(k);
        });
        cmbKlijenti.setModel(mk);

        DefaultComboBoxModel<Marka> mm = new DefaultComboBoxModel<>();
        new ObradaMarka().getPodaci().forEach(m -> {
            mm.addElement(m);
        });
        cmbMarke.setModel(mm);

        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesBeforeCommonEra("dd.MM.yyyy");
        dpiDatumProizvodnje.setSettings(dps);

        cmbVrstaVozila.setSelectedIndex(-1);
        cmbKlijenti.setSelectedIndex(-1);
        cmbMarke.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBoja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBrojSasije = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbVrstaVozila = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        dpiDatumProizvodnje = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        cmbKlijenti = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbMarke = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        lblPoruka = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Podaci o vozilu", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel1.setText("Boja");

        jLabel2.setText("Broj šasije");

        jLabel3.setText("Vrsta vozila");

        cmbVrstaVozila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVrstaVozilaActionPerformed(evt);
            }
        });

        jLabel4.setText("Datum proizvodnje");

        jLabel5.setText("Klijent");

        jLabel7.setText("Marka");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBoja)
                    .addComponent(txtBrojSasije)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmbVrstaVozila, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dpiDatumProizvodnje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbKlijenti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMarke, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrojSasije, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbVrstaVozila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dpiDatumProizvodnje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbKlijenti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMarke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDodaj.setIcon(new javax.swing.ImageIcon("E:\\jp22\\ZavrsniRad\\src\\main\\resources\\icons\\iconfinder_plus_1646001 (1).png")); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setIcon(new javax.swing.ImageIcon("E:\\jp22\\ZavrsniRad\\src\\main\\resources\\icons\\iconfinder_01_Pencil_2064476.png")); // NOI18N
        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setIcon(new javax.swing.ImageIcon("E:\\jp22\\ZavrsniRad\\src\\main\\resources\\icons\\iconfinder_error_1646012.png")); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lblPoruka.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPromjeni)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnObrisi))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDodaj, btnObrisi, btnPromjeni});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        lblPoruka.setText("");
        entitet = new Vozilo();

        postaviVrijednostiUEntitet();

        obrada.setEntitet(entitet);
        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (Iznimka ex) {
            lblPoruka.setText(ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }
        postaviVrijednostiUEntitet();

        try {
            obrada.update();
            ucitajPodatke();
            ocistiPolja();
        } catch (Iznimka e) {
            lblPoruka.setText(e.getPoruka());
        }

    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }

        obrada.setEntitet(entitet);

        try {
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();
        } catch (Iznimka e) {
            lblPoruka.setText(e.getPoruka());
        }

    }//GEN-LAST:event_btnObrisiActionPerformed

    private void cmbVrstaVozilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVrstaVozilaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVrstaVozilaActionPerformed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        entitet = lstPodaci.getSelectedValue();
        if (entitet == null) {
            return;
        }

        txtBoja.setText(entitet.getBoja());
        txtBrojSasije.setText(entitet.getBrojsasije());
        cmbVrstaVozila.setSelectedItem(entitet.getVrstavozila());
        DefaultComboBoxModel<Klijent> mk = (DefaultComboBoxModel<Klijent>) cmbKlijenti.getModel();
        for (int i = 0; i < mk.getSize(); i++) {
            if (mk.getElementAt(i).getId().equals(entitet.getKlijent().getId())) {
                cmbKlijenti.setSelectedIndex(i);
                break;
            }
        }

        DefaultComboBoxModel<Marka> mm = (DefaultComboBoxModel<Marka>) cmbMarke.getModel();
        for (int i = 0; i < mm.getSize(); i++) {
            if (mm.getElementAt(i).getId().equals(entitet.getMarka().getId())) {
                cmbMarke.setSelectedIndex(i);
                break;
            }
        }

        dpiDatumProizvodnje.setDate(entitet.getDatumproizvodnje().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate());


    }//GEN-LAST:event_lstPodaciValueChanged

    private void ucitajPodatke() {
        DefaultListModel<Vozilo> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(k -> m.addElement(k));

        lstPodaci.setModel(m);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Klijent> cmbKlijenti;
    private javax.swing.JComboBox<Marka> cmbMarke;
    private javax.swing.JComboBox<String> cmbVrstaVozila;
    private com.github.lgooddatepicker.components.DatePicker dpiDatumProizvodnje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Vozilo> lstPodaci;
    private javax.swing.JTextField txtBoja;
    private javax.swing.JTextField txtBrojSasije;
    // End of variables declaration//GEN-END:variables

    private void ocistiPolja() {
        txtBoja.setText("");
        txtBrojSasije.setText("");
        cmbVrstaVozila.setSelectedIndex(-1);
        cmbKlijenti.setSelectedIndex(-1);
        cmbMarke.setSelectedIndex(-1);
        dpiDatumProizvodnje.clear();
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setBoja(txtBoja.getText());
        entitet.setBrojsasije(txtBrojSasije.getText());
        entitet.setVrstavozila((Vozilo.VrstaVozila) cmbVrstaVozila.getSelectedItem());
        if (dpiDatumProizvodnje.getDate() != null) {
            entitet.setDatumproizvodnje(Date.from(dpiDatumProizvodnje.getDate().atStartOfDay()
                    .atZone(ZoneId.systemDefault())
                    .toInstant()));
        }
        entitet.setKlijent((Klijent) cmbKlijenti.getSelectedItem());
        entitet.setMarka((Marka) cmbMarke.getSelectedItem());
        obrada.setEntitet(entitet);
    }

}
