package dao;

import idao.IDAOSemestre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Docente;
import model.Semestre;


public class DAOSemestreImpl implements IDAOSemestre{
  private Conexion conexion;

    public DAOSemestreImpl() {
        this.conexion = new Conexion();
    }

    @Override
    public String insertar(Semestre semestre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String modificar(Semestre semestre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Semestre> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String eliminar(Semestre semestre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<Object[]> listarIdSemestreYDetalleSemestre() {
        List<Object[]> listaSemestre = new ArrayList<>();
        try (
              Connection conn = conexion.getConnection(); 
              PreparedStatement ps = conn.prepareStatement("SELECT idSemestre, detalle FROM semestre")
            ) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object semestre[] = new Object[2];
                semestre[0] = rs.getString("idSemestre");
                semestre[1] = rs.getString("detalle");
                listaSemestre.add(semestre);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar la tabla Semestre: " + e.getMessage());
        }
        return listaSemestre;
    }
}
