/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import static datos.Conexion.getConnection;
import domain.Estudiante;
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
public class MateriaDao {

    private static final String SQL_SELECT
            = "SELECT *"
            + " FROM materias";

    private static final String SQL_INSERT
            = "INSERT "
            + "INTO materias(nombre) "
            + "VALUES(?)";

    private static final String SQL_UPDATE = "UPDATE materias "
            + "SET nombre = ?"
            + "WHERE idmaterias = ?";

    private static final String SQL_DELETE = "DELETE FROM materias "
            + "WHERE idmaterias = ?";

    
    
    public List<Materia> seleccionar() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Materia mat = null;
        List<Materia> materias = new ArrayList<>();

        try {
            conn = (Connection) getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idmateria = rs.getInt("idmaterias");
                String nombre = rs.getString("nombre");
                

                mat = new Materia(idmateria, nombre);
                materias.add(mat);
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

        return materias;
    }

}
