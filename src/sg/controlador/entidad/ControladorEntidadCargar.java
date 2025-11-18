
package sg.controlador.entidad;

import java.util.ArrayList;
import sg.modelo.EntidadDeRiesgo;
import sg.servicio.ServicioEntidadDeRiesgo;

public class ControladorEntidadCargar {
    public ArrayList<EntidadDeRiesgo> cargar(){
        ServicioEntidadDeRiesgo serv = new ServicioEntidadDeRiesgo();
        return serv.getEntidades();
    }
}
