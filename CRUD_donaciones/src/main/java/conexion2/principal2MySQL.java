/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion2;

import java.sql.*;
import javax.swing.JOptionPane;

public class principal2MySQL {

    public static void main(String[] args) {
        String hostName = "ods06.crqiacsks14a.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + hostName + ":3306/calendario";
        String user = "admin";
        String password = "LeoTorres625";
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexion exitosa a la base de datos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos, error " +  e);
        }
    }

}
