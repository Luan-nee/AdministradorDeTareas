/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import idao.IDAOMatricula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Matricula;
import model.Persona;

public class DAOMatriculaImpl implements IDAOMatricula{
   private Conexion conexion;
   
   public DAOMatriculaImpl(){
     this.conexion = new Conexion();
   }
   
   @Override
   public String insertar(Matricula matricula){
      String mensaje = "";
      try (Connection conn = conexion.getConnection(); 
          PreparedStatement ps = conn.prepareStatement("INSERT INTO matricula (dni,idModulo,nota,idSemestre) VALUES (?,?,?,?);")) {
          ps.setString(1, matricula.getDni());
          ps.setString(1, matricula.getIdModulo());
          ps.setFloat(1, matricula.getNota());
          ps.setString(1, matricula.getIdSemestre());
          int rowsAffected = ps.executeUpdate();
          if (rowsAffected > 0) {
              mensaje = "Departamento insertado correctamente";
          } else {
              mensaje = "No se pudo insertar el departamento";
          }
      } catch (SQLException e) {
          mensaje = "Error al insertar departamento: " + e.getMessage();
      }
      return mensaje;
   }
   
   @Override
   public List<String[]> listar(){
      List<String[]> listaMatriculasAlumnos = new ArrayList<>();
      try (Connection conn = conexion.getConnection(); 
          PreparedStatement ps = conn.prepareStatement("SELECT ma.dni, mo.nombre, se.detalle, ma.nota  from matricula ma join modulo mo on (ma.idModulo = mo.idModulo) join semestre se on (se.idSemestre = ma.idSemestre);"); ResultSet rs = ps.executeQuery()) {
          while (rs.next()) {
            String[] datos = new String[4];
            datos[0] = rs.getString("ma.dni");
            datos[1] = rs.getString("mo.nombre");
            datos[2] = rs.getString("se.detalle");
            datos[3] = rs.getString("ma.nota");
            listaMatriculasAlumnos.add(datos);
          }
      } catch (SQLException e) {
          System.err.println("Error al listar departamentos: " + e.getMessage());
      }
      return listaMatriculasAlumnos;
   }
}
