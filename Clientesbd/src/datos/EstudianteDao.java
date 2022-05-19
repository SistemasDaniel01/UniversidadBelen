/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static datos.Conexion.getConnection;
import domain.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author planl
 */
public class EstudianteDao {
    
     private static final String SQL_SELECT
            = "SELECT *"
            + " FROM estudiante";
    
      private static final String SQL_INSERT = 
              "INSERT "
              +"INTO estudiante(nombre,apellido,correo) "
              +"VALUES(?,?,?)"; 
      
        private static final String SQL_UPDATE = "UPDATE estudiante "
            + "SET nombre = ?,apellido = ?,correo = ?"
            + "WHERE id = ?";
        
         private static final String SQL_DELETE = "DELETE FROM estudiante "
            + "WHERE id = ?";
      
      
         
    public List<Estudiante> seleccionar(){
       
      Connection conn = null;
      PreparedStatement stmt = null;
      ResultSet rs =null;
      Estudiante est = null;
      List<Estudiante> estudiantes = new ArrayList<>();
      
        try {
            conn = (Connection) getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                int idestudiante = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                
                
                
               est = new Estudiante(idestudiante, nombre, apellido, correo);
               estudiantes.add(est);
            }
        } catch (Exception ex) {
           ex.printStackTrace(System.out);
        }
        finally{
          try {
              Conexion.close(stmt);
              Conexion.close(rs);
              Conexion.close(conn);
          } catch (Exception ex) {
             ex.printStackTrace(System.out);
          }
        }
        
        return estudiantes;
   }
   
    
}
