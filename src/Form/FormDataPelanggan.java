/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package FORM;
import Database.ClassDatabase;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author ASUS
 */
public class FormDataPelanggan extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormDataPelanggan
     */
    DefaultTableModel r = new DefaultTableModel();
    public FormDataPelanggan() {
        initComponents();
        
        try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select no_identitas, j_identitas, nama, jk, alamat, nohp, tgl_plg from pelanggan";
    ResultSet r=s.executeQuery(sql);
    tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
   
                            
    }
    
    
   public void resetInput(){
        txtNoIdentitas.setText("");
        txtNamaplg.setText("");
        txtAlamatplg.setText("");
        txtNohpplg.setText("");
//        txtTgldaftar.setText("");
        JenisKelamin.clearSelection();
        ktpOrsim.clearSelection();
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ktpOrsim = new javax.swing.ButtonGroup();
        JenisKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNoIdentitas = new javax.swing.JTextField();
        txtNamaplg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamatplg = new javax.swing.JTextArea();
        txtNohpplg = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPelanggan = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cariData = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        rbKtp = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        rbSim = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        rbLakilaki = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        rbPerempuan = new javax.swing.JRadioButton();
        txtTgldaftar = new com.toedter.calendar.JDateChooser();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("No. Identitas");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("No. HP");

        jLabel7.setText("Tanggal");

        txtNoIdentitas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNoIdentitasCaretUpdate(evt);
            }
        });

        txtAlamatplg.setColumns(20);
        txtAlamatplg.setRows(5);
        jScrollPane1.setViewportView(txtAlamatplg);

        tblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblPelanggan);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("CLOSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cari Data");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });

        cariData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cariDataKeyPressed(evt);
            }
        });

        ktpOrsim.add(rbKtp);
        rbKtp.setText("KTP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(rbKtp)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbKtp)
        );

        ktpOrsim.add(rbSim);
        rbSim.setText("SIM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbSim)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbSim)
        );

        JenisKelamin.add(rbLakilaki);
        rbLakilaki.setText("Laki-Laki");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(rbLakilaki)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbLakilaki)
        );

        JenisKelamin.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbPerempuan)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbPerempuan)
        );

        jButton7.setText("PRINT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cariData, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtNoIdentitas)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtNohpplg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)))
                                .addGap(112, 112, 112))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtNamaplg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTgldaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton7))
                        .addGap(34, 34, 34))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNoIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNamaplg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNohpplg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6)
                                .addComponent(cariData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTgldaftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setText("FORM ENTRI DATA PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txtNoIdentitas.setText("");
        txtNamaplg.setText("");
        txtAlamatplg.setText("");
        txtNohpplg.setText("");
        txtTgldaftar.setDate(null);
        ktpOrsim.clearSelection();
        JenisKelamin.clearSelection();
        txtNoIdentitas.requestFocus();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        java.util.Date tgl_plg = (java.util.Date) txtTgldaftar.getDate();
        String no_identitas = txtNoIdentitas.getText();
        String nama = txtNamaplg.getText();
        String j_identitas = null;
        if(rbKtp.isSelected()){
            j_identitas = "KTP";
        }else if(rbSim.isSelected()){
            j_identitas = "SIM";
        }
        
        String jk = null;
        if(rbLakilaki.isSelected()){
            jk = "Laki-Laki";           
        }else if(rbPerempuan.isSelected()){
            jk = "Perempuan";
        }
        
        String alamat = txtAlamatplg.getText();
        String nohp = txtNohpplg.getText();
        
        if(txtNoIdentitas.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Data Belum lengkap, Nomor Identitas Pelanggan Tidak Boleh Kosong");
        }else{
            if(txtNamaplg.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Data Belum lengkap, Nama Pelanggan Tidak Boleh Kosong");
            }else{
              if(txtAlamatplg.getText().isEmpty()){
                  JOptionPane.showMessageDialog(this, "Data Belum lengkap,Alamat Tidak Boleh Kosong");
              }else{
                  if(txtNohpplg.getText().isEmpty()){
                      JOptionPane.showMessageDialog(this, "Data Belum lengkap, Nomor HP Tidak Boleh Kosong");
                  }else{
                      
                      try{
                          Connection c = ClassDatabase.getkoneksi();
                          String sql = "INSERT INTO pelanggan VALUES(?,?,?,?,?,?,?)";
                          PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                          p.setString(1, no_identitas);
                          p.setString(2, j_identitas);
                          p.setString(3, nama);
                          p.setString(4, alamat);
                          p.setString(5, jk);
                          p.setString(6, nohp);
                          p.setDate(7, new java.sql.Date(tgl_plg.getTime()));
                          p.executeUpdate();
                          p.close();
                          JOptionPane.showMessageDialog(this, "Sukses Tambah Data");
                          
                      }catch(Exception e){
                          System.out.println(e);
                      }finally{
                      
                  }
              }  
            }
        }
       }
        
        try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select no_identitas, j_identitas, nama, jk, alamat, nohp, tgl_plg from pelanggan";
    ResultSet r=s.executeQuery(sql);
    tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNoIdentitasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNoIdentitasCaretUpdate
        // TODO add your handling code here:
        try{
            Connection c = ClassDatabase.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM pelanggan WHERE no_identitas = '" + this.txtNoIdentitas.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                this.txtNamaplg.setText(r.getString(3));
                if("KTP".equalsIgnoreCase(r.getString("j_identitas"))){
                    rbKtp.setSelected(true);
                }else{
                    rbSim.setSelected(true);
                }                
                if("Laki-Laki".equalsIgnoreCase(r.getString("jk"))){
                    rbLakilaki.setSelected(true);
                }else{
                    rbPerempuan.setSelected(true);
                }
                
                this.txtAlamatplg.setText(r.getString("alamat"));
                this.txtTgldaftar.setDate(r.getDate("tgl_plg"));
                this.txtNohpplg.setText(r.getString("nohp"));
            }
            r.close();
            s.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_txtNoIdentitasCaretUpdate

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      java.util.Date tgl_plg=(java.util.Date) this.txtTgldaftar.getDate();
        String no_identitas=this.txtNoIdentitas.getText();
        String nama=this.txtNamaplg.getText();
        String j_identitas = null;
        if (rbKtp.isSelected()){
            j_identitas = "KTP";
        }else if (rbSim.isSelected()){
            j_identitas = "SIM";
        }
        String jk = null;
        if (rbLakilaki.isSelected()){
            jk = "laki-laki";
        }else if (rbPerempuan.isSelected()){
            jk = "Perempuan";
        }
        String alamat=this.txtAlamatplg.getText();
        String no_hp=this.txtNohpplg.getText();
        if(txtNoIdentitas.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor Identitas Pelanggan Tidak Boleh Kosong");
        }
        else{
        if(txtNamaplg.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nama Pelanggan Tidak Boleh Kosong");
        }
        else{
        if(txtAlamatplg.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Alamat Pelanggan Tidak Boleh Kosong");
        }
        else{
        if(txtNohpplg.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Data Belum Lengkap, Nomor HP Pelanggan Tidak Boleh Kosong");
        }
        else{
        try {
            Connection c=ClassDatabase.getkoneksi();
            String sql =" UPDATE pelanggan SET j_identitas=?,nama = ?,alamat=?,jk=?,nohp=?,tgl_plg=? WHERE no_identitas=?";
            PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                p.setString(7, no_identitas);
                p.setString(1, j_identitas);
                p.setString(2, nama);
                p.setString(3, alamat);
                p.setString(4, jk);
		p.setString(5, no_hp);
                p.setDate(6, new java.sql.Date(tgl_plg.getTime()));
                p.executeUpdate();
            
                JOptionPane.showMessageDialog(this,"Sukses Update Data");
        }catch(SQLException e){
            System.out.println(e);
        }finally{
            
        }}}}}
try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select no_identitas, j_identitas, nama, jk, alamat, nohp, tgl_plg from pelanggan";
    ResultSet r=s.executeQuery(sql);
    tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}   
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
        // TODO add your handling code here:
           
        
    }//GEN-LAST:event_jButton6KeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        java.util.Date tgl_plg = this.txtTgldaftar.getDate();
        String no_identitas = this.txtNoIdentitas.getText();
        
        try{
            Connection c = ClassDatabase.getkoneksi();
            String sql = "DELETE FROM pelanggan WHERE no_identitas = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, no_identitas);
            
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(this, "Sukses Hapus Data");
            
        }catch(SQLException e){System.out.println(e);}
        finally{}        
        try{
            Connection c=ClassDatabase.getkoneksi();
            Statement s= c.createStatement();
            String sql="select no_identitas, j_identitas, nama, jk, alamat, nohp, tgl_plg from pelanggan";
            ResultSet r=s.executeQuery(sql);
            tblPelanggan.setModel(DbUtils.resultSetToTableModel(r));
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } 
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar?", "Anda yakin?",JOptionPane.YES_NO_OPTION);        
        if(ex == 0){
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                
        String cari = cariData.getText();
        DefaultTableModel tabelTampil = new DefaultTableModel();
        tabelTampil.addColumn("no_identitas");
        tabelTampil.addColumn("j_identitas");
        tabelTampil.addColumn("nama");
        tabelTampil.addColumn("alamat");
        tabelTampil.addColumn("jk");
        tabelTampil.addColumn("nohp");
        tabelTampil.addColumn("tgl_plg");
            try{
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM pelanggan WHERE no_identitas LIKE '%" + cari + "%'"+"OR j_identitas LIKE '%" + cari +"%'" +"OR nama LIKE '%" + cari + "%'" + "OR alamat LIKE '%" + cari +"%'" +"OR jk LIKE '%"+cari+"%'" + "OR nohp LIKE '%"+cari+"%'"+"OR tgl_plg LIKE '%"+cari +"%'";
                ResultSet r = s.executeQuery(sql);
                
                while(r.next()){
                    tabelTampil.addRow(new Object[]{
                        r.getString(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        r.getString(5),
                        r.getString(6),
                        r.getString(7),
                    });
                }
                tblPelanggan.setModel(tabelTampil);
            }catch(Exception e){
            }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void cariDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariDataKeyPressed
        // TODO add your handling code here:
        
                
        String cari = cariData.getText();
        DefaultTableModel tabelTampil = new DefaultTableModel();
        tabelTampil.addColumn("no_identitas");
        tabelTampil.addColumn("j_identitas");
        tabelTampil.addColumn("nama");
        tabelTampil.addColumn("alamat");
        tabelTampil.addColumn("jk");
        tabelTampil.addColumn("nohp");
        tabelTampil.addColumn("tgl_plg");
            try{
                Connection c = ClassDatabase.getkoneksi();
                Statement s = c.createStatement();
                String sql = "SELECT * FROM pelanggan WHERE no_identitas LIKE '%" + cari + "%'"+"OR j_identitas LIKE '%" + cari +"%'" +"OR nama LIKE '%" + cari + "%'" + "OR alamat LIKE '%" + cari +"%'" +"OR jk LIKE '%"+cari+"%'" + "OR nohp LIKE '%"+cari+"%'"+"OR tgl_plg LIKE '%"+cari +"%'";
                ResultSet r = s.executeQuery(sql);
                
                while(r.next()){
                    tabelTampil.addRow(new Object[]{
                        r.getString(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        r.getString(5),
                        r.getString(6),
                        r.getString(7),
                    });
                }
                tblPelanggan.setModel(tabelTampil);
            }catch(Exception e){
            }

    }//GEN-LAST:event_cariDataKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          try{
         Connection c=ClassDatabase.getkoneksi();                
         HashMap <String, Object> parameters = new HashMap<>();            
        String pathReport ="src/report/report_DataPelanggan.jasper";  
        JasperPrint print = JasperFillManager.fillReport(pathReport, null,c);
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JenisKelamin;
    private javax.swing.JTextField cariData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup ktpOrsim;
    private javax.swing.JRadioButton rbKtp;
    private javax.swing.JRadioButton rbLakilaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JRadioButton rbSim;
    private javax.swing.JTable tblPelanggan;
    private javax.swing.JTextArea txtAlamatplg;
    private javax.swing.JTextField txtNamaplg;
    private javax.swing.JTextField txtNoIdentitas;
    private javax.swing.JTextField txtNohpplg;
    private com.toedter.calendar.JDateChooser txtTgldaftar;
    // End of variables declaration//GEN-END:variables
}
