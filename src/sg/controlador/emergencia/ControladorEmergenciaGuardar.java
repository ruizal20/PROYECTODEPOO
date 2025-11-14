
package sg.controlador.emergencia;

import sg.modelo.Emergencia;
import sg.modelo.EntidadDeRiesgo;
import sg.modelo.Reporte;
import sg.servicio.ServicioEmergencia;

public class ControladorEmergenciaGuardar {
    private ServicioEmergencia servEmergencia = new ServicioEmergencia();
    
    public boolean guardar(int id, String causa, String fecha, String tipo, String[] zonas, int severidad, Reporte reporte, EntidadDeRiesgo entidadQueAtiende){
        Emergencia emerg = new Emergencia(id, causa, fecha, tipo, zonas, severidad, reporte, entidadQueAtiende);
        return servEmergencia.addEmergencia(emerg);
    }
}
