
package sg.servicio;

import java.util.ArrayList;
import java.util.List;
import sg.dao.emergencia.DAOEmergencia;
import sg.dao.emergencia.DAOEmergenciaArchivo;
import sg.dao.entidad.DAOEntidad;
import sg.dao.entidad.DAOEntidadArchivo;
import sg.modelo.Emergencia;

public class ServicioEmergencia {
    ArrayList<Emergencia> emergencias = new ArrayList<>();

    public ServicioEmergencia() {
        emergencias = new ArrayList<>();
    }
    
    public ArrayList<Emergencia> getEmergencia(){
        return (ArrayList<Emergencia>) new DAOEmergenciaArchivo().listar();
    }
    
    public boolean addEmergencia(Emergencia emergencia){
        DAOEmergencia dao = new DAOEmergenciaArchivo();
        return dao.guardar(emergencia);
    }
    
    public String listar(){
        String list = "";
        DAOEmergencia dao = new DAOEmergenciaArchivo();
        List<Emergencia> emergencias = dao.listar();
        
        for (Emergencia emergencia : emergencias) {
            list += " " + emergencia.toString() + "\n";
        }
        return list;
    }
}
