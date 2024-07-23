/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import idao.IDAOAlumno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Alumno;

public class DAOAlumnoImpl implements IDAOAlumno{
  private Conexion conexion;
  
  public DAOAlumnoImpl(){
    conexion = new Conexion();
  }
  
  @Override
  public List<Alumno> listar(){
      List<Alumno> listaAlu = new ArrayList<>();
        try (Connection conn = conexion.getConnection(); PreparedStatement ps = conn.prepareStatement("SELECT a.dni as dniAlumno,nombres,apellidos FROM persona p join alumno a on (a.dni = p.dni);"); ResultSet rs = ps.executeQuery()) {
        while (rs.next()) {
            Alumno alu = new Alumno();
            alu.setDni(rs.getString("dniAlumno"));
            alu.setNombres(rs.getString("nombres"));
            alu.setApellidos(rs.getString("apellidos"));
            listaAlu.add(alu);
        }
      } catch (SQLException e) {
          System.err.println("Error al listar departamentos: " + e.getMessage());
      }
      return listaAlu;
    }
  
}
