import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import konfigurasi.Koneksi;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Im-Bot
 */
public class Pendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Pendaftaran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        kembali = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        kembali2 = new javax.swing.JButton();
        kembali3 = new javax.swing.JButton();
        kembali4 = new javax.swing.JButton();
        kembali1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        ttl = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jenisKelamin = new javax.swing.JComboBox<>();
        nilaiUN = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jurusanPil1 = new javax.swing.JComboBox<>();
        jurusanPil2 = new javax.swing.JComboBox<>();
        daftar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        noTelp = new javax.swing.JTextField();

        jLabel3.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        jLabel3.setText("SMK NASIONAL");

        kembali.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        kembali.setText("Kembali");
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(5, 55, 66));

        jPanel2.setBackground(new java.awt.Color(0, 90, 141));

        jLabel4.setFont(new java.awt.Font("PT Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SMK NASIONAL");

        kembali2.setBackground(new java.awt.Color(0, 90, 141));
        kembali2.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        kembali2.setForeground(new java.awt.Color(255, 255, 255));
        kembali2.setText("Home");
        kembali2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali2ActionPerformed(evt);
            }
        });

        kembali3.setBackground(new java.awt.Color(0, 90, 141));
        kembali3.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        kembali3.setForeground(new java.awt.Color(255, 255, 255));
        kembali3.setText("Pendaftaran");
        kembali3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali3ActionPerformed(evt);
            }
        });

        kembali4.setBackground(new java.awt.Color(0, 90, 141));
        kembali4.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        kembali4.setForeground(new java.awt.Color(255, 255, 255));
        kembali4.setText("Informasi Sekolah");
        kembali4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(kembali4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembali2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembali3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel4)
                .addGap(169, 169, 169)
                .addComponent(kembali2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembali3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kembali4)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        kembali1.setBackground(new java.awt.Color(0, 90, 141));
        kembali1.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        kembali1.setForeground(new java.awt.Color(255, 255, 255));
        kembali1.setText("Kembali");
        kembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("PT Sans", 1, 36)); // NOI18N
        jLabel2.setText("Pendaftaran");

        nama.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel12.setText("Nama");

        jLabel13.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel13.setText("Alamat");

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        ttl.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel14.setText("Tempat, Tanggal Lahir");

        jLabel15.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel15.setText("Jenis Kelamin");

        jenisKelamin.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P"}));
        jenisKelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisKelaminActionPerformed(evt);
            }
        });

        nilaiUN.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel17.setText("Jumlah nilai UN");

        jLabel16.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel16.setText("Jurusan");

        jurusanPil1.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jurusanPil1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TKJ", "TKR", "AK"}));

        jurusanPil2.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jurusanPil2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TKJ", "TKR", "AK"}));

        daftar.setBackground(new java.awt.Color(82, 115, 77));
        daftar.setFont(new java.awt.Font("PT Sans", 1, 14)); // NOI18N
        daftar.setForeground(new java.awt.Color(255, 255, 255));
        daftar.setText("Daftar");
        daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N
        jLabel18.setText("No. Telepon");

        noTelp.setFont(new java.awt.Font("PT Sans", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(61, 61, 61)
                                        .addComponent(ttl))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel13))
                                                .addGap(157, 157, 157)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(nama)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel18))
                                        .addGap(104, 104, 104)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(noTelp)
                                            .addComponent(jenisKelamin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nilaiUN)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(daftar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jurusanPil1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jurusanPil2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(30, 30, 30)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ttl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(noTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nilaiUN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jurusanPil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jurusanPil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(daftar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        new Main().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void kembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali1ActionPerformed
        dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_kembali1ActionPerformed

    private void kembali2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembali2ActionPerformed

    private void kembali3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembali3ActionPerformed

    private void kembali4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kembali4ActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code:
    }//GEN-LAST:event_namaActionPerformed

    private void jenisKelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisKelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisKelaminActionPerformed

    private void daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarActionPerformed
        try{
            String id = null;
            Connection conn = Koneksi.getConnection();
            Statement stmt = (Statement) conn.createStatement();
            stmt.executeUpdate("INSERT INTO pendaftaran (nama, alamat, ttl, jenis_kelamin, jml_un, jurusan_pil1, jurusan_pil2, status, role) values ('"+nama.getText()+"','"+alamat.getText()+"','"+ttl.getText()+"','"+jenisKelamin.getSelectedItem()+"','"+nilaiUN.getText()+"','"+jurusanPil1.getSelectedItem()+"','"+jurusanPil2.getSelectedItem()+"','"+"Evaluasi"+"','"+12345+"');");
            ResultSet rsLogin = stmt.executeQuery("SELECT * FROM pendaftaran where nama='"+nama.getText()+"';");
            while (rsLogin.next()) {
                id = rsLogin.getString("id_pendaftaran");
            }
            JOptionPane.showMessageDialog(null,"Sukses Memasukan data");
            JOptionPane.showMessageDialog(null,"Gunakan nama sebagai username dan " +id+ " sebagai password untuk login");
            new Masuk().setVisible(true);
            dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Gagal Memasukan data" +e);
        }
    }//GEN-LAST:event_daftarActionPerformed

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
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton daftar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisKelamin;
    private javax.swing.JComboBox<String> jurusanPil1;
    private javax.swing.JComboBox<String> jurusanPil2;
    private javax.swing.JButton kembali;
    private javax.swing.JButton kembali1;
    private javax.swing.JButton kembali2;
    private javax.swing.JButton kembali3;
    private javax.swing.JButton kembali4;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nilaiUN;
    private javax.swing.JTextField noTelp;
    private javax.swing.JTextField ttl;
    // End of variables declaration//GEN-END:variables
}