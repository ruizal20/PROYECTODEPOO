
package sg.dao.entidad;

import java.util.List;
import sg.modelo.Emergencia;
import sg.modelo.EntidadDeRiesgo;

public interface DAOEntidad {
    boolean guardar(EntidadDeRiesgo entidad);
    List<EntidadDeRiesgo> listar();
}
