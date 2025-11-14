
package sg.controlador.reporte;


public class ControladorReporteListar {
    private ServicioReporte serv = ServicioReporte();

    public String Listar(){
        return serv.listar();
        
    }
     
}
