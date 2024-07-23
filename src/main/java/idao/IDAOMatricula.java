
package idao;

import java.util.List;
import model.Matricula;

public interface IDAOMatricula {
  String insertar(Matricula matricula);
  List<String[]> listar();
}
