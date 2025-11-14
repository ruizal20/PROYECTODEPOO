
package sg.controlador.reporte;

import sg.servicio.ServicioReporte;


public class ControladorReporteListar {
    private ServicioReporte serv = new ServicioReporte();

    public String Listar(){
        return serv.listar();
    }
     
}
