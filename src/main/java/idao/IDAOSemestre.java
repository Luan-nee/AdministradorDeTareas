package idao;

import java.util.List;
import model.Semestre;

public interface IDAOSemestre {
    String insertar(Semestre semestre);
    String modificar(Semestre semestre);
    List<Semestre> listar();
    String eliminar(Semestre semestre);
}