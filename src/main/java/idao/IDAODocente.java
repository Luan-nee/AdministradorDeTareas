/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import model.Docente;

/**
 *
 * @author LUIS
 */
public interface IDAODocente {
    String insertar(Docente docente);
    String modificar(Docente docente);
    List<Docente> listar();
    String eliminar(Docente docente);
}
