/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.DAODocenteModuloImpl;
import model.DocenteModulo;
import view.FrmDocenteModulo;


/**
 *
 * @author LUIS
 */
public class DocenteModuloController {
    private DAODocenteModuloImpl dao;
    private FrmDocenteModulo vista;
    public String insertar(DocenteModulo docente_modulo){
     String mensaje = dao.insertar(docente_modulo);
        if (mensaje.equals("Modulo asignado a docente correctamente")) {
            
        }
        return mensaje;
    }
}
