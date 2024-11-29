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
public class Donaciones extends javax.swing.JFrame {

    Conexion1 conex = new Conexion1();

    Connection cn;
    Statement st;
    ResultSet rs;
    int id;

    DefaultTableModel modelo;

    public Donaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana de donaciones");
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDESCRIPCION = new javax.swing.JTextField();
        txtDONADORid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDonaciones = new javax.swing.JTable();
        btnAGREGAR = new javax.swing.JButton();
        btnMODIFICAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnNUEVO = new javax.swing.JButton();
        btnREGRESAR = new javax.swing.JButton();
        cbMONTO = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Donaciones");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Descripcion:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Monto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("ID_donador:");

        txtID.setEditable(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtDESCRIPCION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDESCRIPCIONActionPerformed(evt);
            }
        });

        TablaDonaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Monto", "Descripcion", "ID_Donador", "Fecha de donacion"
            }
        ));
        TablaDonaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDonacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDonaciones);
        if (TablaDonaciones.getColumnModel().getColumnCount() > 0) {
            TablaDonaciones.getColumnModel().getColumn(0).setMinWidth(50);
            TablaDonaciones.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDonaciones.getColumnModel().getColumn(0).setMaxWidth(50);
            TablaDonaciones.getColumnModel().getColumn(1).setMinWidth(70);
            TablaDonaciones.getColumnModel().getColumn(1).setPreferredWidth(70);
            TablaDonaciones.getColumnModel().getColumn(1).setMaxWidth(70);
            TablaDonaciones.getColumnModel().getColumn(3).setMinWidth(80);
            TablaDonaciones.getColumnModel().getColumn(3).setPreferredWidth(80);
            TablaDonaciones.getColumnModel().getColumn(3).setMaxWidth(80);
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

        btnREGRESAR.setText("REGRESAR");
        btnREGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREGRESARActionPerformed(evt);
            }
        });

        cbMONTO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "10.00", "20.00", "50.00", "100.00", "200.00", "500.00", "1000.00" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(276, 276, 276))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDONADORid, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAGREGAR)
                            .addComponent(btnREGRESAR)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnELIMINAR)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMODIFICAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnREGRESAR))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbMONTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDESCRIPCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDONADORid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAGREGAR)
                            .addComponent(btnMODIFICAR))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnELIMINAR)
                            .addComponent(btnNUEVO)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDESCRIPCIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDESCRIPCIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDESCRIPCIONActionPerformed

    private void btnAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAGREGARActionPerformed
        agregar();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAGREGARActionPerformed

    private void btnREGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGRESARActionPerformed
        ventanaPrincipal ventana1 = new ventanaPrincipal();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnREGRESARActionPerformed

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

    private void btnNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNUEVOActionPerformed

    private void TablaDonacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDonacionesMouseClicked
        int fila = TablaDonaciones.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "fila no seleccionada");
        } else {
            id = Integer.parseInt((String) TablaDonaciones.getValueAt(fila, 0).toString());
            String monto = (String) TablaDonaciones.getValueAt(fila, 1);
            String descripcion = (String) TablaDonaciones.getValueAt(fila, 2);
            String idDonador = (String) TablaDonaciones.getValueAt(fila, 3);
            txtID.setText("" + id);
            cbMONTO.setSelectedItem(monto);
            txtDESCRIPCION.setText(descripcion);
            txtDONADORid.setText(idDonador);
        }
    }//GEN-LAST:event_TablaDonacionesMouseClicked

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
            java.util.logging.Logger.getLogger(Donaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donaciones().setVisible(true);
            }
        });
    }

    public void listar() {
        String sql = "SELECT * FROM donations;";

        try {
            cn = conex.getConexion1();
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            Object[] donaciones = new Object[5];
            modelo = (DefaultTableModel) TablaDonaciones.getModel();
            while (rs.next()) {
                donaciones[0] = rs.getInt("id");
                donaciones[1] = rs.getString("amount");
                donaciones[2] = rs.getString("descripcion");
                donaciones[3] = rs.getString("donor_id");
                donaciones[4] = rs.getString("donation_date");
                modelo.addRow(donaciones);
            }
            TablaDonaciones.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo listar las donaciones, error " + e);
        }

    }

    public void agregar() {
        String selectMonto = (String) cbMONTO.getSelectedItem();
        String descripcion = txtDESCRIPCION.getText();
        String idDonador = txtDONADORid.getText();

        if ("Seleccionar".equals(selectMonto)) {
            JOptionPane.showMessageDialog(null, "Seleccione un iten valido");
            limpiar();
        }

        if (descripcion.equals("") || idDonador.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan valores");
            listar();
        }

        int IDDonador = Integer.parseInt(idDonador);
        if (IDDonador == 0) {
            JOptionPane.showMessageDialog(null, "El ID del donador no puede ser cero");
            limpiar();
        } else {
            String sql = "INSERT INTO donations (amount, descripcion, donor_id) VALUES ('" + selectMonto + "', '" + descripcion + "', '" + idDonador + "');";
            try {
                cn = conex.getConexion1();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Donacion agregada exitosamente");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la donacion, error " + e);
                limpiar();
            }
        }
    }

    public void modificar() {
        String selectMonto = (String) cbMONTO.getSelectedItem();
        String descripcion = txtDESCRIPCION.getText();
        String idDonador = txtDONADORid.getText();

        if (descripcion.equals("") || idDonador.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan valores");
            limpiar();
        }

        if ("Seleccionar".equals(selectMonto)) {
            JOptionPane.showMessageDialog(null, "Seleccione un iten valido");
            listar();
        }

        int IDDonador = Integer.parseInt(idDonador);
        if (IDDonador == 0) {
            JOptionPane.showMessageDialog(null, "El ID del donador no puede ser cero");
            limpiar();
        } else {
            String sql = "UPDATE donations SET amount = '" + selectMonto + "', descripcion = '" + descripcion + "', donor_id = '" + idDonador + "' WHERE id =" + id;
            try {
                cn = conex.getConexion1();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Donacion modificada exitosamente");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la donacion, error " + e);
                limpiar();
            }
        }

    }

    public void eliminar() {
        int fila = TablaDonaciones.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            limpiar();
        } else {
            String sql = "DELETE FROM donations WHERE donations.id =" + id;

            try {
                cn = conex.getConexion1();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Donacion eliminada exitosamente");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la donacion, error " + e);
            }
        }

    }

    public void nuevo() {
        txtID.setText("");
        txtDESCRIPCION.setText("");
        txtDONADORid.setText("");
        cbMONTO.setSelectedItem("Seleccionar");
    }

    public void limpiar() {
        for (int i = 0; i < TablaDonaciones.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDonaciones;
    private javax.swing.JButton btnAGREGAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JButton btnNUEVO;
    private javax.swing.JButton btnREGRESAR;
    private javax.swing.JComboBox<String> cbMONTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDESCRIPCION;
    private javax.swing.JTextField txtDONADORid;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
