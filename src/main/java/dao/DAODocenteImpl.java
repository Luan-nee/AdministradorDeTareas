/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IDAODocente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Docente;
import model.Persona;

/**
 *
 * @author LUIS
 */
public class DAODocenteImpl implements IDAODocente {

    private Conexion conexion;

    public DAODocenteImpl() {
        this.conexion = new Conexion();
    }

    @Override
    public String insertar(Docente docente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String modificar(Docente docente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Docente> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String eliminar(Docente docente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Persona> listar_persona() {

        List<Persona> listaPer = new ArrayList<>();
        try (Connection conn = conexion.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT dni,nombres,apellidos,direccion,telefono,fecha_nac,id_distrito FROM persona"); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Persona person = new Persona();
                person.setDni(rs.getString("dni"));
                person.setNombres(rs.getString("nombres"));
                person.setApellidos(rs.getString("apellidos"));
                person.setDireccion(rs.getString("direccion"));
                person.setTelefono(rs.getString("telefono"));
                person.setFecha_nac(rs.getString("fecha_nac"));
                person.setId_distrito(rs.getInt("id_distrito"));
                listaPer.add(person);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar departamentos: " + e.getMessage());
        }
        return listaPer;
    }

    public List<Object[]> listarNombresYApellidosDocente() {
        List<Object[]> listaDocentes = new ArrayList<>();
        try (Connection conn = conexion.getConnection(); 
            PreparedStatement ps = conn.prepareStatement("SELECT dni, nombres, apellidos FROM persona")) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object docente[] = new Object[2];
                docente[0] = rs.getString("dni");
                docente[1] = rs.getString("nombres") + " " + rs.getString("apellidos");
                listaDocentes.add(docente);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar nombres y apellidos de docentes: " + e.getMessage());
        }
        return listaDocentes;
    }
}
