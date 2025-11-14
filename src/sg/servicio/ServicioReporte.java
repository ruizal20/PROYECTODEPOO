
package sg.servicio;

import java.util.ArrayList;
import java.util.List;
import sg.dao.reporte.DAOReporte;
import sg.dao.reporte.DAOReporteArchivo;
import sg.modelo.Reporte;

public class ServicioReporte {
    ArrayList<Reporte> reportes;

    public ServicioReporte() {
       reportes = new ArrayList<>();
    }

    public ArrayList<Reporte> getReportes() {
        return (ArrayList<Reporte>) new DAOReporteArchivo().listar();
    }
    
    public boolean addReporte(Reporte reporte){
        DAOReporte dao = new DAOReporteArchivo();
        return dao.guardar(reporte);
    }
    
    public String listar(){
        String list = "";
        DAOReporte dao = new DAOReporteArchivo();
        List<Reporte> reportes = dao.listar();
        
        for (Reporte reporte : reportes) {
            list += " " + reporte.toString();
        }
        return list;
    }
}
