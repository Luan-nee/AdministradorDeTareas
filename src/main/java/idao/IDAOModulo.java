/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import model.Modulo;

/**
 *
 * @author LUIS
 */
public interface IDAOModulo {
    String insertar(Modulo modulo);
    String modificar(Modulo modulo);
    List<Modulo> listar();
    String eliminar(Modulo modulo);
}
