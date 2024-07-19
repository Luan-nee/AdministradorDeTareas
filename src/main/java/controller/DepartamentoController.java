package controller;

import dao.DAODepartamentoImpl;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Departamento;
import view.FrmDepartamento;

public class DepartamentoController {

    private DAODepartamentoImpl dao;
    private FrmDepartamento vista;
    //private DefaultTableModel model;

    public DepartamentoController(FrmDepartamento depView) {
        this.dao = new DAODepartamentoImpl();
        this.vista = depView;
       // this.model = new DefaultTableModel();
    }

    public void listar(JTable tabla) {
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("Codigo");
        newModel.addColumn("Departamento");
        List<Departamento> lista = dao.listar();
        for (Departamento departamento : lista) {
            Object[] fila = new Object[]{departamento.getId(), departamento.getNombre()};
            newModel.addRow(fila);
        }
        tabla.setModel(newModel);
    }

    public String insertar(Departamento departamento) {
        String mensaje = dao.insertar(departamento);
        if (mensaje.equals("Departamento insertado correctamente")) {
            listar(vista.getTablaDepartamentos());
        }
        return mensaje;
    }
    
    public String modificar(Departamento departamento) {
        String mensaje = dao.modificar(departamento);
        if (mensaje.equals("Departamento modificado correctamente")) {
            // Actualizar la tabla de departamentos después de modificar
            listar(vista.getTablaDepartamentos());
        } 
        return mensaje;
    }
    
    public String eliminar(Departamento departamento) {
        String mensaje = dao.eliminar(departamento);
        if (mensaje.equals("Departamento eliminado correctamente")) {
            // Actualizar la tabla de departamentos después de modificar
            listar(vista.getTablaDepartamentos());
        } 
        return mensaje;
    }
    public int obtenerUltimoId() {
        return dao.obtenerUltimoId();
    }

}
