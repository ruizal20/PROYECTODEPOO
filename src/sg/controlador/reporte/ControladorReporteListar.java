
package sg.controlador.reporte;


public class ControladorReporteListar {
    ServicioReporte serv = ServicioReporte();

    public String Listar(){
        return serv.listar();
        
    }
     
}
