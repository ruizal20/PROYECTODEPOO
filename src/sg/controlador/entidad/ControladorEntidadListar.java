
package sg.controlador.entidad;

import sg.servicio.ServicioEntidadDeRiesgo;

public class ControladorEntidadListar {
    private ServicioEntidadDeRiesgo servEntidad = new ServicioEntidadDeRiesgo();
    
    public String listar(){
        return servEntidad.listar();
    }
}
