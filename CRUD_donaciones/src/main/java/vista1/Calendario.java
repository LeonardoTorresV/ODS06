/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista1;

import conexion2.Conexion2;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MIGUEL
 */
public class Calendario extends javax.swing.JFrame {

    Conexion2 conex = new Conexion2();
    
    Connection cn;
    Statement st;
    ResultSet rs;
    int id;
    
    DefaultTableModel modelo;
    
    public Calendario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Calendario del ODS06");
        listar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tablafechas = new javax.swing.JTable();
        btnAGREGAR = new javax.swing.JButton();
        btnMODIFICAR = new javax.swing.JButton();
        btnELIMINAR = new javax.swing.JButton();
        btnNUEVO = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtFECHA = new javax.swing.JTextField();
        txtEVENTO = new javax.swing.JTextField();
        btnREGRESAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Calendario de fechas importantes del ODS06");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Fecha:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Evento:");

        Tablafechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Evento"
            }
        ));
        Tablafechas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablafechasMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tablafechas);
        if (Tablafechas.getColumnModel().getColumnCount() > 0) {
            Tablafechas.getColumnModel().getColumn(0).setMinWidth(50);
            Tablafechas.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tablafechas.getColumnModel().getColumn(0).setMaxWidth(50);
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

        txtID.setEditable(false);

        txtEVENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEVENTOActionPerformed(evt);
            }
        });

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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnREGRESAR)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnELIMINAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnNUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAGREGAR)
                        .addGap(18, 18, 18)
                        .addComponent(btnMODIFICAR))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnREGRESAR)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEVENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAGREGAR)
                            .addComponent(btnMODIFICAR))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNUEVO)
                            .addComponent(btnELIMINAR)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEVENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEVENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEVENTOActionPerformed

    private void btnREGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREGRESARActionPerformed
        ventanaPrincipal ventana1 = new ventanaPrincipal();
        ventana1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnREGRESARActionPerformed

    private void btnNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNUEVOActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNUEVOActionPerformed

    private void TablafechasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablafechasMouseClicked
        int fila = Tablafechas.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
        } else {
            id = Integer.parseInt((String) Tablafechas.getValueAt(fila, 0).toString());
            String fecha = (String) Tablafechas.getValueAt(fila, 1);
            String evento = (String) Tablafechas.getValueAt(fila, 2);
            txtID.setText("" + id);
            txtFECHA.setText(fecha);
            txtEVENTO.setText(evento);
        }
    }//GEN-LAST:event_TablafechasMouseClicked

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
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calendario().setVisible(true);
            }
        });
    }
    
    public void listar(){
        String sql = "SELECT * FROM fechas_civicas;";
        
        try {
            cn = conex.getConexion2();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            
            Object[] calendario = new Object[3];
            modelo = (DefaultTableModel) Tablafechas.getModel();
            while(rs.next()){
                calendario[0] = rs.getInt("id");
                calendario[1] = rs.getString("fecha");
                calendario[2] = rs.getString("evento");
                modelo.addRow(calendario);
            }
            Tablafechas.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo listar las fechas importantes, error " + e);
        }
    }
    
    public void agregar(){
        String fecha = txtFECHA.getText();
        String evento = txtEVENTO.getText();
        
        if (fecha.equals("") || evento.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan Valores");
            limpiar();
        } else {
            String sql = "INSERT INTO fechas_civicas (fecha, evento) VALUES ('"+fecha+"', '"+evento+"');";
            try {
                cn = conex.getConexion2();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Nueva fecha agregada");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar la nueva fecha, error " + e);
            }
        }
    }
    
    public void modificar(){
        String fecha = txtFECHA.getText();
        String evento = txtEVENTO.getText();
        
        if (fecha.equals("") || evento.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan valores");
            limpiar();
        } else {
            String sql = "UPDATE fechas_civicas SET fecha = '"+fecha+"', evento = '"+evento+"' WHERE id =" + id;
            
            try {
                cn = conex.getConexion2();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Fecha actualizada con exito");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la fecha, error " + e);
                limpiar();
            }
        }
    }
    
    public void eliminar(){
        int fila = Tablafechas.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            limpiar();
        } else {
            String sql = "DELETE FROM fechas_civicas WHERE id =" + id;
            
            try {
                cn = conex.getConexion2();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Fecha eliminada con exito");
                limpiar();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la fecha, error "+ e);
            }
        }
    }
    
    public void nuevo(){
        txtID.setText("");
        txtFECHA.setText("");
        txtEVENTO.setText("");
        txtFECHA.requestFocus();
    }
    
    public void limpiar(){
        for (int i = 0; i < Tablafechas.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablafechas;
    private javax.swing.JButton btnAGREGAR;
    private javax.swing.JButton btnELIMINAR;
    private javax.swing.JButton btnMODIFICAR;
    private javax.swing.JButton btnNUEVO;
    private javax.swing.JButton btnREGRESAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtEVENTO;
    private javax.swing.JTextField txtFECHA;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
