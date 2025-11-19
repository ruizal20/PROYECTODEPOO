
package sg.dao.emergencia;

import java.util.List;
import sg.modelo.Emergencia;

public interface DAOEmergencia {
    boolean guardar(Emergencia emergencia);
    boolean actualizarDatosEmergencia(Emergencia emrgActualizada);
    List<Emergencia> listar();
}
