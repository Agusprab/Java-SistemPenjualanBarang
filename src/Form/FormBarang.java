/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Form;

import javax.swing.JOptionPane;
import Database.ClassDatabase;
import java.io.InputStream;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.text.DecimalFormat;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author AP
 */
public class FormBarang extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormBarang
     */
    public FormBarang() {
        initComponents();
        try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select kodebarang, namabarang, h_beli, h_jual,stok,saham from barang";
    ResultSet r=s.executeQuery(sql);
    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        InputKode = new javax.swing.JTextField();
        InputNama = new javax.swing.JTextField();
        InputHargaBeli = new javax.swing.JTextField();
        InputHargaJual = new javax.swing.JTextField();
        InputStok = new javax.swing.JTextField();
        BtnTampil = new javax.swing.JButton();
        cariData = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblBarang = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FORM ENTRI DATA MASTER BARANG");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Harga Beli");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Harga Jual");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Stok");

        InputKode.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                InputKodeCaretUpdate(evt);
            }
        });

        BtnTampil.setText("Tampilkan");
        BtnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTampilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(InputStok, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(InputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cariData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BtnTampil))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InputKode, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InputHargaBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(InputHargaJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(InputStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnTampil)
                    .addComponent(cariData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("SAVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("CLOSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TblBarang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TblBarang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int saham1 =0;
        String kodea = this.InputKode.getText();
        String namaa = this.InputNama.getText();
        int h_belia1 = Integer.parseInt(InputHargaBeli.getText());
        String h_juala = this.InputHargaJual.getText();
        int stoka1 = Integer.parseInt(InputStok.getText());
        
        saham1 = stoka1 * h_belia1;
        
        String h_belia = this.InputHargaBeli.getText();
        String stoka = this.InputStok.getText();
        String saham = Integer.toString(saham1);
        
        if(InputKode.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Kode Acc Tidak Boleh Kosong");
        }else{
            if(InputNama.getText().isEmpty()){
                JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Nama Acc Tidak Boleh Kosong");
            }else{
                if(InputHargaBeli.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Harga Beli Tidak Boleh Kosong");
                }else{
                    if(InputHargaJual.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Harga Jual Tidak Boleh Kosong");
                    }else{
                        if(InputStok.getText().isEmpty()){
                            JOptionPane.showMessageDialog(this,"Data Belum Lengkap, Stok Tidak Boleh Kosong");
                        }else{
                            try{
                                Connection c = ClassDatabase.getkoneksi();
                                String sql = "INSERT INTO barang VALUES (?,?,?,?,?,?)";
                                PreparedStatement p= (PreparedStatement)c.prepareStatement(sql);
                                p.setString(1,kodea);
                                p.setString(2, namaa);
                                p.setString(3, h_belia);
                                p.setString(4, h_juala);
                                p.setString(5, stoka);
                                p.setString(6, saham);
                                p.executeUpdate();
                                p.close();
                                JOptionPane.showMessageDialog(this,"Sukses Tambah Data");
                            }catch(SQLException e){
                                System.out.println(e);
                            }finally{}
                        }
                    }
                }
            }
        }
              try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select kodebarang, namabarang, h_beli, h_jual from barang";
    ResultSet r=s.executeQuery(sql);
    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
              resetInput();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       resetInput();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void resetInput(){
         InputNama.setText("");
        InputKode.setText("");
        InputStok.setText("");
        InputHargaBeli.setText("");
        InputHargaJual.setText("");
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            String kodeBarang = InputKode.getText();
        String namaBarang = InputNama.getText();
        String h_beli = InputHargaBeli.getText();
        String h_jual = InputHargaJual.getText();
        String stok = InputStok.getText();
        
        
        
        if(kodeBarang.isEmpty() || namaBarang.isEmpty() || h_beli.isEmpty() || h_jual.isEmpty()|| stok.isEmpty()){
            JOptionPane.showMessageDialog(null, "Data Masih ada yang kosong");
        }else{
             try{
                          Connection c = ClassDatabase.getkoneksi();
                          String sql = "UPDATE barang SET namabarang= ?, h_beli=?, h_jual=?, stok=? WHERE kodebarang = ?";
                          PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);
                          
                          p.setString(1, namaBarang);
                          p.setString(2,h_beli);
                          p.setString(3, h_jual);                      
                          p.setString(4, stok);
                          p.setString(5, kodeBarang);
                          p.executeUpdate();
                          p.close();
                          JOptionPane.showMessageDialog(this, "Data Sukses Di ubah");
                          
                      }catch(Exception e){
                          System.out.println(e);
                      }finally{
                      
                  }
             
             
        }
               try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select kodebarang, namabarang, h_beli, h_jual,stok,saham from barang";
    ResultSet r=s.executeQuery(sql);
    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void InputKodeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_InputKodeCaretUpdate
        // TODO add your handling code here:
        
              try{
            Connection c = ClassDatabase.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM barang WHERE kodebarang = '" +this.InputKode.getText() + "'";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                this.InputNama.setText(r.getString("namabarang"));
                this.InputHargaBeli.setText(r.getString("h_beli"));
                this.InputHargaJual.setText(r.getString("h_jual"));
                this.InputStok.setText(r.getString("stok"));
            }
            r.close();
            s.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }//GEN-LAST:event_InputKodeCaretUpdate

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
         String kode = InputKode.getText();        
        
   
             try{
                          Connection c = ClassDatabase.getkoneksi();
                          String sql = "DELETE FROM barang WHERE kodebarang = ?";
                          PreparedStatement p = (PreparedStatement) c.prepareStatement(sql);                          
                          
                          p.setString(1, kode);
                          p.executeUpdate();
                          p.close();
                          JOptionPane.showMessageDialog(this, "Data Sukses Di Hapus");
                          
                      }catch(Exception e){
                          System.out.println(e);
                      }finally{
                      
                  }
                   try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select kodebarang, namabarang, h_beli, h_jual,stok,saham from barang";
    ResultSet r=s.executeQuery(sql);
    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
                   resetInput();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           int ex = JOptionPane.showConfirmDialog(null, "Apakah anda akan keluar?", "Anda yakin?",JOptionPane.YES_NO_OPTION);        
        if(ex == 0){
            dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BtnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTampilActionPerformed
        // TODO add your handling code here:
        
        String key = cariData.getText();
    if(cariData.getText().isEmpty()){
        try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select kodebarang, namabarang, h_beli, h_jual,stok,saham from barang";
    ResultSet r=s.executeQuery(sql);
    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
    }else{
            try{
    Connection c=ClassDatabase.getkoneksi();
    Statement s= c.createStatement();
    String sql="select kodebarang, namabarang, h_beli, h_jual,stok,saham from barang WHERE namabarang LIKE '%"+key+"%' OR kodebarang LIKE '%"+key+"%'"; 
    ResultSet r=s.executeQuery(sql);
    TblBarang.setModel(DbUtils.resultSetToTableModel(r));
}catch (SQLException e){
    JOptionPane.showMessageDialog(null, e);
}
    }
    }//GEN-LAST:event_BtnTampilActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        
        
        try{
         Connection c=ClassDatabase.getkoneksi();                
         HashMap <String, Object> parameters = new HashMap<>();            
        String pathReport ="src/report/report_DataBarang.jasper";  
        JasperPrint print = JasperFillManager.fillReport(pathReport, null,c);
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnTampil;
    private javax.swing.JTextField InputHargaBeli;
    private javax.swing.JTextField InputHargaJual;
    private javax.swing.JTextField InputKode;
    private javax.swing.JTextField InputNama;
    private javax.swing.JTextField InputStok;
    private javax.swing.JTable TblBarang;
    private javax.swing.JTextField cariData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
