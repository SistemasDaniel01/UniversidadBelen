/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import static datos.Conexion.getConnection;
import domain.EstudianteNotas;
import domain.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author planl
 */
public class EstudianteNotasDao {
    
    private static final String SQL_SELECT
            = "SELECT *"
            + " FROM estudiante_materia";
    
     private static final String SQL_SELECTNOTAS
            = "SELECT parcial1,parcial2,examen_final"
            + " FROM estudiante_materia"
            +"WHERE idestudiante = ? and idmateria = ?";

    private static final String SQL_INSERT
            = "INSERT "
            + "INTO estudiante_materia(idestudiante,idmateria,parcial1,parcial2,examen_final) "
            + "VALUES(?,?,?,?,?)";

    private static final String SQL_UPDATE = "UPDATE estudiante_materia "
            + "SET parcial1= ?,parcial2 = ?,examen_final = ?"
            + "WHERE idestudiante = ? and idmateria = ?";

    private static final String SQL_DELETE = "DELETE FROM estudiante_materia "
            + "WHERE idestudiante = ? and idmateria = ?";
    
 
    public List<EstudianteNotas> seleccionar() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        EstudianteNotas estmat = null;
        List<EstudianteNotas> estudiantenotas = new ArrayList<>();

        try {
            conn = (Connection) getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idest = rs.getInt("idestudiante");
                int idmat = rs.getInt("idmateria");
                double nota1 = rs.getDouble("parcial1");
                double nota2 = rs.getDouble("parcial2");
                double nota3 = rs.getDouble("examen_final");
                
                

                estmat = new EstudianteNotas(idest, idmat, nota1, nota2, nota3);
                estudiantenotas.add(estmat);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(rs);
                Conexion.close(conn);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
        }

        return estudiantenotas;
    }
    
    
    public List<EstudianteNotas> seleccionarNotas(int a, int b) {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        EstudianteNotas estmat = null;
        List<EstudianteNotas> estudiantenotas = new ArrayList<>();
        int registros = 0;

        try {
            conn = (Connection) getConnection();
            stmt = conn.prepareStatement(SQL_SELECTNOTAS);
            stmt.setInt(1, a);
            stmt.setInt(2, b);
            rs = stmt.executeQuery();
            while (rs.next()) {
                double nota1 = rs.getDouble("parcial1");
                double nota2 = rs.getDouble("parcial2");
                double nota3 = rs.getDouble("examen_final");
                
                

                estmat = new EstudianteNotas(nota1, nota2, nota3);
                estudiantenotas.add(estmat);
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(rs);
                Conexion.close(conn);
            } catch (Exception ex) {
                ex.printStackTrace(System.out);
            }
        }

        return estudiantenotas;
    }
    
    
      public int insertar (EstudianteNotas estmat){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, estmat.getIdest());
            stmt.setInt(2, estmat.getIdmat());
            stmt.setDouble(3, estmat.getNota1());
            stmt.setDouble(4, estmat.getNota2());
            stmt.setDouble(5, estmat.getNota3());
            registros = stmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
        finally{
          try {
              Conexion.close(stmt);
              Conexion.close(conn);
          } catch (Exception ex) {
             ex.printStackTrace(System.out);
          }
        }
         return registros;
   }
      
      
       public int actualizar (EstudianteNotas estmat){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setDouble(1, estmat.getNota1());
            stmt.setDouble(2, estmat.getNota2());
            stmt.setDouble(3, estmat.getNota3());
             stmt.setInt(4, estmat.getIdest());
            stmt.setInt(5, estmat.getIdmat());
            registros = stmt.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
        finally{
          try {
              Conexion.close(stmt);
              Conexion.close(conn);
          } catch (Exception ex) {
             ex.printStackTrace(System.out);
          }
        }
         return registros;
   }
       
       
       public int eliminar (EstudianteNotas estmat){
       Connection conn = null;
       PreparedStatement stmt = null;
       int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
             stmt.setInt(1, estmat.getIdest());
            stmt.setInt(2, estmat.getIdmat());
            registros = stmt.executeUpdate();
            
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
        finally{
          try {
              Conexion.close(stmt);
              Conexion.close(conn);
          } catch (Exception ex) {
             ex.printStackTrace(System.out);
          }
        }
         return registros;
   }
      
    
      
    
    
    
}
