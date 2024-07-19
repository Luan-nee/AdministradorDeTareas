/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import model.DocenteModulo;

/**
 *
 * @author LUIS
 */
public interface IDAODocenteModulo {
    String insertar(DocenteModulo docente_modulo);
    String modificar(DocenteModulo docente_modulo);
    List<DocenteModulo> listar();
    String eliminar(DocenteModulo docente_modulo);
}
