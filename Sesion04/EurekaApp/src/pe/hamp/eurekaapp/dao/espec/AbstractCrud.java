
package pe.hamp.eurekaapp.dao.espec;

import java.util.List;


public interface AbstractCrud<T> {
    
    T traerPorCodigo(String codigo);
    
    List<T> traerLista(T bean);
    
    void insertar (T bean);
    
    void actualizar (T bean);
    
    void eliminar (String codigo);
    
}
