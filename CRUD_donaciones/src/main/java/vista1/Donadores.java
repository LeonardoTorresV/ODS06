/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista1;

import conexion1.Conexion1;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL
 */
public class Donadores extends javax.swing.JFrame {

    Conexion1 conex = new Conexion1();

    Connection cn;
    Statement st;
    ResultSet rs;
    int id;

    DefaultTableModel modelo;

    public Donadores() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana de donadores");
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNOMBRE = new javax.swing.JTextField();
        txtEMAIL = new javax.swing.JTextField();
        txtTELEFONO = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDonadores = new javax.swing.JTable();
        btnAGREGAR = new javax.swing.JButton();
        btnMODIFICAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnNUEVO = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnREGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Telefono");

        txtID.setEditable(false);

        TablaDonadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Email", "Telefono"
            }
        ));
        TablaDonadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDonadoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDonadores);
        if (TablaDonadores.getColumnModel().getColumnCount() > 0) {
            TablaDonadores.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDonadores.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDonadores.getColumnModel().getColumn(0).setMaxWidth(50);
            TablaDonadores.getColumnModel().getColumn(1).setMinWidth(90);
            TablaDonadores.getColumnModel().getColumn(1).setPreferredWidth(90);
            TablaDonadores.getColumnModel().getColumn(1).setMaxWidth(90);
            TablaDonadores.getColumnModel().getColumn(3).setMinWidth(100);
            TablaDonadores.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablaDonadores.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        btnAGREGAR.setText("AGREGAR");
        btnAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAGREGARActionPerformed(evt);
            }
        });

        btnMODIFICAR.setText("MODIFICAR");
        btnMODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMODIFICARActionPerformed(evt);
            }
        });

        btnELIMINAR.setText("ELIMINAR");
        btnELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnELIMINARActionPerformed(evt);
            }
        });

        btnNUEVO.setText("NUEVO");
        btnNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNUEVOActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Donadores");

        btnREGRESAR.setText("REGRESAR");
        btnREGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnREGRESAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(326, 326, 326))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnELIMINAR)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAGREGAR)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNUEVO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMODIFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnREGRESAR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTELEFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAGREGAR)
                            .addComponent(btnMODIFICAR))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnELIMINAR)
                            .addComponent(btnNUEVO))))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNUEVOActionPerformed

    private void btnREGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGRESARActionPerformed
        ventanaPrincipal ventana1 = new ventanaPrincipal();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnREGRESARActionPerformed

    private void btnAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARActionPerformed
        agregar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAGREGARActionPerformed

    private void btnMODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMODIFICARActionPerformed
        modificar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnMODIFICARActionPerformed

    private void btnELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnELIMINARActionPerformed
        eliminar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnELIMINARActionPerformed

    private void TablaDonadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDonadoresMouseClicked
        int fila = TablaDonadores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        } else {
            id = Integer.parseInt((String) TablaDonadores.getValueAt(fila, 0).toString());
            String nombre = (String) TablaDonadores.getValueAt(fila, 1);
            String email = (String) TablaDonadores.getValueAt(fila, 2);
            String telefono = (String) TablaDonadores.getValueAt(fila, 3);
            txtID.setText("" + id);
            txtNOMBRE.setText(nombre);
            txtEMAIL.setText(email);
            txtTELEFONO.setText(telefono);
        }
    }//GEN-LAST:event_TablaDonadoresMouseClicked

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
            java.util.logging.Logger.getLogger(Donadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donadores().setVisible(true);
            }
        });
    }

    public void listar() {
        String sql = "SELECT * FROM donor;";

        try {
            cn = conex.getConexion1();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] donadores = new Object[4];
            modelo = (DefaultTableModel) TablaDonadores.getModel();
            while (rs.next()) {
                donadores[0] = rs.getInt("id");
                donadores[1] = rs.getString("name");
                donadores[2] = rs.getString("email");
                donadores[3] = rs.getString("cellphone");
                modelo.addRow(donadores);
            }
            TablaDonadores.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo listar a los donadores: error " + e);
        }
    }

    public void agregar() {
        String nombre = txtNOMBRE.getText();
        String email = txtEMAIL.getText();
        String cellphone = txtTELEFONO.getText();

        if (nombre.equals("") || email.equals("") || cellphone.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan valores");
            limpiar();
        } else {
            String sql = "INSERT INTO donor (name, email, cellphone) VALUE ('" + nombre + "','" + email + "','" + cellphone + "')";

            try {
                cn = conex.getConexion1();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se agrego con exito el donador");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar al donador, error " + e);
            }
        }
    }

    public void modificar() {
        String nombre = txtNOMBRE.getText();
        String email = txtEMAIL.getText();
        String cellphone = txtTELEFONO.getText();

        if (nombre.equals("") || email.equals("") || cellphone.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan valores");
            limpiar();
        } else {

            String sql = "UPDATE donor SET name = '" + nombre + "', email = '" + email + "', cellphone = '" + cellphone + "' WHERE id =" + id;
            try {
                cn = conex.getConexion1();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Se modifico con exito el donador");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo modicar al donador, eroor " + e);
            }
        }
    }

    public void eliminar() {
        int fila = TablaDonadores.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado niguna fila");
            limpiar();
        } else {
            String sql = "DELETE FROM donor WHERE id =" + id;

            try {
                cn = conex.getConexion1();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Donador eliminado exitosamente");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar al donador, error " + e);
            }

        }
    }
    
    
    public void nuevo(){
        txtID.setText("");
        txtNOMBRE.setText("");
        txtEMAIL.setText("");
        txtTELEFONO.setText("");
        txtNOMBRE.requestFocus();
    }

    public void limpiar() {
        for (int i = 0; i < TablaDonadores.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDonadores;
    private javax.swing.JButton btnAGREGAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JButton btnNUEVO;
    private javax.swing.JButton btnREGRESAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtTELEFONO;
    // End of variables declaration//GEN-END:variables
}
