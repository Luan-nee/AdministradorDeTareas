package controller;

import java.util.List;
import dao.DAODocenteImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DocenteController {

    private DAODocenteImpl daoDocente;

    public DocenteController() {
        daoDocente = new DAODocenteImpl();
    }

    public List<String> listarNombresYApellidosDocentes() {
        List<Object[]> listaDocentes = daoDocente.listarNombresYApellidosDocente();
        List<String> listaNombresApellidos = new ArrayList<>();
        for (Object[] docente : listaDocentes) {
            listaNombresApellidos.add((String) docente[1]);
        }
        return listaNombresApellidos;
    }

    public Map<String, String> obtenerMapaNombresDni() {
        List<Object[]> listaDocentes = daoDocente.listarNombresYApellidosDocente();
        Map<String, String> mapaNombresDni = new HashMap<>();
        for (Object[] docente : listaDocentes) {
            String dni = (String) docente[0];
            String nombreCompleto = (String) docente[1];
            mapaNombresDni.put(nombreCompleto, dni);
        }
        return mapaNombresDni;
    }

}
