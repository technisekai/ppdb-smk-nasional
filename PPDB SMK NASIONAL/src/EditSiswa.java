/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Statement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import konfigurasi.Koneksi;
import konfigurasi.Session;
/**
 *
 * @author Im-Bot
 */
public class EditSiswa extends javax.swing.JFrame {
    private DefaultTableModel biodata;
    private int pilihBaris;
    private String cmdSql;
    
    //koneksi ke database
    Connection conn = Koneksi.getConnection();
    Statement stmt = (Statement) conn.createStatement();
    
    public void CariData(String dataDicari) throws SQLException {
        biodata = new DefaultTableModel();
        biodata.addColumn("ID");
        biodata.addColumn("Nama");
        biodata.addColumn("Alamat");
        biodata.addColumn("TTL");
        biodata.addColumn("Jenis Kelamin");
        biodata.addColumn("No. Telepon");      

        dataSiswa.setModel(biodata);
        try {
            cmdSql = "SELECT * FROM pendaftaran where id_pendaftaran = '" +dataDicari+ "';";
            ResultSet res = stmt.executeQuery(cmdSql);
            while (res.next()) {
                biodata.addRow(new Object[]{
                    res.getString("id_pendaftaran"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("ttl"),
                    res.getString("jenis_kelamin"),
                    res.getString("no_hp"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void TampilData() throws SQLException {
        biodata = new DefaultTableModel();
        biodata.addColumn("ID");
        biodata.addColumn("Nama");
        biodata.addColumn("Alamat");
        biodata.addColumn("TTL");
        biodata.addColumn("Jenis Kelamin");
        biodata.addColumn("No. Telepon");      

        dataSiswa.setModel(biodata);
        try {
            cmdSql = "SELECT * FROM pendaftaran";
            ResultSet res = stmt.executeQuery(cmdSql);
            while (res.next()) {
                biodata.addRow(new Object[]{
                    res.getString("id_pendaftaran"),
                    res.getString("nama"),
                    res.getString("alamat"),
                    res.getString("ttl"),
                    res.getString("jenis_kelamin"),
                    res.getString("no_hp"),
                });
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * Creates new form Main
     */
    public EditSiswa() throws SQLException {
        initComponents();
        this.TampilData();
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
        home = new javax.swing.JLabel();
        editKelulusan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        noTelp = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jenisKelamin = new javax.swing.JTextField();
        ttl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ubah = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataSiswa = new javax.swing.JTable();
        cariField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namaStaff1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(231, 240, 251));
        jPanel1.setForeground(new java.awt.Color(5, 55, 66));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        editKelulusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/StatusKelulusan.png"))); // NOI18N
        editKelulusan.setToolTipText("");
        editKelulusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editKelulusanMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoSMK.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Roud (1).png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Roud.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Roud (3).png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Roud (2).png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel12.setText("Nama");

        jLabel21.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel21.setText("No. Telpon");

        noTelp.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noTelpActionPerformed(evt);
            }
        });

        nama.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel16.setText("Jenis Kelamin");

        jenisKelamin.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N

        ttl.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel14.setText("Tempat, Tanggal Lahir");

        jLabel13.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel13.setText("Alamat");

        ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ubah.png"))); // NOI18N
        ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahMouseClicked(evt);
            }
        });

        dataSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataSiswa);

        cariField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariFieldActionPerformed(evt);
            }
        });
        cariField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariFieldKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        jLabel1.setText("Cari ID");

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Selamat Datang,.png"))); // NOI18N

        namaStaff1.setFont(new java.awt.Font("Roboto Mono Medium for Powerline", 1, 26)); // NOI18N
        namaStaff1.setForeground(new java.awt.Color(45, 66, 107));
        namaStaff1.setText(Session.getNama());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(cariField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaStaff1)
                        .addGap(229, 229, 229))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ttl)
                                    .addComponent(nama)
                                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(51, 51, 51)
                                .addComponent(noTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ubah)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2))
                    .addComponent(namaStaff1))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cariField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(noTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addComponent(ubah)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vektor_pendaftaran.png"))); // NOI18N

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(editKelulusan)
                            .addComponent(home)
                            .addComponent(logout)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel5)
                .addGap(59, 59, 59)
                .addComponent(home)
                .addGap(26, 26, 26)
                .addComponent(editKelulusan)
                .addGap(26, 26, 26)
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void cariFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariFieldKeyReleased
        String dataDicari = cariField.getText();
        try {
            if (!dataDicari.equals("")){
                CariData(dataDicari);
            }
            else {
                TampilData();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cariFieldKeyReleased

    private void cariFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariFieldActionPerformed

    private void dataSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataSiswaMouseClicked
        pilihBaris = dataSiswa.getSelectedRow();
        nama.setText(biodata.getValueAt(pilihBaris, 1).toString());
        alamat.setText(biodata.getValueAt(pilihBaris, 2).toString());
        ttl.setText(biodata.getValueAt(pilihBaris, 3).toString());
        jenisKelamin.setText(biodata.getValueAt(pilihBaris, 4).toString());
        noTelp.setText(biodata.getValueAt(pilihBaris, 5).toString());
    }//GEN-LAST:event_dataSiswaMouseClicked

    private void ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahMouseClicked
        try {
            cmdSql = "UPDATE pendaftaran set nama = '" +nama.getText()+ "', alamat = '" +alamat.getText()+ "', ttl = '" +ttl.getText()+ "', jenis_kelamin = '" +jenisKelamin.getText()+ "', no_hp = '" +noTelp.getText()+ "' where id_pendaftaran = '" +biodata.getValueAt(pilihBaris, 0).toString()+ "';";
            stmt.executeUpdate(cmdSql);
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ubahMouseClicked

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code:
    }//GEN-LAST:event_namaActionPerformed

    private void noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noTelpActionPerformed

    private void editKelulusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editKelulusanMouseClicked
        try {
            new EditKelulusan().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(EditSiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_editKelulusanMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        new Main().setVisible(true);
        dispose();
    }//GEN-LAST:event_homeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Masuk().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTextField cariField;
    private javax.swing.JTable dataSiswa;
    private javax.swing.JLabel editKelulusan;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenisKelamin;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField nama;
    private javax.swing.JLabel namaStaff1;
    private javax.swing.JTextField noTelp;
    private javax.swing.JTextField ttl;
    private javax.swing.JLabel ubah;
    // End of variables declaration//GEN-END:variables
}