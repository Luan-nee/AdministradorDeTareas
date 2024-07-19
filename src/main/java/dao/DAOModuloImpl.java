/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IDAOModulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Modulo;

/**
 *
 * @author LUIS
 */
public class DAOModuloImpl implements IDAOModulo{
    private Conexion conexion;

    public DAOModuloImpl() {
        this.conexion = new Conexion();
    }
    
     
    @Override
    public String insertar(Modulo modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String modificar(Modulo modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Modulo> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String eliminar(Modulo modulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public List<Object[]> listarModuloNombre() {
        List<Object[]> listaModulo = new ArrayList<>();
        try (Connection conn = conexion.getConnection(); 
            PreparedStatement ps = conn.prepareStatement("SELECT idModulo, nombre FROM modulo")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object modulo[] = new Object[2];
                modulo[0] = rs.getInt("idModulo");
                modulo[1] = rs.getString("nombre");
                listaModulo.add(modulo);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar nombres y apellidos de docentes: " + e.getMessage());
        }
        return listaModulo;
    }
}
