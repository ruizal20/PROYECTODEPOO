
package sg.controlador.emergencia;

import sg.modelo.Emergencia;
import sg.modelo.EmergenciaFactory;
import sg.modelo.EntidadDeRiesgo;
import sg.modelo.Reporte;
import sg.servicio.ServicioEmergencia;

// Me tocó investigar la parte del else

public class ControladorEmergenciaGuardar {
    private ServicioEmergencia servEmergencia = new ServicioEmergencia();
    
    public boolean guardar(int id, String causa, String fecha, String tipo, String[] zonas, int severidad, Reporte reporte, EntidadDeRiesgo entidadQueAtiende){
        EmergenciaFactory fabrica = EmergenciaFactory.getFabrica();
        Emergencia emerg = fabrica.getEmergencia(tipo);
        
        if (emerg == null) {
            return false;
        }else{
            emerg.setId(id);
            emerg.setCausa(causa);
            emerg.setFecha(fecha);
            emerg.setTipo(tipo);
            emerg.setZonas(zonas);
            emerg.setSeveridad(severidad);
            emerg.setEntidadQueAtiende(entidadQueAtiende);
        }
        return servEmergencia.addEmergencia(emerg);
    }
}
