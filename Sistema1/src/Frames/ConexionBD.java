/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import java. sql.*;

/**
 *
 * @author ELIZABETH
 */
public class ConexionBD {
    Connection cn;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //String server = "jdbc:mysql://localhost:3306/sistema";
            cn= DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root","123");
            //String user="root";
            //String pass="localhot ";
        
        System.out.println("se hizo la conexion exitosa");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }return cn;
        
        
    }
    Statement createStatement(){
        throw new  UnsupportedOperationException("no soportado");
    }
    
    
}
