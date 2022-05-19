/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author planl
 */
public class Conexion {
    
    public static final String url = "jdbc:mysql://localhost:3306/uni";
    public static final String user = "root";
    public static final String key = "root";
    
    public static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, key);
           

        } catch (Exception e) {

            System.out.println(e);

        }

        return conn;
    }
    
    public static void close(ResultSet rs) throws SQLException{
        
        rs.close();
        
    }
    
   
    public static void close(PreparedStatement smtm) throws SQLException{
        
        smtm.close();
        
    }
    
  
      
    public static void close(Connection conn) throws SQLException{
        
        conn.close();
        
    }
}
