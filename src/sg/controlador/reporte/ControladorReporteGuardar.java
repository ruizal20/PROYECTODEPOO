
package sg.controlador.reporte;

import sg.modelo.Reporte;
import sg.modelo.Usuario;
import sg.servicio.ServicioReporte;

public class ControladorReporteGuardar {
    private ServicioReporte serv = new ServicioReporte();
    

    public boolean guardar(String tipoEmergencia,String ubicacion, String zona,String descripcion, boolean heridosVisibles, Usuario usuarioReporta){
        
        Reporte nuevoReporte = new Reporte(tipoEmergencia,ubicacion,zona,descripcion, heridosVisibles,usuarioReporta);
       
        return serv.addReporte(nuevoReporte);
    }

}
