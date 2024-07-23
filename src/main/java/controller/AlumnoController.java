
package controller;

import dao.DAOAlumnoImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Alumno;

public class AlumnoController {
  
  private DAOAlumnoImpl alumnoImpl; 
  
  public AlumnoController(){
    alumnoImpl = new DAOAlumnoImpl();
  }
  
  public List<String> listarNombresYApellidosAlumnos() {
    List<Alumno> listaAlumnos = alumnoImpl.listar();
    List<String> listaNombresApellidos = new ArrayList<>();
    for (Alumno alu : listaAlumnos) {
        listaNombresApellidos.add(alu.getNombres()+" "+alu.getApellidos());
    }
    return listaNombresApellidos;
  }
  
  public Map<String, String> obtenerMapaNombresDni() {
    List<Alumno> listaAlumnos = alumnoImpl.listar();
    Map<String, String> mapaNombresDni = new HashMap<>();
    for (Alumno alu : listaAlumnos) {
      String dni = alu.getDni();
      String nombreCompleto = alu.getNombres()+" "+alu.getApellidos();
      mapaNombresDni.put(nombreCompleto, dni);
    }
    return mapaNombresDni;
  }
  
  
  
}
