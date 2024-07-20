package controller;

import dao.DAOSemestreImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SemestreController {
  
  private DAOSemestreImpl daoSemestreImp;
  
  public SemestreController(){
    daoSemestreImp = new DAOSemestreImpl();
  }
  
  // esta método convierte los datos en un array list, solo se necesita 
  // indicar que atributos de la clase Semestre quiere listar en un List<>
  public List<String> convertir_a_list_string(int indiceCampo){
    List<String> listaValores = new ArrayList<>();
    for (Object[] item : daoSemestreImp.listarIdSemestreYDetalleSemestre()) {      
        listaValores.add((String) item[indiceCampo]);
    }
    return listaValores;
  }
  
  public Map<String, String> convertir_a_mapa(){
    Map<String, String> mapaValores = new HashMap<>();
    for (Object[] semestre : daoSemestreImp.listarIdSemestreYDetalleSemestre()) {
        String id = (String) semestre[0];
        String detalle = (String) semestre[1];
        mapaValores.put(detalle, id);
    }
    return mapaValores;
  }
  
  public List<String> listarDetalle() {
      return this.convertir_a_list_string(1);
  }

  public Map<String, String> obtenerMapaDetalleId() {
      return this.convertir_a_mapa();
  }
  
  
}
