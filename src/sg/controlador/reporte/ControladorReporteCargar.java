
package sg.controlador.reporte;

import java.util.ArrayList;
import sg.modelo.Reporte;
import sg.servicio.ServicioReporte;

public class ControladorReporteCargar {
    public ArrayList<Reporte> cargar(){
        ServicioReporte serv = new ServicioReporte();
        return serv.getReportes();
    }
}
