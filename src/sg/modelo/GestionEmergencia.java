
package sg.modelo;

import java.util.ArrayList;

public class GestionEmergencia {
    private GestionEmergencia instancia;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emergencia> emergencias;
    private ArrayList<EntidadDeRiesgo> entidades;

    public GestionEmergencia() {
        usuarios = new ArrayList<>();
        emergencias = new ArrayList<>();
        entidades = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Emergencia> getEmergencias() {
        return emergencias;
    }

    public void setEmergencias(ArrayList<Emergencia> emergencias) {
        this.emergencias = emergencias;
    }

    public ArrayList<EntidadDeRiesgo> getEntidades() {
        return entidades;
    }

    public void setEntidades(ArrayList<EntidadDeRiesgo> entidades) {
        this.entidades = entidades;
    }

    @Override
    public String toString() {
        return "GestionEmergencia{" + "usuarios = " + usuarios + ", emergencias = " + emergencias + ", entidades = " + entidades + '}';
    }
    
    
    
    public void crearEmergencia(Emergencia emergencia){
        emergencias.add(emergencia);
    }
    
    public void crearUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void crearEntidad(EntidadDeRiesgo entidad){
        entidades.add(entidad);
    }
    
    public String listarXEmengencia(String tipo){
        String list = "";
        for (Emergencia emergencia : emergencias) {
            if (emergencia.getTipo().equalsIgnoreCase(tipo)) {
                list += " " + emergencia.toString() + "\n";
            }
        }
        return list;
    }
    
    public String listarXUsuario(String nomUsuario){
        String list = "";
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equalsIgnoreCase(nomUsuario)) {
                list += " " + usuario.toString() + "\n";
            }
        }
        return list;
    }
    
    public String listarXZona(String xZona){
        String list = "";
        for (Emergencia emergencia : emergencias) {
            if (emergencia.getZonas().equals(xZona)) {
                list += " " + emergencia.toString() + "\n";
            }
        }
        return list;
    }
    
    public String listarXEntidad(String xEntidad){
        String list = "";
        for (EntidadDeRiesgo entidad : entidades) {
            if (entidad.getNombre().equalsIgnoreCase(xEntidad)) {
                list += " " + entidad.toString() + "\n";
            }
        }
        return list;
    }
    
    
}
