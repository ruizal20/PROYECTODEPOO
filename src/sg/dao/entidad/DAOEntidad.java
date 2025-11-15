
package sg.dao.entidad;

import java.util.List;
import sg.modelo.EntidadDeRiesgo;

public interface DAOEntidad {
    boolean guardar(EntidadDeRiesgo entidad);
    boolean actualizarDatos(EntidadDeRiesgo entidad);
    List<EntidadDeRiesgo> listar();
}
