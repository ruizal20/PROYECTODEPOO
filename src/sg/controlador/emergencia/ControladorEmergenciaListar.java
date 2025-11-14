
package sg.controlador.emergencia;

import sg.servicio.ServicioEmergencia;

public class ControladorEmergenciaListar {
    private ServicioEmergencia servEmergencia = new ServicioEmergencia();
    
    public String listar(){
        return servEmergencia.listar();
    }
}
