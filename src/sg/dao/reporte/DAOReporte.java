
package sg.dao.reporte;

import java.util.List;
import sg.modelo.Reporte;

public interface DAOReporte {
    boolean guardar(Reporte reporte);
    List<Reporte> listar();
}
