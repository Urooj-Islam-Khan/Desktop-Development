/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crudapplication;


import java.sql.*;
import Connection.DBConnection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrudApp extends javax.swing.JFrame {
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model;
    public CrudApp() {
        initComponents();
        conn = DBConnection.getConnection(); // Establishing connection
//        
        model = (DefaultTableModel) aptTable.getModel();
        fetchData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveBtn = new java.awt.Button();
        appointmentTime = new javax.swing.JTextField();
        pName = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        male = new javax.swing.JCheckBox();
        female = new javax.swing.JCheckBox();
        dName = new javax.swing.JTextField();
        updateBtn = new java.awt.Button();
        jSeparator3 = new javax.swing.JSeparator();
        clearBtn = new java.awt.Button();
        deleteBtn = new java.awt.Button();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aptTable = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 48, 71));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(2, 48, 71));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(1, 32, 47));

        jLabel7.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("HOSPITAL MANAGEMENT SYSTEM");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(497, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(387, 387, 387))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1270, 80));

        jPanel4.setBackground(new java.awt.Color(2, 48, 71));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 158, 188), 3, true), "ADD   APPOINTMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APPOINTMENT TABLE");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PATIENT NAME");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AGE");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GENDER");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOCTOR NAME");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        saveBtn.setBackground(new java.awt.Color(33, 158, 188));
        saveBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setLabel("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel4.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 87, -1));

        appointmentTime.setBackground(new java.awt.Color(2, 48, 71));
        appointmentTime.setForeground(new java.awt.Color(255, 255, 255));
        appointmentTime.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 158, 188), 2, true));
        jPanel4.add(appointmentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 230, -1));

        pName.setBackground(new java.awt.Color(2, 48, 71));
        pName.setForeground(new java.awt.Color(255, 255, 255));
        pName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 158, 188), 2, true));
        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });
        jPanel4.add(pName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 230, -1));

        age.setBackground(new java.awt.Color(2, 48, 71));
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 158, 188), 2, true));
        jPanel4.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 230, -1));

        male.setBackground(new java.awt.Color(2, 48, 71));
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel4.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 70, -1));

        female.setBackground(new java.awt.Color(2, 48, 71));
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel4.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        dName.setBackground(new java.awt.Color(2, 48, 71));
        dName.setForeground(new java.awt.Color(255, 255, 255));
        dName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 158, 188), 2, true));
        dName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameActionPerformed(evt);
            }
        });
        jPanel4.add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 230, 20));

        updateBtn.setBackground(new java.awt.Color(33, 158, 188));
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setLabel("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel4.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 90, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 10));

        clearBtn.setBackground(new java.awt.Color(33, 158, 188));
        clearBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clearBtn.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn.setLabel("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel4.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 90, -1));

        deleteBtn.setBackground(new java.awt.Color(33, 158, 188));
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setLabel("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel4.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 90, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 470, 320));

        jPanel5.setBackground(new java.awt.Color(2, 48, 71));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(33, 158, 188), 3, true), "ADD   APPOINTMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Stencil", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aptTable.setBackground(new java.awt.Color(2, 48, 71));
        aptTable.setForeground(new java.awt.Color(255, 255, 255));
        aptTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, ""},
                {null, null, "", "", null, null},
                {null, null, null, null, "", null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S.No", "Appointment Time", "Patient Name", "Age", "Gender", "Doctor Name"
            }
        ));
        aptTable.setGridColor(new java.awt.Color(33, 158, 188));
        aptTable.setShowGrid(true);
        jScrollPane1.setViewportView(aptTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 660, 260));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 230, 10));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 710, 320));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Method to update selected row
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
         int row = aptTable.getSelectedRow();
   
        if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to update");
        return;
    }

    int id = (int) model.getValueAt(row, 0);
    String apt_Time = appointmentTime.getText();
    String p_Name = pName.getText();
    String p_age = age.getText();
    String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
    String d_Name = dName.getText();

    try {
        String query = "UPDATE javapatientappointment SET appointment_time=?, patient_name=?, age=?, gender=?, doctor_name=? WHERE id=?";
        pst = conn.prepareStatement(query);
        pst.setString(1, apt_Time);
        pst.setString(2, p_Name);
        pst.setString(3, p_age);
        pst.setString(4, gender);
        pst.setString(5, d_Name);
        pst.setInt(6, id); // Correct placement for WHERE clause
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data Updated Successfully!");
        fetchData();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed
// Method to insert data into database
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String apt_Time = appointmentTime.getText();
        String p_Name = pName.getText();
        String p_age = age.getText();
        String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
        String d_Name = dName.getText();
        
        // ✅ Check if fields are empty
        if (apt_Time.isEmpty() || p_Name.isEmpty() || p_age.isEmpty() || gender.isEmpty() || d_Name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String query = "INSERT INTO `javapatientappointment`( `Appointment_Time`, `Patient_Name`, `Age`, `Gender`, `Doctor_Name`) VALUES (?, ?, ?, ?,?)";
            pst = conn.prepareStatement(query);
            pst.setString(1, apt_Time);
            pst.setString(2, p_Name);
            pst.setString(3, p_age);
            pst.setString(4, gender);
            pst.setString(5, d_Name);
            
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Data inserted successfully!");
            fetchData(); // Refresh table
        } else {
            JOptionPane.showMessageDialog(this, "Insertion failed!");
        }
            conn.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    // Method to fetch data from database and display in JTable
    private void fetchData() {
        model.setRowCount(0);
        Connection conn = DBConnection.getConnection();
        try {
            String query = "SELECT * FROM javapatientappointment";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),rs.getString("Appointment_Time"), rs.getString("Patient_Name"), rs.getInt("Age"),
                    rs.getString("Gender"), rs.getString("Doctor_Name")
                });
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    
    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameActionPerformed

//   To clear all table data
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
                         try {
            String query = "TRUNCATE TABLE javapatientappointment";
            pst = conn.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "All Data Cleared Successfully!");
            fetchData();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_clearBtnActionPerformed
    
//   To delete selected row
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
    int row = aptTable.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete");
        return;
    }

    int id = (int) model.getValueAt(row, 0);

    // Confirmation dialog
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", 
                                                "Confirm Deletion", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) {
        return;
    }

    PreparedStatement pst = null;
    try {
        String query = "DELETE FROM javapatientappointment WHERE id=?";
        pst = conn.prepareStatement(query);
        pst.setInt(1, id);
        int affectedRows = pst.executeUpdate();
        
        if (affectedRows > 0) {
            JOptionPane.showMessageDialog(this, "Data Deleted Successfully!");
            model.removeRow(row); // Remove from table UI
        } else {
            JOptionPane.showMessageDialog(this, "Deletion failed. Record may not exist.");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error deleting data: " + ex.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void dNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameActionPerformed

 

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField appointmentTime;
    private javax.swing.JTable aptTable;
    private java.awt.Button clearBtn;
    private javax.swing.JTextField dName;
    private java.awt.Button deleteBtn;
    private javax.swing.JCheckBox female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JCheckBox male;
    private javax.swing.JTextField pName;
    private java.awt.Button saveBtn;
    private java.awt.Button updateBtn;
    // End of variables declaration//GEN-END:variables
}
