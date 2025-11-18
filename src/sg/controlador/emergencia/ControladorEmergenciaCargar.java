
package sg.controlador.emergencia;

import java.util.ArrayList;
import sg.modelo.Emergencia;
import sg.servicio.ServicioEmergencia;

public class ControladorEmergenciaCargar {
    public ArrayList<Emergencia> cargar(){
        ServicioEmergencia serv = new ServicioEmergencia();
        return serv.getEmergencia();
    }
}
