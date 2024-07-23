
package controller;
import dao.DAOMatriculaImpl;
import java.util.List;
import model.Matricula;

public class MatriculaController {
  
  private DAOMatriculaImpl matriculaImpl;
  
  public MatriculaController (){
    matriculaImpl = new DAOMatriculaImpl();
  }
  
  public List<String[]> listarAlumnosMatricula(){
    return matriculaImpl.listar();
  }  
  
  public void insertarAlumnosMatricula(Matricula matricula){
    matriculaImpl.insertar(matricula);
  }
}
