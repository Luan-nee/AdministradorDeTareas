/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import dao.DAODepartamentoImpl;
import model.Departamento;
/**
 *
 * @author LUIS
 */
public class DeparatamentoView {
    public static void main(String[] args) {
        Departamento obj_dep = new Departamento();
        DAODepartamentoImpl obj_dep_dao = new DAODepartamentoImpl();

        obj_dep.setId(56);
        obj_dep.setNombre("Madre de Dios");

        obj_dep_dao.insertar(obj_dep);

        // Reutilizar la misma instancia para listar
        for (Departamento dep : obj_dep_dao.listar()) {
            System.out.println("Id:" + dep.getId());
            System.out.println("Departamento:" + dep.getNombre());
        }
    }
}
