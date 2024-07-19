/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IDAODocenteModulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import model.DocenteModulo;

/**
 *
 * @author LUIS
 */
public class DAODocenteModuloImpl implements IDAODocenteModulo{
    private Conexion conexion;

    public DAODocenteModuloImpl(Conexion conexion) {
        this.conexion = new Conexion();
    }
    
    
    @Override
    public String insertar(DocenteModulo docente_modulo) {
        String mensaje = "";
        try (Connection conn = conexion.getConnection(); 
            PreparedStatement ps = conn.prepareStatement("INSERT INTO docente_modulo (dni, idModulo, idSemestre) VALUES (?,?,?)")) {
            ps.setString(1, docente_modulo.getDni());
            ps.setInt(2, docente_modulo.getIdModulo());
            ps.setInt(3, docente_modulo.getIdSemestre());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                mensaje = "Modulo asignado a docente correctamente";
            } else {
                mensaje = "No se pudo asignar el modulo al docente correctamente";
            }
        } catch (SQLException e) {
            mensaje = "Error al insertar modulo a docente: " + e.getMessage();
        }
        return mensaje;
    }

    @Override
    public String modificar(DocenteModulo docente_modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DocenteModulo> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(DocenteModulo docente_modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
