package idao;

import java.util.List;
import model.Docente;

public interface IDAODocente {
  String insertar(Docente docente);
  String modificar(Docente docente);
  List<Docente> listar();
  String eliminar(Docente docente);
}
