
package sg.modelo;

import java.util.ArrayList;

public class GestionEmergencia {
    private static GestionEmergencia instancia = null;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Emergencia> emergencias;
    private ArrayList<EntidadDeRiesgo> entidades;

    private GestionEmergencia() {
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
    
    public static GestionEmergencia getInstancia(){
        if (instancia == null) {
            instancia = new GestionEmergencia();
        }
        return instancia;
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
    
    public float porcenEmergAtendXEntidad(String xEntidad){
        float porcen = 0;
        for (EntidadDeRiesgo entidad : entidades) {
            if (entidad.getNombre().equalsIgnoreCase(xEntidad)) {
                porcen = (float) (entidad.getCantEmergAtendidas() / emergencias.size() * 100);
            }
        }
        return porcen;
    }
    
    public float porcenXTipoEmergencia(String xTipo){
        float porcen = 0, conta = 0;
        for (Emergencia emergencia : emergencias) {
            if (emergencia.getTipo().equalsIgnoreCase(xTipo)) {
                conta++;
            }
        }
        return (float) (conta / emergencias.size() * 100);
    }
}
