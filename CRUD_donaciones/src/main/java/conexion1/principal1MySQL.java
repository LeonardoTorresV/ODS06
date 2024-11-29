/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion1;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class principal1MySQL {

    public static void main(String[] args) {

        String hostName = "ods06.crqiacsks14a.us-east-1.rds.amazonaws.com";
        String jdbcURl = "jdbc:mysql://" + hostName + ":3306/DB_donacionesODS06";
        String user = "admin";
        String password = "LeoTorres625";

        Connection con = null;

        try {
            con = DriverManager.getConnection(jdbcURl, user, password);
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexion exitosa con la base de datos");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al conectarse con la base de datos: " + e);
        }
    }

}
