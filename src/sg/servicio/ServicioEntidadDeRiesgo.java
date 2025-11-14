
package sg.servicio;

import java.util.ArrayList;
import java.util.List;
import sg.dao.entidad.DAOEntidad;
import sg.dao.entidad.DAOEntidadArchivo;
import sg.modelo.EntidadDeRiesgo;

public class ServicioEntidadDeRiesgo {
    ArrayList<EntidadDeRiesgo> entidades;

    public ServicioEntidadDeRiesgo() {
        entidades = new ArrayList<>();
    }

    public ArrayList<EntidadDeRiesgo> getEntidades() {
        return (ArrayList<EntidadDeRiesgo>) new DAOEntidadArchivo().listar();
    }
    
    public boolean addEntidad(EntidadDeRiesgo entidad){
        DAOEntidad dao = new DAOEntidadArchivo();
        return dao.guardar(entidad);
    }
    
    public String listar(){
        String list = "";
        DAOEntidad dao = new DAOEntidadArchivo();
        List<EntidadDeRiesgo> entidades = dao.listar();
        
        for (EntidadDeRiesgo entidad : entidades) {
            list += " " + entidad.toString() + "\n";
        }
        return list;
    }
}
