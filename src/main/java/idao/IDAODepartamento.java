/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idao;

import java.util.List;
import model.Departamento;

public interface IDAODepartamento {
    String insertar(Departamento departamento);
    String modificar(Departamento departamento);
    List<Departamento> listar();
    String eliminar(Departamento departamento);
}