/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pretest3;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;

public class pretest3 extends javax.swing.JFrame {
Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
 public void dataTabel(){
        String sqlTabel ="select * from tabel_pre3";
        try {
            ps= conn.prepareStatement(sqlTabel);
            rs = ps.executeQuery();
            tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    /**
     * Creates new form pretest3
     */
    public pretest3() {
        initComponents();
       
        tglpenjualan.setDateFormat(new SimpleDateFormat());
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idpenjualan = new javax.swing.JTextField();
        idbarang = new javax.swing.JTextField();
        namabarang = new javax.swing.JTextField();
        tglpenjualan = new org.freixas.jcalendar.JCalendarCombo();
        jharga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelinput = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        bln = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 3, 24)); // NOI18N
        jLabel1.setText("PRETEST 3 OTODIDAK ANAK MAGANG");

        jLabel2.setText("ID Penjualan");

        jLabel3.setText("ID Barang");

        jLabel4.setText("Nama Barang");

        jLabel5.setText("Tanggal Penjualan");

        jLabel6.setText("Harga");

        idpenjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpenjualanActionPerformed(evt);
            }
        });

        jLabel7.setText("Rp.");

        insert.setText("INSERT");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        tabelinput.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Penjualan ", "ID Barang", "Nama Barang", "Tanggal Penjualan", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tabelinput);

        jButton1.setText("CARI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Bulan--", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        bln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnActionPerformed(evt);
            }
        });

        jLabel8.setText("Cari Berdasarkan Bulan");

        jLabel9.setText("Nama : Fajar Galang Septoni (16111100017)");

        jLabel10.setText(" Achmad Perdanai (16111100019)");

        jLabel11.setText("Ardin Tito Pinandito (16111100037)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insert)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(43, 43, 43))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(idbarang)
                                    .addComponent(idpenjualan)
                                    .addComponent(namabarang)
                                    .addComponent(tglpenjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bln, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jButton1))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bln, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tglpenjualan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idpenjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpenjualanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpenjualanActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
    String sql ="insert into tabel_pre3 values(?,?,?,?,?)";
            
         try {
              
        ps = conn.prepareStatement(sql);
        ps.setString(1, idpenjualan.getText());
        ps.setString(2, idbarang.getText());
        ps.setString(3, namabarang.getText());
        ps.setString(4, (String) tglpenjualan.getSelectedItem());
        ps.setString(5, jharga.getText());
        ps.executeUpdate();
// TODO add your handling code here:


    } catch (Exception e) { 
        JOptionPane.showMessageDialog(null, e);
    }
         dataTabel();
    }//GEN-LAST:event_insertActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = koneksi.connpretest3();
        dataTabel();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (bln.getSelectedItem().equals("Januari"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'January'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Februari"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'February'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Maret"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'March'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("April"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'April'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Mei"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'May'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Juni"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'June'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Juli"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'July'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Agustus"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'August'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("September"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'September'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Oktober"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'October'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("November"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'November'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        else if (bln.getSelectedItem().equals("Desember"))
        {
            String sqlTabel ="select * from tabel_pre3 WHERE MONTHNAME(tgl_penjualan)= 'December'";
            try 
            {
                ps= conn.prepareStatement(sqlTabel);
                rs = ps.executeQuery();
                tabelinput.setModel(DbUtils.resultSetToTableModel(rs));
            } 
            catch (Exception e) {
                 JOptionPane.showMessageDialog(rootPane, e);
            }
        }
       
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void blnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blnActionPerformed

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
            java.util.logging.Logger.getLogger(pretest3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pretest3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pretest3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pretest3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pretest3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bln;
    private javax.swing.JTextField idbarang;
    private javax.swing.JTextField idpenjualan;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jharga;
    private javax.swing.JTextField namabarang;
    private javax.swing.JTable tabelinput;
    private org.freixas.jcalendar.JCalendarCombo tglpenjualan;
    // End of variables declaration//GEN-END:variables
}
