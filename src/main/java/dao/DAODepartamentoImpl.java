package dao;

import idao.IDAODepartamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Departamento;

public class DAODepartamentoImpl implements IDAODepartamento {

    private Conexion conexion;

    public DAODepartamentoImpl() {
        this.conexion = new Conexion();
    }

    @Override
    public String insertar(Departamento departamento) {
        String mensaje = "";
        try (Connection conn = conexion.getConnection(); 
            PreparedStatement ps = conn.prepareStatement("INSERT INTO departamento (nombre) VALUES (?)")) {
            ps.setString(1, departamento.getNombre());
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
    public String modificar(Departamento departamento) {
        String mensaje = "";
        try (Connection conn = conexion.getConnection(); 
            PreparedStatement ps = conn.prepareStatement("UPDATE departamento SET nombre = ? WHERE idDepartamento = ?")) {
            ps.setString(1, departamento.getNombre());
            ps.setInt(2, departamento.getId());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                mensaje = "Departamento modificado correctamente";
            } else {
                mensaje = "No se pudo modificar el departamento";
            }
        } catch (SQLException e) {
            mensaje = "Error al modificar departamento: " + e.getMessage();
        }
        return mensaje;
    }

    @Override
    public List<Departamento> listar() {
        List<Departamento> listaDep = new ArrayList<>();
        try (Connection conn = conexion.getConnection(); 
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM departamento"); 
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Departamento depa = new Departamento();
                depa.setId(rs.getInt("idDepartamento"));
                depa.setNombre(rs.getString("nombre"));
                listaDep.add(depa);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar departamentos: " + e.getMessage());
        }
        return listaDep;
    }

    @Override
    public String eliminar(Departamento departamento) {
        String mensaje = "";
        try (Connection conn = conexion.getConnection(); 
             PreparedStatement ps = conn.prepareStatement("DELETE FROM departamento WHERE idDepartamento = ?")) {
            ps.setInt(1, departamento.getId());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                mensaje = "Departamento eliminado correctamente";
            } else {
                mensaje = "No se pudo eliminar el departamento";
            }
        } catch (SQLException e) {
            mensaje = "Error al eliminar departamento: " + e.getMessage();
        }
        return mensaje;
    }
    public int obtenerUltimoId() {
        int ultimoId = 0;
        try (Connection conn = conexion.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT MAX(idDepartamento) AS max_id FROM departamento");
             ResultSet rs = ps.executeQuery()) {
            
            if (rs.next()) {
                ultimoId = rs.getInt("max_id");
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener último ID: " + e.getMessage());
        }
        return ultimoId;
    }

}
