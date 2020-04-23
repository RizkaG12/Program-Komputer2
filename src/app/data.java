package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class data extends javax.swing.JFrame {

 
    DefaultTableModel model;

    public data() {
        initComponents();
        String[] judul = {"Id", "No", "Nama Perumahan", "Alamat", "No. Telp", "Email", "Pengembang", "Tipe", "Brosur"};
        model = new DefaultTableModel(judul, 0);
        tblData.setModel(model);
        loadData("");
        txtId.setEnabled(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        txtPerumahan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBrosur = new javax.swing.JTextField();
        cmbTipe = new javax.swing.JComboBox<String>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        ID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCari = new javax.swing.JTextField();
        txtPengembang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nama Perumahan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 90, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        txtPerumahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerumahanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 232;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 36, 0, 72);
        getContentPane().add(txtPerumahan, gridBagConstraints);

        jLabel2.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 90, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        txtAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlamatActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.ipadx = 232;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 36, 0, 72);
        getContentPane().add(txtAlamat, gridBagConstraints);

        txtTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelpActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.ipadx = 232;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 36, 0, 72);
        getContentPane().add(txtTelp, gridBagConstraints);

        jLabel3.setText("No. Telp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 90, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.ipadx = 232;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 36, 0, 72);
        getContentPane().add(txtEmail, gridBagConstraints);

        jLabel4.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 90, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Tipe Perumahan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 90, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setText("File Brosur");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 90, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        txtBrosur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrosurActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 232;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 36, 0, 72);
        getContentPane().add(txtBrosur, gridBagConstraints);

        cmbTipe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipe A", "Tipe B" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 36, 0, 72);
        getContentPane().add(cmbTipe, gridBagConstraints);

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 90, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
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
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 296;
        gridBagConstraints.ipady = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 90, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 9, 0, 0);
        getContentPane().add(btnUbah, gridBagConstraints);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 12, 0, 0);
        getContentPane().add(btnHapus, gridBagConstraints);

        ID.setText("Id");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 90, 0, 0);
        getContentPane().add(ID, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 36, 0, 0);
        getContentPane().add(txtId, gridBagConstraints);

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 27;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 12, 0, 0);
        getContentPane().add(txtCari, gridBagConstraints);

        txtPengembang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengembangActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 23;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 232;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 36, 0, 72);
        getContentPane().add(txtPengembang, gridBagConstraints);

        jLabel7.setText("Cari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 51;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 12, 0, 72);
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setText("Pengembang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 90, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPerumahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerumahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerumahanActionPerformed

    private void txtAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlamatActionPerformed

    private void txtTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelpActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtBrosurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrosurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrosurActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/perumahan", "rizka", "@dbID1331.");
            cn.createStatement().executeUpdate("INSERT INTO perumahan(id, nama, alamat, telp, email, pengembang, tipe, brosur) VALUES " + "(NULL, " + "'" + txtPerumahan.getText() + "','" + txtAlamat.getText() + "','" + txtTelp.getText() + "','" + txtEmail.getText() + "','" + txtPengembang.getText() + "','" + cmbTipe.getSelectedItem() + "','" + txtBrosur.getText() + "')");
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasill.....");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ada yang belum diisi !!");
        }
        loadData("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int i = tblData.getSelectedRow();

        if (i > -1) {
            txtId.setText(model.getValueAt(i, 0).toString());
            txtPerumahan.setText(model.getValueAt(i, 2).toString());
            txtAlamat.setText(model.getValueAt(i, 3).toString());
            txtTelp.setText(model.getValueAt(i, 4).toString());
            txtEmail.setText(model.getValueAt(i, 5).toString());
            txtPengembang.setText(model.getValueAt(i, 6).toString());
            cmbTipe.setSelectedItem(model.getValueAt(i, 7));
            txtBrosur.setText(model.getValueAt(i, 8).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/perumahan", "rizka", "@dbID1331.");
            Statement st = cn.createStatement();
            cn.createStatement().executeUpdate("UPDATE perumahan set nama ='" + txtPerumahan.getText() + "',alamat ='" + txtAlamat.getText() + "',telp ='" + txtTelp.getText() + "',email ='" + txtEmail.getText() + "',pengembang ='" + txtPengembang.getText() +"',tipe ='" + cmbTipe.getSelectedItem() + "',brosur ='" + txtBrosur.getText() + "' WHERE id ='" + txtId.getText() + "'");

            JOptionPane.showMessageDialog(null, "Data telah diedit.....");
            loadData("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/perumahan", "rizka", "@dbID1331.");
            cn.createStatement().executeUpdate("DELETE FROM perumahan where id ='" + txtId.getText() + "'");
            loadData("");
            JOptionPane.showMessageDialog(null, "data terhapus.....");
        } catch (SQLException ex) {
            Logger.getLogger(data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        String key = txtCari.getText();
        if (key.isEmpty()) {
            loadData("");
        } else {
            loadData(key);
        }
    }//GEN-LAST:event_txtCariKeyReleased

    private void txtPengembangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengembangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPengembangActionPerformed


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
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbTipe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtBrosur;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPengembang;
    private javax.swing.JTextField txtPerumahan;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables

    private void loadData(String key) {
        try {
            model.setRowCount(0);
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/perumahan", "rizka", "@dbID1331.");
            Statement st = cn.createStatement();

            String where = key.isEmpty() ? "" : " WHERE nama LIKE '%" + key + "%' OR alamat LIKE '%"+ key + "%' OR telp LIKE '%"+ key + "%' OR email LIKE '%"+ key +"%' OR tipe LIKE '%"+ key +"%' OR brosur LIKE '%"+key+"%'";

            ResultSet rs = st.executeQuery("SELECT * FROM perumahan" + where);
            int no = 0;
            while (rs.next()) {
                no++;
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String alamat = rs.getString("alamat");
                String telp = rs.getString("telp");
                String email = rs.getString("email");
                String pengembang = rs.getString("pengembang");
                String tipe = rs.getString("tipe");
                String brosur = rs.getString("brosur");

                Object[] data = {id, no, nama, alamat, telp, email, pengembang, tipe, brosur};
                model.addRow(data);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
}
