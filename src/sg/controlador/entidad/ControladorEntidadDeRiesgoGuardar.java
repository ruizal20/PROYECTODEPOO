
package sg.controlador.entidad;

import sg.modelo.Emergencia;
import sg.modelo.EntidadDeRiesgo;
import sg.servicio.ServicioEntidadDeRiesgo;

public class ControladorEntidadDeRiesgoGuardar {
    private ServicioEntidadDeRiesgo servEntidad = new ServicioEntidadDeRiesgo();
    
    public boolean guardar(int id, String nombre, boolean disponible, Emergencia emergenciaQueAtiende, int cantEmergenciasAtendidas){
        EntidadDeRiesgo entidad = new EntidadDeRiesgo(id, nombre, disponible, emergenciaQueAtiende, cantEmergenciasAtendidas);
        return servEntidad.addEntidad(entidad);
    }
}
