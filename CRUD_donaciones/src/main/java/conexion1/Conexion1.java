/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion1;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conexion1 {
    
    String hostName = "ods06.crqiacsks14a.us-east-1.rds.amazonaws.com";
    String jdbcURl = "jdbc:mysql://" + hostName+":3306/DB_donacionesODS06";
    String user = "admin";
    String password = "LeoTorres625";
    
    Connection con;
    
    public Conexion1(){
        try {
            con = DriverManager.getConnection(jdbcURl, user, password);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un errror al conectarse a la base de datos: " + e);
        }
    }
    
    public Connection getConexion1(){
        return con;
    }
}
