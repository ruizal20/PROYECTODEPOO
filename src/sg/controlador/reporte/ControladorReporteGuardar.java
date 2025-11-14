
package sg.controlador.reporte;

public class ControladorReporteGuardar {
    ServicioReporte serv = ServicioReporte();
    

    public boolean guardar(String tipoEmergencia,String ubicacion,String descripcion, boolean heridosVisibles, Usuario usuarioReporta){
        
        Reporte nuevoReporte = new Reporte(tipoEmergencia,ubicacion,descripcion, heridosVisibles,usuarioReporta);
        Reporte re= new Reporte(tipoEmergencia,ubicacion,descripcion, heridosVisibles,usuarioReporta);
        return serv.addReporte(re);
    }

}
