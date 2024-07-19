/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOModuloImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LUIS
 */
public class ModuloController {
    private DAOModuloImpl daoModulo;

    public ModuloController() {
         daoModulo = new DAOModuloImpl();
    }
    
    public List<String> listarNombres() {
        List<Object[]> listaModulos = daoModulo.listarModuloNombre();
        List<String> listaNombreModulos = new ArrayList<>();
        for (Object[] modulo : listaModulos) {
            listaNombreModulos.add((String) modulo[1]);
        }
        return listaNombreModulos;
    }

    public Map<String, Integer> obtenerMapaNombresId() {
        List<Object[]> listaModulos = daoModulo.listarModuloNombre();
        Map<String, Integer> mapaNombresId = new HashMap<>();
        for (Object[] modulo : listaModulos) {
            int id = (Integer) modulo[0];
            String nombre = (String) modulo[1];
            mapaNombresId.put(nombre, id);
        }
        return mapaNombresId;
    }
}
